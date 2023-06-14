# FORMATTING

## Theory

You should take care that your code is nicely formatted.
You should choose a set of simple rules that govern the format of your code, and then you should consistently apply those rules.

If you are working on a team, then the team should agree to a single set of formatting rules and all members should comply.

## Vertical formatting

How big should a source file be ?

it should be as small as you can.
Small files are usually easier to understand than large files are.

for example FitNesse is close to 50 000 lines, and most of the files are 200 lines long with an upper limit of 500.

### The newspaper metaphor

Think of a well-written newspaper article. You read it vertically. At the top you expect a
headline that will tell you what the story is about and allows you to decide whether it is
something you want to read.
The first paragraph gives you a synopsis of the whole story.As you continue downward, the details increase.

We would like a source file to be like a newspaper article. The name should be simple
but explanatory. It must tell you if you are in the right module or not.

### Vertical Openness Between Concepts

Each group of lines represents a complete thought. those thoughts should be separated from each other with blank lines.

## Indentation

A source file is a hierarchy rather like an outline.
To make this hierarchy of scopes visible, we indent the lines of source code in proportion to their position in the hierarchy.
Statements at the level of the file, such as most class declarations, are not indented at all. Methods within a class are indented one level to the right of the class.
Implementations of those methods are implemented one level to the right of the method declaration. Block implementations are implemented one level to the right of their containing block, and so on.


## Katas

Review all the classes which are in the package [``...bad``](src/main/java/info/touret/workshop/cleancode/formatting/bad) .
Copy them into the [``...good``](src/main/java/info/touret/workshop/cleancode/formatting/good) one and fix them regarding the advices given in this chapter.


__[Next Chapter : Objects and data structure](../05-objects-and-data-structure/README.md)__
