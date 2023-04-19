package exercici1;

public class Programa1 {
    public static void main(String[] args) {

        NoGenericMethods myObjects = new NoGenericMethods("object 1", "object 2", "object 3");
        System.out.println(myObjects.getObject1()); // Imprime "object 1"
        System.out.println(myObjects.getObject2()); // Imprime "object 2"
        System.out.println(myObjects.getObject3()); // Imprime "object 3"

        myObjects.setObject1("New object 1");
        System.out.println(myObjects.getObject1()); // Imprime "new object 1"


        NoGenericMethods myObjects2 = new NoGenericMethods("objecte 2", "objecte 3", "objecte 1");
        System.out.println(myObjects2.getObject1()); // Imprimeix "objecte 2"
        System.out.println(myObjects2.getObject2()); // Imprimeix "objecte 3"
        System.out.println(myObjects2.getObject3()); // Imprimeix "objecte 1"


    }
}
