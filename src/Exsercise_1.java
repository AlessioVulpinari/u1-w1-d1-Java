public class Exsercise_1 {
    public static void main(String[] args) {
        System.out.println("Il risultato della moltiplicazione è: " + moltiplicazione(2, 3));
        System.out.println("Il risultato della concatenazione è: " + concatena("Giampiero", 3));

        String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio"};
        String[] newArray =  inserisciInArray(mesi, "Giuliano");

    }
    public static int moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String phrase, int num ) {
        return phrase.concat(String.valueOf(num));
    }

    public static String[] inserisciInArray(String[] array, String string) {

        String[] newArray = new String[6];

        for (int i = 0; i < newArray.length; i++) {
            if ( i < 2) {
                newArray[i] = array[i];
                System.out.println(newArray[i]);
            } else if (i == 2) {
                newArray[i] = string;
                System.out.println(newArray[i]);
            }
             else {
                newArray[i] = array[i - 1];
                System.out.println(newArray[i]);
            }

        }

        return newArray;
    }
}
