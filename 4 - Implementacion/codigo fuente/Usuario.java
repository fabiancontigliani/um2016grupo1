import java.util.Date;

public class Usuario extends Persona {

	private String nombre;

	private String apellido;

	private String email;

	private Date fechaDeNacimiento;

	private Denuncia[] denuncia;

	private Album[] album;

	private Foto[] foto;

	private Comentario[] comentario;

	private Notificacion[] notificacion;

	private Usuario[] usuario;

	private SolicitudDeAmistad[] solicitudDeAmistad;

	private Grupo[] grupo;

	public void denunciarUsuario(Usuario usuario) {

	}

	public Integer calcularCumpleaños(Date fechaDeNacimiento) {
		return null;
	}

	public void banearUsuario(Usuario usuario, int razon) {

	}

	public Boolean registrarUsuario(String nombre, String apellido, String email, Date fechaDeNacimiento, String usuario, String contraseña) {
		return null;
	}

}
