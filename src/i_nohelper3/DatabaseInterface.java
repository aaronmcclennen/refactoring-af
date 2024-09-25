package i_nohelper3;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}