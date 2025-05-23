# MarioEval Project

This project requires **Java 1.8** to compile and run.

## 🛠 Requirements

- **Java JDK 1.8** installed and available on your system `PATH`
- **Apache Ant** (version 1.7 or higher)

## 📦 Setting Up Apache Ant

If you don't have Ant installed:

### Windows

1. Download Ant from [https://ant.apache.org/bindownload.cgi](https://ant.apache.org/bindownload.cgi)
2. Extract the ZIP archive to a location like `C:\Ant`
3. Add the `bin` directory (e.g., `C:\Ant\bin`) to your system `PATH`
4. Set the `ANT_HOME` environment variable to the extracted directory (e.g., `C:\Ant`)

## Building the Project

To build the runnable JAR file:

```
ant
```

This uses the build.xml file and creates a file called MarioEval.jar in the current directory.

The JAR includes all necessary dependencies and uses a jar-in-jar loader.

##  Running the Program

Once the JAR is built, you can run it with:

```
java -jar MarioEval.jar
```

The actual main class that runs is:
```
edu.southwestern.tasks.mario.level.MarioLevelUtil
```


