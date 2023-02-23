package Math_utils;

public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;

    public Math_utils(String nameAPP, String version, int year)
    {
        this.nameAPP = nameAPP;
        this.version = version;
        this.year = year;
    }

    public void printApp()
    {
        System.out.println(
                this.nameAPP + " - " + this.version + " - " + this.year
        );
    }

    public void generateNaturalNumbers(int limit)
    {
        System.out.println("Generar numeros naturales (FOR)");
        for (int i = 1; i <= limit; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public void generatePairNumbers(int limit)
    {

    }

    public void getExtensionFromCI(String ci)
    {

    }
}
