package exercici1;

public class NoGenericMethods {
    private Object obj1;
    private Object obj2;
    private Object obj3;

    public NoGenericMethods(Object obj1, Object obj2, Object obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void setObject1(Object obj) {
        this.obj1 = obj;
    }

    public void setObject2(Object obj) {
        this.obj2 = obj;
    }

    public void setObject3(Object obj) {
        this.obj3 = obj;
    }

    public Object getObject1() {
        return this.obj1;
    }

    public Object getObject2() {
        return this.obj2;
    }

    public Object getObject3() {
        return this.obj3;
    }


}
