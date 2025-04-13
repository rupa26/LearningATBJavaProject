package ex_31_Generics;

public class Lab238_Generics_class {



}


class GenericsClass<T>{
    private T data;
    public GenericsClass(T data){
        this.data =data;
    }

    public T getData() {
        return this.data;
    }
}

