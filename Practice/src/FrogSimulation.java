

public class FrogSimulation {
     private int goalDistance;
     private int maxHops;

     public FrogSimulation(int dist, int numHops){
         goalDistance = dist;
         maxHops = numHops;
     }

     private int hopDistance(){
         return (int)((Math.random()*100)-50);
     }

     public boolean simulate(){
         int numhops = (int)(Math.random()*(maxHops)+1);
         int travelDist = 0;
         for(int i = 0; i < numhops; i++){
             travelDist += hopDistance();
             if(travelDist >= goalDistance){
                 return true;
             } else if(travelDist < 0){
                 break;
             }
         }
         return false;
     }

     public double runSimulations(int num) {
         int success = 0;
         for(int i = 0; i < num; i++){
             if(simulate()){
                 success++;
             }
         }
         return (double)(success/num);
     }
}
