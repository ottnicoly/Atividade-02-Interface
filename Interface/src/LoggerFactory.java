public class LoggerFactory {
    private static LoggerConsole Loggerconsole;
    private static LoggerFile LoggerFile;

    public LoggerFactory(String logFileName) {
        this.Loggerconsole = new LoggerConsole();
        this.LoggerFile = new LoggerFile(logFileName);
    }

    public static void Loggerconsole(Level level, String message) {
        Loggerconsole.log(level, message);
    }

    public static void LoggerFile(Level level, String message) {
        LoggerFile.log(level,message);
    }
}
