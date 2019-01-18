[Back to questions](../README.md)

## 1aeb: *Generic number manipulation*

This question provides practice with *bounded* generics and the use of *wildcards*.

Recall that Java provides classes that wrap all the primitive numeric types.  E.g., `Integer` is
 a wrapper for `int`, and `Double` is a wrapper for `double`.  These classes
 all extend an abstract class, `Number`, which provides general methods such as `intValue()`
 and `doubleValue()`, which convert any instance of `Number` into an `int`
 or `double`, respectively.  (The conversion process may lead to truncation or rounding.
 E.g., converting a `Double` to an `int` may cause truncation,
 while converting an `Integer` to a `double` may cause rounding.)

In this question, your task is to write a class with generic methods for reading numbers from the command-line,
adding numbers, and converting numbers into doubles or ints.  The question is divided into a number of steps,
and there are hints for each step at the end of the sheet.

### Step 1
Write a generic interface, `NumberParser`.  Write the
type parameter for this interface so that it can only be substituted by the `Number` class,
or a subclass of `Number`.  `NumberParser` should specify two methods:

```
// Convert String s into a Number of type E
public E parseNumber(String s);

// Return the name of the type to which E corresponds.  E.g., if E is Integer,
// the method should return "int"
public String typeParsed();
```

### Step 2
Write classes `IntegerParser` and `DoubleParser`
which implement the `NumberParser` interface.  These classes should *not* be generic: they
should implement `NumberParser` with respect to specific subclasses of `Number`---`Integer`
and `Double` respectively.  Write some simple programs to convince yourself that these classes are working.

### Step 3
Write a class, `NumberManipulation`, with a static method
called `readNumbers`.  The `readNumbers` method should be generic: for some type `T` that is
a subclass of `Number` the method should take as parameters an integer `n` specifying how many numbers should
be read from the command-line, and a `NumberParser` capable of parsing numbers of type `T`.  The method should
return a `Set` with element type `T`.

Your implementation of `readNumbers` should repeatedly prompt the user to enter a number until `n` numbers
have been read.  To tell the user which type of number they should enter, use the `typeParsed()` method of the
`NumberParser` parameter.  To actually parse the number, use a `BufferedReader` to read a line from standard
input, and use the `parseNumber()` method of the `NumberParser` parameter to turn this into number of type
`T`.

*Note:* It is recommended for this question that you use `Set` from the Java standard library, rather than
the `GenericSet` interface designed in [question b401](b401.md).

### Step 4
Write a `main` method in `NumberManipulator`.  This method should obtain
a set of five doubles and a set of five integers from the command-line, by invoking the `readNumbers()` method with appropriate arguments.
Test that this is working by printing to standard output the sets constructed by your program.

### Step 5
Write a generic interface, `NumberAdder`.  Write the
type parameter for this interface so that it can only be instantiated by the `Number` class,
or a subclass of `Number`.  `NumberAdder` should specify two methods:

```
// Return a number of type T that represents zero
T zero();

// Return the sum of x and y
public T add(T x, T y);
```

### Step 6
Write classes `IntegerAdder` and `DoubleAdder`
which implement the `NumberAdder` interface.  Like `IntegerParser` and `DoubleParser`,
these classes should *not* be generic: they
should implement `NumberAdder` with respect to specific subclasses of `Number`---`Integer`
and `Double` respectively.  Write some simple programs to convince yourself that these classes are working.

### Step 7
Add to `NumberManipluator` a static method, `addNumbers`.
The `addNumbers` method should be generic: for some type `T` that is
a subclass of `Number` the method should take as parameters a `Set` containing elements of
type `T`, and a `NumberAdder` capable of adding numbers of type `T`.  The method should
return a number of type `T` which should be the sum of all the numbers in the set.

### Step 8
Extend `main` so that, after obtaining a set of ints and a set of
doubles, the sum of each of these sets is computed.  Test that this is working by printing to standard output the sets
and their sums.

### Step 9
Add to `NumberManipulator` a static method, `displayAsDoubles`.
The method should take one argument: a `Set` whose element type is `Number` or any subclass of
`Number`.  The method should print the contents of the set to standard output, representing each set element
as a `double`.  Add a corresponding method, `displayAsInts`.  To implement these methods, why is
it essential that the set element type is a subtype of `Number`?

### Step 10
Finally, extend your main method so that, after printing the sum of each set
entered by the user, the set of integers is printed as a set of doubles (using `displayAsDoubles`) and
the set of `doubles` is printed as a set of integers (using `displayAsInts`).

An interactive session with your final program might look like this:


```
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
```

### Hints

**Step 1.** You can write:

```
interface NumberParser<T extends Number> { ...
```

to ensure that in instances of `NumberParser`, `T`
can only be substituted by `Number` or one of its subclasses.

**Step 2.** To implement `NumberParser` with
respect to the *specific* type `Double`, you can write:

```
public class DoubleParser implements NumberParser<Double> { ...
```

Having done this, in the class body you should use `Double`
wherever the interface uses the type parameter `T`.

**Step 3.** The declaration for `readNumbers` should
be as follows:

```
public static <T extends Number> Set<T> readNumbers(int n, NumberParser<T> parser) throws IOException;
```

We write `<T extends Number>` to say "in the rest of the method declaration and body,
`T` denotes some type that is either `Number` or one of its subclasses".

Why would the following declaration not be suitable?

```
public static Set<Number> readNumbers(int n, NumberParser<Number> parser) throws IOException;
```

The method throws `IOException` because it will use a buffered reader.

In the body of `readNumbers`, you can create an instance of `Set<T>` by writing:

```
Set<T> result = new HashSet<T>();
```

**Step 4.** To read five doubles from standard input, you should simply be able to write:

```
Set<Double> doubles = readNumbers(5, new DoubleParser());
```

**Step 5.** See hint for Step 1.

**Step 6.** See hint for Step 2.

**Step 7.** The signature for `addNumbers` should be:

```
public static <T extends Number> T addNumbers(Set<T> numbers, NumberAdder<T> adder);
```

In the body of `addNumbers`, you should declare a `result` variable that is initially set to zero:

```
T result = adder.zero();
```

This should be followed by a loop over all elements of `numbers`, using `adder` to add each number
to `result`.

**Step 8.** Given a set of doubles, you should be able to compute its sum by simply writing:

```
double sumOfDoubles = addNumbers(doubles, new DoubleAdder());
```

**Step 9.** You might think that `displayAsDoubles` should have the signature:

```
public static void displayAsDoubles(Set<Number> numbers); // (*)
```

However, this is wrong: if `doubles` has type `Set<Double>`, then `doubles`
cannot be passed as an argument to `displayAsDoubles`, because `Set<Double>` is not
a subtype of `Set<Number>` (see [question 876b](876b.md)).

The correct signature uses a *wildcard*:

```
public static void displayAsDoubles(Set<? extends Number> numbers); // (**)
```

To understand why this is correct, think of something you could write in the body of a method with signature (*)
that could cause runtime problems, but which would cause a compiler error if written in the body of a method
with signature (**).
