import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(false, 35));
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("width:");
            double num1 = scanner.nextDouble();
            System.out.println("height");
            double num2 = scanner.nextDouble();
            System.out.println(area(num1, num2));
        } catch (Exception ex){
            System.out.println("invalid input");
        }
        try{
            System.out.println("Radius:");
            double radius = scanner.nextDouble();
            System.out.println(area(radius));
        }catch(Exception ex){
            System.out.println("invalid input");
        }
    }
    public static boolean shouldWakeUp(boolean bool, int num){
        return bool && num < 19 && num > 7;
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        return (age1 > 12 && age1 < 20) ||
                (age2 > 12 && age2 < 20) ||
                (age3 > 12 && age3 < 20);
    }
    public static boolean isCatPlaying(boolean summer, int degree){
        if(summer){
            return degree < 46 && degree > 24;
        } else return degree < 36 && degree > 24;
    }
    public static double area(double num1, double num2){
        if(num1 < 0 || num2 < 0){
            return -1;
        } else{
            return num1 * num2;
        }
    }
    public static double area(double radius){
        if(radius < 0){
            return -1;
        } else{
            return radius * radius * Math.PI;
        }
    }
}