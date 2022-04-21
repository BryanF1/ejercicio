package clase1;

 class Main {
    public static void main(String[] args) {
        
        Ecuacion ecuacion1 = new Ecuacion();
        ecuacion1.establecerNumero1(1.00);
        ecuacion1.establecerNumero2(-2.00);
        ecuacion1.establecerNumero3(1.00);
       
       
        System.out.println("numero 1: "+ecuacion1.obtenerNumero1());
        System.out.println("numero 2: "+ecuacion1.obtenerNumero2());
        System.out.println("numero 3: "+ecuacion1.obtenerNumero3());
        ecuacion1.calcular();
       
        
    }
}
