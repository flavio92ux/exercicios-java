import java.text.DecimalFormat;

public class Delta {
  private int a, b, c;

  public Delta(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getDelta() {
    return this.b * this.b  - 4 * a * c; 
  }

  public void getRoots() {
    if (this.getDelta() < 0) {
      System.out.println("Não existe raízes reais");
    } else if (this.getDelta() == 0) {
      double x = (-this.b + Math.pow(this.getDelta(), 0.5)) / (2 * this.a);
      System.out.println("S = {" + x + "}");
    } else {
      double x1 = (-this.b + Math.pow(this.getDelta(), 0.5)) / (2 * this.a);
      double x2 = (-this.b - Math.pow(this.getDelta(), 0.5)) / (2 * this.a);

      DecimalFormat df = new DecimalFormat("0.000");
      System.out.println("S = {" + df.format(x1) + ";" + df.format(x2) + "}");
    }
  }
}
