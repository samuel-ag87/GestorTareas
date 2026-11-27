package conflictos;

public class GestorTareas {

	public static String obtenerEstado(int tareasPendientes) {
		return "Tareas pendientes: " + tareasPendientes;
	}

	public static void main(String[] args) {
		System.out.println(obtenerEstado(5));
	}
}