package h_nohelper2;

public class Caller {
	public static void main(String[] args) {
		RecordDto record = new RecordDto();
		InsertImplementation di = new InsertImplementation(record);
		
		di.process();
	}
}
