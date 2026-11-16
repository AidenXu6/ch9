public class arthdumbo{

public static void main(String []args){
int max = Integer.MIN_VALUE;
int count=0;
int longest=0;
String first="";
String current="";
for (int i=0; i<args.length; i++) {
count=args[i].length();
current=args[i];
if (count>max){
max=count;
longest=i;
}
if (first.compareTo(current)<0){
first=current;
}


}
System.out.println("Longest: "+args[longest] +" (" +max + " letters)" );
System.out.println("First Alphabetically: "+first);
}
}
