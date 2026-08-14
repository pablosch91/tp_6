import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Edificio edificio = new Edificio("Torre Central", 500.0, 300.0);
    Auto auto = new Auto("Toyota Corolla", 1200.0, 14.0);
    Bicicleta bicicleta = new Bicicleta("Montaña", 150.0);

    ArrayList<ImpactoEcologico> lista = new ArrayList<>();
    lista.add(edificio);
    lista.add(auto);
    lista.add(bicicleta);

    for (ImpactoEcologico item : lista) {
      System.out.printf("%s -> Impacto ecologico: %.2f kg de CO2%n",
          item.identificar(), item.obtenerImpactoEcologico());
    }
  }

  // // Pregunto el tipo real del objeto para poder acceder a sus atributos propios
  // private static String identificar(ImpactoEcologico item) {
  //   if (item instanceof Edificio) {
  //     Edificio e = (Edificio) item;
  //     return "Edificio [" + e.getNombre() + ", " + e.getMetrosCuadrados() + " m2]";
  //   } else if (item instanceof Auto) {
  //     Auto a = (Auto) item;
  //     return "Auto [" + a.getModelo() + ", " + a.getKilometrosRecorridos() + " km]";
  //   } else if (item instanceof Bicicleta) {
  //     Bicicleta b = (Bicicleta) item;
  //     return "Bicicleta [" + b.getTipo() + ", " + b.getKilometrosRecorridos() + " km]";
  //   }
  //   return "Desconocido";
  // }


}