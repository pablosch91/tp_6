public class Bicicleta implements ImpactoEcologico {

  // Atributos

  String tipo;
  double kilometrosRecorridos;

  // Uso los mismos valores de referencia que en Auto para poder comparar
  double factorCo2Gasolina = 2.31;
  double rendimientoAutoReferencia = 10.0;

  public Bicicleta(String tipo, double kilometrosRecorridos) {
    this.tipo = tipo;
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  // Métodos

  public double calcularCaloriasQuemadas() {
    return kilometrosRecorridos * 30;
  }

  public String getTipo() {
    return tipo;
  }

  public double getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  // La bici no contamina, entonces calculo el CO2 que me ahorro comparado con usar un auto
  // lo devuelvo en negativo para diferenciarlo del CO2 que si se emite
  public double obtenerImpactoEcologico() {
    double litrosEquivalentes = kilometrosRecorridos / rendimientoAutoReferencia;
    return litrosEquivalentes * factorCo2Gasolina * -1;
  }

  @Override
  public String identificar() {
    return "Bicicleta [" + tipo + ", " + kilometrosRecorridos + " km]";
  }

}