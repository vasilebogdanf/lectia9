package OOP.poly;

public class StaticPolyMain {
    public static void main(String[] args) {
        System.out.println(SumOfIntegeres(new int[]{12,132,10}));
        System.out.println(SumOfIntegeres("12,132,10"));
    }

    //
    public static int SumOfIntegeres(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    //"15,7.89,15000, 17000.5"
    public static int SumOfIntegeres(String numbers) {
        String numbersAsStrings[] = numbers.split(",");
        int sum = 0;
        for (int i = 0; i < numbersAsStrings.length; i++) {
            sum = sum + Integer.parseInt(numbersAsStrings[i].trim());
        }
        return sum;
    }


}
