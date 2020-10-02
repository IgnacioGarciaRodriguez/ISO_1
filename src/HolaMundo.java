
public class HolaMundo {
	public static void main(String args[]) {
		System.out.println("Hola Mundo");
		System.out.println("segunda etapa");
		
		MessageAgent ma = new MessageAgent("Hola soy tu agente");
		System.out.print("Agente dice: "+ ma.getMessage());
	}
}
