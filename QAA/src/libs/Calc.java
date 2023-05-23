package libs;

public class Calc {
    /**
     * Sum ints
     *
     * @param dodanok1
     * @param dodanok2
     */
    public static void sum(int dodanok1, int dodanok2) {
        System.out.println("sum = " + (dodanok1 + dodanok2));
    }

    public static void stringdod(String dod1, String dod2) {
        System.out.println("stringsum =" + dod1 + dod2);
    }

    public static void min(int min1, int min2) {
        System.out.println("sum = " + (min1 - min2));
    }

    public static void umn(int mnozh1, int mnozh2) {
        System.out.println("sum = " + (mnozh1 * mnozh2));
    }

    public static void dil(int dil1, int dil2) {
        System.out.println("suууцвуцвm = " + (dil1 / dil2));
    }

    public static String sumstr(String text1, int cifra2) {
        return text1 + cifra2;
    }

    public static Integer strint(int tex2t1, String cif2ra2) {
        try {
            Integer result = tex2t1 + Integer.parseInt(cif2ra2);
            System.out.println("Result =" + result);
            return result;
        }catch (NumberFormatException e){
            System.out.println("WRONG FORMAT");
            return 9999;
    }
        catch(Exception e){
            System.out.println("Error " + e);
            return 888;
        }
    }
    public static double delenyedouble (int var1, int var2){
        double result = (double) var1/var2;
        System.out.println(result);
        return result;
    }
}