package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 10;
//        edades[1] = 20;
//        edades[2] = 30;
        System.out.println("edades  0 = " + edades[0]);
//        System.out.println("edades  1 = " + edades[1]);
//        System.out.println("edades  2 = " + edades[2]);

        //edades[3] = 5;
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }               
        
        String frutas[] = {"Naranja" , "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
