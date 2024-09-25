package m_deleteparam;

public class InsertImplementation extends GenericDbCall{

	public InsertImplementation(RecordDto record) {
		// created with auto fix
		super(record);
	}

	@Override
	public void prepareRequest() {
		record.getId();
		record.getId();
	}

	@Override
	public void handleError() {
		System.out.print(record.getId());
	}

}
