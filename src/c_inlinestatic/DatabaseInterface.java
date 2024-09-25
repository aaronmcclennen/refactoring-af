package c_inlinestatic;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}