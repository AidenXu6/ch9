public class arthdumbo{

public static void main(String []args){
int max = Integer.MIN_VALUE;
int count=0;
int sum=0;
int min=Integer.MAX_VALUE;
int average=0;
for (String arg : args) {
    int value = Integer.parseInt(arg);
    if (value > max) {
        max = value;
    }
    if (value<min){
    min=value;
    }
    count++;
    sum=sum+value;
}
average=sum/count;
System.out.println("Max: " + max);
System.out.println("Count: "+ count);
System.out.println("Min: "+ min);
System.out.println("Sum: "+ sum);
System.out.println("Average: "+ average);

}
}
