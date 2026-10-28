# 🚀 Ultimate Kotlin Language

A hands-on, structured curriculum for learning Kotlin from zero to advanced. Lessons are organized into numbered folders and include explanations, runnable `.kt` examples, exercises, and project briefs.

> Primary reference: [Official Kotlin Documentation](https://kotlinlang.org/docs/home.html)

## Learning outcomes

- Write Kotlin programs using variables, types, expressions, control flow, and functions.
- Model optional values with null safety.
- Use collections, classes, interfaces, data classes, sealed types, and generics.
- Apply lambdas, higher-order functions, extensions, delegation, and idiomatic Kotlin.
- Work with errors, files, Gradle, tests, and debugging.
- Understand coroutines, Java interoperability, and Kotlin Multiplatform.
- Build practical console projects and reason about algorithmic complexity.

## Environment setup

**Recommended:** IntelliJ IDEA with the Kotlin plugin and a supported JDK for Kotlin/JVM. For current requirements and installation steps, use the [official getting started guide](https://kotlinlang.org/docs/getting-started.html).

### macOS
Install IntelliJ IDEA using JetBrains Toolbox, then configure a supported JDK. If you prefer package-manager tools, check current Homebrew formulas and the official Kotlin compiler installation instructions before installing.

### Windows
Install IntelliJ IDEA and a supported JDK. You can optionally install the Kotlin command-line compiler using a package manager. Verify installation with `kotlinc -version` if the compiler is on your PATH.

### Linux
Install a supported JDK using your distribution's package manager, then install IntelliJ IDEA and/or the Kotlin command-line compiler using the official instructions.

> Tool installation commands and supported versions change over time; follow the official Kotlin and JetBrains instructions for your platform.

## Your first program

Create `Hello.kt`:

```kotlin
fun main() {
    val name = "Kotlin learner"
    println("Hello, $name!")
}
```

Compile and run with the Kotlin command-line compiler:

```bash
kotlinc Hello.kt -include-runtime -d hello.jar
java -jar hello.jar
```

You can also create a Kotlin/JVM project in IntelliJ IDEA and run `main` directly.

## Curriculum

| # | Module | Level |
|---:|---|---|
| 00 | Getting Started | Beginner |
| 01 | Variables and Basic Types | Beginner |
| 02 | Operators and Expressions | Beginner |
| 03 | Control Flow | Beginner |
| 04 | Functions | Beginner |
| 05 | Null Safety | Beginner |
| 06 | Strings, Ranges, and Arrays | Beginner |
| 07 | Collections | Beginner–Intermediate |
| 08 | Classes and Objects | Intermediate |
| 09 | Inheritance, Interfaces, and Sealed Types | Intermediate |
| 10 | Object Declarations and Data Classes | Intermediate |
| 11 | Functional Kotlin and Lambdas | Intermediate |
| 12 | Generics and Type System | Intermediate–Advanced |
| 13 | Extensions, Delegation, and DSLs | Advanced |
| 14 | Exceptions, Files, and I/O | Intermediate |
| 15 | Packages, Modules, and Gradle | Intermediate |
| 16 | Testing and Debugging | Intermediate |
| 17 | Coroutines and Concurrency | Advanced |
| 18 | Java Interoperability and JVM | Advanced |
| 19 | Kotlin Multiplatform Overview | Advanced |
| 20 | Idiomatic Kotlin and Design | Advanced |
| 21 | Algorithms and Problem Solving | All levels |
| 22 | Capstone Projects | Practical |

Each lesson folder contains a lesson guide, an `examples/Main.kt` file, and exercises. Advanced/platform-specific examples may require a configured Gradle project; their prerequisites are noted in the lesson.

## Study method

1. Follow the numbered modules in order.
2. Type and run examples rather than only reading them.
3. Change the examples and predict the result before running.
4. Complete exercises without copying a finished solution.
5. Track your progress in [PROGRESS.md](PROGRESS.md).
6. Finish the project briefs in `projects/`.

## Official resources

- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Tour](https://kotlinlang.org/docs/kotlin-tour-welcome.html)
- [Basic syntax](https://kotlinlang.org/docs/basic-syntax.html)
- [Kotlin API reference](https://kotlinlang.org/api/)
- [Coroutines guide](https://kotlinlang.org/docs/coroutines-guide.html)
- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). Please favor original explanations and examples, and link to official documentation instead of copying large sections.

## License

Original learning materials are provided under the MIT License. Linked official documentation remains subject to its own terms.
