[Back to questions](../README.md)

## Solution to [dd4c](../questions/dd4c): *Clocks*

See code at `solutions/code/tutorialquestions/questiondd4c`


TODO: add content

\begin{question}{Clocks.}
Some notes on the sample code solution:

\vspace{1mm}\emph{The Clock class.}
The two display modes are represented by an enum, \lstinline{DisplayMode}.  They could be represented using
a boolean.  The advantage of an enum is that it allows us to easily add further display modes.

I decided to use ``seconds since midnight'' as the canonical representation for a \lstinline{Clock}.
My \lstinline{Clock} class has a \textbf{private} constructor that takes a ``seconds since midnight'' value
and a \lstinline{DisplayMode}.  There are two public constructors, as required in the question, which
both delegate to the private constructor:

\begin{lstlisting}
public Clock(int secondsSinceMidnight);
\end{lstlisting}
%
simply uses \lstinline{this(...)} to call the private \lstinline{Clock} constructor with the given number of seconds since midnight and the
\lstinline{SecondsSinceMidnight} display mode.

\begin{lstlisting}
public Clock(int hh, int mm, int ss);
\end{lstlisting}
%
uses method \lstinline{twentyFourHourToSecondsSinceMidnight} to convert the given hours, minutes and seconds into
a ``seconds since midnight value'', and uses \lstinline{this(...)} to call the private constructor with the
resulting value and the \lstinline{TwentyFourHour}
display mode.

The helper method \lstinline{twentyFourHourToSecondsSinceMidnight} is \textbf{static}.  This makes sense because the
method computes a straightforward function of its arguments: it does not depend on the state of any \lstinline{Clock}
object.

I have used some constants, such as \lstinline{SECONDS_IN_A_MINUTE} and \lstinline{MINUTES_IN_AN_}\lstinline{HOUR} to make the
code easy to read.  You might argue that I have gone overboard here, but I personally approve of using constants
instead of ``magic numbers'' wherever
possible, even for very well-known magic numbers.

Take a look at the \lstinline{toString} method and check you understand it, in particular the way the
\lstinline{padding} helper method is used to properly format the clock display.


\vspace{1mm}\emph{The AlarmClock class.}  Observe that \lstinline{AlarmClock} has two public constructors,
corresponding to the public constructors for \lstinline{Clock}.  Each adds new fields to represent the time
at which the alarm is set to go off.  Each constructor first uses \lstinline{super(...)} to call the appropriate
constructor of \lstinline{Clock}, then assigns to the new ``alarm'' fields.  Notice also that \lstinline{AlarmClock}
uses a boolean flag to decide whether the alarm is currently sounding; this is initialised to \emph{false}.

Check that you understand the (slightly complex) logic used in \lstinline{tick()} to determine whether the
alarm is sounding or not.

Look at the use of \lstinline{super} in \lstinline{toString}, to avoid duplicating code for displaying a
\lstinline{Clock} in \lstinline{AlarmClock}.  Also check you understand the use of the ternary operator in
\lstinline{toString}:
%
\begin{lstlisting}
(alarmSounding ? " " + beep() : "")
\end{lstlisting}
If \lstinline{alarmSounding} is \emph{true}, this operator returns a space followed by the result of method
\lstinline{beep()}.  Otherwise, the operator returns the empty string.

\vspace{1mm}\emph{The RadioAlarmClock class.}  I have modelled radio stations using an enumeration, \lstinline{RadioStation}.  This class (remember, an enum is a class) represents four different radio stations, and includes
a special \lstinline{None} value to model the case where a \lstinline{RadioAlarmClock} is not tuned to any station.

The constructors for \lstinline{RadioAlarmClock} mirror the constructors for \lstinline{AlarmClock} (which in turn
mirror the public constructors for \lstinline{Clock}).  Each constructor takes a time of day, an alarm time, and
a \lstinline{RadioStation}.

Notice that I have \emph{not} overridden \lstinline{toString()} to change the way a \lstinline{RadioAlarm}\lstinline{Clock} is
displayed.  The \lstinline{toString} method in \lstinline{AlarmClock} calls a method, \lstinline{beep()}, which
returns the string \lstinline{BEEP!}.  In \lstinline{RadioAlarmClock} I have overridden \lstinline{beep()}.  This means that
when \lstinline{toString()} is called on an instance of \lstinline{RadioAlarmClock}, the \lstinline{toString()} method
in \lstinline{AlarmClock} will execute.  This method calls \lstinline{beep()}, but because \lstinline{RadioAlarmClock}
overrides \lstinline{beep()} it is this overridden version of \lstinline{beep()} that will be called.

Now consider the implementation of \lstinline{beep()} in \lstinline{RadioAlarmClock}.  If the radio station field
of the radio alarm clock is \lstinline{None} then \lstinline{beep()} uses \lstinline{super} to invoke \lstinline{beep()}
in \lstinline{AlarmClock}.  Otherwise the \lstinline{getNoise()} method is called on the radio alarm clock's \lstinline{station}
field.  This illustrates the fact that enum classes can have instance methods.  Look at the implementation of \lstinline{getNoise()}
in \lstinline{RadioStation}.

\end{question}
