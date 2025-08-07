
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[]={30,30,40,50,50,70,70,10};
        System.out.println("before removing duplicate");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }                                     
//                                             (without create other array)
        System.out.println();
        Arrays.sort(a);
        System.out.println("after sorting array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }                                

        System.out.println();
          int j=0;
          
          for( int i=1;i<a.length;i++){
            if(a[i]!=a[j]){
                j++;
                a[j]=a[i];
                
                
     }
             } 
             System.out.println("after removing duplicate");
              for(int i=0;i<=j;i++){
            System.out.print(a[i]+ " ");
    }
 }
             
                
             
        
}




          
    
    

