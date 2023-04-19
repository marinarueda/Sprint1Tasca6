package exercici2;

import exercici2.Persona;

public class Programa {
    public static void main(String[] args) {

        Persona persona = new Persona("Joan", "Martínez", 30);
        String profesion = "Soy bombero";
        byte antiguedad = 15;

        //llama al método genèrico con un objeto Persona, una cadena y un entero
        Persona.GenericMethods.print(persona, profesion, antiguedad);

        //llama al método genèrico con una cadena, un entero y un Objeto
        Persona.GenericMethods.print(profesion, antiguedad, persona);

        //llama al método genèrico con un entero, una cadena y un Objeto
        Persona.GenericMethods.print(antiguedad, profesion, persona);
    }
}
