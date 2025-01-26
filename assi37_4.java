// 4. Write a program which checks whether 15th bit is ON or OFF.

import java.util.*;

class assi37_4
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x000001c0;
        int iResult = 0;

        iResult = iMask & iNo;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        bRet = ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }
}