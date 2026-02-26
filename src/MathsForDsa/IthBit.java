package MathsForDsa;

public class IthBit {
    public static void main(String[]args) {
        int n = 0b1101;
        int p = 2;
        int ans = (n & (1 << (p)));
        System.out.print(ans);
    }
}
