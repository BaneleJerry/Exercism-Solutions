public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(": ", 2)[1].strip();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1,logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
