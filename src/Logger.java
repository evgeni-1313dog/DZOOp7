import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class Logger implements Ilog{
    @Override
    public void log(String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime + " "+ message);
    }
}
