package conflictos;

public class GestorTareas {

	public static String obtenerEstado(int tareasPendientes) {
		if (tareasPendientes > 10) {
			return "ATENCIÓN: acumulación de tareas";
		}
		return "Total de tareas: " + tareasPendientes;
	}

	public static void main(String[] args) {
		System.out.println(obtenerEstado(5));
	}
}