public class CountNumbers {
    public static void main(String[] args) {
        int n = 122234222;

        // Q : Count a particular number in a given n value
        int count = 0;
        while (n > 0){
            int rem = n % 10;  // Finds the last digit of the given n value
            if(rem == 2){
                count++;      // if rem == 'count of number needed to find' increment count + 1
            }
            n = n / 10;          // to remove last digit which already checkedSystem.out.println(count);
        }
        System.out.println(count);
    }

}
