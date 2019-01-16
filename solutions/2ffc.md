[Back to questions](../README.md)

## Solution to [2ffc](../questions/2ffc): *Generic stacks*

See code at `solutions/code/tutorialquestions/question2ffc`

\begin{question}{Generic stacks.}\label{question:genericstacks} Making the solution to the \textbf{string stack} question
of Sheet 3 (Question 8) generic is pretty straightforward: compare the sample solutions.

Some notes: in `GenericStackArray<T>` you will have a field:

\begin{lstlisting}
private T[] elements;
\end{lstlisting}

In the constructor of `GenericStackArray<T>` you cannot write:

\begin{lstlisting}
elements = new E[STACK_LIMIT];
\end{lstlisting}
%
---remember that one of the rules of generics is that it is not permissible to create a new
array with generic element type.  You can work around this by writing:

\begin{lstlisting}
elements = (E[])(new Object[STACK_LIMIT]);
\end{lstlisting}
%
i.e., creating a new array that can hold any sort of object, and casting this to the required array type.  The compiler
does not like this, because in general in the presence of such casts, the type-safety guarantees of generics do not hold.
The compiler can issue a warning.  You can \emph{suppress} this warning by adding:

\begin{lstlisting}
@SuppressWarnings("unchecked")
\end{lstlisting}
%
just before the declaration of the constructor.  What's the point of suppressing this warning?  It helps ensure that you
do not miss other important warnings that are mixed up in a sea of spurious warnings.

The need to cast arrays of objects in this way is the least elegant feature of Java's generics.

