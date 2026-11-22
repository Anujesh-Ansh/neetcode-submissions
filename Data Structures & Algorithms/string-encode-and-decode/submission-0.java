class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s:strs){
            int length = s.length();
            str = str.append(length).append("#").append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i=0;
        while(i<str.length()-1){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j) =='#'){
                    int len = Integer.parseInt(str.substring(i,j));
                    String sub = str.substring(j+1,j+1+len);
                    decoded.add(sub);
                    i=j+1+len;
                    break;
                }
            }
        }
        return decoded;
    }
}
