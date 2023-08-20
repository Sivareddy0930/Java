abstract class A{
    int id;
    String Name;
    A(int idvalue,String name){

        this.id=idvalue;
        this.Name=name;

    }

    abstract void getData();
}

class Test3 extends A{

            int salary;

            Test3(int id,String name,int sal){
                super( id, name);
                //  System.out.println(sal);
                this.salary=sal;

            }



            public void getData(){
                System.out.println(id);
                System.out.println(Name);
                System.out.println(salary);
            }

    public static void main(String[] args){


          Test3 obj=new Test3(101,"siva",45000);
           obj.getData();

        

    }
} 
