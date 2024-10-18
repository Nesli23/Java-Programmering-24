package codealongs.Java_playground;

public class Result {
    public static void main(String[] args) {
        int result = 0;
        for (int x = 1, y = 10; x < 5; x++, y--)
            result = result + x * y;
    }
}
