package ProveEksamen2024;



class Train implements Transport{


    @Override
    public double calculateCost(int distance){
        return trainCostPerMeter*distance;
    }

    @Override
    public double calculateTime(int distance, int minutesTilNextTransport){
        return (0.5/1000)*distance+minutesTilNextTransport;
    }


}

class Taxi implements Transport{


    @Override
    public double calculateCost(int distance){
        return taxiCostPerMeter*distance+50;
    }

    @Override
    public double calculateTime(int distance, int minutesTilNextTransport){
        return (1/1000)*distance+minutesTilNextTransport ;
    }

}
public class Oppgave5 {

    public static void main(String[] args) {
        Transport[] transportArray = new Transport[2];
        Train train1 = new Train();
        Taxi taxi1 = new Taxi();

        transportArray[0] = train1;
        transportArray[1] = taxi1;

        int[] waitTimes = {30, 5};
        int[] distances = {1000, 5000, 50000};


        for(int i = 0; i < transportArray.length; i++){
            Transport transporten = transportArray[i];
            int theWaitTime = waitTimes[i];
            int theDistance = distances[i];
            System.out.println("Here is the costs and times for"+transporten+"");
        }





        /*
        train1.calculateCost(1000);
        train1.calculateTime(1000, 30);
        train1.calculateCost(5000);
        train1.calculateTime(5000, 30);
        train1.calculateCost(50000);
        train1.calculateTime(50000, 30 );

        taxi1.calculateCost(1000);
        taxi1.calculateTime(1000, 5);
        taxi1.calculateCost(5000);
        taxi1.calculateTime(5000, 5);
        taxi1.calculateCost(50000);
        taxi1.calculateTime(50000, 5 );

         */









    }

    }





