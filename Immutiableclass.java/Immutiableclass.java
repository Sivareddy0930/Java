


final class Immutiableclass {

    private final int p;

    Immutiableclass(int p){
        this.p=p;
    }

    public Immutiableclass modified(int z){
            if(this.p==z){
                // System.out.println(this);
                    return this;
            }
            else{
                return new Immutiableclass(z);
            }
    }


    public static void main(String[] args) 
    {
       Immutiableclass obj=new Immutiableclass(10);
		Immutiableclass obj1=obj.modified(100);
		Immutiableclass obj2=obj.modified(10);

        System.out.println(obj==obj1);
        System.out.println(obj==obj2);
		
    }

}


// Immutiable vs final 

// final is applicable to variables or reference variables ,class ,methods
// Immutiable means it can appliacble for only objects


