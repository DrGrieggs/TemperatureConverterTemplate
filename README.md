# Temperature Converter Assignment

Welcome to your first Java programming assignment! This project will help you get familiar with GitHub Classroom while practicing basic Java programming concepts.
You'll be working on this project as a group, but graded individually. Once your group all submits, you're welcome to head out.

## Learning Objectives
- Understanding basic Java class and method structure
- Working with Git and GitHub
- Writing and running Java programs
- Understanding unit tests

## Getting Started

### Prerequisites
- Java JDK 11 or higher installed on your computer
- Git installed on your computer
- A code editor or IDE (I recommend VS Code)

### Setup Instructions
1. Accept the GitHub Classroom assignment link (provided by your instructor)
2. Clone your new repository to your local machine:
   ```bash
   git clone <your-repository-url>
   ```
3. Open the project in your preferred IDE

## Understanding the Project Structure
This project looks different from the single Java files you've worked with in zyBooks! That's because it's a complete Java project with testing capabilities. Here's what you'll find:

```
your-repository/
├── src/
│   ├── main/
│   │   └── java/          <- This is where you'll put your TemperatureConverter.java
│   └── test/
│       └── java/          <- This contains the tests that will check your code
├── build.gradle           <- This tells Java how to run your project
├── gradlew               <- These help run the project
└── gradlew.bat           <- on different computers
```

Don't worry about all these extra files! You only need to:
1. Create your `TemperatureConverter.java` file in the `src/main/java` directory
2. Write your code according to the requirements below
3. Commit and push your changes

The other files help me automatically test your code when you submit it.

## Your Tasks

### 1. Create TemperatureConverter.java
Create a new file called `TemperatureConverter.java` with a class that implements the following methods:

```java
public double toCelsius(double fahrenheit) {...}
public double toFahrenheit(double celsius) {...}
```

Requirements:
- The class name must be `TemperatureConverter`
- Method names must be exactly as shown above
- Methods must use the specified parameter names
- Methods must return double values
- Use the following formulas:
  - Celsius = (Fahrenheit - 32) × 5/9
  - Fahrenheit = (Celsius × 9/5) + 32

### 2. Implementation Details
Your code will be tested against unit tests, so make sure:
- Your class and method names match exactly
- Your calculations are accurate
- You use double precision for calculations
- You don't modify the method signatures

### 3. Testing Your Code
The repository includes unit tests that will verify your implementation. To pass the assignment:
- All tests must pass
- Your code must compile without errors
- Method names must match exactly as specified

## Submitting Your Work
You can submit your work as many times as required until the deadline.
Note: If you get an error about configuring "user.name" and "user.email" in Git, follow [this guide](https://www.reddit.com/r/vscode/comments/18eh8m0/help_configure_username_and_useremail/) to set up your Git configuration.

1. Commit your changes:
   ```bash
   git add TemperatureConverter.java
   git commit -m "Implemented temperature converter"
   ```

2. Push your changes to GitHub:
   ```bash
   git push origin main
   ```

## Grading Criteria
- [x] Correct implementation of toCelsius method (40%)
- [x] Correct implementation of toFahrenheit method (40%)
- [x] Code quality and documentation (20%)

## Need Help?
- Review the Java documentation on double precision calculations
- Visit office hours for additional support
- Review Git commands at [GitHub's Git Guide](https://github.com/git-guides)

Remember: The goal is to learn both Java and GitHub. Don't hesitate to ask questions if you get stuck!

## License
This project is licensed under the MIT License - see the LICENSE file for details
