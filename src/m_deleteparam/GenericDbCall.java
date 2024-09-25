package m_deleteparam;

public abstract class GenericDbCall {
	protected final RecordDto record;

	public GenericDbCall(RecordDto record) {
		this.record = record;
	}

    abstract void prepareRequest();
    abstract void handleError();

    public void  process()
    {
        //begin database transaction
        try
        {
            //some logic
            prepareRequest();
            //more computation

            //database commit();
            handleError();
        }
        finally
        {
            //if transaction open database rollback();
        }
    }

}
