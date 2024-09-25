package f_abstractbase;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}