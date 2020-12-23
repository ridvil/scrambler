
/**
 * Scrambler3.
 *
 * @version 1.0
 */
public class Scrambler3 implements ScramblerInterface
{
    private int shift;
    /**
     * custom constructor
     * @param int shift
     */
    public Scrambler3(int shift)
    {
        this.shift = shift;
    }
     /**
     * encryptor
     * shifts string for shift parameter on char array
     * @return String encrypt
     * @param plainText String
     */
    public String encrypt(String plainText){
        String encrpt = "";
        char ch = ' ';
        for(int i = 0; i < plainText.length(); i++)
        {
            int a = charToIndex(plainText.charAt(i));
            if(plainText.charAt(i) == ' ')
            {
                encrpt = encrpt + " ";
            }
            else
            {
            if((a + shift) <= 25 && (a + shift) >= 0)
            {
                ch = alpha[a + shift];
                encrpt = encrpt + ch;
            }
            else if (a + shift > 25)
            {
               ch = alpha[(a + shift) - 26];
               encrpt = encrpt + ch;
            }
            else if (a + shift < 0)
            {
               ch = alpha[(a + shift) + 26];
               encrpt = encrpt + ch;
            }
            }
        }
        return encrpt;
    }
    /**
     * decryter
     * @return String decrypt
     * @param String encrytedText
     */
    public String decrypt(String encryptedText){
        String dencrpt = "";
        char ch = ' ';
        for(int i = 0; i < encryptedText.length(); i++)
        {
            int a = charToIndex(encryptedText.charAt(i));
            if(encryptedText.charAt(i) == ' ')
            {
                dencrpt = dencrpt + " ";
            }
            else
            {
            if(a - shift <= 25 && a - shift >= 0)
            {
                ch = alpha[a - shift];
                dencrpt = dencrpt + ch;
            }
            else if (a - shift > 25)
            {
               ch = alpha[(a - shift) - 26];
               dencrpt = dencrpt + ch;
            }
            else if (a - shift < 0)
            {
               ch = alpha[(a - shift) + 26];
               dencrpt = dencrpt + ch;
            }
            }
        }
        return dencrpt;
    }
   
    public int charToIndex(char let)
    {
    int index = 0;
    if(let == 'a' || let == 'A')
    {
        index = 0;
    }
     if(let == 'b' || let == 'B')
    {
        index = 1;
    }
    if(let == 'C' || let == 'c')
    {
        index = 2;
    }
     if(let == 'd' || let == 'D')
    {
        index = 3;
    }
    if(let == 'e' || let == 'E')
    {
        index = 4;
    }
     if(let == 'f' || let == 'F')
    {
        index = 5;
    }
    if(let == 'g' || let == 'G')
    {
        index = 6;
    }
     if(let == 'H' || let == 'h')
    {
        index = 7;
    }
    if(let == 'I' || let == 'i')
    {
        index = 8;
    }
     if(let == 'j' || let == 'J')
    {
        index = 9;
    }
    if(let == 'k' || let == 'K')
    {
        index = 10;
    }
     if(let == 'l' || let == 'L')
    {
        index = 11;
    }
    if(let == 'M' || let == 'm')
    {
        index = 12;
    }
     if(let == 'n' || let == 'N')
    {
        index = 13;
    }
    if(let == 'o' || let == 'O')
    {
        index = 14;
    }
     if(let == 'P' || let == 'p')
    {
        index = 15;
    }
    if(let == 'Q' || let == 'q')
    {
        index = 16;
    }
     if(let == 'R' || let == 'r')
    {
        index = 17;
    }
    if(let == 'S' || let == 's')
    {
        index = 18;
    }
     if(let == 'T' || let == 't')
    {
        index = 19;
    }
    if(let == 'U' || let == 'u')
    {
        index = 20;
    }
     if(let == 'V' || let == 'v')
    {
        index = 21;
    }
    if(let == 'W' || let == 'w')
    {
        index = 22;
    }
     if(let == 'x' || let == 'X')
    {
        index = 23;
    }
    if(let == 'Y' || let == 'y')
    {
        index = 24;
    }
     if(let == 'z' || let == 'Z')
    {
        index = 25;
    }
    return index;
    }
    private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H',
        'I', 'J', 'K', 'L','M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
        'W', 'X', 'Y', 'Z'};
}
