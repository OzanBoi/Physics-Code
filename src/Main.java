public class Main {
    public static void main(String[] args) {

        double k = 8.99e9;  // Coulomb's constant in Nm^2/C^2
        double Q = 1e-9;    // Rod's total charge in Coulombs
        double L = 1;       // Rod's Length
        double X = 1;       // Rod's center to point P distance
        int N = 1000000;    // a large value

        double Vn = 0;      // First value of the electric potential

        //a.
        // Electric potential at point P
        double V = k * (Q / X);
        System.out.println("The electric potential at point P is: " + V + " Volts");

        //b.
        // Electric potential at point P + X distance away
        double V1 = k * (Q / X);
        System.out.println("The electric potential at " + X + " meters away is: " + V1 + " Volts");

        //c.
        // Electric potential at point P + X distance away
        double V2 = k * (Q / (2 * L)) * (1 / X + 1 / X);
        System.out.println("The electric potential at " + X + " meters away is: " + V2 + " Volts");

        //d.
        // Electric potential at point P + X distance away
        double V4 = k * (Q / (4 * L)) * (1 / X + 1 / X + 1 / X + 1 / X);
        System.out.println("The electric potential at " + X + " meters away is: " + V4 + " Volts");

        //e.
        // Electric potential at point P + X distance away
        double V6 = k * (Q / (6 * L)) * (1 / X + 1 / X + 1 / X + 1 / X + 1 / X + 1 / X);
        System.out.println("The electric potential at " + X + " meters away is: " + V6 + " Volts");

        //f.
        // Electric potential at point P + X distance away
        double V8 = k * (Q / (8 * L)) * (1 / X + 1 / X + 1 / X + 1 / X + 1 / X + 1 / X + 1 / X + 1 / X);
        System.out.println("The electric potential at " + X + " meters away is: " + V8 + " Volts");

        //g.
        for (int i = 0; i < N; i++) {
            double q = Q / N;  // Charge

            double Vn_i = k * (q / X);  // Electric potential x
            Vn += Vn_i;                 // Electric potential x added to the total electric potential
        }

        // Print the result g
        System.out.println("The electric potential at " + X + " meters away is: " + Vn + " Volts\n");

        //h.
        System.out.println("Comparison:");
        System.out.println("V: " + V + " Volts");
        System.out.println("V1: " + V1 + " Volts");
        System.out.println("V2: " + V2 + " Volts");
        System.out.println("V4: " + V4 + " Volts");
        System.out.println("V6: " + V6 + " Volts");
        System.out.println("V8: " + V8 + " Volts");
        System.out.println("Vn: " + Vn + " Volts");
            }
        }