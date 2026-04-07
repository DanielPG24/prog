package prog.ud5.ejer4;

class ContadorObjetos {
    private static int totalObjetos = 0;
    
    ContadorObjetos(){
        this.totalObjetos += 1;
    }
    
    static void mostrarTotalObjetos(){
        System.out.println(totalObjetos);
    }
}
