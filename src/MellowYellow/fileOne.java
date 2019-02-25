package MellowYellow;

import java.beans.IntrospectionException;

public class fileOne {
    public static void main(String[] args) {
        Integer number;
        number=0;

        while (number<5){
            System.out.println(number);
            number++;
        }
        Integer num2;
        num2=0;

        do {
            System.out.println(num2);
            num2++;
        }while (num2<5);

        for (Integer i=10; i>0;i--){
            System.out.println(i);
        }

    }
}
