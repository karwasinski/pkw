package pl.javastart.second;

public class UstawPunkt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punkt point1=new Punkt();
		point1.UstawX(10);
		point1.UstawY(15);
		System.out.println("Wspolrzedne punktu to ("+point1.DajX()+", "+point1.DajY()+")");
	}

}
