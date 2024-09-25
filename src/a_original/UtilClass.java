package a_original;

public class UtilClass {
    public static void  genericDbCall(RecordDto record,  DatabaseInterface di)
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
