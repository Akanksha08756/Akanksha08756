public class Smallest {
    
    public static void main(String[]args){
        int[]array={10,20,30,40,50,60};
        int Smallest=Integer.MAX_VALUE;
        int Secondsmallest=Integer.MAX_VALUE;
        for(int num:array){
            if(num<Smallest){
                Secondsmallest=Smallest;
                Smallest=num;
           }
           else if(num<Secondsmallest&&num!=Smallest){
                  Secondsmallest=num;

           }

        }
        if(Secondsmallest==Integer.MIN_VALUE){
            System.out.println("there is no second largest number");
        }
        else{
            System.out.println("smallest:"+ Smallest);  
        System.out.println("Secondsmallest:"+ Secondsmallest);        
    }

 }

}


    

