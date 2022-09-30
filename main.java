class main{
private String name;
main(){
System.out.println("Constructor Called:");
name="Programiz";
} 
public static void main(String[]args)
{
main obj = new main();
System.out.println("The name is"+ obj.name);
}
}