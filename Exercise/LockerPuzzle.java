public class LockerPuzzle{
      public static void main(String[] args) {
            boolean[] array = new boolean[101];

            for (int i = 1; i < 101 ;i++ ) {
                  array[i] = false;
            }

            for (int i =1 ; i < 101 ; i++) {
                  for (int j = i; j < 101 ; j += i ) {
                        if(array[j] == false)
                              array[j] = true;
                        else
                              array[j] = false;
                  }
            }

            for (int i = 1; i < 101; i++) {
                  if(array[i] == true)
                        System.out.print("L" + i + " ");
            }
      }
}
