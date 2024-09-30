class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
      Arrays.sort(seats);
      Arrays.sort(students);
      int i=0;
      int ans=0;
      while(i<seats.length){
        ans=ans+(Math.max(seats[i],students[i])-Math.min(seats[i],students[i]));
        i++;
      }
      return ans;
    }
}