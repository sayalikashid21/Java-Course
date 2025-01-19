// 2.Write a java program which accept number from user and return the count of odd digits.

import java.util.*;

class Digit
{
    public int CountOdd(int iNo)
    {
        int iCnt=0, iDigit=0;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           if((iDigit%2) != 0)
           {
                iCnt++;
           } 
           iNo = iNo / 10;
        }
        return iCnt++;
    }
}

class assi34_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0, iRet=0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digit aobj = new Digit();

        iRet = aobj.CountOdd(iValue);

        System.out.println("Count of odd number is: "+iRet);

        sobj.close();
    }
}