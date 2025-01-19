// 5.Write a java program which accept number from user and return the difference between summation of even digit and summation of odd digits.

import java.util.*;

class Digit
{
    public int CountDiff(int iNo)
    {
        int iDigit=0, iESum=0, iOSum=0, iDiff=0;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           if(iDigit%2 == 0)
           {
                iESum = iESum + iDigit;
           } 
           else
           {
                iOSum = iOSum + iDigit;
           }
           iNo = iNo / 10;
        }

        iDiff = iESum - iOSum;
        return iDiff;
    }
}

class assi34_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0, iRet=0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digit aobj = new Digit();

        iRet = aobj.CountDiff(iValue);

        System.out.println("Count of even number is: "+iRet);

        sobj.close();
    }
}