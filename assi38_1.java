// 1. Write a program which accepts one number from user and off 7th bit of that number if it is ON. Return modified number.

import java.util.*;

class OffBit
{
    public int OffBit(int iNo)
    {
        int iMask = 0x00000040;
        int iResult = 0;

        iResult = iMask & iNo;

        if(iResult == iMask)
        {
            return iMask ^ iNo;
        }
        else
        {
            return iNo;
        }
    }
}

class assi38_1
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0;
        int iRet = 0;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        OffBit bobj = new OffBit();

        iRet = bobj.OffBit(iNo);

        System.out.println("Updated bit is: "+iRet);
        
    }
}