package taller3.televisores;

public class Control {
	TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
		
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void enlazar(TV televisor) {
		tv = televisor;
		tv.setControl(this);
	}
	
	public TV getTV() {
		return tv;
	}
	
	public void setTV(TV televisor){
		tv = televisor;
	}
}
