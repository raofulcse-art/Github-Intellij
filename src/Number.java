public class Number {
    public int sum;
    public int add(int ...num){
        sum=0;

        for(int i:num){
            sum+=i;
        }

        return sum;
    }
}
