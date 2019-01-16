[Back to questions](../README.md)

## 2ffc: *Generic stacks*

\begin{question}{.}\label{question:genericstacks} \emph{Note:} even if you did not attempt the \textbf{string stack} question
of Sheet 3 (Question 13), you should still be able to attempt this question by starting with the Sheet 3 sample solutions.

Replace the `StringStack` interface of Question 13, Sheet 3, with an interface `GenericStack`
that can hold elements of \emph{any} given type, not necessarily `String`.

Replace the implementing classes `StringStackArray` and `StringStackList` with generic classes
`GenericStackArray` and `GenericStackList` that mimic the original classes, but store elements
of an \emph{arbitrary} type rather than strings.

This should be fairly straightforward, with one exception: in the constructor of `StringStackArray` you probably created
a new array of strings:

\begin{lstlisting}
elements = new String[STACK_LIMIT];
\end{lstlisting}

You would think (hope!) that the corresponding generic code would be:

\begin{lstlisting}
elements = new E[STACK_LIMIT];
\end{lstlisting}
%
where `E` is the generic type parameter.  However, this does not work.  Why?

See the end of the sheet for a hint on how to solve this issue.  (Also look at the source code
given as part of \questionref{treenodes} below.)

As in Question 13 of Sheet 3, write a `Demo` class with a static method, `transferStacks`.
However, this time `transferStacks` should be generic: given two generic stacks with the same type
parameter, it should transfer the contents of one to the other.

Write a `main` method that creates several stacks using different types (e.g., `String`,
`PrintStream`, or types from classes you have created yourself) and the two different representations
(`GenericStackArray` and `GenericStackList`).  Dem-onstrate that your stacks are working
by transferring contents between stacks, and showing the contents of a stack by popping its elements one
by one and displaying them.
\end{question}


\noindent\textbf{Hint for \questionref{genericstacks}.}  You cannot create a new array with generic element type `E`, but you
can create a new array with element type `Object` and cast it to an array with element type `E`.  The compiler will
complain that this cast is unchecked, and in general such a cast is not safe, but clearly it will work here because the new array is
empty.  You can shut the compiler up by adding the annotation:

\begin{lstlisting}
@SuppressWarnings("unchecked")
\end{lstlisting}
%
to the constructor of `GenericStackArray`.
