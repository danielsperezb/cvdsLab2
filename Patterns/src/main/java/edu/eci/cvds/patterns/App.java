package edu.eci.cvds.patterns;

/**
 * Hello World!
 *
 */
public class App{
    public static void main( String[] args )
    {
	if(args.length <=0){
		System.out.println( "Hello World!");
	}else if(args.length == 1){
		System.out.println( "Hello " + args[0]);	
	}else if(args.length == 2){
		System.out.println( "Hello " + args[0] + " " + args[1]);
	}

	
    }
}
