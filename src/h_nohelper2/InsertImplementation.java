package h_nohelper2;

public class InsertImplementation extends GenericDbCall implements DatabaseInterface {

	public InsertImplementation(RecordDto record) {
		// created with auto fix
		super(record);
	}

	@Override
	public void prepareRequest(RecordDto record) {

	}

	@Override
	public void handleError(String id) {

	}

}
