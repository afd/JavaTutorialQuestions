[Back to questions](../README.md)

## 1aeb: *Generic number manipulation*

This question provides practice with \emph{bounded} generics and the use of \emph{wildcards}.

Recall that Java provides classes that wrap all the primitive numeric types.  E.g., \lstinline{Integer} is
 a wrapper for \lstinline{int}, and \lstinline{Double} is a wrapper for \lstinline{double}.  These classes
 all extend an abstract class, \lstinline{Number}, which provides general methods such as \lstinline{intValue()}
 and \lstinline{doubleValue()}, which convert any instance of \lstinline{Number} into an \lstinline{int}
 or \lstinline{double}, respectively.  (The conversion process may lead to truncation or rounding.
 E.g., converting a \lstinline{Double} to an \lstinline{int} may cause truncation,
 while converting an \lstinline{Integer} to a \lstinline{double} may cause rounding.)

In this question, your task is to write a class with generic methods for reading numbers from the command-line,
adding numbers, and converting numbers into doubles or ints.  The question is divided into a number of steps,
and there are hints for each step at the end of the sheet.

\vspace{1mm}\noindent\textbf{Step 1.} Write a generic interface, \lstinline{NumberParser}.  Write the
type parameter for this interface so that it can only be substituted by the \lstinline{Number} class,
or a subclass of \lstinline{Number}.  \lstinline{NumberParser} should specify two methods:

\begin{lstlisting}
// Convert String s into a Number of type E
public E parseNumber(String s);

// Return the name of the type to which E corresponds.  E.g., if E is Integer,
// the method should return "int"
public String typeParsed();
\end{lstlisting}

\vspace{1mm}\noindent\textbf{Step 2.} Write classes \lstinline{IntegerParser} and \lstinline{DoubleParser}
which implement the \lstinline{NumberParser} interface.  These classes should \emph{not} be generic: they
should implement \lstinline{NumberParser} with respect to specific subclasses of \lstinline{Number}---\lstinline{Integer}
and \lstinline{Double} respectively.  Write some simple programs to convince yourself that these classes are working.

\vspace{1mm}\noindent\textbf{Step 3.} Write a class, \lstinline{NumberManipulation}, with a static method
called \lstinline{readNumbers}.  The \lstinline{readNumbers} method should be generic: for some type \lstinline{T} that is
a subclass of \lstinline{Number} the method should take as parameters an integer \lstinline{n} specifying how many numbers should
be read from the command-line, and a \lstinline{NumberParser} capable of parsing numbers of type \lstinline{T}.  The method should
return a \lstinline{Set} with element type \lstinline{T}.

Your implementation of \lstinline{readNumbers} should repeatedly prompt the user to enter a number until \lstinline{n} numbers
have been read.  To tell the user which type of number they should enter, use the \lstinline{typeParsed()} method of the
\lstinline{NumberParser} parameter.  To actually parse the number, use a \lstinline{BufferedReader} to read a line from standard
input, and use the \lstinline{parseNumber()} method of the \lstinline{NumberParser} parameter to turn this into number of type
\lstinline{T}.

\vspace{0.5mm}\noindent\emph{Note:} It is recommended for this question that you use \lstinline{Set} from the Java standard library, rather than
the \lstinline{GenericSet} interface designed in \questionref{genericsets}.

\vspace{1mm}\noindent\textbf{Step 4.} Write a \lstinline{main} method in \lstinline{NumberManipulator}.  This method should obtain
a set of five doubles and a set of five integers from the command-line, by invoking the \lstinline{readNumbers()} method with appropriate arguments.
Test that this is working by printing to standard output the sets constructed by your program.

\vspace{1mm}\noindent\textbf{Step 5.} Write a generic interface, \lstinline{NumberAdder}.  Write the
type parameter for this interface so that it can only be instantiated by the \lstinline{Number} class,
or a subclass of \lstinline{Number}.  \lstinline{NumberAdder} should specify two methods:

\begin{lstlisting}
// Return a number of type T that represents zero
T zero();

// Return the sum of x and y
public T add(T x, T y);
\end{lstlisting}

\vspace{1mm}\noindent\textbf{Step 6.} Write classes \lstinline{IntegerAdder} and \lstinline{DoubleAdder}
which implement the \lstinline{NumberAdder} interface.  Like \lstinline{IntegerParser} and \lstinline{DoubleParser},
these classes should \emph{not} be generic: they
should implement \lstinline{NumberAdder} with respect to specific subclasses of \lstinline{Number}---\lstinline{Integer}
and \lstinline{Double} respectively.  Write some simple programs to convince yourself that these classes are working.

\vspace{1mm}\noindent\textbf{Step 7.} Add to \lstinline{NumberManipluator} a static method, \lstinline{addNumbers}.
The \lstinline{addNumbers} method should be generic: for some type \lstinline{T} that is
a subclass of \lstinline{Number} the method should take as parameters a \lstinline{Set} containing elements of
type \lstinline{T}, and a \lstinline{NumberAdder} capable of adding numbers of type \lstinline{T}.  The method should
return a number of type \lstinline{T} which should be the sum of all the numbers in the set.

\vspace{1mm}\noindent\textbf{Step 8.} Extend \lstinline{main} so that, after obtaining a set of ints and a set of
doubles, the sum of each of these sets is computed.  Test that this is working by printing to standard output the sets
and their sums.

