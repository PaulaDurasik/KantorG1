package menu;

import java.util.Scanner;

public class CurrencyMenu implements MenuInterface {

    public void display() {


        System.out.println("=====================");
        System.out.println("    Kursy walut: ");
        System.out.println("=====================");

        System.out.println("\nWybierz jedną z opcji:");
        System.out.println("1 - Podaj aktualny kurs walut");
        System.out.println("Exit - wróć do menu głównego");

        menuChoose();

    }

    private void menuChoose(){

        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();



        while (true) {

            if ("1".equals(wybor)) {

                System.out.println("Wybrałeś stronę kursów walut:");
            } else

            if ("Exit".equals(wybor)) {
                break;
            }
        }
    }
}
