import io.LowerCaseInputStream;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTestSuite {
    @Test
    public void testIOStream() {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("E:/Dokumenty/Kodilla/Kodilla-Projects/head-first-design-patterns/chapter-three-pattern-decorator/src/main/resources/test.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
