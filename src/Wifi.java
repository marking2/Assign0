

public class Wifi {

	String BSSID, LAT, LON, SSID, Crypt;
	String Connection_Mode;
	String Channel, RXL, Date, Time;
	String Beacon_Interval;


	public Wifi(String BSSID,String LAT,String LON,String SSID,String Crypt,String Beacon_Interval,String Connection_Mode,String Channel,String RXL,String Date,String Time){
		this.BSSID = BSSID;
		this.LAT = LAT;
		this.LON = LON;
		this.SSID = SSID;
		this.Crypt = Crypt;
		this.Beacon_Interval = Beacon_Interval;
		this.Connection_Mode = Connection_Mode;
		this.Channel = Channel;
		this.RXL = RXL;
		this.Date = Date;
		this.Time = Time;

	}

	public Wifi(String[] arr){
		this.BSSID = arr[0];
		this.LAT = arr[1];
		this.LON = arr[2];
		this.SSID = arr[3];
		this.Crypt = arr[4];
		this.Beacon_Interval = arr[5];
		this.Connection_Mode = arr[6];
		this.Channel = arr[7];
		this.RXL = arr[8];
		this.Date = arr[9];
		this.Time = arr[10];
	}

	public Wifi(){
		this.BSSID = "";
		this.LAT = "";
		this.LON = "";
		this.SSID = "";
		this.Crypt = "";
		this.Beacon_Interval = "";
		this.Connection_Mode = "";
		this.Channel = "";
		this.RXL = "";
		this.Date = "";
		this.Time = "";
	}

	public String[] getValues (){
		String[] values = new String[11];
		values[0] = this.BSSID;
		values[1] = this.LAT;
		values[2] = this.LON;
		values[3] = this.SSID;
		values[4] = this.Crypt ;
		values[5] = this.Beacon_Interval;
		values[6] = this.Connection_Mode;
		values[7] = this.Channel;
		values[8] = this.RXL;
		values[9] = this.Date;
		values[10] = this.Time;
		return values;	
	}

	public Wifi get(){
		return this;
	}

	public String toString() {
		return "Wifi [BSSID=" + BSSID + ", LAT=" + LAT + ", LON=" + LON + ", SSID=" + SSID + ", Crypt=" + Crypt
				+ ", Connection_Mode=" + Connection_Mode + ", Channel=" + Channel + ", RXL=" + RXL + ", Date=" + Date
				+ ", Time=" + Time + ", Beacon_Interval=" + Beacon_Interval + "]";
	}
	public String getBSSID() {
		return BSSID;
	}

	public void setBSSID(String bSSID) {
		BSSID = bSSID;
	}

	public String getLAT() {
		return LAT;
	}

	public void setLAT(String lAT) {
		LAT = lAT;
	}

	public String getLON() {
		return LON;
	}

	public void setLON(String lON) {
		LON = lON;
	}

	public String getSSID() {
		return SSID;
	}

	public void setSSID(String sSID) {
		SSID = sSID;
	}

	public String getCrypt() {
		return Crypt;
	}

	public void setCrypt(String crypt) {
		Crypt = crypt;
	}

	public String getConnection_Mode() {
		return Connection_Mode;
	}

	public void setConnection_Mode(String connection_Mode) {
		Connection_Mode = connection_Mode;
	}

	public String getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public String getRXL() {
		return RXL;
	}

	public void setRXL(String rXL) {
		RXL = rXL;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getBeacon_Interval() {
		return Beacon_Interval;
	}

	public void setBeacon_Interval(String beacon_Interval) {
		Beacon_Interval = beacon_Interval;
	}


}
