package view;

import javax.swing.JOptionPane;

import model.Professor;



public class Execucao {

	public static void main(String[] args) {
		//TOTO Auto-generated method stub
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null, "Nome:"));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereco:"));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro:"));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep:")));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade:"));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado:"));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Rg:")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Cpf:")));
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas disciplinas você tem? "));
			String disciplinas[] = new String[100];
			for (int i = 0; i < dis; i++) {
					disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina" + i);
			}
			professor.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui"));
			String cursos [] = new String[100];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso" + i);
			}
		    professor.setCursos(cursos);
		    
		    JOptionPane.showMessageDialog(null, professor.getNome() + "\n" + professor.getEndereco() + "\n" + professor.getBairro() + "\n" + professor.getCep() + "\n" + professor.getCidade() + "\n" + professor.getEstado() + "\n" + professor.getRg() + "\n" + professor.getCpf() + "\n");
		    
      } catch (Exception e) {
    	  e.printStackTrace();
    	  
      }
   }
}