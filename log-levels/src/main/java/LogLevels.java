import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        String[] mes=logLine.split(":");
        return mes[1].strip();
    }

    public static String logLevel(String logLine) {
        String[] mes=logLine.split(":");
        return mes[0].substring(1, mes[0].length()-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] mes=logLine.split(":");
        return LogLevels.message(logLine)+" ("+LogLevels.logLevel(logLine)+")";
    }
}
