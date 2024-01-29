package QuanLyTamGiac;

public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {
        if (isValidTriangle(a, b, c)) {
            if (a == b && b == c) {
                return "Tam giác đều";
            } else if (a == b || b == c || a == c) {
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        } else {
            return "Không phải là tam giác";
        }
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }
}
