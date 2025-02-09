package slidingWindow;

public class GrumpyBookstoreOwner {
    public static void main(String[] args) {

        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;

        System.out.println(maxSatisfied(customers, grumpy, minutes));

    }

    private static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0,j=0,satisfiedCust =0;

        int currentDiscoverable =0;
        int recoverable =0;

        while (j<customers.length){
            //calc
            if(grumpy[j] == 0){satisfiedCust += customers[j];}
            else {currentDiscoverable += customers[j];}

            // window size is achieved so store the ans and remove the effect of ith customer
            if (j - i + 1 == minutes) {
                recoverable = Math.max(recoverable, currentDiscoverable);
                if(grumpy[i] ==1){
                    currentDiscoverable -= customers[i];
                }
                i++;
            }

            j++;
        }
        return satisfiedCust +recoverable;
    }
}
