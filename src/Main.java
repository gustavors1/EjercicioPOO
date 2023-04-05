public class Main {
    public static void main(String[] args) {

        SmartDevice tabletHawk = new SmartDevice("huawei", "Metal",
                "Jovenes", 2023, false, 10.1);

        System.out.println(tabletHawk.añoCreacion);

        SmartPhone rts24 = new SmartPhone();
        rts24.pantallaTactil = true;
        System.out.println(rts24.pantallaTactil);

        SmartWatch watch34GT = new SmartWatch();
        watch34GT.Fabricante = "Huawei";
        System.out.println(watch34GT.Fabricante);

        System.out.println("Fin");

    }
}