import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Jakie zadanie chcesz wykonać?");
        System.out.println("1. Test niezależności chi - kwadrat");
        System.out.println("2. Współczynnik korelacji Pearsona");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        double wynik;

        switch (wybor)
        {
            case 1:
                ChiKwadrat chiKwadrat = new ChiKwadrat();
                wynik = chiKwadrat.liczenie();
                System.out.println("Wynik: " + wynik);
            break;

            case 2:
                Pearson pearson = new Pearson();
                pearson.liczenie();
            break;

            default:
                System.out.println("Zły wybór. Uruchom pogram od nowa, bo nie chce mi się pisać pętli");
                break;
        }
    }
}
