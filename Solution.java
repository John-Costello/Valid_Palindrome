class Solution
{
    public boolean isPalindrome(String s)
    {
        int lenOfString = s.length();
        char[] arrayOfChar = new char[lenOfString];
        char iChar;
        int j=0;
        for(int i=0; i<lenOfString; i++)
        {           
            iChar = s.charAt(i);
            if(iChar>='A' && iChar<='Z')
            {
                arrayOfChar[j++]=iChar;
            }
            else if(iChar>='a' && iChar<='z')
            {
                arrayOfChar[j++]=(char) (iChar-32);
            }
        }
        int lenOfAlphaString=j;
        char[] arrayOfAlphaChar = new char[lenOfAlphaString];
        for(int i=0; i<lenOfAlphaString; i++)
        {
            arrayOfAlphaChar[i] = arrayOfChar[i];
        }
        boolean stillValid=true;
        if(lenOfAlphaString%2==0)
        {
            for(int i=0, imax=(lenOfAlphaString/2)-1; i<=imax; i++)
            {
                if(arrayOfAlphaChar[i]!=arrayOfAlphaChar[lenOfAlphaString-1-i])
                {   stillValid=false;   }
            }
        }
        else
        {
            for(int i=0, imax=(((lenOfAlphaString-1)/2)-1); i<=imax; i++)
            {
                if(arrayOfAlphaChar[i]!=arrayOfAlphaChar[lenOfAlphaString-1-i])
                {   stillValid=false;   }
            }
        }
        return stillValid;
    }
}
