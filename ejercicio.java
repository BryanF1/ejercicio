package clase1;

 class ejercicio {
    Double numero1;
    Double numero2;
    Double numero3;
    double y2;
    double y1;

    void establecerNumero1(Double num1)
    {
        numero1 = num1;
    }
    Double obtenerNumero1()
    {
        return numero1;
    }
    void establecerNumero2(Double num2)
    {
        numero2 = num2;
    }
    double obtenerNumero2()
    {
        return numero2;
    }
  
    void establecerNumero3 (Double num3)
    {
        numero3 = num3;
    }
     Double obtenerNumero3()
    {
        return numero3;
    }

    Double getDiscriminante()
    {
       return Math.pow(obtenerNumero2(), 2)-(4*obtenerNumero1()*obtenerNumero3());
    }
  


    void obtenerRaices()
    {
        y1 = (-obtenerNumero2()+Math.sqrt(getDiscriminante()))/(2*obtenerNumero1());
        y2 = (-obtenerNumero2() - Math.sqrt(Math.pow(obtenerNumero2(), 2)-(4*obtenerNumero1()*obtenerNumero3())))/(2*obtenerNumero1());
        System.out.println("solucion y1");
        System.out.println(y1);
        System.out.println("solucion y2");
        System.out.println(y2);
    }

    void obtenerRaiz()
   {
    double z=(-obtenerNumero2()) / (2*obtenerNumero1());
     System.out.println("unica solucion");
     System.out.println(z);
   }
 
   boolean tieneRaices() {                                                     
   
       return getDiscriminante () > 0;                                   
    }                                                                                            
   boolean tieneRaiz() {                                                  
       return getDiscriminante() ==0;
   }
   void calcular()
    {
     if (tieneRaices()){
       obtenerRaices();
    }
    if (tieneRaiz()){
           obtenerRaiz();
       }
    if (getDiscriminante() <0) {
           System.out.println("No tiene soluciones");
       }
         
    }
}