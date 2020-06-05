package wbs.pattern.templateMethod;

 

abstract class AbstractTemplateMethod {
	public void doIt() {
		stepOne();
		stepTwo();
		stepThree();
	}
	
	public abstract void stepOne();
	public abstract void stepTwo();
	public abstract void stepThree();
}