class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for(int i=0;i<sentences.length;i++)
        {
            int spaces=0;
             for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    spaces++;
                }
            }
            int words = spaces+1;
        if(words > maxWords)
        {
             maxWords = words;
        }
        }
        return maxWords;
    }
}