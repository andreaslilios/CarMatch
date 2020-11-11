
import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;

public class CarD2 {

    public static Scanner vehicle = new Scanner(System.in);
    public static ArrayList<Car2> cars = new ArrayList();   //LISTA TYPOY CAR2
    static ArrayList<Integer> list1 = new ArrayList();      //LISTA GIA TOYS IPPOYS
    static ArrayList<String> markes = new ArrayList();      //LISTA GIA TIS MARKES AMAKSIWN
    
    Random rand = new Random();
    static boolean f;   
    static int i = 0, j, horse, cub, pri, cod, maxnum, minnum;

    public static void main(String[] args) {

        Random rand = new Random();

        f = true;   //THN XRHSIMOPOIW GIA THN EISAGWGH AMAKSIOY STHN eisagwghCar()

        eisagwghCar();

        int[] number = new int[cars.size()];    //PINAKAS MONADIKWN KWDIKWN AMAKSIWN
        for (i = 0; i < cars.size(); i++) {
            number[i] = 100 + rand.nextInt(899);
        }
        for (i = 0; i < cars.size(); i++) {
            for (j = i + 1; j < cars.size(); j++) {
                if (number[i] == number[j]) {           //GEMIZW TOYS MONADIKOYS KWDIKOYS
                    number[i] = 100 + rand.nextInt(899);
                }
            }
        }

        for (i = 0; i < cars.size(); i++) {
            cars.get(i).setCode(number[i]);         // KAI TOYS ANATHETW 
        }
        System.out.println("-----------------------");
        System.out.println("cars size: " + cars.size());
        for (i = 0; i < cars.size(); i++) {
            cars.get(i).printer();                  // EMFANIZW THN EKTHESH AYTOKINHTWN
            System.out.println("-----------------------");
        }

        System.out.println("ANAZHTHSH BASH KWDIKOY");

        int kwdikos = rand.nextInt(cars.size());

        System.out.println("Tyxaios kwdikos pros anazitisi:" + " " + number[kwdikos]);
        for (i = 0; i < cars.size(); i++) {
            if ((number[kwdikos]) == cars.get(i).getCode()) {   //VAZW ENAN TYXAIO KWDIKO APTHN LISTA 
                System.out.println("O kwdikos parapempei sto autokinito " + cars.get(i).getCompany() + " " + cars.get(i).getModel());
                break;
            }
        }

        System.out.println("DIAGRAFH BASH KWDIKOY");
         cars.remove(kwdikos);

         for (i = 0; i < cars.size(); i++) {
         cars.get(i).printer();         // ME TON IDIO KWDIKO KANW THN DIAGRAFH KAI THN EPALHTHEVW
         }
         
         for (i = 0; i < cars.size(); i++) {
            markes.add(cars.get(i).getCompany());   
            
        }
      
        markes=XwrisDiplotypa(markes);  // TELIKH LISTA MARKES
        
        
        System.out.println("-----------------------");
        System.out.println("Oi markes ths ekthesis");   //EMFANISH PLHTHOYS MARKWN
        for (i = 0; i < markes.size(); i++) {
            System.out.println(markes.get(i));
        }
        System.out.println("-----------------------");
        max();                  // MAX IPPOI
        System.out.println();
        min();                  // MIN IPPOI
        System.out.println();
        aloga();                //MAX IPPOI/MARKA ,  MIN IPPOI/MARKA
        System.out.println();
        plithos();              // PLITHOS AMAKSIWN/MARKA
        System.out.println();
        System.out.println("Dwse pithanh timh pwlhsh");
        int value = vehicle.nextInt();
        sygkrisi(value);        //EMFANISH AMAKSIWN ME TIMI PWLHSHS< TIMH XRHSTH

    }
    
    public static ArrayList<String> XwrisDiplotypa(ArrayList<String> strings) {

    int size = strings.size();      // EPEIDH METAVALETAI TO MEGETHOS THS LISTAS
    
    for (int i = 0; i < size - 1; i++) {
        
        for (int j = i + 1; j < size; j++) {// GIA NA APOFYGW THN PERIPTWSH( i == j )
            
            if (!strings.get(j).equals(strings.get(i)))
                continue;
            
            strings.remove(j);
            j--;                
            size--;             //METAVALLW TO MEGETHOS THS LISTAS
        } 
    } 
    return strings;
    

}

