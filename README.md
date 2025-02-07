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
│   └── TemperatureConverter.java    <- Create your code here
├── test/
│   └── TemperatureConverterTest.java <- Tests that check your code
├── lib/
│   └── junit-platform-console-standalone-1.8.2.jar
└── .vscode/
    ├── launch.json    <- Helps VS Code run your code
    └── settings.json  <- Configures Java in VS Code
```
Don't worry about all these extra files! You only need to:
1. Create your `TemperatureConverter.java` file in the `src/` directory
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
- Include a main method that:
  - Uses Scanner to get a temperature in Fahrenheit from the user
  - Converts it to Celsius using your toCelsius method
  - Displays the result
- Use these formulas:
  - Celsius = (Fahrenheit - 32) × 5/9
  - Fahrenheit = (Celsius × 9/5) + 32

Example interaction:
```
Enter a temperature in Fahrenheit: 98.6
98.6F is equal to 37.0C
```

### 2. Running Your Code
To run your program in VS Code:
1. Open TemperatureConverter.java
2. Click the play button in the top right
   - If you don't see the play button, or you get an error try:
     1. Opening Command Palette (Ctrl+Shift+P or Cmd+Shift+P)
     2. Running "Java: Clean Java Language Server Workspace"
     3. Selecting "Restart and delete"
     4. Waiting for VS Code to rebuild

### 3. Testing Your Code
Your code will be tested in two ways:
1. Unit tests that check your conversion methods directly
2. Input/output tests that check your program's interaction with users

Both types of tests run automatically when you push your code.

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

Once this has all been submitted, you can refresh the github page, if you see a green checkmark, you're good to go.

## Grading Criteria
- [x] Compilation (20%)
- [x] Unit Tests (40%)
- [x] F to C Conversion I/O Test (40%)


## Need Help?
- Review the Java documentation on double precision calculations
- Visit office hours for additional support
- Review Git commands at [GitHub's Git Guide](https://github.com/git-guides)

Remember: The goal is to learn both Java and GitHub. Don't hesitate to ask questions if you get stuck!
