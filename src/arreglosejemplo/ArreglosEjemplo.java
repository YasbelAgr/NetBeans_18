import javax.swing.JOptionPane;
public class ArreglosEjemplo {
    public static void main(String[] yas) {
        //Declaracion de valriables
        String materias []={"CalcDif", "FundPro", "FundInv", "Quimica", "DesaSus", "MateDis"};
        String encabezado []={"Materia", "U1", "U2", "U3", "U4", "U5","PromMat"};
        byte calificaciones[][]=new byte [6][6];
        byte x,y;
     
        for (x=0;x<=5;x++){//Filas
            for (y=0;y<5;y++){//Columnas
            calificaciones [x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa"
                    + " calificaciones de "+materias[x]+" unidad "+(y+1)));
            } 
        }  

        //Impresion de calificasiones
        for (x=0;x<=6;x++){
            System.out.print(encabezado[x]+"\t");
        }
        System.out.println("\n");
        for (x=0;x<=5;x++){
            System.out.print(materias[x]+"\t");
            for (y=0;y<5;y++){
                System.out.print(calificaciones[x][y]+"\t"); 
            }
            System.out.println("\n");
        }
    }
    
}
