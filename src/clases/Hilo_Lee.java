package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo_Lee implements Runnable
{
	Thread hilo;
        
        Conexion con;
	
	
	public Hilo_Lee() 
	{  }
	
	public void inicio() throws Exception
	{
	   con = new Conexion();
           con.ConexionPostgres();
	    
	    if (hilo==null)
		{
			hilo=new Thread(this);//crea el hilo
		//	hilo=new Thread();//crea el hilo
			hilo.start();// lanzar el hilo
			
		}
		
	}
	
	public void stop()
	{
		hilo=null;
	}
	
	public void run()
	{
		String query= "  ";
		ResultSet temp;
        		
		Thread hiloActual=Thread.currentThread();
		
        Imprimir  b =new Imprimir();
        b.show();
	
		while (hilo==hiloActual)
		{
          try
          {
              query= "select * from producto";
              temp= con.consultar(query);
              try
              {
                  
                  while (temp.next())
                  {
                      if(temp.getLong("existencia_producto")<=temp.getLong("stockminimo_producto")+100){
                      String id;
                      String nombre;
                      String descr;
                      
                      id=temp.getString(1);
                      nombre=temp.getString(2);
                      descr=temp.getString(3);
                      
                      b.colocar(id,nombre,descr);
                      pausa(5000);
                      }
                  }
              }
              catch(SQLException e)
              {  }
          }
		  catch(SQLException ex)	
		  {     Logger.getLogger(Hilo_Lee.class.getName()).log(Level.SEVERE, null, ex);
  }
		}
	}
	
	public void pausa(int tiempo)
	{
		try
		{
			Thread.sleep(tiempo);
		}
		catch(InterruptedException ignorada)
		{ }
	 }
		
	
	
}
