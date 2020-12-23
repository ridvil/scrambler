/**
 * Scrambler1
 *
 * @version 1.0
 */
public class Scrambler1 extends IndexKey implements ScramblerInterface
{   
    public String encrypt(String plainText) 
    {
        String encrypt = "";
        char ch = 'a';
        for(int i = 0; i < plainText.length(); i+=2)
        {
            int a = charToIndex(plainText.charAt(i));
            String encrypt2 = "";
            if(i > 0)
            {
            encrypt2 = "" + plainText.charAt(i - 1);
            }
            if(plainText.charAt(i) == ' ')
            {
                encrypt = encrypt + " ";
            }
            else
            {
            if((a + i) <= 25 && (a + i) >= 0)
            {
                ch = alpha[a + i];
                encrypt = encrypt + encrypt2 + ch;
            }
            else if (a + i > 25)
            {
               ch = alpha[(a + i) - 26];
               encrypt = encrypt + encrypt2 + ch;
            }
            else if (a + i < 0)
            {
               ch = alpha[(a + i) + 26];
               encrypt = encrypt + encrypt2 + ch;
            }
            }
        }
        encrypt = encrypt.toUpperCase();
        return encrypt; 
    }
     public String decrypt(String encryptedText) 
    {
        String dencrypt = "";
        char ch = 'a';
        for(int i = 0; i < plainText.length(); i+=2)
        {
            int a = charToIndex(plainText.charAt(i));
            String dencrypt2 = "";
            if(i > 0)
            {
            dencrypt2 = "" + plainText.charAt(i - 1);
            }
            if(plainText.charAt(i) == ' ')
            {
                dencrypt = dencrypt + " ";
            }
            else
            {
            if((a - i) <= 25 && (a - i) >= 0)
            {
                ch = alpha[a - i];
                dencrypt = dencrypt + dencrypt2 + ch;
            }
            else if (a - i > 25)
            {
               ch = alpha[(a - i) - 26];
               dencrypt = dencrypt + dencrypt2 + ch;
            }
            else if (a - i < 0)
            {
               ch = alpha[(a - i) + 26];
               dencrypt = dencrypt + dencrypt2 + ch;
            }
            }
        }
        dencrypt = dencrypt.toUpperCase();
        return dencrypt; 
    }
    private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
        'W', 'X', 'Y', 'Z'};
}
