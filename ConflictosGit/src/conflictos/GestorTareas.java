package conflictos;

public class GestorTareas {

	public static String obtenerEstado(int tareasPendientes) {
		if (tareasPendientes == 0) {
			return "No hay tareas pendientes";
		}
		return "Pendientes: " + tareasPendientes + " tareas";
	}

	public static void main(String[] args) {
		System.out.println(obtenerEstado(5));
	}
}