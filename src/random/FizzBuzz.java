package random;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> printRandom(int n){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i<=n; i++){

            if (i%3 == 0 && i%5 != 0){
                list.add("Fizz");
                //System.out.println("Fizz");
                continue;
            }
            else if (i%5 == 0 && i%3 != 0){
                list.add("Buzz");
                //System.out.println("Buzz");
                continue;
            }

            if (i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
                //System.out.println("FizzBuzz");
            }
            else {
                list.add(Integer.toString(i));
                //System.out.println(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list=  printRandom(15);

        for (String key: list){
            System.out.println(key);
        }
    }
}
