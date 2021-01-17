[Back to questions](../README.md)

## Solution to [dd4c](../questions/dd4c.md): *Clocks*

See code at `solutions/code/tutorialquestions/questiondd4c`

Some notes on the sample code solution:

*The Clock class.*
The two display modes are represented by an enum, `DisplayMode`.  They could be represented using
a boolean.  The advantage of an enum is that it allows us to easily add further display modes.

I decided to use "seconds since midnight" as the canonical representation for a `Clock`.
My `Clock` class has a **private** constructor that takes a "seconds since midnight" value
and a `DisplayMode`.  There are two public constructors, as required in the question, which
both delegate to the private constructor:

```
public Clock(int secondsSinceMidnight);
```

simply uses `this(...)` to call the private `Clock` constructor with the given number of seconds since midnight and the
`SecondsSinceMidnight` display mode.

```
public Clock(int hh, int mm, int ss);
```

uses method `twentyFourHourToSecondsSinceMidnight` to convert the given hours, minutes and seconds into
a "seconds since midnight value", and uses `this(...)` to call the private constructor with the
resulting value and the `TwentyFourHour`
display mode.

The helper method `twentyFourHourToSecondsSinceMidnight` is **static**.  This makes sense because the
method computes a straightforward function of its arguments: it does not depend on the state of any `Clock`
object.

I have used some constants, such as `SECONDS_IN_A_MINUTE` and `MINUTES_IN_AN_``HOUR` to make the
code easy to read.  You might argue that I have gone overboard here, but I personally approve of using constants
instead of "magic numbers" wherever
possible, even for very well-known magic numbers.

Take a look at the `toString` method and check you understand it, in particular the way the
`padding` helper method is used to properly format the clock display.

*The AlarmClock class.*  Observe that `AlarmClock` has two public constructors,
corresponding to the public constructors for `Clock`.  Each adds new fields to represent the time
at which the alarm is set to go off.  Each constructor first uses `super(...)` to call the appropriate
constructor of `Clock`, then assigns to the new "alarm" fields.  Notice also that `AlarmClock`
uses a boolean flag to decide whether the alarm is currently sounding; this is initialised to *false*.

Check that you understand the (slightly complex) logic used in `tick()` to determine whether the
alarm is sounding or not.

Look at the use of `super` in `toString`, to avoid duplicating code for displaying a
`Clock` in `AlarmClock`.  Also check you understand the use of the ternary operator in
`toString`:

```
(alarmSounding ? " " + beep() : "")
```

If `alarmSounding` is *true*, this operator returns a space followed by the result of method
`beep()`.  Otherwise, the operator returns the empty string.

*The RadioAlarmClock class.*  I have modelled radio stations using an enumeration, `RadioStation`.  This class (remember, an enum is a class) represents four different radio stations, and includes
a special `None` value to model the case where a `RadioAlarmClock` is not tuned to any station.

The constructors for `RadioAlarmClock` mirror the constructors for `AlarmClock` (which in turn
mirror the public constructors for `Clock`).  Each constructor takes a time of day, an alarm time, and
a `RadioStation`.

Notice that I have *not* overridden `toString()` to change the way a `RadioAlarm``Clock` is
displayed.  The `toString` method in `AlarmClock` calls a method, `beep()`, which
returns the string `BEEP!`.  In `RadioAlarmClock` I have overridden `beep()`.  This means that
when `toString()` is called on an instance of `RadioAlarmClock`, the `toString()` method
in `AlarmClock` will execute.  This method calls `beep()`, but because `RadioAlarmClock`
overrides `beep()` it is this overridden version of `beep()` that will be called.

Now consider the implementation of `beep()` in `RadioAlarmClock`.  If the radio station field
of the radio alarm clock is `None` then `beep()` uses `super` to invoke `beep()`
in `AlarmClock`.  Otherwise the `getNoise()` method is called on the radio alarm clock's `station`
field.  This illustrates the fact that enum classes can have instance methods.  Look at the implementation of `getNoise()`
in `RadioStation`.
