package l_usebase;

public class InsertImplementation extends GenericDbCall{

	public InsertImplementation(RecordDto record) {
		// created with auto fix
		super(record);
	}

	@Override
	public void prepareRequest(RecordDto param_record) {
		record.getId();
		record.getId();
	}

	@Override
	public void handleError(String id) {
		System.out.print(record.getId());
	}

}
