package g_nohelper1;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}