package Prepration.DesignPatterns.StructuralDesignPattern.AdapterDesignPatter;

public class AdapterClient {
    public static void main(String[] args) {
        RoundSocket roundSocket = new RoundSocket();
        SquareSocket squareSocket = new SquareSocket();

        SquareSocket squareRoundAdapter = new SquareRoundAdapter(roundSocket);

        System.out.println("Round socket...");
        roundSocket.socketType();
        roundSocket.socketArea();

        System.out.println("Square socket...");
        squareSocket.calculateSquare();

        // toy duck behaving like a bird
        System.out.println("SquareRoundAdapter...");
        squareRoundAdapter.calculateSquare();

    }
}
