package b_methofobject;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}