package d_subclass;

public class Caller {
	public static void main(String[] args) {
		RecordDto record = new RecordDto();
		DatabaseInterface di = new InsertImplementation(record);
		
		new GenericDbCall(record).process(di);
	}
}
