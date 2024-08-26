# Clean Code

This project is a workshop about clean code principles. It's based on [the famous book Clean code by R. MARTIN](https://www.oreilly.com/library/view/clean-code-a/9780136083238/).
It aims to help (not only) beginners to embrace the principles described in the book. 

## Getting Started

### :wrench: Tools
#### If you want to execute this workshop locally
You **MUST** have set up these tools first:
* [Java 17+](https://adoptium.net/temurin/releases/?version=17)
* [Maven 3.9+](https://maven.apache.org/)
* [Docker](https://docs.docker.com/) & [Docker compose](https://docs.docker.com/compose/)
* Any IDE ([IntelliJ IDEA](https://www.jetbrains.com/idea), [VSCode](https://code.visualstudio.com/), [Netbeans](https://netbeans.apache.org/),...) you want
* [cURL](https://curl.se/), [jq](https://stedolan.github.io/jq/), [HTTPie](https://httpie.io/) or any tool to call your REST APIs



Here are commands to validate your environment:

**Java**

```jshelllanguage
java -version
    openjdk version "17.0.5" 2022-10-18
    OpenJDK Runtime Environment Temurin-17.0.5+8 (build 17.0.5+8)
    OpenJDK 64-Bit Server VM Temurin-17.0.5+8 (build 17.0.5+8, mixed mode, sharing)

```

**Maven**
```jshelllanguage
 mvn --version                                                                                                                                                                                   a696618@WL-941Y493 
Apache Maven 3.9.2 (c9616018c7a021c1c39be70fb2843d6f5f9b8a1c)
Maven home: /usr/local/sdkman/candidates/maven/current
Java version: 17.0.4, vendor: Eclipse Adoptium, runtime: /usr/local/sdkman/candidates/java/17.0.4-tem
Default locale: en_GB, platform encoding: UTF-8
OS name: "linux", version: "5.15.90.1-microsoft-standard-wsl2", arch: "amd64", family: "unix"

```


### Warmup
Clone this repository.

Check that everything is fine running this command:

```jshelllanguage
mvn clean install
```

### Gitpod

You can also run it into Gitpod:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#github.com/alexandre-touret/clean-code-workshop.git)


## Chapters

### [Meaningful Names](01-meaningful-names/README.md)
### [Functions](02-functions/README.md)
### [Comments](03-comments/README.md)
### [Formatting](04-formatting/README.md)
### [Objects and data structure](05-objects-and-data-structure/README.md)
### [Error Handling](06-error-handling/README.md)
### [Classes](07-classes/README.md)
### [Unit tests](08-unit-tests/README.md)
### [Smells and heuristics](09-smells-and-heuristics/README.md)


## Solutions

You can check the solution for each exercise on the ``solution`` branch.
