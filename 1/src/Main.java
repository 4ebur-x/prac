//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет "+ name + "!");
        scanner.close();
    }
}