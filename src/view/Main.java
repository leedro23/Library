package view;

import java.util.List;

import model.Livro;
import repository.LivroRepository;

public class Main {
	public static void main(String[] args) {
		
		Livro livro;
		LivroRepository livroRepository = new LivroRepository();
		
		livro = new Livro("Tolkien", "The lord of the rings", "Darkside", "1940", "fisico", "", 0.0);
		
		livroRepository.livroAdd(livro);
		
		List<Livro> listarTodosOsLivros = livroRepository.livroListar();
		
	}
}
