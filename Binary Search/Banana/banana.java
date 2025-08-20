class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt(); // can also get the max of array using a for loop
        int res = r; // initializes the result as the maximum value since it's guaranteed that koko will eat all piles in time
        while(l <= r){ // checks the eating rate values from 1 -> max pile
            int k = (l + r) / 2; 
            long totalTime = 0;
            for(int p : piles)
                totalTime += Math.ceil((double) p / k); // ceil because it gives the next biggest integer after the double.(eg: ceil(1.5)->2)
            if(totalTime <= h){ //if total time is still under time limit, we can eat slower
                res = k; // initialise res as k
                r = k - 1; // move right pointer towards the left of k
            }
            else{
                l = k + 1; // if total time is over the limit, it means we are eating too slow and need to look for a higher speed
            }
        }
        return res;
    }
}
/* l = 1, r = 4, res = 4, k = 5/2 = 2, totaltime = 0, totaltime = 1+2+2+1 = 6, 6<=9, res=2,r=1,l=1
   l = 1, r = 1, k = 1, totaltime = 0, totaltime = 10 , l = 2, 2<=1, false, return res from prev iteration -> 2 */
