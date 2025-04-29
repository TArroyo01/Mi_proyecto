public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Opel","Astra",18);
        Coche c2 = new Coche("Audi", "A5",2);
        Coche c3 = new Coche("bmw", "A5",4);


        if ((c1.getMarca().equals(c2.getMarca())) && (c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() == c2.getAnio())){
            System.out.println("El coche es igual.");
        } else if ((!c1.getMarca().equals(c2.getMarca())) && (c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() == c2.getAnio())){
            System.out.println("La marca no es la misma.");
        } else if ((c1.getMarca().equals(c2.getMarca())) && (!c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() == c2.getAnio())) {
            System.out.println("El modelo no es el mismo");
        } else if ((c1.getMarca().equals(c2.getMarca())) && (c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() != c2.getAnio())){
            System.out.println("El año no es el mismo");
        } else if ((c1.getMarca().equals(c2.getMarca())) && (!c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() != c2.getAnio())){
            System.out.println("Solo tienen la misma marca.");
        } else if ((!c1.getMarca().equals(c2.getMarca())) && (c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() != c2.getAnio())){
            System.out.println("Solo tienen el mismo modelo.");
        } else if ((!c1.getMarca().equals(c2.getMarca())) && (!c1.getModelo().equals(c2.getModelo())) && (c1.getAnio() == c2.getAnio())){
            System.out.println("Solo tienen los mismos años.");
        } else {
            System.out.println("No coincide en nada");
        }
}
}

