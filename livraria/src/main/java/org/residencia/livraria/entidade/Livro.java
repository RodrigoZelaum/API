package org.residencia.livraria.entidade;

import java.util.Date;

public class Livro {

		private Integer idLivro;
		private String titulo;
		private	String tipo;
		private String autor;
		private Date data;
		
		public Livro() {}
		
		public Livro(Integer idLivro, String titulo, String tipo, String autor, Date data) {
			super();
			this.idLivro = idLivro;
			this.titulo = titulo;
			this.tipo = tipo;
			this.autor = autor;
			this.data = data;
		}
		public Integer getIdLivro() {
			return idLivro;
		}
		public void setIdLivro(Integer idLivro) {
			this.idLivro = idLivro;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		
		
}
