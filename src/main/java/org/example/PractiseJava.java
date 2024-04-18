package org.example;

import org.checkerframework.checker.units.qual.Length;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class PractiseJava {

    public static void main(String[] args) {



    }
}

    /* //find the duplicates in a string and print its count
        String word="malayalam";
        HashMap<Character,Integer> combination = new HashMap<Character, Integer>();

        for (int i=0;i<word.length();i++){
                if(combination.containsKey(word.charAt(i))){
                    combination.put(word.charAt(i),combination.get(word.charAt(i))+1);
                } else {
                    combination.put(word.charAt(i),1);
                }
            }
        for (Character car:combination.keySet()){
            if (combination.get(car)>1) {
                System.out.println("Characters " + car + " Counts " + combination.get(car));
            }
        }*/

/*    //find duplicates elements in an array
        int[] numbers={9,1,2,9,4,6,3,1,2,2};
        HashSet<Integer> duplicatenumbers =new HashSet<Integer>();
        int numberlength = numbers.length;
        for(int i=0;i< numberlength;i++){
            for(int j=i+1;j<numberlength;j++){
                if (numbers[i]==numbers[j]){
                    duplicatenumbers.add(numbers[i]);

                }
            }
        }
       for (int i:duplicatenumbers){
           System.out.println(i);
       }*/

//Program to reverse the words in a string
/*public class PractiseJava {
    ArrayList<String> reversedString= new ArrayList<>();

    public void reversString(String stringtobereversed){

        String name = stringtobereversed;
        String reversedName="";
        //System.out.println(name.charAt(0));
        int nameLength=name.length();
        //System.out.print(name);
        //System.out.println("Lengthof the Given name "+ nameLength);

        for (int i=nameLength-1;i<nameLength;i--){
            //System.out.println("Entered loop");
            reversedName=reversedName+name.charAt(i);
            //System.out.println(reversedName);
            if (reversedName.length()==nameLength){
                break;
            }
        }

        reversedString.add(reversedName);
        //System.out.print(reversedString+" ");
    }
    public void splitstring(String inputString){
        String unsplittedstring=inputString;
        String[] splittedstring=unsplittedstring.split(" ");
        System.out.println(Arrays.toString(splittedstring));

        for (String i:splittedstring){
            //System.out.println(i);
            reversString(i);
        }
        System.out.print(reversedString+" ");
    }
    public static void main(String[] args) {

        PractiseJava call = new PractiseJava();
        //call.reversString();
        call.splitstring("Good Morning Madhan");
    }
}*/
    /* //remove the special characters from the sting
        String mixedstring="Good1%^&Morning@!#";
        mixedstring=mixedstring.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(mixedstring);*/

/*//Sorting elements
        int seqnum[]={8,3,1,5,9,2,4,6,7};
        int temp;
        System.out.println("Before sorting"+ Arrays.toString(seqnum));

            for (int i=0;i< seqnum.length;i++){
                for (int j=i+1;j< seqnum.length;j++){
                    if (seqnum[j]<seqnum[i]){

                        temp=seqnum[i];
                        seqnum[i]=seqnum[j];
                        seqnum[j]=temp;
                    }
                }
            }
        System.out.println("After Sorting"+ Arrays.toString(seqnum));
            *//*for (int i=0;i<seqnum.length;i++){
                System.out.print(seqnum[i]);
            }*/

 /*//Maximum and Minimum Values in an Array
        int values[]={70,40,20,80,90,10};
        int max=values[0];
        int min=values[0];

        for (int i=1;i< values.length;i++){
            if (values[i]>max){
                max=values[i];
            }
            if (values[i]<min){
                min=values[i];
            }
        }
        System.out.println("Max value "+max+" Min Values "+min);*/

/*//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
        //Fibonacci Series
        ArrayList<Integer> FB = new ArrayList<Integer>();
        FB.add(0);
        FB.add(1);
        //System.out.println(FB.size());
        Scanner FiboSize = new Scanner(System.in);
        System.out.println("Input the number of Fibo required");
        int Fibolen = FiboSize.nextInt();

            while (FB.size()<Fibolen ){
            int FBS=FB.get(FB.size()-1) + FB.get(FB.size()-2);
            FB.add(FBS);
        }
        System.out.println(FB);*/

/*ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //int CarsSize= cars.size();
        //int i=1;

        // Get the iterator
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){

            System.out.println(it.next());

        }*/

/*HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("US", "Washington DC");
        //System.out.println(capitalCities);
        for (String capital : capitalCities.keySet())
        {
            System.out.println("Country :"+capital+" Cities :"+capitalCities.get(capital));
        }*/

/*   LocalDate Todaydate = LocalDate.now();
        System.out.println(Todaydate);
        LocalDateTime TodayDateTime =LocalDateTime.now();
        System.out.println(TodayDateTime);
        DateTimeFormatter Formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String FormatedDateTime = TodayDateTime.format(Formater);
        System.out.println(FormatedDateTime);*/

//MultiDimensional Array
/*int a[][] = {{10,4,5},{3,4,7},{8,2,1}};
        int b=a[0][0];
        int x=0;
        int y=0;

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {

                if(a[i][j]<b){
                    b=a[i][j];
                    x=i; //2
                    y=j; //0
                }

            }
        }
        System.out.println(b);
        int max=0;
        for(int i=0;i<=x;i++){
            for(int j=y;j<=y;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }

        }
        System.out.println(max);*/

/*int a[][] = {{2,4,5},{3,4,7},{1,2,9}};
        List<Integer> b =new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b.add(a[i][j]);

            }
        }
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);
        int smallestNumber =b.get(0);
        System.out.println(smallestNumber);*/

//      *
//      * *
//      * * *

       /* for (int i=1; i<=3;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\r");
        }*/
      /*  int count=0;
        for (int i=1;i<=4;i++){

            for(int j=i;j<=4;j++){
                count=count+1;
                System.out.print(" "+count);
            }
            System.out.println("\r");
        }*/

/*1
 * 2 3
 * 4 5 6
 * 7 8 9 10*/
        /*int count=1;
         for (int i=1; i<=4; i++){
             for (int j=1;j<=i;j++){
                 System.out.print(count+" ");
                 count++;
             }
             System.out.println("\r");

         }*/
/*1
 * 1 2
 * 1 2 3
 * 1 2 3 4*/
        /*for (int i=1; i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("\r");
        }*/
/*3
 * 6 9
 * 12 15 18*/
        /*int mul=1;
        for (int i=1;i<=3;i++){
            for (int j=1;j<=i;j++){
                int result=mul*3;
                System.out.print(result+" ");
                mul++;
            }
            System.out.println("\r");
        }*/
/*Program to reverse the String*/
        /*String name ="Madhan";
        String reversedName="";
        //System.out.println(name.charAt(0));
        int nameLength=name.length();
        System.out.print(name);
        System.out.println("Lengthof the Given name "+ nameLength);

        for (int i=nameLength-1;i<nameLength;i--){
            //System.out.println("Entered loop");
            reversedName=reversedName+name.charAt(i);
            //System.out.println(reversedName);
            if (reversedName.length()==nameLength){
                break;
            }
        }
        System.out.println("Reversed name "+reversedName);*/
