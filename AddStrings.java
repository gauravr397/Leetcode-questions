public class AddStrings {
    public static void main(String[] args) {

        String num1 = "456";
        String num2 = "77";
        AddStrings ad = new AddStrings();
        System.out.println(ad.addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        int carry = 0;
        String res = "";
        while (m >= 0 || n >= 0 || carry != 0) {
            int a = m >= 0 ? num1.charAt(m) - '0' : 0;
            int b = n >= 0 ? num2.charAt(n) - '0' : 0;
            m--;
            n--;
            int sum = a + b + carry;
            res = sum % 10 + res;
            carry = sum / 10;
        }
        return res;

    }
}
