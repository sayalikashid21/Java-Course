// 1. Write a program which checks whether 15th bit is ON or OFF.

import java.util.*;

class assi37_1
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x00004000;
        int iResult = 0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean iRet = false;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        iRet = ChkBit(iNo);
        
        if(iRet == true)
        {
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is OFF");
        }
    }
}