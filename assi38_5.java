// 5. Write a program which accepts one number from user and ON its first 4 bits. Return modified number.

import java.util.*;

class OffBit
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0x0000000f;
        int iResult = 0;

        iResult = iMask | iNo;
        
        return iResult;
    }
}

class assi38_5
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