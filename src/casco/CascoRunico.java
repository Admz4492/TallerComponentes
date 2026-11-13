package casco;

public class CascoRunico implements ProteccionElemental {
    @Override
    public String resistirAtaque(String elemento) {
        if ("FUEGO".equalsIgnoreCase(elemento) || "MAGIA".equalsIgnoreCase(elemento)) {
            return "Ataque elemental de " + elemento + " bloqueado por runas";
        }
        return "Daño recibido por ataque de " + elemento;
    }
}