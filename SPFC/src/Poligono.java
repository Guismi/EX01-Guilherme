
public abstract class Poligono extends Figura {

		private int base;
		private int altura;
		
		
		public Poligono(int base, int altura) {
			// TODO Auto-generated constructor stub
		setAltura(altura);
		setBase(base);
		}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}

}
