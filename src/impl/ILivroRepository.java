package impl;

import java.util.List;

import model.Livro;

public interface ILivroRepository {
	
	public void livroAdd(Livro livro);
	
	public List livroListar();

}
