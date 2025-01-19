// 1.Write a java program which accept number from user and return the count of even digits.

import java.util.*;

class Digit
{
    public int CountEven(int iNo)
    {
        int iCnt=0, iDigit=0;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           if(iDigit%2 == 0)
           {
                iCnt++;
           } 
           iNo = iNo / 10;
        }
        return iCnt++;
    }
}

class assi34_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0, iRet=0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digit aobj = new Digit();

        iRet = aobj.CountEven(iValue);

        System.out.println("Count of even number is: "+iRet);

        sobj.close();
    }
}