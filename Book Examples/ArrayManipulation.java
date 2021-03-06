public class ArrayManipulation{
      public static void main(String[] args){
            int[] list = { 1, 2 , 3 , 4 , 1, 2, 3};
            findAndPrintPairs(list, 5);
            bubbleSort(list);
            showList(list);

            list = new int[] { 1, 2,3,4,5,6,7,8,9,10};
            bubbleSort(list);
            showList(list);

            list = new int[]{11,10,9,8,7,6,5,4,3,2,1,-1,-2};
            bubbleSort(list);
            showList(list);

            list = new int[] {1};
            bubbleSort(list);
            showList(list);

      }

      public static int findMin(int [] list){
            assert list != null && list.length > 0: "failed precondition";

            int indexOfMin = 0;
            for(int i = 1; i < list.length; i ++){
                  if (list[i] < list[indexOfMin])
                        indexOfMin = i;
            }
            return indexOfMin;
      }

      public static void badResize(int[] list, int newSize){
            assert list != null && newSize >= 0: "Failed precondition";

            int[] temp = new int [newSize];
            int limit = Math.min(list.length, newSize);

            for(int i = 0; i < limit ; i ++){
                  temp[i] = list[i];
            }

            list = temp;
      }

      public static int[] goodResize(int[] list, int newSize){
            assert list != null && newSize >= 0: "failed precondition";

            int[] result = new int[newSize];
            int limit = Math.min(list.length, newSize);

            for(int i = 0; i < limit; i ++)
                  result[i] = list[i];

            return result;
      }

      public static void findAndPrintPairs( int[] list, int target){
            assert list != null : "Failed precondition";

            for(int i = 0; i < list.length; i ++){
                  for(int j = i + 1; i < list.length; j++)
                        if(list[i] + list[j] == target)
                              System.out.println("The two elements at indices" + i + "and" + j + "are" + list[i]
                                                            + "and" + list[j] + "add up to target" + target);
            }
      }


      public  static void bubbleSort(int[] list){
            assert list != null : "failed precondition";

            int temp ;
            boolean changed = true;

            for(int i = 0; i < list.length && changed; i ++){
                  changed = false;
                  for(int j = 0; j < list.length - i - 1; j ++)
                        {assert(j> 0) && (j+1 < list.length) : " loop counter j " + j + "is out of bounds.";
                        if (list[j] > list[j + 1]){
                              changed = true;
                              temp = list[j + 1];
                              list[j + 1] = list[j];
                              list[j] = temp;
                        }
                  }
            }
            assert isAscending(list);
      }

      public static void showList(int[] list){ // show the whole array
            for(int i = 0; i < list.length; i ++)
                  System.out.print(list[i] + "        ");
            System.out.println();
      }

      public static boolean isAscending(int[] list){
            boolean ascending = true;
            int index = 1;
            while(ascending && index < list.length){
                  assert index >= 0 && index < list.length;

                  ascending = (list[index - 1] <= list[index]);
                  index++;
            }
            return ascending;
      }
}
