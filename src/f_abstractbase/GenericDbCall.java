package f_abstractbase;

public abstract class GenericDbCall {
	private final RecordDto record;

	public GenericDbCall(RecordDto record) {
		this.record = record;
	}

    abstract void prepareRequest(RecordDto record);
    abstract void handleError(String id);

    public void  process(DatabaseInterface di)
    {
        //begin database transaction
        try
        {
            //some logic
            di.prepareRequest(record);
            //more computation

            //database commit();
            di.handleError(record.getId());
        }
        finally
        {
            //if transaction open database rollback();
        }
    }

}
