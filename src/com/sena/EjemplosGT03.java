package com.sena;

public class EjemplosGT03 {

    public static void main(String[] args) {
        // write your code here
        EjemplosGT03 ej03 = new EjemplosGT03();
        /*ej03.EjemploMath();
        ej03.EjemploFloat();
        ej03.EjemploDouble();
        ej03.EjemploInteger();
        ej03.EjemploBoolean();*/
        ej03.EjemploString();
    }

    /**
     * La clase Math tiene miembros dato y funciones que nos permiten trabajar con funciones matematicas
     * */
    public void EjemploMath (){
        // Informacion de la libreria Math: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

        /* abs => En matemáticas, el valor absoluto o módulo1​ de un número real es su valor numérico sin tener en cuenta su signo */
        System.out.println("|-9| es " + Math.abs(-9));
        /* acos => En trigonometría el arcocoseno está definido como la función inversa del coseno de un ángulo. */
        System.out.println("El Arcocoseno de -1.0 es: "+Math.acos(-1.0));

    }

    /**
     * La clase Float es un envoltorio del dato primitivo float en un Objeto, Provee varios metodos para hacer operaciones con datos de tipo float
     * */
    public void EjemploFloat (){
        //Informacion de la libreria Math: https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html

        Float fl = 15.2f;                                               // Declaracion directa
        Float ObjFloat = new Float("15.2");                          // Instancia
        System.out.println(ObjFloat.compareTo(fl));                     // Comparar dos Floats -1 es menor 0 igual 1 mayor
        System.out.println(Float.compare(fl, ObjFloat));                // Comparar sin instancia
        Float convert = Float.valueOf("15.3");                          // Convertir un String a Float Cadenas y Otros Valores
        Float OtroConvert = Float.parseFloat("15.9");                // Convertir un String a Float Solo cadenas
        String inverso = convert.toString();                            // Convertir un Floar a un String
        System.out.println(Float.toHexString(fl));                      // Devuelve su valor en Hexadecimal
        Float sumData = Float.sum(fl,ObjFloat);                         // Sumar dos float con precision.
        System.out.println(Float.min(fl,OtroConvert));                  // Minimo entre dos valores float
        System.out.println(Float.max(fl,OtroConvert));                  // Maximo entre dos valores float
        System.out.println(Float.isNaN(Float.valueOf("15.2122")));      // Verifica si es un numero o no
        System.out.println(Float.isInfinite( (float) Math.PI));         // Verifica si un numero es infinito
        System.out.println(sumData.longValue());                        // Devuelve un valor long de un float
        System.out.println(sumData.shortValue());                       // Devuelve un valor short de un float
        System.out.println(sumData.intValue());                         // Devuelve un valor int de un float
    }

    /**
     * La clase Float es un envoltorio del dato primitivo double en un Objeto, Provee varios metodos para hacer operaciones con datos de tipo double
     * */
    public void EjemploDouble (){
        //Informacion de la libreria Math: https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html

        Double dol = 15.2;                                               // Declaracion directa
        Double ObjDouble = new Double("15.2");                         // Instancia
        // Implementa los mismo metodos pero tratandolos con Double (compare, compareTo, doubleValue, equals, floatValue, intValue, isFinite, isInfinite, longValue, parseDouble, shortValue
    }

    /**
     * La clase Integer es un envoltorio del dato primitivo int en un Objeto, Provee varios metodos para hacer operaciones con datos de tipo int
     * */
    public void EjemploInteger (){
        //Informacion de la libreria Math: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html

        Integer inte = 15;                                               // Declaracion directa
        Integer ObjInt = new Integer("15");                          // Instancia
        // Implementa los mismo metodos pero tratandolos con Double (compare, compareTo, doubleValue, equals, floatValue, intValue, isFinite, isInfinite, longValue, parseDouble, shortValue
    }

    /**
     * La clase Boolean es un envoltorio del dato primitivo boolean en un Objeto, Provee varios metodos para hacer operaciones con datos de tipo boolean
     * */
    public void EjemploBoolean (){
        //Informacion de la libreria Math: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html

        Boolean mibool = true;                                              // Declaracion directa
        Boolean ObjBool = new Boolean("true");                           // Instancia
        boolean Value = ObjBool.booleanValue();                             // Retorna un boolean primitivo
        System.out.println(Boolean.compare(true,false));                    // Compara dos Boolean -1 es menor 0 igual 1 mayor
        System.out.println(mibool.compareTo(true));                         // Compara dos Boolean -1 es menor 0 igual 1 mayor
        Boolean ObjectTwo = Boolean.getBoolean("false");              // Convierte un valor string a Boolean
        Boolean ObjectThree = Boolean.parseBoolean("true");              // Convierte un valor string a Boolean
        Boolean ObjectFour = Boolean.valueOf("true");                       // Convierte un valor string a Boolean
        System.out.println(ObjBool.toString());                             // Convierte un boolean a un string
    }

    /**
     * La clase String representa cadenas de caracteres. Todos los literales de cadena en los programas Java, como "abc", se implementan como instancias de esta clase.
     * */
    public void EjemploString (){
        //Informacion de la libreria Math: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

        String CadenaUno = "Hola";                                          // Declaracion Directa
        char arrCharts [] = {'H','o','l','a'};
        String CadenaDos = new String(arrCharts);                           // Array de Charts
        String CadenaTres = new String("Hola");                     // Cadena

        System.out.println(CadenaUno.charAt(0));                            // Devuelve el caracter especifico de una cadena
        System.out.println(CadenaUno.codePointAt(0));                // Devuelve el codigo unicode de caracter especifico de una cadena
        System.out.println(CadenaUno.codePointBefore(1));            // Devuelve el caracter especifico de una cadena antes de un indice
        System.out.println(CadenaUno.compareTo("HOLA"));                    // Compara dos cadenas de modo lexicografico (Convierte a char cada caracter y lo compara) -x 0 x
        System.out.println(CadenaUno.compareToIgnoreCase("HOLA"));      // Compara dos cadenas de modo lexicografico sin case (Convierte a char cada caracter y lo compara) -x 0 x
        System.out.println(CadenaUno.concat(" Mundo"));                     // Devuelve el caracter especifico de una cadena

        //StringBuilder falta


    }


}
