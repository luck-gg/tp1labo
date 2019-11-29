package ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import entidades.Paciente;
import produccion.Handler;



public class ConsultaPanelPaciente extends JPanel {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	List <Paciente> listadoPacientes;
	private Handler handler;

	public ConsultaPanelPaciente(){
		//Constructor vacio ya que se necesita el handler antes de hacer el query. Sino da nullpointerexception
	}

	public void InicializarPanel() {
		//Obtiene pacientes
		listadoPacientes = getHandler().ObtenerTodosPacientes();
		
		//Generacion de tabla
		this.setLayout(new BorderLayout());
		JTable tablaconsulta = new JTable(new PacienteTableModel(listadoPacientes));
		JScrollPane pane = new JScrollPane(tablaconsulta);
		this.add(pane, BorderLayout.CENTER);
		this.setVisible(true);
	}
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	
}