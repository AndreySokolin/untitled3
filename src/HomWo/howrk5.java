package HomWo;

public class howrk5 {
    public static void main(String[] args) {
        digitIdentifier(-7);
        digitIdentifier(0);
        digitIdentifier(9);

    }
    static void digitIdentifier(int digit){
        if (digit < 0) {
            System.out.println(digit + "Norm");
        }
        else{
            System.out.println(digit + "NE_Norm");
        }
    }
}

