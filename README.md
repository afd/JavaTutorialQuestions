# Java Programming: Ally's Tutorial Questions

The best way to learn a programming language and the concepts that underlie the language's design is to do *lots* of programming.

The aim of these tutorial questions is to give you the opportunity to write, inspect, debug and play with a bunch of reasonably small programs.  There are quite a lot of questions, they form part of the examinable material for the course, and thus I strongly encourage you to attempt *all* of them.

I also encourage you to explore your own variations of and extensions to the tutorial questions.  Think of extra features you could add to some
of the programs, and try to add them.

## When are these tutorials?

There aren't any.  I'm calling them "tutorial questions", but really the questions are for your own self-study.  I won't be running tutorial sessions during my part of the course; instead we will do lots of live coding in class.  While I might touch on a few of these questions, the vast majority of them won't be discussed.  Similarly, your programming tutor or undergraduate teaching assistant might choose to go over some of these questions during PPT sessions, but they are not part of the core material to be covered in PPT groups.

So, once again: do try out all the questions **in your own time** before the final test!

## When should I attempt each question?

The questions are presented in a reasonably logical order, but this order might not match exactly the order we cover material during the lectures.  I suggest that you try out each question as soon as you feel you've learned enough to have a stab at it.  I've indicated using links where there are dependencies between questions, and have tagged each question with one or more topic areas.

## Reporting errors

For everyone's benefit (including the benefit of future students), please email me ([afd](mailto:afd@ic.ac.uk)) if you find errors in these sheets or the sample solutions.

## If you get stuck

* Ask me for help after lectures and tutorials
* Attend the lab sessions and ask the lab helpers for advice
* Send me an email ([afd](mailto:afd@ic.ac.uk))

However, before you ask for help do make sure you have spent a significant
amount of time scratching your head and thinking about your problem, and looking for solutions in the lecture notes
and other available sources.  You will likely learn a lot by really trying to figure things out for yourself.
If you are still stuck after this then I, and the others involved in the course, will be very happy to help.

## Question labels, dependencies and tags

Each question is labelled with a 4-digit hex identifier, e.g. 98e3.

Some of the questions depend on other questions; I have indicated wherever this is the case, linking to the prerequisite question.

To help you decide how you should prioritise working through the questions, I have attached one or more tags to each question in the list below.  The tags are as follows:

* Recap: focuses on recapping basic imperative concepts of Java: loops, recursion, variables, arrays and enumerations.
* SimpleObjects: covers basic use of objects (with little or no use of interfaces, inheritance, etc.).
* Interfaces: covers concepts relating to Java interfaces.
* Functional: focuses on functional programming features of Java: streams, lambdas and method references.
* Inheritance: covers the design and implementation of subclasses.
* AbstractClasses: focuses on using abstract superclasses to share common state and methods among subclasses.
* Generics: focuses on building generic containers, and on technical aspects of Java generics.
* Exceptions: covers handling unexpected program behaviours using Java's exception mechanisms.
* MemoryManagement: explores the stack, heap and garbage collector.
* Advanced: Challenging questions that bring together many concepts covered during my part of the course.  If you can solve these questions using only the hints provided then you are doing *very* well!  You might prefer to work through these questions referring to the sample solutions along the way.

## The questions!

You can access the questions via the table below.  Solutions are provided for all questions, and code solutions for all questions are available at ```solutions/code```.  

It is totally up to you when to look at these.  I suggest you attempt each question without reference to its solution, and start to peek at the solutions when you get stuck, or when you believe you have made good progress on a question.

Much of Object Oriented Programming is not an exact science: there is a lot of room for creativity, and when designing an application one often has to make a choice between multiple imperfect approaches, each with different pros and cons.

As a result, you will likely find that some of your answers differ from the sample solutions.  When this is the case, think hard about whether the sample solution is better than your solution, whether your solution is better than the sample solution, or whether they are both viable alternatives.

I'm very happy to discuss alternative solutions.  Also, please get in touch if there are parts of the solutions that you do not understand, of if you spot errors.

