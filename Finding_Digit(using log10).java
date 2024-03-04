public class EvenDigits {
    public static void main(String[] args) {
        System.out.println(digits2(456123));
    }
}
static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
}
