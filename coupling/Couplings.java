//the degree of dependence between components is known as coupling.
//if high dependency is there then it is Tightly coupled.
//if low dependency is there then it is loosely coupled.
// Always loosely coupling is best approch.

class A{
    static int i=B.j;
}
class B{
   static int j=C.k;
}
class C{
   static int K=10;
}
// above programme is tightly coupled. because one component is depnded on another for values.

class A{
    static int i=20;
}
class B{
   static int j=100;
}
class C{
   static int K=10;
}
// above programme is loosely coupled .because no dependency is there between components.