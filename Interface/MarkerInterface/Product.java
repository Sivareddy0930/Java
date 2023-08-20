class Product implements Cloneable {
    //Cloneable is marker inteface
        int a;

        Product(int a){
           this.a=a;
        }

      void  getData(){
        System.out.println("Value:-"+a);
      }

    public static void main(String[] args) throws CloneNotSupportedException{

                Product c=new Product(10);
                Product cc=(Product)c.clone();
                cc.getData();


    }
}