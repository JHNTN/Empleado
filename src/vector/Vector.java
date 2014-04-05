
package vector;

import javax.swing.*;
public class Vector {

    public static void main(String[] args) {
    	int vect[];
    	vect=new int[5];
    	int dato,x;

        for (x=0; x<=4; x++){
        	dato = Integer.parseInt(JOptionPane.showInputDialog(" Digite el dato de la posición"));
        	if (dato>8){
       				 vect[x]=dato;
        		   	 System.out.print(dato + " ");
    }else
    	System.out.print( " Menor " );
    	

		}
    }

}