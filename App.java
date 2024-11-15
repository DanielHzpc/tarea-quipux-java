public class App {


    public static void main (String[] args){

        String[] paises = {
            "Brasil", "México", "Argentina", "Colombia", "Canadá", "Honduras",
            "Panamá", "Costa Rica", "Chile", "Estados Unidos", "Paraguay", "Belice",
            "Perú", "El Salvador", "Venezuela", "Ecuador", "Antiguas y Barbuda", "Uruguay",
            "Guatemala", "Cuba", "Surinam", "Bahamas", "Barbados", "Nicaragua", 
            "Trinidad y tobago", "Haití", "Dominica", "Jamaica", "Granada", "Guyana", 
            "San Cristóbal y Nieves", "San Vicente y las Granadinas y Santa Lucía", "Bolivia", 
            "República Dominicana"
        };
        
        Integer  contador = 0;

        for (String i : paises) {
            if (i.length()== 4 ) {
                System.out.println("Un pais con 4 digitos es: " + i);
                contador++;
            }
        }

        System.out.println("La cantidad de paises con 4 digitos son: "+ contador);
    }

}