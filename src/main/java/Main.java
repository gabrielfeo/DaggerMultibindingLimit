class Main {

	public static void main(String[] args) {
		var component = DaggerExampleComponent.create();
		var elements = component.getElements();
		System.out.printf("%s elements", elements.size());
	}
}
