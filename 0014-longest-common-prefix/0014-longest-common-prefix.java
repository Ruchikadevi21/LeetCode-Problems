class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0 || strs[0].length() == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int min =Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
            if(min>strs[i].length()){
                min = strs[i].length();
            }
        }
        if(min == 0){
            return "";
        }

        for(int j=0; j<min; j++){
            for(int i=0; i<strs.length-1; i++){
                if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(j));
        }
        return sb.toString();
    }
}