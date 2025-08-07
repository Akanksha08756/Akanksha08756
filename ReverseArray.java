public class ReverseArray {
    
    public static void main(String[] args) {
        int a[]={30,30,40,50,50,70,70,10};
        System.out.println("before reversing");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        } 
    
        int i=0;
        int j= a.length-1;
        while(i<j){
           int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        
        System.out.println("after reversing");
        for( i=0;i<a.length;i++){
         System.out.print(a[i]+ " ");
        }
        
    }
}   

    

