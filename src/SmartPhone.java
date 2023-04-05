public class SmartPhone extends SmartDevice {

    Boolean tecladoFisico;
    Boolean pantallaTactil;

    public SmartPhone(String fabricante, String material, String usuario, int añoCreacion, boolean withIA, double sistemaOperativo,
                      Boolean tecladoFisico, Boolean pantallaTactil) {
        super(fabricante, material, usuario, añoCreacion, withIA, sistemaOperativo);
        this.tecladoFisico = tecladoFisico;
        this.pantallaTactil = pantallaTactil;
    }

    public SmartPhone(){




    }
}
