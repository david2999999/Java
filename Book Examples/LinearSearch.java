public class LinearSearch {
      public static int linearSearch(int [] list , int key){
            for( int i = 0; int < list.length; i ++){
                  if(key == list[i])
                        return i;
            }
            return -1;
      }
}
