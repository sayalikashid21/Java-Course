//  5.  Accept string from user and check whether the string is palindrome or not without considering its case.

import java.util.*;

class StringDemo
{
    public boolean StrCmpX(String src)
    {
        String Arr = src;
        String str = null;
        str="";
        int i = 0;

        for(i=src.length()-1; i >= 0; i--)
        {
           str = str+src.charAt(i);
        }      
        if(str.equals(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class assi36_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;
        int iNo = 0;

        System.out.println("Enter string: ");
        String str = sobj.nextLine();

        StringDemo aobj = new StringDemo();

        bRet = aobj.StrCmpX(str);

        if(bRet == true)
        {
            System.out.println("String are palindrome");
        }
        else
        {
            System.out.println("Strings are not palindrome");
        }

        sobj.close();
    }
}

