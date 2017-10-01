public class BinaryConverter{
      public static void main(String[] args){
            for (int i = -5; i < 33 ; i ++){
                  System.out.println(i + ": " + toBinary(i));
                  System.out.println(i);
                  //ANOTHER WAY
                  System.out.println(i + ":  " + Integer.toBinaryString(i));
            }
      }

      public static String toBinary(int Base10Num){
            boolean isNeg = Base10Num < 0;
            Base10Num = Math.abs(Base10Num);
            String result = " ";

            while(Base10Num > 1){
                  result = (Base10Num % 2) + result;
                  Base10Num /= 2;
            }

            assert Base10Num == 0 || Base10Num == 1 : "value is not <= 1:      " + Base10Num;

            result = Base10Num + result;
            assert all0sAnd1s(result);

            if (isNeg)
                  result = "-" + result;
            return result;
      }

      public static boolean all0sAnd1s(String val){   // checking to see if all the value is either 1 or 0
            assert val != null : "Failed precondition all0sAnd1s. parameter cannot be null";
            boolean all = true;
            int i = 0;
            char c;

            while(all && i < val.length()){
                  c = val.charAt(i);
                  all == c == '0' || c == '1';
                  i ++;
            }
            return all;
      }
}
