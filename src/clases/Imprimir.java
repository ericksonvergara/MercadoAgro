package clases;

import java.awt.*;


public class Imprimir extends Frame
{
            public static TextArea txt;
            
            public Imprimir()
            {
                        inicializar();
            }
            
            private void inicializar()
            {
                        txt=new TextArea();
                        setLayout(new BorderLayout(50,50));
                        addWindowListener(new java.awt.event.WindowAdapter()
                        {
                                   public void windowClosing(java.awt.event.WindowEvent e)
                                   {
                                               salir(e);
                                   }
                        });
                        
                       
                        txt.setText(txt.getText() + "id articulo \t Nombre \t categoria \n");
                                  
                        //rellenarRegistros();
                        
                        add(txt, java.awt.BorderLayout.CENTER);
                        pack();
            }
            
            public static void colocar(String id, String nom, String cat)
            { 
               txt.setText(txt.getText() + id + "\t" + nom + "\t" + cat + "\n");
            }
            
            
            private void salir(java.awt.event.WindowEvent e)
            {
                        System.exit(0);
            }
            
}
