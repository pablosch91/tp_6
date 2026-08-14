public class Auto implements ImpactoEcologico {

  // Atributos

  String modelo;
  double kilometrosRecorridos;
  double rendimientoKmPorLitro;

  // 1 litro de gasolina genera aprox 2.31 kg de CO2
  double factorCo2Gasolina = 2.31;

  public Auto(String modelo, double kilometrosRecorridos, double rendimientoKmPorLitro) {
    this.modelo = modelo;
    this.kilometrosRecorridos = kilometrosRecorridos;
    this.rendimientoKmPorLitro = rendimientoKmPorLitro;
  }

  // Métodos

  public double calcularLitrosConsumidos() {
    return kilometrosRecorridos / rendimientoKmPorLitro;
  }

  public String getModelo() {
    return modelo;
  }

  public double getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  // Con este método calculamos cuanto CO2 genero segun los litros que consumí
  public double obtenerImpactoEcologico() {
    return calcularLitrosConsumidos() * factorCo2Gasolina;
  }

}