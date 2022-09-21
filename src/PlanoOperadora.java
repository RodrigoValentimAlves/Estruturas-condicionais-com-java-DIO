public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //B,M e T
        /*
          Com else if
         
        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if(plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagra, grátis");
        }else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e instagra, grátis");
            System.out.println("5gb Youtube");
        }*/

        //Com switch
        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
            }
            case "M":{
                System.out.println("Whats e instagra, grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }

       
    }
}
