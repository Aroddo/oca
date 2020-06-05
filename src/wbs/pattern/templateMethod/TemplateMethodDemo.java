package wbs.pattern.templateMethod;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		ConcreteTemplateMethod ctm = new ConcreteTemplateMethod();	
		ctm.doIt();
	}
}

class ConcreteTemplateMethod extends AbstractTemplateMethod {

	@Override
	public void stepOne() {
		System.out.println("Eins!");
	}

	@Override
	public void stepTwo() {
		System.out.println("Zwei!");
	}

	@Override
	public void stepThree() {
		System.out.println("Drei!");
	}
	
}