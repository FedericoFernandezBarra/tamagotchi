package ar.edu.dds.tamagotchi;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MalHumor implements Estado {
	private List<TiempoDeMalHumor> tiemposDeMalHumor = new ArrayList<TiempoDeMalHumor>();

	public MalHumor(Tamagotchi tamagotchi) {
		tiemposDeMalHumor.add(new TiempoDeMalHumor(tamagotchi));
	}

	public MalHumor(Tamagotchi tamagotchi, LocalDateTime tiempoQueComenzoMalHumorado) {
		tiemposDeMalHumor.add(new TiempoDeMalHumor(tamagotchi, tiempoQueComenzoMalHumorado));
	}

	@Override
	public void comer(Tamagotchi tamagotchi) {
		if (tiempoQueLlevaMalHumorado(tamagotchi) > 80) {
			tamagotchi.cambiarEstado(new Contento());
		}
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.cambiarEstado(new Contento());
	}

	@Override
	public boolean puedeJugar() {
		return true;
	}

	public long tiempoQueLlevaMalHumorado(Tamagotchi tamagotchi) {
		LocalDateTime tiempoQueComenzoMalHumorado = tiemposDeMalHumor.stream()
				.filter(unTiempoDeMalHumor -> unTiempoDeMalHumor.obtenerTamagotchi().equals(tamagotchi))
				.map(unTiempoDeMalHumor -> unTiempoDeMalHumor.obtenerTiempoQueComenzoMalHumorado()).findFirst().get();
		return ChronoUnit.MINUTES.between(tiempoQueComenzoMalHumorado, LocalDateTime.now());
	}
}