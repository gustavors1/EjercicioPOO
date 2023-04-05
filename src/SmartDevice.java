public class SmartDevice {

    String Fabricante;
    String Material;
    String Usuario;
    int añoCreacion;
    boolean withIA;
    double sistemaOperativo;



    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String material, String usuario, int añoCreacion,
                       boolean withIA, double sistemaOperativo) {
        Fabricante = fabricante;
        Material = material;
        Usuario = usuario;
        this.añoCreacion = añoCreacion;
        this.withIA = withIA;
        this.sistemaOperativo = sistemaOperativo;
    }
}
