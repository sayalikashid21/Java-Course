// 1. Write a java program which accepts 2 strings from user and concat N characters of second string after first string. Value of N should be accepted from user.

// Note : If third parameter is greater than the size of second string then concat whole string after first string.

import java.util.*;

class StringDemo
{
    public String StrNCatX(String src, String dest, int iCnt)
    {
        int i=0;
        //String str3 = null;
        char Arr[] = dest.toCharArray();

        if(iCnt > dest.length())
        {
            src =  src + dest;
        }

        if(iCnt <= dest.length())
        {
            for(i=0; i < iCnt; i++)
            {
                src = src + Arr[i];
            }
        }    
        return src;
    }
}

class assi36_1
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null, str2 = null;
        String iRet = null;
        int iNo = 0;

        System.out.println("Enter the first String: ");
        str1 = sobj.nextLine();

        System.out.println("Enter the second String: ");
        str2 = sobj.nextLine();

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        StringDemo aobj = new StringDemo();

        iRet = aobj.StrNCatX(str1, str2, iNo);

        System.out.println("Concat string is: "+iRet);

        sobj.close();
    }
}
