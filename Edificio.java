// 1 m3 de gas natural genera aprox 1.93 kg de CO2
public class Edificio implements ImpactoEcologico {
  private static final double FACTOR_CO2_GAS = 1.93;

  private String nombre;
  private double metrosCuadrados;
  private double consumoGasMensual;

  public Edificio(String nombre, double metrosCuadrados, double consumoGasMensual) {
    this.nombre = nombre;
    this.metrosCuadrados = metrosCuadrados;
    this.consumoGasMensual = consumoGasMensual;
  }

  public double calcularCostoEnergiaPorM2(double tarifaPorM3) {
    return (consumoGasMensual * tarifaPorM3) / metrosCuadrados;
  }

  public String getNombre() {
    return nombre;
  }

  public double getMetrosCuadrados() {
    return metrosCuadrados;
  }

  @Override
  public double obtenerImpactoEcologico() {
    return consumoGasMensual * FACTOR_CO2_GAS;
  }

  @Override
  public String identificar() {
    return "Edificio [" + nombre + ", " + metrosCuadrados + " m2]";
  }

}