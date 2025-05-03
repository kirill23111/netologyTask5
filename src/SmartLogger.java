import java.time.LocalDateTime;

public class SmartLogger implements Logger{
    public int count;
    public void log(String msg) {
        if (msg.contains("error") || msg.contains("ERROR")) {
            System.out.println("ERROR#" + count++ + "[" + LocalDateTime.now() + "]" + " " + msg);
        } else{
            System.out.println("INFO#" + count++ + "[" + LocalDateTime.now() + "]" + " " + msg);

        }
    }
}
