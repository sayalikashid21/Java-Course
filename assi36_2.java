//  2. Write a program which 2 strings from user and check whether contents of two strings are equal or not.

/*
import java.util.*;

class StringDemo
{
    public boolean StrCmpX(String src, String dest)
    {
        if(src.length() != dest.length())
        {
            return false;
        }
        
        for(int i=0; i<src.length(); i++)
        {
            if(src.charAt(i) != dest.charAt(i))
            {
                return false;
            }
        }
        
        return true;
    }
}

class assi36_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1="";
        String str2="";

        System.out.println("Enter first string: ");
        str1 = sobj.nextLine();

        System.out.println("Enter second string: ");
        str2 = sobj.nextLine();

        StringDemo aobj = new StringDemo();

        boolean bRet = aobj.StrCmpX(str1, str2);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FLASE");
        }
    }
}*/







import java.util.*;

class StringDemo
{
    public boolean StrCmpX(String src, String dest)
    {
        char Arr[] = src.toCharArray();
        char Brr[] = dest.toCharArray();
        boolean bEqual = false;
        int i = 0;

        for(i=0; i < Arr.length; i++)
        {
            if(Arr[i] != Brr[i])
            {
                break;
            }
        }
        if(i == Arr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class assi36_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;

        System.out.println("Enter first string: ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sobj.nextLine();

        StringDemo aobj = new StringDemo();

        bRet = aobj.StrCmpX(str1, str2);

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

