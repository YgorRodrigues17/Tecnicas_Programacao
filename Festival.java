import java.util.ArrayList;
import java.util.ListIterator;
public class Festival {
	ArrayList<Banda> lista = new ArrayList<Banda>();
	
	public void incluir(Banda banda) {
		lista.add(banda);
	}
	public void excluir(Banda banda) {
		lista.remove(banda);
	}
	public void listar() {
		ListIterator<Banda> it = lista.listIterator();
		while(it.hasNext()) {
			it.next().visualizar();
		}
	}
	public void excluir(String nome) {
		for(int i = 0; i < lista.size(); i++)
			if(lista.get(i).getGenero().equals(nome))
				lista.remove(i);
	}
	public Banda pesquisar(String nome) {
		for(Banda b : lista)
			if(b.getNome().equals(nome))
				return b;
		return null;
	}

}
