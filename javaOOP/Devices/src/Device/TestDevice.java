package Device;

public class TestDevice{
    public static void main(String[] args){
        Phone phone = new Phone();

        phone.makeCall();
        phone.makeCall();
        phone.makeCall();

        phone.playGame();
        phone.playGame();

        phone.charge();
    }
}
