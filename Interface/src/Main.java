public class Main {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory("interface.txt");

        LoggerFactory.Loggerconsole(Level.DEBUG, "Debug message");
        LoggerFactory.Loggerconsole(Level.WARNING, "Warning message");
        LoggerFactory.Loggerconsole(Level.ERROR, "Error message");

        LoggerFactory.LoggerFile(Level.DEBUG, "Debug message");
        LoggerFactory.LoggerFile(Level.WARNING, "Warning message");
        LoggerFactory.LoggerFile(Level.ERROR, "Error message");
    }
}