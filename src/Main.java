public class Main {
    public static void main(String[] args) {
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        simpleLogger.log("Простое сообщение от SimpleLogger.");
        simpleLogger.log("Еще одно сообщение.");

        smartLogger.log("Информационное сообщение от SmartLogger.");
        smartLogger.log("Сообщение об ERROR в системе.");
        smartLogger.log("Еще одно информационное сообщение.");
    }
}