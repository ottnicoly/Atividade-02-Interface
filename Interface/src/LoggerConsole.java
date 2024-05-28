import java.time.LocalDateTime;

public class LoggerConsole implements Logger{

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void log(Level level, String message) {
        String dateTime = LocalDateTime.now().toString();
        String color;

        if (level == level.DEBUG) {
            color = ANSI_GREEN;
        } else if (level == level.WARNING) {
            color = ANSI_YELLOW;
        } else if (level == level.ERROR) {
            color = ANSI_RED;
        } else {
            color = ANSI_RESET;
        }
        System.out.println(color+dateTime+"["+level+"]"+message+ANSI_RESET);
    }
}