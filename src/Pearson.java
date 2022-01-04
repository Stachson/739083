import java.util.Scanner;

public class Pearson
{

    Scanner scanner = new Scanner(System.in);
    private int nX;
    private double WKP;
    private double a;
    private double licznik = 0;
    private double licznikSrednia = 0;
    private double mianownikSrednia = 0;
    private double mianownik = 0;
    private double mianownikWKP_1 = 0;
    private double mianownikWKP_2 = 0;
    private double mianownikWKP = 0;
    private double [] wierszGórny;
    private double [] wierszDolny;

    public Pearson()
    {


    }

    public void liczenie()
    {
        nX = wprowadzanieX();
        wierszGórny = new double[nX];
        wierszDolny = new double[nX];

        System.out.println("Wprowadz po kolei wartości z górnego rzędu");
        for(int i = 0;i<nX;i++)
        {
            wierszGórny[i] = scanner.nextDouble();
            licznikSrednia +=wierszGórny[i];
        }
        licznikSrednia = licznikSrednia/nX;
        //System.out.println(licznikSrednia);

        System.out.println("Wprowadz po kolei wartości z dolnego rzędu");
        for(int i = 0;i<nX;i++)
        {
            wierszDolny[i] = scanner.nextDouble();
            mianownikSrednia += wierszDolny[i];
        }
        mianownikSrednia = mianownikSrednia/nX;
        //System.out.println(mianownikSrednia);

        for(int i = 0;i<nX;i++)
        {
            licznik += ((wierszGórny[i]-licznikSrednia)*(wierszDolny[i]-mianownikSrednia));
            mianownik += ((wierszGórny[i]-licznikSrednia)*(wierszGórny[i]-licznikSrednia));
            mianownikWKP_1 += (wierszGórny[i]-licznikSrednia)*(wierszGórny[i]-licznikSrednia);
            mianownikWKP_2 += (wierszDolny[i]-mianownikSrednia)*(wierszDolny[i]-mianownikSrednia);
        }

        mianownikWKP = mianownikWKP_1*mianownikWKP_2;
        double sqrt = Math.sqrt(mianownikWKP);
        WKP = licznik/sqrt;
        a = licznik/mianownik;
        double b;
        b = mianownikSrednia-(a*licznikSrednia);
        System.out.println("WKP: " + WKP);
        System.out.println("a: " + a);
        System.out.println("b: " + b);



    }

    private int wprowadzanieX()
    {
        System.out.println("Wprowadz ilość kolumn: ");
        int nX = scanner.nextInt();
        return nX;
    }





}
