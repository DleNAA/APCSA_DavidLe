package HW;
import java.util.*;
/**
 * HW6_P1_Asc
 */
public class HW6_P1_Asc {
    public static void main(String[] args) {
        System.out.println((int) (Math.random()));
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            boolean signed = Math.random() < 0.5;
            array[i] = signed ? (int) (Math.random() * 100) : (- (int) (Math.random() * 100));
        }

        System.out.println(Arrays.toString(array));
    }
}