class ArrayDemo
{
    public static void main(String[] arg)
      {
         int[] arr=new int[5];
         for(int i=0;i<5;i++)
           arr[i]=i;
         for(int i=0;i<5;i++)
          System.out.print(arr[i]);
          System.out.println();
          System.out.println(arr.length);
       }
}