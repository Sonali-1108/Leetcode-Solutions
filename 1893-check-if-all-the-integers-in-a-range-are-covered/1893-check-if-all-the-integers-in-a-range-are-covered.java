class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
      label : for(int i = left;i<=right;i++){
      for(int[] range : ranges){
        if(i>=range[0] && i<=range[1])
        {
            continue  label;
        }
      }
      return false;
      }
      return true;
    }
}