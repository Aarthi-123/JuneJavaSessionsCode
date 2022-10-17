package assignment;

public class BrowserConstructor {
	
	//its calling from TestBrowser

	private String name;
	private double version;
	private String[] plugin;
	
//	private String[] plugin = new String[3];
		
	// const:
	public BrowserConstructor(String name, double version, String[] plugin) {
//		super();
		this.name = name;
		this.version = version;
		this.plugin = plugin;
		
	}

	//getter and setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String[] getPlugin() {
		return plugin;
	}

	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}

	public void changeplugin(String value, int index)
	{
		this.plugin[index] = value;
	}
	
	
}
