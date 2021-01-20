[Back to questions](../README.md)

## Solution to [e6fd](../questions/e6fd.md): *Bit sets*

See code at `solutions/code/tutorialquestions/questione6fd`

The sample code solution is fairly intricate: study it in depth.  I'll describe the `remove` method of the `BitSet8` class in some detail here:

```
@Override
public void remove(int value) {
  if (inRange(value)) {
    representation &= (~((byte) 1 << (byte) value));
  }
}
```

The `@Override` annotation is used to indicate that a method of the `BitSet` interface is being implemented.

The `inRange` method checks whether it is possible for `value` to be in the bit set at all.  If it is not, there is no need to remove `value` as it is guaranteed to not be present.

The expression `(byte) 1 << (byte) value` yields the binary number with zeros everywhere except bit `value`.  Applying the `~` operator to this binary number gives the binary number with ones everywhere except bit `value`.  The `representation` field, which stores the current state of the bit set, is then updated to be the bitwise and of itself and the shifted, negated expression.  This "masks off" bit `value`: if it was not set, it will remain not set; if it was set, it will no longer be set.  This has the effect of removing `value` from the set.

Notice that the `remove` method of `BitSet64` is almost identical.  Unfortunately it is *not* possible to avoid this duplication, because the `representation` fields of these classes have different types.

The `BitSetArray` class uses an array of `long` values to store an arbitrarily large bit set.  Method `index` determines which array element contains the bits relevant to a number `value`.  Once this element has been found, `bitWithinCell` is used to work out the bit of this array element corresponding to `value`.

Have a look at the `intersectWith` methods of all three bit set implementations.  They each do an `instanceof` check to decide whether the incoming bit set has the same type as the receiving bit set.  If this is the case, intersection can be performed very efficiently.  Otherwise, a default intersection algorithm is used.  The default algorithm is duplicated between the implementations.  It would be possible to avoid this duplication using an abstract class.  Try this out as an exercise.

The `Demo` class shows the bit sets in action, and demonstrates that intersection between different sorts of bit sets is possible.
