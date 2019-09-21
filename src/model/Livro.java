package model;

public class Livro {
	
	private String author;
	private String book;
	private String editor;
	private String year;
	private String type;
	private String url;
	private double tamItem;
	
	
	public Livro () {
		
	}

	/* Construtor passando todos os parammetros
	 * 
	 */
	public Livro(String author, String book, String editor, String year, String type, String url, double tamItem) { 
		super();
		this.author = author;
		this.book = book;
		this.editor = editor;
		this.year = year;
		this.type = type;
		this.url = url;
		this.tamItem = tamItem;
	}

	/*
	 * Sao os metodos publicos que modificam os atributos privados
	 */
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getBook() {
		return book;
	}


	public void setBook(String book) {
		this.book = book;
	}


	public String getEditor() {
		return editor;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public double getTamItem() {
		return tamItem;
	}


	public void setTamItem(double tamItem) {
		this.tamItem = tamItem;
	}

}

//leolandia