class Solution {
    public int subtractProductAndSum(int n) {
           System.out.print("Enter a number: ");
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;   
            sum = sum + digit;
            n = n / 10;    
        }
        int result = product - sum;
        System.out.println("Product of digits = " + product);
        System.out.println("Sum of digits = " + sum);
        System.out.println("result =" + result);
         return result;
}
    }

