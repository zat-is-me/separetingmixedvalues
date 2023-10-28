import java.util.TreeSet;

/**
 * @author tatek on 10/24/2023
 */
public class Main {
    public static void main(String[] args) {
        String name1 = "c2b1a3";

        TreeSet<Character> orst = new TreeSet<>();
        TreeSet<Character> ornm = new TreeSet<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < name1.length();i++) {
            if (Character.isDigit(name1.charAt(i))){
                ornm.add(name1.charAt(i));
            }else {
                orst.add(name1.charAt(i));
            }
        }

        int random = (int)(Math.random()*7+1);
        System.out.println("Random number: "+random);
        char temp = name1.charAt(random);
        System.out.println("Random: "+temp);
        Object[] array = orst.toArray();
        Object[] array1 = ornm.toArray();

        System.out.println(orst);
        System.out.println(ornm);
        for (int i = 0; i < orst.size(); i++) {
            stringBuffer.append(array[i]);
            stringBuffer.append(array1[i]);
        }

        System.out.println(stringBuffer);
    }
}