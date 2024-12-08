package ProveEksamen2024;

public interface Transport {
   double trainCostPerMeter = 0.01;
   double taxiCostPerMeter = 0.05;
   double calculateCost(int distance);

   double calculateTime(int distance, int minutesTilNextTransport);

}


