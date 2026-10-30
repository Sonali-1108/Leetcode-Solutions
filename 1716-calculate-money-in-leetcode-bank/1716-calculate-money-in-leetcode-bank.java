class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int total = 0;
      
            for (int i = 0; i < weeks; i++) {
    total += 28 + (7 * i);
}
          for (int j = 0; j < days; j++) {
    total += weeks + 1 + j;
}
 return total;
        
    }
}