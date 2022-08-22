import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
//      есть строка "java scala ruby kafka kafka ruby", посчитать количество повторений. Крайне желательно сделать с помощью Streams.

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        String inputStr = "java scala ruby kafka kafka ruby";
        Map<String, Long> repetitionAmountMap = Arrays.stream(inputStr.split(" ")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        String resultStr = repetitionAmountMap.toString();
        logger.log(Level.INFO, resultStr);
    }
}