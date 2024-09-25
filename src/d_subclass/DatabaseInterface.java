package d_subclass;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}