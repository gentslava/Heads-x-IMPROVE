import java.util.*;

public class MainClass {
    private static Object[] func(int n) {
        Object[] outputArray = new Object[n];
        Set<Integer> sizes = new HashSet<>();
        while (sizes.size() != n) sizes.add((int) (Math.random() * (Short.MAX_VALUE - 1) + 1));
        System.out.println(sizes.toString());
        int i = 0;
        for (Iterator<Integer> it = sizes.iterator(); it.hasNext(); i++) {
            Double[] inArray = new Double[it.next()];
            for (int j = 0; j < inArray.length; j++) {
                inArray[j] = Math.random();
            }
            if (i % 2 == 0) Arrays.sort(inArray);
            else Arrays.sort(inArray, Collections.reverseOrder());
            outputArray[i] = inArray;
        }
        return outputArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Object[] arr = func(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + ((Double[]) arr[i]).length);
            for (int j = 0; j < ((Double[]) arr[i]).length; j++) System.out.println(((Double[]) arr[i])[j]);
            System.out.println("____________________________");
        }
    }
}
