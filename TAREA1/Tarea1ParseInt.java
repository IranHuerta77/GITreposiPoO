public class Tarea1ParseInt {
    public static void main(String[] args){
        
        String s1 = "1234";
        int i = Integer.parseInt(s1);// retorna: 1234
        String t1 = Integer.toString(i);// retorna: "1234"

        // flotantes
        String s2 = "1234.56";
        double d = Double.parseDouble(s2);// retorna: 1234.56
        String t2 = Double.toString(d);// retorna: "1234.56"

        System.out.println("Longitud de una cadena es:" + i);
        System.out.println("Longitud de una cadena es:" + t1);
        System.out.println("Longitud de una cadena es:" + d);
        System.out.println("Longitud de una cadena es:" + t2);

        


    }
}