| Label                     | Name                              | Topic tag(s)            | Depends on  | Solution |
|---------------------------|-----------------------------------|-------------------------|-------------|----------|
| [98e3](questions/98e3.md) | *... 1 4 2 1 4 2 1 ...*           | Recap                   |             | [Solution](solutions/98e3.md) |
| [f79b](questions/f79b.md) | *Perfect palindromic cubes*       | Recap                   |             | [Solution](solutions/f79b.md) |
| [4c70](questions/4c70.md) | *Lottery numbers*                 | Recap                   |             | [Solution](solutions/4c70.md) |
| [014e](questions/014e.md) | *Random numbers*                  | Recap                   |             | [Solution](solutions/014e.md) |
| [2d33](questions/2d33.md) | *Reversed order of input*         | Recap                   |             | [Solution](solutions/2d33.md) |
| [f7c3](questions/f7c3.md) | *Pig Latin*                       | Recap                   |             | [Solution](solutions/f7c3.md) |
| [67dd](questions/67dd.md) | *Word count*                      | Recap                   |             | [Solution](solutions/67dd.md) |
| [7ec8](questions/7ec8.md) | *Battling fighters*               | Recap, SimpleObjects    |             | [Solution](solutions/7ec8.md) |
| [8d24](questions/8d24.md) | *Lucky battling fighters*         | Recap, SimpleObjects    | [7ec8](questions/7ec8.md) | [Solution](solutions/8d24.md) |
| [bec2](questions/bec2.md) | *Music collection*                | Recap, SimpleObjects    |             | [Solution](solutions/bec2.md) |
| [c2b8](questions/c2b8.md) | *Irresponsible rectangle*         | SimpleObjects           |             | [Solution](solutions/c2b8.md) |
| [d363](questions/d363.md) | *Bloated person*                  | SimpleObjects           |             | [Solution](solutions/d363.md) |
| [7206](questions/7206.md) | *Understanding references*        | SimpleObjects           |             | [Solution](solutions/7206.md) |
| [937d](questions/937d.md) | *Flawed rectangle*                | SimpleObjects           |             | [Solution](solutions/937d.md) |
| [bdb4](questions/bdb4.md) | *Flawed house*                    | SimpleObjects           |             | [Solution](solutions/bdb4.md) |
| [0378](questions/0378.md) | *Comparing people*                | Interfaces              |             | [Solution](solutions/0378.md) |
| [6346](questions/6346.md) | *Depth of arithmetic expressions* | Interfaces              |             | [Solution](solutions/6346.md) |
| [e6fd](questions/e6fd.md) | *Bit sets*                        | Interfaces              |             | [Solution](solutions/e6fd.md) |
| [fe94](questions/fe94.md) | *Using Stream.map and Stream.filter* | Functional              |             | [Solution](solutions/fe94.md) |
| [68e6](questions/68e6.md) | *Using Stream.reduce*             | Functional              |             | [Solution](solutions/68e6.md) |
| [0f05](questions/0f05.md) | *Coloured points*                 | Inheritance             |             | [Solution](solutions/0f05.md) |
| [dd4c](questions/dd4c.md) | *Clocks*                          | Inheritance             |             | [Solution](solutions/dd4c.md) |
| [8f65](questions/8f65.md) | *Lucky battling fighters with inheritance* | Inheritance    | [8d24](questions/8d24.md) | [Solution](solutions/8f65.md) |
| [845d](questions/845d.md) | *Books and dictionaries*          | Inheritance             |             | [Solution](solutions/845d.md) |
| [e93f](questions/e93f.md) | *Apparent and actual types*       | Inheritance             |             | [Solution](solutions/e93f.md) |
| [d3f5](questions/d3f5.md) | *Streams and downcasting*         | Functional, Inheritance, Generics |             | [Solution](solutions/d3f5.md) |
| [5235](questions/5235.md) | *Equality between points*         | ObjectEquality          | [0f05](questions/0f05.md) | [Solution](solutions/5235.md) |
| [710c](questions/710c.md) | *The consequences of overriding `equals`* | ObjectEquality  | [5235](questions/5235.md) | [Solution](solutions/710c.md) |
| [aa68](questions/aa68.md) | *Symmetric equality testing*      | ObjectEqualilty         | [5235](questions/5235.md) | [Solution](solutions/aa68.md) |
| [0c21](questions/0c21.md) | *Properties*                      | AbstractClasses         |             | [Solution](solutions/0c21.md) |
| [236b](questions/236b.md) | *Fields for properties*           | AbstractClasses         | [0c21](questions/0c21.md) | [Solution](solutions/236b.md) |
| [5981](questions/5981.md) | *Shapes*                          | AbstractClasses         |             | [Solution](solutions/5981.md) |
| [dc38](questions/dc38.md) | *Email management system*         | AbstractClasses         |             | [Solution](solutions/dc38.md) |
| [1486](questions/1486.md) | *String stack*                    | Interfaces              |             | [Solution](solutions/1486.md) |
| [8a61](questions/8a61.md) | *Int set*                         | Interfaces              | [1486](questions/1486.md) | [Solution](solutions/8a61.md) |
| [85bb](questions/85bb.md) | *String stack iterators*          | AbstractClasses, Interfaces | [1486](questions/1486.md) | [Solution](solutions/85bb.md) |
| [a6e7](questions/a6e7.md) | *Int set iterators*               | AbstractClasses, Interfaces | [8a61](questions/8a61.md) [85bb](questions/85bb.md) | [Solution](solutions/a6e7.md) |
| [2ffc](questions/2ffc.md) | *Generic stacks*                  | Generics                | [1486](questions/1486.md) | [Solution](solutions/2ffc.md) |
| [b401](questions/b401.md) | *Generic sets*                    | Generics                | [8a61](questions/8a61.md) | [Solution](solutions/b401.md) |
| [336b](questions/336b.md) | *Evolving the Set interface*      | Interfaces, Advanced    | [b401](questions/b401.md) | [Solution](solutions/336b.md) |
| [17b1](questions/17b1.md) | *Default methods*                 | Interfaces, Advanced    |             | [Solution](solutions/17b1.md) |
| [96df](questions/96df.md) | *Tree nodes*                      | Generics                |             | [Solution](solutions/96df.md) |
| [7041](questions/7041.md) | *Cloning tree nodes*              | Generics                | [96df](questions/96df.md) | [Solution](solutions/7041.md) |
| [888a](questions/888a.md) | *Generic methods with streams*    | Generics, Functional    | [68e6](questions/68e6.md) | [Solution](solutions/888a.md) |
| [11e2](questions/11e2.md) | *Bounded generic methods with streams* | Generics, Functional |             | [Solution](solutions/11e2.md) |
| [c822](questions/c822.md) | *Problems cloning tree nodes*     | Advanced                | [7041](questions/7041.md) | [Solution](solutions/c822.md) |
| [735a](questions/735a.md) | *Generic iterators*               | Generics                | [85bb](questions/85bb.md) [a6e7](questions/a6e7.md) [b401](questions/b401.md) | [Solution](solutions/735a.md) |
| [876b](questions/876b.md) | *Generics and subclasses*         | Generics, Inheritance   |             | [Solution](solutions/876b.md) |
| [1aeb](questions/1aeb.md) | *Generic number manipulation*     | Generics                |             | [Solution](solutions/1aeb.md) |
| [b4a5](questions/b4a5.md) | *Observing the garbage collector* | MemoryManagement        |             | [Solution](solutions/b4a5.md) |
| [1ae9](questions/1ae9.md) | *Reusing immutable value objects* | MemoryManagement        | [0f05](questions/0f05.md) | [Solution](solutions/1ae9.md) |
| [290b](questions/290b.md) | *Memory leaks in Java*            | MemoryManagement, Advanced |          | [Solution](solutions/290b.md) |
| [5566](questions/5566.md) | *Exception-throwing stacks*       | Exceptions              | [1486](1486.md) | [Solution](solutions/5566.md) |
| [a22c](questions/a22c.md) | *No duplicate email addresses*    | Exceptions              | [dc38](questions/dc38.md) | [Solution](solutions/a22c.md) |
| [e093](questions/e093.md) | *Average of numbers*              | Exceptions              |             | [Solution](solutions/e093.md) |
| [7e2a](questions/7e2a.md) | *Stack overflow*                  | Exceptions              |             | [Solution](solutions/7e2a.md) |
| [30cd](questions/30cd.md) | *Heap exhaustion*                 | Exceptions              |             | [Solution](solutions/30cd.md) |
| [74d2](questions/74d2.md) | *Exceptions and inheritance (i)*  | Exceptions, Inheritance |             | [Solution](solutions/74d2.md) |
| [2862](questions/2862.md) | *Exceptions and inheritance (ii)* | Exceptions, Inheritance |             | [Solution](solutions/2862.md) |
| [153d](questions/153d.md) | *Exceptions and inheritance (iii)* | Exceptions, Inheritance |            | [Solution](solutions/153d.md) |
| [5d30](questions/5d30.md) | *Unreliable buffered reader*      | Exceptions              |             | [Solution](solutions/5d30.md) |
| [1171](questions/1171.md) | *Cloning graphs*                  | Advanced                |             | [Solution](solutions/1171.md) |
| [f763](questions/f763.md) | *Simulating garbage collection*   | Advanced                |             | [Solution](solutions/f763.md) |
| [9a9b](questions/9a9b.md) | *Transposing tunes*               | Advanced                |             | [Solution](solutions/9a9b.md) |
| [b33f](questions/b33f.md) | *Logging using a functional interface* | Advanced           | [888a](questions/888a.md) | [Solution](solutions/b33f.md) |

## More hex strings

When I am gone, if someone wants to add more questions then please consume the remaining [hex strings here](questions/hex_strings.md).
