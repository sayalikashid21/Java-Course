// 3. Write a Java program which accept string from user and return difference between frequency of small characters and frequency of capital characters.

import java.util.*;

class StringDemo
{
    public int CountDiff(String str)
    {
        int iCnt=0, iCount=0, iCount1=0, iDiff=0;

        char Arr[] = str.toCharArray();

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>='A' && Arr[iCnt]<='Z')
            {
                iCount++;
            }
            if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                iCount1++;
            }
        }
        iDiff = iCount1 - iCount;
        return iDiff;
    }
}

class assi32_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iRet = 0;

        System.out.println("Enter the String: ");
        str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        iRet = dobj.CountDiff(str);

        System.out.println("Number capital characters are: "+iRet);

        sobj.close();
    }
}