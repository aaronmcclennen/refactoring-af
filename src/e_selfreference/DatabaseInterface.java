package e_selfreference;

public interface DatabaseInterface
{
    void prepareRequest(RecordDto record);
    void handleError(String id);
}