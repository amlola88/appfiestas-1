package org.example;

public class Main {
    public static void main(String[] args) {
        // para usar una clase debo crear un objeto
        Empleado objeto = new Empleado();

        //utiliar el objeto para acceder a um atributo
        objeto.nombre = "";

        //utilizar el objeto para acceder a un método
        String resultado=objeto.saludar("Angela López");
        int sumatoria=objeto.sumar(5,8);



        //SALIDAS POR CONSOLA
        //acceder a mostrar el valor de un atributo
        System.out.println(objeto.nombre);
        //acceder a mostrar el retorno de la funcion
        System.out.println(objeto.saludar("Angela López"));
        //Salida de retorno de una función, la idea es crear una variable
        System.out.println(resultado);

        System.out.println(sumatoria);
    }
//EN EL MAIN LLAMO A MIS CLASES
//EN EL MAIN CREO LOS OBJETOS DE MIS CLASES
//EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
//EN EL MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOS
//Invitado objetoDeClaseInvitado=new Invitado();
//Invitado objeto2=new Invitado(333,true,"Juan",10000);


//obtener el valor de los atributos
//System.out.println(objetoDeClaseInvitado.nombre);
//System.out.println(objeto2.nombre);


