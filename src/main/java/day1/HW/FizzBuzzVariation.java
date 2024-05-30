package day1.HW;

//Mashael Alkhelaiwi

import java.util.ArrayList;

public class FizzBuzzVariation
{
    public static void main(String[] args)
    {
        System.out.println("Here are the answer of Fizz, Buzz, FizzBuzz and Jazz Variation question from 1 to 100:\n");
        FizzBuzzVariationArray();
    }
    public static void FizzBuzzVariationArray()
    {
        ArrayList <String> VariationArray = new ArrayList<>();

        for(int i=1; i<= 100 ; i++)
        {
            if (i%3==0 && i%5==0)
            {
                VariationArray.add("FizzBuzz");
            }
            else if (i%3==0)
            {
                VariationArray.add("Fizz");
            }
            else if (i%5==0)
            {
                VariationArray.add("Buzz");
            }
            else if (i%7==0)
            {
                VariationArray.add("Jazz");
            }
            else
                VariationArray.add(i+"");
        }

        for(String value: VariationArray)
        {
            System.out.println(value);
        }
    }
}
