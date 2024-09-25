package c_inlinestatic;

public class Caller {
	public static void main(String[] args) {
		RecordDto record = new RecordDto();
		DatabaseInterface di = new InsertImplementation();
		
		new GenericDbCall(record).process(di);
	}
}
