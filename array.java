package Atividade2;

public class array {
    public static void main(String[] args) {
        String[] lista = new String[5];

        lista[0] = "leite";
        lista[1] = "ovos";
        lista[2] = "frutas";
        lista[3] = "carnes";
        lista[4] = "biscoito";

        System.out.println(" O item da lista na posição 3 é " + lista[3]);

        lista[2] = "camarao";

        lista[4] = null;


        for (int i=0; i<lista.length; i++)
            System.out.println(lista[i]);



    }

}
