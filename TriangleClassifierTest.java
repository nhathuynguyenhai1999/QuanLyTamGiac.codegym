package QuanLyTamGiac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    void testClassifyTriangle() {
        assertEquals("Tam giác đều", TriangleClassifier.classifyTriangle(2, 2, 2));
        assertEquals("Tam giác cân", TriangleClassifier.classifyTriangle(2, 2, 3));
        assertEquals("Tam giác thường", TriangleClassifier.classifyTriangle(3, 4, 5));
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(8, 2, 3));
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(-1, 2, 1));
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(0, 1, 1));
    }
}