    public static void eisagwghCar() {
        Car2 karo;
        String comp, col, mod;
        while (f) {             //OSO ISXYEI EISAGW AMAKSIA STHN EKTHESI

            System.out.print("ETAIREIA : ");
            comp = vehicle.nextLine();
 
            System.out.print("XRWMA : ");
            col = vehicle.nextLine();
            System.out.print("MONTELO : ");
            mod = vehicle.nextLine();
            System.out.print("IPPODYNAMH : ");
            horse = vehicle.nextInt();
            System.out.print("KYBIKA : ");
            cub = vehicle.nextInt();
            System.out.print("TIMH : ");
            pri = vehicle.nextInt();
            

            karo = new Car2(comp, col, mod, horse, cub, pri);   // DHMIOYRGIA ANTIKEIMENOY Car2
           
            cars.add(karo); //EISAGWGH ANTIKEIMENWN STHN LISTA
            System.out.println("---------------------------");
            System.out.println("Ean den xreiazeste allo aytokinito patiste 1 alliws 0");
            j = vehicle.nextInt(); // 0 H 1
            vehicle.nextLine();
            if (j == 1) {
                f = false;  // 1=OXI ALLO AMAKSI
            } else if (j == 0) {    //0=KI ALLH EISAGWGH
                System.out.println("eisagete neo aytokinito");
                System.out.println("-----------------------");
            }
            //i = 1;
        }

    }

    public static void max() {
        maxnum = Integer.MIN_VALUE;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getHorsepower() > maxnum) {
                maxnum = cars.get(i).getHorsepower();       // EYRESH MAX IPPWN
            }
        }
        for (int l = 0; l < cars.size(); l++) {
            if (maxnum == cars.get(l).getHorsepower()) {    //EYRESH AMAKSIOY ME MAX IPPOYS
                System.out.println("amaksi me Max ippoi :" + cars.get(l).getCompany() + cars.get(l).getModel());
            }
        }
    }

    public static void min() {
        minnum = Integer.MAX_VALUE;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getHorsepower() < minnum) {     //EYRESH MIN IPPWN 
                minnum = cars.get(i).getHorsepower();
            }
        }
        for (int l = 0; l < cars.size(); l++) {
            if (minnum == cars.get(l).getHorsepower()) {    //EYRESH AMAKSIOY ME MAX IPPOYS
                System.out.println("amaksi me Min ippoi : " + cars.get(l).getCompany() + " " + cars.get(l).getModel());
            }
        }

    }

    public static void plithos() {  //PLITHOS AMAKSIWN ANA MARKA
        int count = 0;

        for (int i = 0; i < markes.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if (markes.get(i).equalsIgnoreCase(cars.get(j).getCompany())) { //GIA TA DIPLOTYPA
                    count++;
                }
            }
            System.out.println(markes.get(i) + " : " + count + " " + "amaksia");
        }

    }

    public static void aloga() {        // MAX,MIN IPPOI/MARKA
        maxnum = Integer.MIN_VALUE;
        minnum = Integer.MAX_VALUE;

        for (int i = 0; i < markes.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if (markes.get(i).equalsIgnoreCase(cars.get(j).getCompany())) {
                    list1.add(cars.get(i).getHorsepower()); //LISTA IPPWN ANA AMAKSI GIA THN MARKA i
                }

            }

            for (int k = 0; k < list1.size(); k++) {
                if (list1.get(k) > maxnum) {
                    maxnum = list1.get(k);
                }
                if (list1.get(k) < minnum) {      
                    minnum = list1.get(k);
                }
            }
            for (int l = 0; l < cars.size(); l++) {
                if (maxnum == cars.get(i).getHorsepower()) {
                    System.out.println("Max ippoi/marka: " + cars.get(l).getCompany() + " " + cars.get(l).getModel());

                }
                if (minnum == cars.get(i).getHorsepower()) {
                    System.out.println("Min ippoi/marka: " + cars.get(l).getCompany() + " " + cars.get(l).getModel());
                }
                System.out.println();
            }
            list1.removeAll(list1);//MHDENIZW GIA THN NEA MARKA
        }

    }

    public static int sygkrisi(int value) { //SYGKRISH TIMH PWLHSHS-TIMH XRHSTH
        System.out.println("Megaluterh timh apthn proteinomenh exoun ta amksia:");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > value) {
                System.out.println(cars.get(i).getCompany() + cars.get(i).getModel());
            }
        }
        return 0;
    }

}
