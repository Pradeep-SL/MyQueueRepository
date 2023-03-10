class BubbleSort
{
    public static void main(String[] args) 
    {
        int [] arr={7,1,8,3,2,4};
        Sort(arr);
        for (int i : arr) 
        {
            System.out.println(i);
        }

    }
    public static void Sort(int[] arr) 
    {
       for (int i = 1; i < arr.length; i++) 
       {
        int current =arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j])
        {   arr[j+1]=arr[j];
            j--;    
        }
        arr[j+1]=current;
    }
}
      
}
