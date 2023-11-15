// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws malasLetras {
        String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        new Controlador();

        String[] dna1 = {"ATGCGA","CAGTGC","TTAGGT","AGACGG","CCCTTA","TCAATG"};

        String[] dna2 = {"ATGCGA","CAGTGC","TTABGT","AGACGG","CCCTTA","TCAATG"};
        String[] dna3 = {"ATCCGA","CAGCGC","TCAGGT","AGACGG","CCCTCA","TCAACG"};
        String[] dna4 = {"ATCAGA","CAGCCC","TAAGCT","AGACCG","CCATCA","TCAACG"};
        String[] dna5 = {"TTTGGG","CCCCGC","TCAGGT","AGGTTG","ACATCA","TAAATG"};
        String[] dna6 = {"CTCCGA","TACCAC","ACAAGT","TGCTGG","CCTTCA","TCACAT"};
        String[] dna7 = {"CTCCGA","CAGCGC","CCAGGT","CGAAGG","CCCTAT","TCAACA"};
        String[] dna8 = {"TCDAEA","LPODFC","ABECED","SETSCS","CCCTCA","KLETSS"};
        String[] dna9 = {"CTCAGA","AGCATC","TACAGT","CCCCTA","AGGGTA","GCAATA"};
        Controlador.comprobar(dna1);
        Controlador.comprobar(dna);
        Controlador.comprobar(dna2);
        Controlador.comprobar(dna3);
        Controlador.comprobar(dna4);
        Controlador.comprobar(dna5);
        Controlador.comprobar(dna6);
        Controlador.comprobar(dna7);
        Controlador.comprobar(dna8);
        Controlador.comprobar(dna9);



    }
}