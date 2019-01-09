[Back to questions](../README.md)

## bdb4: *Flawed house*

Can you find a design flaw in the following two classes?

* [Rectangle.java](../solutions/code/tutorialquestions/questionbdb4/flawed/Rectangle.java)
* [House.java](../solutions/code/tutorialquestions/questionbdb4/flawed/House.java)

Explain what the flaw is, and improve the classes to eliminate it.

**Hint:** This question is related to question [937d](questions/937d.md): the class
`House` should maintain an invariant that involves the members `floorSize`
and `floorArea`.  There are at least two ways in which this invariant can be invalidated,
despite the fact that no member variables are public.  Discuss both of them and propose ways for
improvement.
