//  3.  Write a program which 2 strings from user and check whether first N contents of two strings are  equal or not.

import java.util.*;

class StringDemo
{
    public boolean StrCmpX(String src, String dest, int iCnt)
    {
        char Arr[] = src.toCharArray();
        char Brr[] = dest.toCharArray();
        boolean bEqual = false;
        int i = 0;

        for(i=0; i < iCnt; i++)
        {
            if(Arr[i] != Brr[i])
            {
                break;
            }
        }
        if(i == iCnt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class assi36_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        int iNo = 0;

        System.out.println("Enter first string: ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sobj.nextLine();

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        StringDemo aobj = new StringDemo();

        bRet = aobj.StrCmpX(str1, str2,iNo);

        if(bRet == true)
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }

        sobj.close();
    }
}

