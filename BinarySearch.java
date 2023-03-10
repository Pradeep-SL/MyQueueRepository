import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


class BinarySearch
{
    // public static void main(String[] args) 
    // {
    //     int []arr={1,2,3,4,5,6,7,8};
    // //    System.out.println(binarySearch(arr, 6));
    //   int k=1;
    //     +

    //    System.out.println(Arrays.binarySearch(arr, 6));

        
    // }
        // public static int binarySearch(int[]arr,int x) 
        // {
        //    int start=0,end=arr.length-1;
        //    while (start<=end) 
        //    {
        //       int mid=(start+end)/2;
        //       if(x==arr[mid]) return mid;
        //       else if(x<arr[mid]) return end=mid-1;
        //       else  start=mid+1;
              
        //    }  
        //    return -1;
        // }
        public static void main(String[] args) {
          String str="java is an opp lang java";
          StringBuffer sbr=new StringBuffer();
          str.chars().distinct().forEach(s->sbr.append((char)s));
          System.out.println(sbr);
          System.out.println(removeDuplicates(str));
        }
        public static String removeDuplicates(String input) {
          String[] words = input.split(" "); // split input string into words
          HashSet<String> set = new HashSet<>();
          StringBuilder sb = new StringBuilder();
          
          for (String word : words) {
              if (!set.contains(word)) {
                  set.add(word);
                  sb.append(word).append(" ");
              }
          }
          
          return sb.toString().trim(); // remove trailing space and return the result
      }
      // public static void main(String[] args) {
      //    String str="pradeep";
      //    StringBuffer sbr=new StringBuffer();
      //    Set<Character> set= new LinkedHashSet<Character>();
      //    for (int i = 0; i < str.length(); i++) 
      //    {
      //     set.add(str.charAt(i));
      //    }
      //    for (Object string : set) 
      //    {
      //     sbr.append(string); 
      //    }
      //    System.out.println(sbr);
         


      // }
      // public static void main(String[] args) {
      //   int arr[]={1,2,3,4,1,4};
      //   for(int i=0;i<arr.length;i++)
      //   {
      //     for(int j=i+1;j<arr.length;j++)
      //     {
      //       if(arr[i]==arr[j])
      //       {
      //         System.out.println(arr[j]);
      //       }
      //     }
      //   }
      // }
      
      

}