class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 ,j = numbers.length - 1;   // i = left increasing // j = right increasing
        while(numbers[i] + numbers[j] !=target){
                if(numbers[i]+numbers[j]<target) i++;
                    else j--;
            }
              return new int[] {i+1,j+1};

        }
}