
/**
 * Scrambler2.
 *
 * @version 1.0
 */
public class Scrambler2 extends IndexKey implements ScramblerInterface 
{

    /**
     * Constructor for objects of class TrithemiusCipher
     */
    public Scrambler2()
    {

    }
    
    /**
     * encryptor that shifts value on alphabet array based on count
     * @return String encrypt
     * @param plainText String
     */
    public String encrypt(String plainText){
        String encrpt = "";
        char ch = 'a';
        int count = 0;
        for(int i = 0; i < plainText.length(); i++)
        {
            int a = charToIndex(plainText.charAt(i));
            if(plainText.charAt(i) == ' ')
            {
                count = -1;
                encrpt = encrpt + " ";
            }
            else
            {
            if((a + count) <= 25 && (a + count) >= 0)
            {
                ch = alpha[a + count];
                encrpt = encrpt + ch;
            }
            else if (a + count > 25)
            {
               ch = alpha[(a + count) - 26];
               encrpt = encrpt + ch;
            }
            else if (a + count < 0)
            {
               ch = alpha[(a + count) + 26];
               encrpt = encrpt + ch;
            }
            }
            count++;
        }
        return encrpt;
    }
    /**
     * decryter
     * @return String decrypt
     * @param String encrytedText
     */
    public String decrypt(String encryptedText){
        String encrpt = "";
        char ch = 'a';
        int count = 0;
        for(int i = 0; i < encryptedText.length(); i++)
        {
            int a = charToIndex(encryptedText.charAt(i));
            if(encryptedText.charAt(i) == ' ')
            {
                count = -1;
                encrpt = encrpt + " ";
            }
            else
            {
            if((a - count) <= 25 && (a - count) >= 0)
            {
                ch = alpha[a - count];
                encrpt = encrpt + ch;
            }
            else if (a - count > 25)
            {
               ch = alpha[(a - count) - 26];
               encrpt = encrpt + ch;
            }
            else if (a - count < 0)
            {
               ch = alpha[(a - count) + 26];
               encrpt = encrpt + ch;
            }
            }
            count++;
        }
        return encrpt;
    }
    private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
        'W', 'X', 'Y', 'Z'};
}
