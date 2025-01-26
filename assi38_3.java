// 3. Write a program which accepts one number from user and toggle 7th bit of that number. Return modified number.

import java.util.*;

class OffBit
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0x00000040;
        int iResult = 0;

        iResult = iMask ^ iNo;
        
        return iResult;
    }
}

class assi38_3
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0;
        int iRet = 0;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        OffBit bobj = new OffBit();

        iRet = bobj.ToggleBit(iNo);

        System.out.println("Modifed number is: "+iRet);
        
    }
}