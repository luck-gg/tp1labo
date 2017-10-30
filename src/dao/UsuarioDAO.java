package dao;

import java.util.Collection;

import entidades.Pacientes;

public interface UsuarioDAO {

	public void insertarPacientes(Pacientes p);
	public void deletePacienteByDocumento(int documento);
	public void updateUsuarioByDocumento(int documento, Pacientes p);
	public Pacientes getPacienteByDocumento(int documento);
	public Collection<?> getAllUsuarios();
	
}