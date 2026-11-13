package peto;

import core.GemaEnergia;

public class PetoEnlace {
    public boolean escudoActivo(GemaEnergia gema) {
        if (gema == null) {
            return true; // Mantiene el escudo activo al ser retirado en combate
        }
        return gema.tieneCarga();
    }
}