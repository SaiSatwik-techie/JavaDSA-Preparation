class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Integer> hash = new HashMap<>();
        int count = 97;
        char ch;
        for(int i =0; i<key.length();i++){
            ch = key.charAt(i);
            if(ch!=' '&& !hash.containsKey(ch)){
                hash.put(ch,count);
                count++;
            }
        }
    String ans="";
    int val;
    char value;
    for(int i=0;i<message.length();i++){
        char temp = message.charAt(i);
        if(temp==' '){
            ans+=temp;
        }else{
            val = hash.get(temp);
            value = (char)val;
            ans += value;
        }
    }
    return ans;
    }
}
