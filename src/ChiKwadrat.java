import java.util.Scanner;

public class ChiKwadrat
{

    Scanner scanner = new Scanner(System.in);
    private int nX;
    private int nY;
    private double duzeN = 0;
    private double toSmieszneX = 0;
    private double [][] macierz;
    private double[][] macierz2;
    private double[] sumaWierszy;
    private double[] sumaKolumn;

    public ChiKwadrat()
    {

    }

    public double liczenie()
    {
        nX = wprowadzanieX();
        nY = wprowadzanieY();
        macierz = new double[nX][nY];
        macierz2 = new double[nX][nY];
        sumaWierszy = new double[nX];
        sumaKolumn = new double[nY];
        System.out.println("Wpisuj po kolei wartości macierzy według wierszy");

        //wypełnianie macierzy wartościami

        for(int i = 0;i < nX;i++)
        {
            for(int j = 0;j < nY;j++)
            {
                macierz[i][j] = scanner.nextInt();
                duzeN+=macierz[i][j];
            }
        }

        //Policzenie sum wierszy

        int k = 0;
        for(int i = 0;i < nX;i++)
        {
            for(int j = 0;j < nY;j++)
            {
                sumaWierszy[k]+=macierz[i][j];
            }
            k++;
        }

        //Policzenie sum kolumn

        k=0;
        for(int j = 0;j < nY;j++)
        {
            for(int i = 0;i < nX;i++)
            {
                sumaKolumn[k]+=macierz[i][j];
            }
            k++;
        }

         //Wypełnienie macierzy2 wartościami
        k=0;
        int l=0;
        for(int i = 0;i<nX;i++)
        {
            for(int j = 0;j<nY;j++)
            {
                macierz2[i][j] = (sumaKolumn[k]*sumaWierszy[l])/duzeN;
                k++;
            }
            k=0;
            l++;
        }
        //Liczenie tego śmiesznego X^2;
        for(int i = 0;i<nX;i++)
        {
            for(int j = 0;j<nY;j++)
            {
                toSmieszneX+=((macierz[i][j]-macierz2[i][j])*(macierz[i][j]-macierz2[i][j]))/macierz2[i][j];
            }
        }
        return toSmieszneX;

    }

    private int wprowadzanieX()
    {
        System.out.println("Ile jest wariantów cechy X?");
        int nX = scanner.nextInt();
        return nX;
    }

    private int wprowadzanieY()
    {
        System.out.println("Ile jest wariantów cechy Y?");
        int nY = scanner.nextInt();
        return nY;
    }




}