\vspace{1mm}\noindent\textbf{Step 9.} Add to \lstinline{NumberManipulator} a static method, \lstinline{displayAsDoubles}.
The method should take one argument: a \lstinline{Set} whose element type is \lstinline{Number} or any subclass of
\lstinline{Number}.  The method should print the contents of the set to standard output, representing each set element
as a \lstinline{double}.  Add a corresponding method, \lstinline{displayAsInts}.  To implement these methods, why is
it essential that the set element type is a subtype of \lstinline{Number}?

\vspace{1mm}\noindent\textbf{Step 10.} Finally, extend your main method so that, after printing the sum of each set
entered by the user, the set of integers is printed as a set of doubles (using \lstinline{displayAsDoubles}) and
the set of \lstinline{doubles} is printed as a set of integers (using \lstinline{displayAsInts}).

An interactive session with your final program might look like this:

\begin{scriptsize}
\begin{verbatim}
Please enter five doubles, one line at a time
Please enter number of type double:
1.2
Please enter number of type double:
1.4
Please enter number of type double:
1.6
Please enter number of type double:
1.8
Please enter number of type double:
2.0
Please enter five ints, one line at a time
Please enter number of type int:
1
Please enter number of type int:
2
Please enter number of type int:
3
Please enter number of type int:
4
Please enter number of type int:
5
Sum of all doubles is 8.0
Sum of all ints is 15
Ints as doubles:
[ 1.0, 2.0, 3.0, 4.0, 5.0 ]
Doubles as ints
[ 2, 1, 1, 1, 1 ]
\end{verbatim}
\end{scriptsize}

\end{question}


\noindent\textbf{Hints for \questionref{boundedgenerics}.}

\vspace{1mm}
\noindent\textbf{Step 1.} You can write:

\begin{lstlisting}
interface NumberParser<T extends Number> { ...
\end{lstlisting}
%
to ensure that in instances of \lstinline{NumberParser}, \lstinline{T}
can only be substituted by \lstinline{Number} or one of its subclasses.

\vspace{1mm}
\noindent\textbf{Step 2.} To implement \lstinline{NumberParser} with
respect to the \emph{specific} type \lstinline{Double}, you can write:

\begin{lstlisting}
public class DoubleParser implements NumberParser<Double> { ...
\end{lstlisting}

Having done this, in the class body you should use \lstinline{Double}
wherever the interface uses the type parameter \lstinline{T}.

\vspace{1mm}
\noindent\textbf{Step 3.} The declaration for \lstinline{readNumbers} should
be as follows:

\begin{lstlisting}
public static <T extends Number> Set<T> readNumbers(int n, NumberParser<T> parser) throws IOException;
\end{lstlisting}

We write \lstinline{<T extends Number>} to say ``in the rest of the method declaration and body,
\lstinline{T} denotes some type that is either \lstinline{Number} or one of its subclasses''.

Why would the following declaration not be suitable?

\begin{lstlisting}
public static Set<Number> readNumbers(int n, NumberParser<Number> parser) throws IOException;
\end{lstlisting}

The method throws \lstinline{IOException} because it will use a buffered reader.

In the body of \lstinline{readNumbers}, you can create an instance of \lstinline{Set<T>} by writing:

\begin{lstlisting}
Set<T> result = new HashSet<T>();
\end{lstlisting}

\vspace{1mm}
\noindent\textbf{Step 4.} To read five doubles from standard input, you should simply be able to write:

\begin{lstlisting}
Set<Double> doubles = readNumbers(5, new DoubleParser());
\end{lstlisting}

\vspace{1mm}
\noindent\textbf{Step 5.} See hint for Step 1.

\vspace{1mm}
\noindent\textbf{Step 6.} See hint for Step 2.

\vspace{1mm}
\noindent\textbf{Step 7.} The signature for \lstinline{addNumbers} should be:

\begin{lstlisting}
public static <T extends Number> T addNumbers(Set<T> numbers, NumberAdder<T> adder);
\end{lstlisting}

In the body of \lstinline{addNumbers}, you should declare a \lstinline{result} variable that is initially set to zero:

\begin{lstlisting}
T result = adder.zero();
\end{lstlisting}

This should be followed by a loop over all elements of \lstinline{numbers}, using \lstinline{adder} to add each number
to \lstinline{result}.

\vspace{1mm}
\noindent\textbf{Step 8.} Given a set of doubles, you should be able to compute its sum by simply writing:

\begin{lstlisting}
double sumOfDoubles = addNumbers(doubles, new DoubleAdder());
\end{lstlisting}

\vspace{1mm}
\noindent\textbf{Step 9.} You might think that \lstinline{displayAsDoubles} should have the signature:

\begin{lstlisting}
public static void displayAsDoubles(Set<Number> numbers); // (*)
\end{lstlisting}

However, this is wrong: if \lstinline{doubles} has type \lstinline{Set<Double>}, then \lstinline{doubles}
cannot be passed as an argument to \lstinline{displayAsDoubles}, because \lstinline{Set<Double>} is not
a subtype of \lstinline{Set<Number>} (see \questionref{subtyping}).

The correct signature uses a \emph{wildcard}:

\begin{lstlisting}
public static void displayAsDoubles(Set<? extends Number> numbers); // (**)
\end{lstlisting}

To understand why this is correct, think of something you could write in the body of a method with signature (*)
that could cause runtime problems, but which would cause a compiler error if written in the body of a method
with signature (**).
