package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import conecxao.Conexao;
import model.Curso;
import model.Projeto;

public class BuscarDataDao {
	public BuscarDataDao(){ Conexao.obterConexao(); }
	
	//CONEXAO
	Connection con = (Connection) Conexao.obterConexao();
	
	Projeto projeto = new Projeto();
	Curso curso = new Curso();
	private List<Projeto> listaProjeto;
	private List<Projeto> projeto2 = new ArrayList<Projeto>();
	//SELECT ONE
	public List<Projeto> setLista(int data1, int data2)throws SQLException
	{	
			//INSTANCIANDO SQL PARA RECEVER COMANDO
			StringBuilder sql = new StringBuilder();
			sql.append("select * from bd01_projeto_mostra  where Ano_Proj_Mostra between  2001 and 2019;");//EXECUTANDO SQL	

				try
				{		
				Statement stmt = (Statement) con.createStatement();
				ResultSet rs 	= stmt.executeQuery(sql.toString());
				
					while(rs.next())
					{
					Projeto p 	= new Projeto();
					Curso c		= new Curso();
					 	p.setCod(rs.getInt("Cod_Proj_Mostra"));
					 	p.setNome(rs.getString("Nome_Proj_Mostra"));
					 	c.setCod(rs.getInt("Bd01_Curso_cod_curso"));
					 	p.setCurso(curso);
					 	p.setDescricao(rs.getString("Descr_Proj_Mostra"));
					 	p.setCoordenador(rs.getString("Coord_Proj_Mostra"));
					 	p.setAno(rs.getDate("Ano_Proj_Mostra"));
					 	p.setSemestre(rs.getString("Semestre_Proj_Mostra"));
					 	p.setData_alteracao(rs.getDate("Data_Alt_Cadas_Proj_mostra"));
					projeto2.add(p);
					}
				 }catch (SQLException e) {e.printStackTrace();}
				
		return projeto2;
	}//END METODO
	
	public List<Projeto> getLista()
	{
		return this.projeto2;


	}
	
}//END CLASS