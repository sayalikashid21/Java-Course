// 1. Write a Java program which accept string from user and count number of capital characters.

import java.util.*;

class StringDemo
{
    public int CountCapital(String str)
    {
        int iCnt=0, iCount=0;

        char Arr[] = str.toCharArray();

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>='A' && Arr[iCnt]<='Z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class assi32_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iRet = 0;

        System.out.println("Enter the String: ");
        str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        iRet = dobj.CountCapital(str);

        System.out.println("Number capital characters are: "+iRet);

        sobj.close();
    }
}