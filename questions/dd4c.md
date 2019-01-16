[Back to questions](../README.md)

## dd4c: *Clocks*


Write a class, `Clock`, that records a moment in time during a day, in the granularity of seconds,
together with a mode in which the time should be shown.  The mode should be one of:



\item 24-hour format, i.e., *hh:mm:ss*

\item number of seconds since midnight, e.g., 03:24:52 is 12292 seconds since midnight

```

Your class should allow a clock to be constructed either by specifying a single integer, the number of seconds
since midnight (in which case this is the display mode to be used), or three integers, representing the current
hour, minute and seconds (in which case 24-hour format should be used as the display mode).

Your class should provide a method, `tick()`, that advances the time stored by a `Clock` object by one second.  In
addition, you should override `toString()` so that a `Clock` is represented as a string according
to the appropriate display mode.

Write a Java program, say in `ClockDemo.java`, to demo your `Clock` class
by creating a few clocks, then updating their time
once per second.  You can do this by using Java's `Thread.sleep(x)` method, which causes execution
to pause for `x` milliseconds.  This method of timing is not precise, but suffices for
this exercise.  Because `Thread.sleep(x)` can throw an `InterruptedException`, you will need
to specify that your `main` method `throws` this exception.  The output of your program should
look something like this:

\begin{scriptsize}
\begin{verbatim}
Clock 1 shows: 0 seconds since midnight.  Clock 2 shows: 23:59:53
Clock 1 shows: 1 seconds since midnight.  Clock 2 shows: 23:59:54
Clock 1 shows: 2 seconds since midnight.  Clock 2 shows: 23:59:55
Clock 1 shows: 3 seconds since midnight.  Clock 2 shows: 23:59:56
Clock 1 shows: 4 seconds since midnight.  Clock 2 shows: 23:59:57
Clock 1 shows: 5 seconds since midnight.  Clock 2 shows: 23:59:58
Clock 1 shows: 6 seconds since midnight.  Clock 2 shows: 23:59:59
Clock 1 shows: 7 seconds since midnight.  Clock 2 shows: 00:00:00
Clock 1 shows: 8 seconds since midnight.  Clock 2 shows: 00:00:01
Clock 1 shows: 9 seconds since midnight.  Clock 2 shows: 00:00:02
\end{verbatim}
\end{scriptsize}

Now design a class, `AlarmClock`, which extends `Clock` by storing a specific time
at which an alarm should sound.  An `AlarmClock` should also include a `boolean` field determining whether the alarm is
currently sounding; this should initially be *false*.  `AlarmClock` should provide appropriate constructors so that
one can create an `AlarmClock` with a specified 24-hour time and alarm, or a ``seconds since
midnight'' time and alarm.

Override the `tick()` method to behave as for `Clock`, but to additionally control the alarm.
If the alarm time is reached, the alarm should be turned on, and should remain on for 60 seconds.

Also override the `toString()` method to indicate whether the alarm is currently sounding.

Write a program, `AlarmClockDemo.java` to demo your `AlarmClock` class, similarly
to `Clock.java` above.  For a single clock, initialised to 23:59:50 with the alarm set to
go off at 23:59:58, the output of your program should be something like:

\begin{scriptsize}
\begin{verbatim}
Clock says: 23:59:50
Clock says: 23:59:51
Clock says: 23:59:52
Clock says: 23:59:53
Clock says: 23:59:54
Clock says: 23:59:55
Clock says: 23:59:56
Clock says: 23:59:57
Clock says: 23:59:58 BEEP!
Clock says: 23:59:59 BEEP!
Clock says: 00:00:00 BEEP!
...
Clock says: 00:00:55 BEEP!
Clock says: 00:00:56 BEEP!
Clock says: 00:00:57 BEEP!
Clock says: 00:00:58
Clock says: 00:00:59
Clock says: 00:01:00
Clock says: 00:01:01
Clock says: 00:01:02
\end{verbatim}
\end{scriptsize}

Finally, write a class called `RadioAlarmClock` which extends `AlarmClock`.
A `RadioAlarmClock` should have a `station` field, which either has a special
value `None`, or the value of a radio station.  You should choose, or make up, a number
of suitable radio stations.  If the `station` field is `None`, a `RadioAlarmClock`
should behave exactly as an `AlarmClock`.  Otherwise, instead of displaying `BEEP!` when the
alarm is sounding, an appropriate message representative of the given radio station should be shown.

Write an `RadioAlarmClockDemo.java` program to demonstrate this.  For example, given three radio
alarm clocks, each initialised to 23:59:50 with the alarm set to go off at 23:59:58, and tuned to no station,
*Radio 4* and *Five Live*, respectively, your program should display something like:

\begin{scriptsize}
\begin{verbatim}
Clocks say: 23:59:50 - 23:59:50 - 23:59:50
Clocks say: 23:59:51 - 23:59:51 - 23:59:51
Clocks say: 23:59:52 - 23:59:52 - 23:59:52
Clocks say: 23:59:53 - 23:59:53 - 23:59:53
Clocks say: 23:59:54 - 23:59:54 - 23:59:54
Clocks say: 23:59:55 - 23:59:55 - 23:59:55
Clocks say: 23:59:56 - 23:59:56 - 23:59:56
Clocks say: 23:59:57 - 23:59:57 - 23:59:57
Clocks say: 23:59:58 BEEP! - 23:59:58 Blah, blah, blah - 23:59:58 ...and it's a GOAL!!
Clocks say: 23:59:59 BEEP! - 23:59:59 Blah, blah, blah - 23:59:59 ...and it's a GOAL!!
Clocks say: 00:00:00 BEEP! - 00:00:00 Blah, blah, blah - 00:00:00 ...and it's a GOAL!!
...
Clocks say: 00:00:01 BEEP! - 00:00:01 Blah, blah, blah - 00:00:01 ...and it's a GOAL!!
Clocks say: 00:00:56 BEEP! - 00:00:56 Blah, blah, blah - 00:00:56 ...and it's a GOAL!!
Clocks say: 00:00:57 BEEP! - 00:00:57 Blah, blah, blah - 00:00:57 ...and it's a GOAL!!
Clocks say: 00:00:58 - 00:00:58 - 00:00:58
Clocks say: 00:00:59 - 00:00:59 - 00:00:59
Clocks say: 00:01:00 - 00:01:00 - 00:01:00
Clocks say: 00:01:01 - 00:01:01 - 00:01:01
Clocks say: 00:01:02 - 00:01:02 - 00:01:02
\end{verbatim}
\end{scriptsize}
