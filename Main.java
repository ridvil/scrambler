
/**
 * Main class.
 *
 * @version 1.0
 */
public class Main
{
    public static void main(String[] args)
    {
        Scrambler3 simple = new Scrambler3(4);
        System.out.println(simple.encrypt("Chicken"));
        System.out.println(simple.decrypt("GLMGOIR"));
        Scrambler1 scram1 = new Scrambler1();
        System.out.println(scram1.encrypt("Chicken"));
        System.out.println(scram1.decrypt("ChKcOeT"));
        System.out.println(scram1.encrypt("How are you doing"));
        System.out.println(scram1.decrypt("HOY ERK GOE POWNW"));

    }
}
