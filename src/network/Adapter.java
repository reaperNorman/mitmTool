package network;

public class Adapter {
	String name, mac;
	String[][] ip_local;
	int type;
	
	public Adapter()
	{
		
	}
	public Adapter(String name, String mac, String[][] ip_local, int type)
	{
		this.name = name;
		this.mac = mac;
		this.ip_local = ip_local;
		this.type = type;
	}
	
	protected void set_name(String name)
	{
		this.name = name;
	}
	protected void set_mac(String mac)
	{
		this.mac = mac;
	}
	protected void set_ip_local(String[][] ip)
	{
		this.ip_local = ip;
	}
	protected void set_ip_local(String ip)
	{
		//Add parsing logic here
	}
	private void set_type(int type)
	{
		this.type = type;
	}
	
	public String get_name()
	{
		return this.name;
	}
	public String get_mac()
	{
		return this.mac;
	}
	public String[][] get_ip_local()
	{
		return ip_local;
	}
	public String get_ip_local_as_output()
	{
		//Add deparsing logic
		return "";
	}
	public int get_type()
	{
		return this.type;
	}
	
	
}
