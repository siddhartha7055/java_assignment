class FLBQ3{
public static void main(String args[]){
if(args.length!=2){
System.out.println("Please provide two inputs");
System.exit(0);
}
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=a+b;
System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+c);
}
}