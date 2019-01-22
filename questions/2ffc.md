[Back to questions](../README.md)

## 2ffc: *Generic stacks*

*Note:* even if you had trouble completing [question 1486](1486.md) on **string stacks**, you could still attempt this question by starting with [sample solution for question 1486](../solutions/1486.md).

Replace the `StringStack` interface of [question 1486](1486.md), with an interface `GenericStack`
that can hold elements of *any* given type, not necessarily `String`.

Replace the implementing classes `StringStackArray` and `StringStackList` with generic classes
`GenericStackArray` and `GenericStackList` that mimic the original classes, but store elements
of an *arbitrary* type rather than strings.

This should be fairly straightforward, with one exception: in the constructor of `StringStackArray` you probably created
a new array of strings:

```
elements = new String[STACK_LIMIT];
```

You would think (hope!) that the corresponding generic code would be:

```
elements = new E[STACK_LIMIT];
```

where `E` is the generic type parameter.  However, this does not work.  Why?

See below for a hint on how to solve this issue.  (Also look at the source code
given as part of [question 96df](96df.md).)

Write a `Demo` class with a static method, `transferStacks`.
However, this time `transferStacks` should be generic: given two generic stacks with the same type
parameter, it should transfer the contents of one to the other.

Write a `main` method that creates several stacks using different types (e.g., `String`,
`PrintStream`, or types from classes you have created yourself) and the two different representations
(`GenericStackArray` and `GenericStackList`).  Dem-onstrate that your stacks are working
by transferring contents between stacks, and showing the contents of a stack by popping its elements one
by one and displaying them.

**Hint:**  You cannot create a new array with generic element type `E`, but you
can create a new array with element type `Object` and cast it to an array with element type `E`.  The compiler will
complain that this cast is unchecked, and in general such a cast is not safe, but clearly it will work here because the new array is
empty.  You can shut the compiler up by adding the annotation:

```
@SuppressWarnings("unchecked")
```

to the constructor of `GenericStackArray`.
