
/**
 * Scrambler3.
 * 
 * @version 1.0
 */
public class Scrambler3 extends IndexKey implements ScramblerInterface
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
   
    private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H',
        'I', 'J', 'K', 'L','M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
        'W', 'X', 'Y', 'Z'};
}
