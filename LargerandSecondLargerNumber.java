class LargerandSecondLargerNumber{
    public static void main(String[]args){
        int[]array={10,20,30,40,50,60};
        int largest=Integer.MIN_VALUE;
        int Secondlargest=Integer.MIN_VALUE;
        for(int num:array){
            if(num>largest){
                Secondlargest=largest;
                largest=num;
           }
           else if(num>Secondlargest&&num!=largest){
                  Secondlargest=num;

           }

        }
        if(Secondlargest==Integer.MIN_VALUE){
            System.out.println("there is no second largest number");
        }
        else{
            System.out.println("largest:"+ largest);  
        System.out.println("Secondlargest:"+ Secondlargest);        
    }

 }

}

