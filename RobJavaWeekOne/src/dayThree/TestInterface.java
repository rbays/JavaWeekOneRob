package dayThree;


interface Callback{
    void callback(int param);

}

class Client implements Callback{


    @Override
    public void callback(int param){
        System.out.println("Callback with a Limo!");
    }
}

class AnotherClient implements Callback{

    @Override
    public void callback(int param){
        System.out.println("Call back without a limo!");
    }

}

public class TestInterface{

}

