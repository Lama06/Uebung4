package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2f;
        float fahrenheitFloat = 0;

        double celsiusDouble = 14.2;
        double fahrenheitDouble = 0;

        fahrenheitFloat = celsiusFloat * (9f/5f) + 32f;
        fahrenheitDouble = celsiusDouble * (9.0/5.0) + 32.0;

//        System.out.println(fahrenheitFloat);
//        System.out.println(fahrenheitDouble);
    }
}
