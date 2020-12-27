import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //HashMap-->няма определена подредба, докато TreeMap има и подрежда стойностите в него, LinkedHashMap изкарва стойностите както са въведени,в същия ред
        Map<String,Integer> infectedByCity = new HashMap<>();
        //декларираме с примитивни ИНТИДЖЪРИ и стрингове
        String command = scanner.next();
        while (!command.equals("end")){
            if (command.equals("report")){
                String cityName = scanner.next();
                System.out.println(infectedByCity.get(cityName));
            }else {
                int newlyInfected = scanner.nextInt();
                // еднакво на проверката в иф-а е и долния ред от код
               // infectedByCity.putIfAbsent(command,0);
                Integer currentInfected = infectedByCity.get(command);
                // примитивната стойност може да съдържа в себе си NULL докато инт не може
                // тук проверката го приравнява на нула, защото на първата итерация currentInfected винаги ще е NULL
                if (currentInfected==null){
                    currentInfected=0;

                }
                infectedByCity.put(command,currentInfected+newlyInfected);
                                    // ключеове (еквивалентни на индекси в листовете)
                                    // това са стойностите на мапа

            }
            command = scanner.next();
            // цялото това решение е същото като това да разделяме инпута
            // на масив от стригове и да четем различните команди

        }
//        infectedByCity.keySet() обхожда/изкарва всички ключове( в случая Стринговете/градовете)
//        infectedByCity.values() изкарва всички Интиджър стойности (в случая бройката на заразените)
//        infectedByCity.entrySet() всичките записи
        //for each--> alt + enter iter и итерира мапа
        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
