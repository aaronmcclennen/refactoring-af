package k_recordvisibility;

public class InsertImplementation extends GenericDbCall{

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
