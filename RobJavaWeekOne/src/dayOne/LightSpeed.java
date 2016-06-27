package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class LightSpeed {

    public static void main(String[] args){
        int lightSpeed = 299792458; //speed in m/s
        long days;
        long seconds;
        long distance;
        int metersPerMile;
        long milesDistance;
        metersPerMile = 1609;


        days = 7;
        seconds = days * 60*60*24;
        distance = lightSpeed * seconds;
        milesDistance = distance / metersPerMile;


        System.out.println("in " + days + " days, light will travel about " + milesDistance + " miles.");
    }
}
