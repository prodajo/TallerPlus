package libreria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class ValidarFormatos { //este metodo comprueba que la entrada de datos coincida con un numero entero , es caso contrario, saltara la excepcion
    
    public static boolean isNumeric(String cadena){ // metodo para validar si el formato introducido es un numero de tipo int
        try{
            Integer.parseInt(cadena); // si podemos realizar la operacion devolvemos true 
            return true;
        }catch(NumberFormatException e){
            return false; // en caso contrario, no es un int, devolvemos false 
        }
    }
    
    public static boolean validarDni(String dni){
        boolean esValido=false; // variable que retornaremos para saber si es valido o no el dni introducido
        int i=0; // indice para comprobar cada una de las posiciones de dni si son numeros 
        int caracterASCII=0; // almacenaremos aqui el codifo ascci de cada posicion del dni
        char letra=' '; // para almacenar la letra introducida por el usuario 
        int miDni=0; // para almacenar los numeros del dni introducidos por el usuario 
        int resto=0; // el resto es usado en la operacion de calculo de letra asignada 
        char[]asignacionLetra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; // la letra del dni tiene que ser una de las que aparecen en esta lista 
        if(dni.length()==9&&Character.isLetter(dni.charAt(8))){ // validamos que la entrada tenga 9 caracteres y el ultimo caracter sea una letra
            do{
                caracterASCII=dni.codePointAt(i); // convertimos el caracter a codigo ascii
                esValido=(caracterASCII>47&&caracterASCII<58); // comprobamos que los 8 primeros caracteres tengan un codigo ascii entre 47 y 58, lo que significan que son numeros entre 0 y 9 
                i++; // aumentamos la posicion para comprobar el siguiente numero del dni
            }
            while(i<dni.length()-1&&esValido); // lo hacemos en las 8 primeras posiciones y mientras no se encuentre ningun caracter no valido
}
        if(esValido){
            letra=Character.toUpperCase(dni.charAt(8)); // se inserta en la variable letra la letra del dni introducido por el usuario
            miDni=Integer.parseInt(dni.substring(0,8));
            resto=miDni%23; // hacemos los calculos para saber la letra que corresponde al dni introducido
            esValido=(letra==asignacionLetra[resto]); // comprobamos que la letra introducida sea la correcta para el dni en cuestion
        }
        return esValido; // retornamos true si el dni es correcto y false si el dni introducido no es valido
}
    public static boolean validarTelefono(String telefono){ // todos los telefonos constan de 9 digitos numericos, no contemplamos la opcion de empezar por 9,8,7 o 6 por poder tener algun cliente extranjero
        if(telefono.length()==9){ // si el telefono tiene 9 caracteres 
            try{
                Integer.parseInt(telefono); // comprobamos que se trate de un numero entero 
                return true; // retornamos true si se cumplen las condiciones 
            }catch(NumberFormatException e){
                return false; // retornamos false si tiene algun caracter no numero 
            }
        }
        else{
            return false; // retornamos false si no tiene 9 caracteres
        }
        
            
    }
    public static boolean validarPrecio(String precio){ // validamos que el precio se pueda pasar a float 
         try{
            Float.parseFloat(precio); // si podemos realizar la operacion devolvemos true 
            return true;
        }catch(NumberFormatException e){
            return false; // en caso contrario, no es un int, devolvemos false 
        }
    }
    public static boolean validarMatricula(String matricula){ // para validar el campo matricula utilizaremos expresiones regulares
        if(matricula.matches("^[0-9]{4}[A-Z]{3}$")) // si la matricula tiene formato 1111-AAA
            return true;
        else if(matricula.matches("^[A-Z]{1,2}{4}[A-Z]{0,2}")) // si la matricula tiene formato antiguo AA-1111-AA
            return true;
        else 
            return false;
    }
    
}
