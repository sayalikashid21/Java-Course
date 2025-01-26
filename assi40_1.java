// 1. Write a program which accepts one number from user and count number of ON(1) bits in it without using % and / operator.

import java.util.*;

class Number
{
    public int CountOne(int iNo)
    {
        int mask = 0x00000001;
        int iResult = 0;
        int iCnt = 0, i=0;

        for(i=1; i<=32; i++)
        {
            mask = 0x00000001;
            mask = mask << (i-1);

            iResult = mask & iNo;
            if(iResult == mask)
            {
                iCnt++;
            }
        }

        return iCnt;
    }
}

class assi40_1
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0;
        int iRet =0;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        Number bobj = new Number();

        iRet = bobj.CountOne(iNo);

        System.out.println("Count of ON bit is: "+iRet);
    }
}