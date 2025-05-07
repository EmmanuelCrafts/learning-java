import java.util.Scanner;
public class Array2D {
    public static void main(String[] args){
        int[][] temp = new  int[3][7];

//        3 cities are in rows then 7 days for the column
        Scanner tempArray = new Scanner(System.in);
        for (int city = 0 ;city < temp.length ;city++){
            System.out.println("Enter temperature for city" + (city + 1));
            for (int day = 0 ; day < temp[city].length ;day++){
                System.out.print("day" + (day + 1) +":");
                temp[city][day] = tempArray.nextInt();
            }
        }
        tempArray.close();
        int cityNumber = 1;
        for(int[] row : temp ){
            int sum = 0;
            for (int value : row){
                sum += value;
            }
            int avgTemp = sum/7;
            System.out.println("Average temperature for city"+cityNumber +" is "+ ":"+ avgTemp);
            cityNumber++;
        }
//        if we wanted to print the arrays
//        for (int city = 0 ;city < temp.length ;city++) {
//            System.out.println("  city " + (city + 1) +":");
//            for (int day = 0; day < temp[city].length; day++) {
//                System.out.println("  day" + (day + 1) + ": " + temp[city][day]);
//            }
//        }
    }
}
//Q1. Write a Java program that stores the temperatures for 7 days in 3 cities using a 2D array.
// Then, use a nested for-each loop to print the average temperature of each city.