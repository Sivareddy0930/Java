// cohesion in java is used to perform a specified task(single task) insted of performing multiple tasks in a java class.
// class with single task is high cohesion.(reccomended to use).
// class with multiple tasks is low cohesion.

//HIGH COHESION.

class Add{
    void add(){

    }
}
class mult{
    void mult(){
        
    }
}

//LOW COHESION.

class calc{
     void add(){

    }
     void mult(){

    }
}