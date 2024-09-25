package h_nohelper2;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}