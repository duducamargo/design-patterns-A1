package logger;

public class LoggerSingleton {

    private static volatile LoggerSingleton instance;

    private LogSender sender;

    private LoggerSingleton() {
        sender = new LogSender();
    }

    public static LoggerSingleton getInstance() {

        if (instance == null) {  
            synchronized (LoggerSingleton.class) {
                if (instance == null) {  
                    instance = new LoggerSingleton();
                }
            }
        }

        return instance;
    }

    public void log(String type, String message) {
        String fullMessage = "[" + type.toUpperCase() + "] " + message;

        writeToFile(fullMessage);
        sender.send(fullMessage);
    }

    private void writeToFile(String message) {
        System.out.println("[FILE LOG] " + message);
    }
}
