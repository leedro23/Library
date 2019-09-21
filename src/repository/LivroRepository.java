package repository;

import java.util.ArrayList;
import java.util.List;

import impl.ILivroRepository;
import model.Livro;

public class LivroRepository implements ILivroRepository{
	
	List<Livro> livros = new ArrayList<Livro>();

	@Override
	public void livroAdd(Livro livro) {
		this.livros.add(livro);
	}

	@Override
	public List livroListar() {
		return livros;
	}

}
