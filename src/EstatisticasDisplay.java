
public class EstatisticasDisplay  implements Observer{
	private Subject subject;
	
	public EstatisticasDisplay(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
		
	}

	private void display() {
		
	}
	
	@Override
	public void update(float temperatura, float umidade, float pressao) {
	
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		display();
		
	}
}
