package g_nohelper1;

public class Caller {
	public static void main(String[] args) {
		RecordDto record = new RecordDto();
		InsertImplementation di = new InsertImplementation(record);
		
		di.process(di);
	}
}
