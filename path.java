package front;

class path {
	String path;

	public  path(int i) {

		path= "c:\\" + "\\" + "abc" + "\\" + "\\" + i + ".jpg";
	}
	
	public  String pathre() {

		return path;
	}
	public void pathset(int i) {
		
		path="c:\\"+"\\"+"abc"+"\\"+"\\"+i+".jpg";
	}
}
