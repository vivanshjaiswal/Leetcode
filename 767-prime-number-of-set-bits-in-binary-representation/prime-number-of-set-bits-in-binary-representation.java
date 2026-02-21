class Solution {
    public boolean isPrime(int count){
        if(count<=1){
            return false;
        }
        for(int i=2;i*i<=count;i++){
            if(count%i==0) return false;
        }
        return true;
        

    }
    public int countones(String num){
        if(num=="") return 0;
        int count=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1')count++;
        }
        return count;
    }
    public String ConvertBinary(int n){
        if(n==0){
            return "0";
        }
        String num="";
        while(n>0){
            int remainder=n%2;
            num=num+remainder;
            n=n/2;
        }
        return num;
    }
    public int countPrimeSetBits(int left, int right) {
        ArrayList<String>bin=new ArrayList<>();
        int c=0;
        if(left ==0 && right==0){
            return 0;
        }
        for(int i=left;i<=right;i++){

            bin.add(ConvertBinary(i));
        }
        for(int i=0;i<bin.size();i++){
            if(isPrime(countones(bin.get(i)))) c++;

        }
        return c;
    }
}