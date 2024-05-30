package day2.session1;

import java.util.Arrays;
import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("please enter the mark:");
        double mark = sc.nextDouble();

        System.out.println("please enter the fullmark:");
        double fullmark = sc.nextDouble();

        double result = MyMethods.calmark(mark,fullmark);

        System.out.println("the result:"+MyMethods.fullmarkExceprtion(result));

        var gradeExceprition = MyMethods.fullmarkExceprtionAsArray(new double[] {80,23,66,34});
        System.out.println("the result as Array:"+ Arrays.toString(gradeExceprition));

//        var gradeExceprition = MyMethods.fullmarkExceprtionAsArray2(22,23,21,34);
//        System.out.println("the result as Array:"+ Arrays.toString(gradeExceprition));

    }
}
