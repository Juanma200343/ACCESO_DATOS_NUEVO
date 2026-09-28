package EjercicioTiendaOnline.servicio;

import EjercicioTiendaOnline.modelo.EnviadorEmail;
import EjercicioTiendaOnline.repositorio.EnviadorEmailRepo;
import EjercicioTiendaOnline.repositorio.RepositorioPedido;

public class TiendaService {
	
	private RepositorioPedido repo;
	private EnviadorEmailRepo repo2;
	public TiendaService(RepositorioPedido repo, EnviadorEmailRepo repo2) {
		super();
		this.repo = repo;
		this.repo2 = repo2;
	}
	public RepositorioPedido getRepo() {
		return repo;
	}
	public void setRepo(RepositorioPedido repo) {
		this.repo = repo;
	}
	public EnviadorEmailRepo getRepo2() {
		return repo2;
	}
	public void setRepo2(EnviadorEmailRepo repo2) {
		this.repo2 = repo2;
	}
	@Override
	public String toString() {
		return "PedidoService [repo=" + repo + ", repo2=" + repo2 + "]";
	}

	
}
