import java.util.List;

public interface Observer {
    void update(String stockSymbol, double price);
}