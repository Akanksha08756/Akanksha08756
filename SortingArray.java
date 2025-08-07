public class SortingArray {
    public static void main(String[] args) {
        int arr[]={9,2,8,7,1};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        
        System.out.println();
}   
 int Temp =0;  
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[i]){
            Temp=arr[i];
            arr[i]=arr[j];
            arr[j]=Temp;
            arr[j]=Temp;

        }

    }

}
System.out.println("sorting  array:");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
}   
    }
    
}
