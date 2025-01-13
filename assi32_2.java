// 2. Write a Java program which accept string from user and count number of small characters.

import java.util.*;

class StringDemo
{
    public int CountSmall(String str)
    {
        int iCnt=0, iCount=0;

        char Arr[] = str.toCharArray();

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class assi32_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int iRet = 0;

        System.out.println("Enter the String: ");
        str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        iRet = dobj.CountSmall(str);

        System.out.println("Number capital characters are: "+iRet);

        sobj.close();
    }
}