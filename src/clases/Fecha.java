

package clases;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


class Fecha
{


public static java.util.Date hoy = new java.util.Date();
//public static String patron = "EEEE dd-MMM-yyyy, HH:mm:ss";

public static String patron = "dd/MMM/yyyy, HH:mm:ss";

public static String sfecha, shora,salida;
public static DateFormat formato1;


//public static String mostrar()


Fecha()
{

   SimpleDateFormat formato = new SimpleDateFormat(patron);
   salida = formato.format(hoy);
   System.out.println("hoy es: " + salida);

   formato1 = DateFormat.getDateInstance();
   sfecha = formato1.format(hoy);
   System.out.println("hoy es: " + sfecha);

   formato1 = DateFormat.getTimeInstance();
   shora = formato1.format(hoy);
   System.out.println("la hora es : " + shora);

   //return sfecha;
  // return salida;
}

public static void main(String[] args) //throws Exception
{

   Fecha fechita = new Fecha();
   //fechita.mostar();

} 
}
