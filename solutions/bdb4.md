[Back to questions](../README.md)

## Solution to [bdb4](../questions/bdb4.md): *Flawed house*

See code at `solutions/code/tutorialquestions/questionbdb4`

The problem is rather similar to question [937d](937d.md).  The `House` class should
enforce the invariant:

```
floorArea == floorSize.getWidth() * floorSize.getHeight()
```

which can easily be invalidated despite the fact that class `Rectangle` has no
public fields.

The first way of destroying the invariant is:

```
House h = new House(new Rectangle(10, 20));
h.getFloorSize().setWidth(50);
```

The `getFloorSize()` method returns a reference to a `Rectangle`
object held by `h`, which is then changed without `h`'s knowing.

The second way of destroying the invariant is:

```
Rectangle r = new Rectangle(10, 20);
House h = new House(r);
r.setWidth(50);
```

The problem is that the reference `r` points to the inner part of `h`,
which allows us to change the state of `h` without `h`'s knowledge.

This may not seem like an important problem; however, in practice, similar situations often happen unintentionally.

A simple way of handling both problems is to modify `House` so that it keeps a private
internal copy of a `Rectangle` that is never made accessible to its clients.  This
solution is shown in the `fixed` sub-package: examine it carefully.  By completely
hiding the `floorSize` field from the outside world, we ensure that this field cannot
be changed without the enclosing `House` object's knowledge.

Other solutions are possible, e.g. we could make `floorArea` a computed attribute,
as suggested for the `area` attribute of `Rectangle` in question [937d](937d.md).
