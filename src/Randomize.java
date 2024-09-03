import java.util.Scanner;
import java.util.Random;

public class Randomize{
    public static void main (String[] args) {
        Mat mat = new Mat();
        Gen gen = new Gen();
        if ((mat.num1 > 1000000) || (mat.num2 > 100000)) {
            System.out.println("Неверно заданный диапазон");
        } else if (mat.num1 < 0) {
            System.out.println("Число должно  быть положительным: " + mat.num1);
        } else if (mat.num2 < 0) {
            System.out.println("Число должно  быть положительным: " + mat.num2);
        } else if (mat.num1 >= mat.num2) {
            System.out.println("Верхняя граница должна быть больше нижней: нижняя граница = " + mat.num1 + ", верхняя граница = " + mat.num2);
        }
        System.out.println("Сгенерированное число " +gen.randomInRange+ " в диапазоне от " +mat.num1+ " до " +mat.num2);
    }}

 class Mat{
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
}

class Gen{
    Mat mat = new Mat();
    int randomInRange = (int)(Math.random() * (mat.num2 - mat.num1 + 1) + mat.num1);

}











