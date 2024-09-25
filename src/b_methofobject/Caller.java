package b_methofobject;

public class Caller {
	public static void main(String[] args) {
		RecordDto record = new RecordDto();
		DatabaseInterface di = new InsertImplementation();
		
		UtilClass.genericDbCall(record, di);
	}
}
