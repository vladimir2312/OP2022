
public class Work1_3 {

	public static void main(String[] args)
	{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	if(args.length == 2)
	{
		System.out.println(args[0]+"+"+args[1]+ "=" +(a+b));
	}
	else
	{
		System.out.println("Неверное колличество параметров");
	}

	}}
