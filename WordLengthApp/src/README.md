## to compile and build the java project
mvn clean install
## to 
java -cp target/WordLengthApp-1.0-SNAPSHOT.jar com.example.wordlength.App
## Breakdown:
java
This invokes the Java Runtime Environment (JRE) to run a Java application.

-cp or -classpath
This option specifies the classpath, i.e., where the Java runtime should look for compiled .class files and libraries (usually .jar files).

target/WordLengthApp-1.0-SNAPSHOT.jar
This is a wildcard that matches all .jar files in the current directory. These jars are added to the classpath.

⚠️ Important: This only works on Unix/Linux/macOS terminals (like Bash) where the shell expands *.jar into a list of files. On Windows CMD, this wildcard won't expand unless handled specifically.

com.example.wordlength.App
This is the fully qualified name of the main class (with a public static void main(String[] args) method) that you want to execute.