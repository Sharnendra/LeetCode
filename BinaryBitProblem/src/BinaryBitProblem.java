public class BinaryBitProblem {

    public static void main(String... args) {
        int[] output = countBits(2);
        for (int a : output){
            System.out.println(a);
        }
    }

    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0; i<n+1; i++) {
            arr[i] = convertBinary(i);
        }
        return arr;
    }

    public static int convertBinary(int num){
        /* 0 ---   0000
        1-------   0001
        2-------   0010
        3-------   0011
        4-------   0100
        5-------   0101
        6-------   0110
        7-------   0111
        8-------   1000
        9-------   1001
        10------   1010
        11------   1011
        12------   1100
        13------   1101
        14------   1110
        15------   1111*/
        int sum = 0;
        int binary[] = new int[20];
        int index = 0;
        while(num > 0 && index < binary.length){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            sum = sum + binary[i];
        }
        return sum;
    }
}
