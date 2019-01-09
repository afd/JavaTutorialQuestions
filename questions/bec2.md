[Back to questions](../README.md)

## bec2: *Music collection*

Write a class, `Record`, to represent records that have been released by music artists.
An instance of `Record` should consist of a *title* (a string) and a *genre*,
which should be one of *rock*, *pop* or *jazz*.  You should use an enumerated type,
`Genre`, to represent these.

Write another class, `Artist`, representing a music artist.  An instance of `Artist`
should consist of a *name* (a string), a *catalogue* (a list of `Record`s) and a *main genre*
(a `Genre`).  The latter
is the genre of music that this artist tends to record.

`Artist` should contain the following methods:

```
// Add a record of the given name to the artist's catalogue
// Use the artist's main genre as the record's genre
public void addRecord(String name);

// Add a record of the given name and genre to the artist's
// catalogue
public void addRecord(String name, Genre genre);

// Display the artist's catalogue
public void showCatalogue();

// Display the subset of artist's catalogue that falls into
// the given genre
public void showGenre(Genre genre);
```

To represent an artist's catalogue, you can use an array, or you can
use the Java `List` interface
and `ArrayList` class.
You will see examples of these in the lectures and labs in due course,
but feel free to read the Java tutorials, look at the Java APIs and search
online for examples of how they can be used.
