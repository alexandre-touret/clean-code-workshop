# FUNCTIONS

## Theory

__"The first rule of functions is that they should be small. The second rule of functions is that they should be smaller than that."__

### Do one thing

__"Functions should do one thing. They should do it well. They should do it only"__

Sometimes it's hard to tell if a function does only one thing or more.
So a way to know that a function is doing more than "one thing" is if you can extract another function from it with a name that is not merely a restatement of its implementation.

### Function arguments

A function shouldn’t have more than 3 arguments.
Keep it under 3 is best.
When a function seems to need more than two or three arguments, it is likely that some of those arguments ought to be wrapped into a class of their own.

https://refactoring.guru/refactoring/smells/bloaters

### Side effects

Side effects are lies. Your function promises to do one thing, but it also does other hidden things.
So if a function do something more than what you expect, you can have modification in your program you don't want.

## Katas

Review all the classes which are in the package [``...bad``](src/main/java/info/touret/workshop/cleancode/function/bad) .
Copy them into the [``...good``](src/main/java/info/touret/workshop/cleancode/function/good) one and fix them regarding the advices given in this chapter.


__[Next Chapter : Comments](../03-comments/README.md)__
