package ReverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
      int reverse = 0;
      while(x != 0){
          int pop = x % 10;
          x/=10;
          if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && pop >7)) return 0;
          if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && pop < -8)) return 0;
          reverse = reverse*10 + pop;
      }
      return reverse;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 120;
        int reverse = reverseInteger.reverse(x);
        System.out.println("Reverse of Int "+ x +" is => "+reverse);
    }
}
