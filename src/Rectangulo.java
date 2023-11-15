import java.util.Scanner;

public class Rectangulo extends Figura {

    public Rectangulo() {
    }

    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("RECTANGULO");
        for(int i=0;i<4;i++){
            System.out.println("INGRESE EL COMPONENTE DE X DEL PUNTO:"+i);
            double x = sc.nextDouble();
            System.out.println("INGRESE EL COMPONENTE DE Y DEL PUNTO:"+i);
            double y = sc.nextDouble();
            Punto punto =new Punto(x,y);
            this.listaPuntos.add(punto);
        }
    }

    double calcularPerimetro(){
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);
        Punto p3 =this.listaPuntos.get(2);
        Punto p4 =this.listaPuntos.get(3);

        double l1 = p1.calcularDistancia(p2);
        double l2 = this.calcularDistacia(p1,p3);

        this.perimetro = l1*2+l2*2;
        return  perimetro;

    }

    double calcularArea(){
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);
        Punto p3 =this.listaPuntos.get(2);

        double l1= p1.calcularDistancia(p2);
        double l2 = this.calcularDistacia(p1,p3);

        this.area = l1*l2;
        return  area;
    }
}
