package a_original;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}