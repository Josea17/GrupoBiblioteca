
public class Main {

	public static void main(String[] args) {

		Livro l = new Livro();
		l.setId(1l);
		l.setIsbn(36455);
		l.setAno_lancamento(19/10/2000);
		l.setTitulo("Probabilidade");
		l.setAutor("Jose");
		DAO<Livro> dao = new DAO<Livro>();
		dao.save(l);
		
		Materia m = new Materia();
		m.setId(2l);
		m.setNome("Matematica");
		DAO<Materia> dao2 = new DAO<Materia>();
		dao2.save(m);
		
		Grupo_estudo g = new Grupo_estudo();
		g.setId(3l);
		g.setNome_responsavel("Alan");
		g.setTema_estudo("Matematica financeira");
		g.setDias_reuniao(2);
		g.setHorario(5);
		DAO<Grupo_estudo> dao3 = new DAO<Grupo_estudo>();
		dao3.save(g);
		
		Grupo_estudo g1= new Grupo_estudo();
		g1.setId(3l);
		g1.setNome_responsavel("Alan");
		g1.setTema_estudo("Matematica financeira");
		g1.setDias_reuniao(2);
		g1.setHorario(5);
		DAO<Grupo_estudo> dao4 = new DAO<Grupo_estudo>();
		dao4.save(g1);
	}

	
}