
public class Main {

	public static void main(String[] args) {

		Livro l = new Livro();
		l.setId(1l);
		l.setIsbn(36455);
		l.setAnoLancamento(19/10/2000);
		l.setTitulo("Probabilidade");
		l.setAutor("Jose");
		DAO<Livro> dao = new DAO<Livro>();
		dao.save(l);
		
		Materia m = new Materia();
		m.setId(2l);
		m.setNome("Matematica");
		DAO<Materia> dao2 = new DAO<Materia>();
		dao2.save(m);
		
		GrupoEstudo g = new GrupoEstudo();
		g.setId(3l);
		g.setNomeResponsavel("Alan");
		g.setTemaEstudo("Matematica financeira");
		g.setDiasReuniao(2);
		g.setHorario(5);
		DAO<GrupoEstudo> dao3 = new DAO<GrupoEstudo>();
		dao3.save(g);
		
		GrupoEstudo g1= new GrupoEstudo();
		g1.setId(3l);
		g1.setNomeResponsavel("Alan");
		g1.setTemaEstudo("Matematica financeira");
		g1.setDiasReuniao(2);
		g1.setHorario(5);
		DAO<GrupoEstudo> dao4 = new DAO<GrupoEstudo>();
		dao4.save(g1);
	}
}