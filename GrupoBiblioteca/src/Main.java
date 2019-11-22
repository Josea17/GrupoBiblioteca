import java.util.Random;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 3000; i++) {

			Livro l = new Livro();
			l.setId(gerarId());
			l.setIsbn(gerarIsbn());
			l.setAnoLancamento(19 / 10 / 2000);
			l.setTitulo(gerarString());
			l.setAutor(gerarString());
			DAO<Livro> dao = new DAO<Livro>();
			dao.save(l);

			Materia m = new Materia();
			m.setId(gerarId());
			m.setNome(gerarString());
			DAO<Materia> dao2 = new DAO<Materia>();
			dao2.save(m);

			GrupoEstudo g = new GrupoEstudo();
			g.setId(gerarId());
			g.setNomeResponsavel(gerarString());
			g.setTemaEstudo(gerarString());
			g.setDiasReuniao(2);
			g.setHorario(5);
			DAO<GrupoEstudo> dao3 = new DAO<GrupoEstudo>();
			dao3.save(g);

			GrupoEstudo g1 = new GrupoEstudo();
			g1.setId(gerarId());
			g1.setNomeResponsavel(gerarString());
			g1.setTemaEstudo(gerarString());
			g1.setDiasReuniao(2);
			g1.setHorario(5);
			DAO<GrupoEstudo> dao4 = new DAO<GrupoEstudo>();
			dao4.save(g1);
		}
	}

	private static String gerarString() {
		String letras[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "y", "b", "p", "d", "s", "k", "c", "a", "b", "c", "a",
				"g", "j", "d" };

		int nrAleatorio;
		int nrAleatorio2;
		int nrAleatorio3;
		int nrAleatorio4;
		int nrAleatorio5;
		int nrAleatorio6;
		Random ramdom = new Random(3);

		nrAleatorio = ramdom.nextInt(40);
		nrAleatorio2 = ramdom.nextInt(40);
		nrAleatorio3 = ramdom.nextInt(40);
		nrAleatorio4 = ramdom.nextInt(40);
		nrAleatorio5 = ramdom.nextInt(40);
		nrAleatorio6 = ramdom.nextInt(40);

		return (letras[nrAleatorio] + letras[nrAleatorio2] + letras[nrAleatorio3] + letras[nrAleatorio4]
				+ letras[nrAleatorio5] + letras[nrAleatorio6]);
	}

	private static Long gerarId() {

		Random r = new Random();
		Long x = r.nextLong();
		return x;

	}
	private static int gerarIsbn() {

		Random r = new Random();
		int x = r.nextInt(30000);
		return x;

	}

}