package libs;

public class WorkWithMAssive {

    public void printMassive(int[][] massiveFotPrint) {
        for (int i = 0; i < massiveFotPrint.length; i++) {
            for (int j = 0; j < massiveFotPrint[i].length; j++) {
                System.out.print(massiveFotPrint[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public int[][] addMassive2(int[][] massiveFotPrint) {
        for (int i = 0; i < massiveFotPrint.length; i++) {
            for (int j = 0; j < massiveFotPrint[i].length; j++) {
                System.out.print(massiveFotPrint[i][j] + " ");
            }
        }
    return massiveFotPrint;}


            public void addStroka (int[][] massiveFotPrint){
                for (int g = 0; g < massiveFotPrint.length; g++) {

                    System.out.println("");
                }
            }
    public static int[][] createMassive2d (int height, int length){
        int[][] ourMassive = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                ourMassive[i][j] = 0;
            }
        }
        return ourMassive;
    }
    public static void printMassive2d(int[][] massiveForPrint){
        for (int i=0; i < massiveForPrint.length; i++) {
            for (int j = 0; j < massiveForPrint[i].length; j++) {
                System.out.print(massiveForPrint[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static void printMassive1d(int[][] massiveForPrint){
        for (int i=0; i < massiveForPrint.length; i++) {
            for (int j = 0; j < massiveForPrint[i].length; j++) {
                System.out.print(massiveForPrint[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static int[][] makeDiagonal2 (int[][] diagonalMassive){
        for (int i = 0; i < diagonalMassive.length; i++) {
            for (int j = 0; j < diagonalMassive.length; j++) {
                if (i == diagonalMassive.length - j -1){
                    diagonalMassive[i][j] = 1;
                }
            }

        }
        printMassive2d(diagonalMassive);
        return (diagonalMassive);
    }

}





