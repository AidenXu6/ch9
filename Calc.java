public class arthdumbo{

public static void main(String []args){

 if (args.length < 2) {
        System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
   return;
        }
        String action=args[0];
                if (!action.equals("add") && !action.equals("mult") && !action.equals("max") && !action.equals("min")) {
            System.err.println("Unknown operation: " + action);
            return;
        }
        

int count=0;
int answer=1;
int current=0;
int average=0;
int min=Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for (int i=1; i<args.length; i++) {
current = Integer.parseInt(args[i]);
if (action.equals("add")){
answer=answer+current;
}
if (action.equals("mult")){
answer=answer*current;
}
if (action.equals("max")){
    if (current> max) {
        max =current;
    }
}
if (action.equals("min")){
    if (current< min) {
        min=current;
    }
}
}
if (action.equals("add")){
System.out.println(answer-1);
}
if (action.equals("mult")){
System.out.println(answer);
}
if (action.equals("max")){
System.out.println(max);
}
if (action.equals("min")){
System.out.println(min);
}

}
}
