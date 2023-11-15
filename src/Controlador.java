import java.util.NoSuchElementException;

public class Controlador {

    private static char[][] matrizDna;
    public static boolean isMutant(String[] dna) throws malasLetras {
        int e = dna.length;

        int contador = 0;
        try{




            matrizDna = new char[e][e];
            for (int i = 0; i < e; i++) {

                matrizDna[i] = dna[i].toCharArray();

            }


            for (int i = 0; i < e; i++) {
                for (int j = 0; j < e; j++) {

                           //vertical
                    // tiene 3 espacios mas y contienen los mismos caracteres)
                    if (j + 3 < e && matrizDna[i][j] == matrizDna[i][j + 1] &&
                            matrizDna[i][j] == matrizDna[i][j + 2] &&
                            matrizDna[i][j] == matrizDna[i][j + 3]) {
                        contador++;
                    }
                    //horizontal
                    //tiene 3 espacios y contienen los mismos caracteres)
                    if (i + 3 < e && matrizDna[i][j] == matrizDna[i + 1][j] &&
                            matrizDna[i][j] == matrizDna[i + 2][j] &&
                            matrizDna[i][j] == matrizDna[i + 3][j]
                    ) {
                        contador++;
                    }

                    //diagonal principal
                    if (i + 3 < e && j + 3 < e && matrizDna[i][j] == matrizDna[i + 1][j + 1] &&
                            matrizDna[i][j] == matrizDna[i + 2][j + 2] &&
                            matrizDna[i][j] == matrizDna[i + 3][j + 3]
                    ) {
                        contador++;
                    }
                    //diagonal secundaria
                    if (i + 3 < e && j - 3 >= 0 && matrizDna[i][j] == matrizDna[i + 1][j - 1] &&
                            matrizDna[i][j] == matrizDna[i + 2][j - 2] &&
                            matrizDna[i][j] == matrizDna[i + 3][j - 3]
                    ) {
                        contador++;
                    }
                }

            }
            mostrar(matrizDna);


        }catch (Exception a){
            System.out.println("El adn contiene letras que nos correspoden");
            }
            if (contador > 1)

    {
        return true;
    }else return false;
    }


    public static void mostrar(char matriz[][]){
        for(int i =0; i<6; i++){
            System.out.println("");
            for (int j=0;j<6;j++){
                System.out.print("[ " + matriz[i][j] + " ]");
            }
        }
    }
    public static void comprobar(String[] dna)throws malasLetras{
        try {
            System.out.println("Comprobando el DNA");
            for(int i=0;i<dna.length;i++){
                for (char a:dna[i].toCharArray()) {
                    if(a =='A'||a=='C'||a=='T'||a=='G'){

                    }else{
                        throw new malasLetras();
                    }
                }
            }
            if (isMutant(dna)) {
                System.out.println("Es mutante");
            } else {
                System.out.println("No es mutante");
            }
        }catch (Exception a){
            System.out.println("Hay letras que no corresponden");
        }
    }
}
