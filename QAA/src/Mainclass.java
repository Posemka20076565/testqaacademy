import Currency.Currency;
import Currency.Btc;
import Currency.KazahValue;
import Currency.Dollar;
import Currency.euro;
import libs.Calc;
import libs.WorkWithMAssive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Mainclass {
    public static void main(String[] arg) {

        int var1, var2, lala1, lsklkad2;
        var1 = 1;
        var2 = 2;
        lala1 = 4;
        lsklkad2 = 9;
        System.out.println("resultado=" + (var1 + var2));
        System.out.println("Stranno no minus = " + (lala1 - lsklkad2));
        Calc.sum(var1, var2);
        Calc.stringdod("tets", "kdcxkxkixsikkmix");
        Calc.sum(19, 10);
        Calc.min(1, 3);
        System.out.println(Calc.sumstr("text", 3) + "kcjkcjc");
        System.out.println(Calc.strint(21647, "21474о83647"));
        System.out.println("----END----");

        int[] ourMassive = {2, 4, 288, 6, 28, 10, 9, 20, 33};
        System.out.println(ourMassive[0]);
        System.out.println(ourMassive.length);
        for (int i = 0; i < ourMassive.length; i++) {
            System.out.println(ourMassive[i]);
        }
        for (int i = 0; i < ourMassive.length; i++) {
            if (10 == ourMassive[i]) {
                System.out.println("Ravno 10");
            }
            if (10 < ourMassive[i]) {
                System.out.println("Bolshe 10");
            }
            if (10 > ourMassive[i]) {
                System.out.println("Menshe 95");
            }
        }
        Calc.delenyedouble(5, 0);
        System.out.println();
        int[][] masivMasiv = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        WorkWithMAssive workWithMAssive = new WorkWithMAssive();
        workWithMAssive.printMassive(masivMasiv);

        int[][] massivMassiv2 = new int[2][2];
        WorkWithMAssive workWithMAssive2 = new WorkWithMAssive();
        workWithMAssive.addMassive2(massivMassiv2);

        List<String> ourList = new ArrayList<String>();
        ourList.add("Test");
        ourList.add("Test122121");
        System.out.println(ourList);
        System.out.println(ourList.size());
        System.out.println(ourList.get(1));
        System.out.println("Size =" + ourList.size());
        ourList.remove(1);
        System.out.println(ourList.get(0));
        ourList.add("test2");
        System.out.println(ourList);

        ArrayList<String> ourList2 = new ArrayList<>();
        ourList2.add("value1");
        System.out.println(ourList2);
        ourList2.addAll(0, ourList);
        System.out.println(ourList2);

        List<List<Integer>> ourListList = new ArrayList<>();
        System.out.println(ourListList);
        ourListList.add(new ArrayList<Integer>());
        System.out.println(ourListList);
        ourListList.get(0).add(211);
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.get(1).add(5);
        ourListList.get(1).add(10);
        System.out.println(ourListList.get(1).get(1));
        ourListList.get(1).add(0, 8);
        ourListList.add(1, new ArrayList<>());
        System.out.println(ourListList);

        ArrayList<Integer> listInteger = new ArrayList();
        listInteger.add(333);
        listInteger.add(444);
        ourListList.add(new ArrayList<>());
        ourListList.get(3).addAll(listInteger);
        System.out.println(ourListList);
        listInteger.add(555);
        ourListList.add(0, listInteger);
        System.out.println(ourListList);
        ourListList.get(3).add(666);
        System.out.println(ourListList);

        HashMap<String, String> ourMap = new HashMap<>();
        ourMap.put("KEY1", "TEST2");
        System.out.println(ourMap);
        System.out.println(ourMap.get("KEY1"));
        ourMap.put("KEy2", "test2");
        System.out.println(ourMap);
        System.out.println(ourMap.get("KEy2"));

        ArrayList<HashMap<String, String>> ourListmap = new ArrayList<>();
        ourListmap.add(new HashMap<>());
        ourListmap.get(0).put("Key11", "TESTO");
        System.out.println(ourListmap);
        System.out.println(ourListmap.get(0).get("Key11"));
        ourListmap.get(0).put("Pass", "Valiut");
        System.out.println(ourListmap.get(0).get("Pass"));
        ourListmap.get(0).put("Value11", "Val22");
        System.out.println(ourListmap.get(0).get("Value11"));
        ourListmap.add(new HashMap<>());
        ourListmap.get(1).put("Value1", "Val22");
        System.out.println(ourListmap.get(1).get("Value1"));
        ourListmap.add(new HashMap<>());
        ourListmap.add(ourMap);
        System.out.println(ourListmap);
        for (HashMap elementOfMap : ourListmap
        ) {
            System.out.println(elementOfMap);
        }
        Dollar dollar = new Dollar(28);
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(28.55);
        System.out.println(dollar.getKursNBU());
        euro euro = new euro(28.55);
        System.out.println(euro.getKursNBU());
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(26.55);
        System.out.println(dollar.getKursNBU());
        System.out.println(dollar.getMarga());
        System.out.println(euro.getMarga());
        /* Currency currency =new Currency(55);*/
        KazahValue kaza = new KazahValue(10000.30);
        System.out.println(kaza.getKursNBU());

        int[][] massivMassiv4 = new int[5][5];
        WorkWithMAssive workWithMAssive3 = new WorkWithMAssive();
        workWithMAssive.makeDiagonal2(massivMassiv4);

        kaza.exchangeCurrencyToGrn(100);
        kaza.exchangeCurrencyToGrn(400);
        System.out.println(kaza.exchangeCurrencyToGrn(1));
        Btc bitcoin = new Btc(-40000);
        System.out.println(bitcoin.exchangeCurrencyToGrn(8));
        System.out.println(dollar.getCurrencyName());
        bitcoin.setMarga(-0.4);
        System.out.println(bitcoin.getMarga());
    }
}
