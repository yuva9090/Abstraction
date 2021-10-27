

public class Desktop implements HardWare,Software{
	public void desktopModel() {
		System.out.println("i7");
	}
	@Override
	public void softwareResources() {
System.out.println("java");		
	}
	@Override
	public void hardwareResources() {
System.out.println("framework");		
	}		
	public static void main(String[] args) {
			Desktop  i = new Desktop ();
			i.desktopModel();
			i.hardwareResources();
			i.softwareResources();
				}
}

