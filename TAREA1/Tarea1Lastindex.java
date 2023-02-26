public class Tarea1Lastindex {
    public static void main(String[] args){
        String s = "Hola, como estas? Estas como querias?";
        int p1 = s.indexOf("como");// retorna: 6
        int p2 = s.indexOf("estas");// retorna: 11
        int p3 = s.lastIndexOf("como");// retorna: 24
        System.out.println("Longitud de una cadena es:" + p1);
        System.out.println("Longitud de una cadena es:" + p2);
        System.out.println("Longitud de una cadena es:" + p3);
        
    }
    
}
