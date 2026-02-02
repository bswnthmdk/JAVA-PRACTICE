class GFG_Q1{
    public static int lengthOfLongestSubstringWith_K_Distinct_Atmost(String s, int k) {
        int[] freqArr = new int[26];

        int l=0, r=0, maxLen=-1, d=0;
        while(r<s.length()){
            freqArr[s.charAt(r)-'a']++;
            if(freqArr[s.charAt(r)-'a']==1){
                d++;
            }
            r++;
            
            while(d>k){
                freqArr[s.charAt(l)-'a']--;
                if(freqArr[s.charAt(l)-'a']==0){
                    d--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l);
            System.out.println("char:- "+s.charAt(r-1)+" d:- "+d+" l:- "+l+" r:- "+r+" maxLen:- "+maxLen);
        }
        return maxLen;
    }
    public static int lengthOfLongestSubstringWith_K_Distinct(String s, int k){
        int[] freqArr = new int[26];
        int l=0, r=0, d=0, maxLen=-1;
        while(r<s.length()){
            freqArr[s.charAt(r)-'a']++;
            if(freqArr[s.charAt(r)-'a'] == 1){
                d++;
            }
            while(d>k){
                freqArr[s.charAt(l)-'a']--;
                if(freqArr[s.charAt(l)-'a'] == 0){
                    d--;
                }
                l++;
            }
            if(d==k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
            System.out.println("char:- "+s.charAt(r-1)+" d:- "+d+" l:- "+l+" r:- "+r+" maxLen:- "+maxLen);
        }
        return maxLen;
    }
    public static int lengthOfLongestSubstringWith_K_RepeatingAtleast(String s, int k){

    }
    public static void main(String[] args){
        StringBuilder s =  new StringBuilder();
        s.append("aaaa");
        int k=2;
        // System.out.println(lengthOfLongestSubstringWith_K_Distinct_Atmost(s.toString(),k));
        System.out.println(lengthOfLongestSubstringWith_K_Distinct(s.toString(),k));
    }
}