package designpatterns.strutural.adapter;

public class SquareRoundAdapter extends SquareSocket {
    private RoundSocket roundSocket;

    public SquareRoundAdapter(RoundSocket roundSocket){
        this.roundSocket = roundSocket;
    }

    @Override
    public void calculateSquare() {
        roundSocket.socketArea();
    }
}
