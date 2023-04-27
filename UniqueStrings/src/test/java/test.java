

import org.example.UniqeString;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.example.UniqeString.uniqueString;


public class test {
    private UniqeString uniqeStringFinder;
    @Test
    public void uniqueStringSize() {
        System.out.println("Testing unique String count CHECK:");
        List<String> stringOfList= new ArrayList<>();
        stringOfList.add("SONA");
        stringOfList.add("SONA");
        stringOfList.add("JAVA");
        stringOfList.add("JAVA");
        final var UniqueActualCount=uniqueString(stringOfList);
        uniqeStringFinder.uniqueStringSize(stringOfList);
        Assertions.assertEquals(2,UniqueActualCount.size());
        System.out.println("size expected:2  size actual :"+UniqueActualCount.size());
    }
}
