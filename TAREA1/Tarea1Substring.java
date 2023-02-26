public class Tarea1Substring {
    public static void main(String[] args){
        String s = "Hola, como estas?";
        String s1 = s.substring(0,4);// retorna: Hola
        String s2 = s.substring(6,10);// retorna: como
        String s3 = s.substring(11);// retorna: estas?

        System.out.println("Longitud de una cadena es:" + s1);
        System.out.println("Longitud de una cadena es:" + s2);
        System.out.println("Longitud de una cadena es:" + s3);
    }
}
