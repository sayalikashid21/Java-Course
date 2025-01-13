// 5. Write a Java program which accept string from user and display in it reverse order.

import java.util.*;
import java.lang.*;

class StringDemo
{
    public void Reverse(String str)
    {
        int iCnt=0;
        String str1 = "";

        System.out.println("Original String is: "+str);

        System.out.print("Reverse String is: ");
        for(iCnt=str.length(); iCnt>0; iCnt--)
        {
            str1 = str1+str.charAt(iCnt-1);
        }
        System.out.println(str1);
    }
}

class assi32_5
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
       
        System.out.println("Enter the String: ");
        str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        dobj.Reverse(str);

        sobj.close();
    }
}