public class ArrayRotation {
    static void Rotate(int[]a){
        int temp=a[0];
        

         for( int i=1;i<a.length;i++){
            a[i-1]=a[i];
            
         }
         a[a.length-1]=temp;
// (once time rotaion only)
    }
    static void rotate(int[]a, int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;

        }
        for( int i=1;i<k;i++){
            Rotate(a);
    }
}
    public static void main(String[]args){
        int[]a={1,4,5,6,7};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        
        }
        System.out.println();

        rotate(a,3);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
    }
}
    
    
}
