package b_methofobject;

public class UtilClass {
    public static void  genericDbCall(RecordDto record,  DatabaseInterface di)
    {
        new GenericDbCall(record).process(di);
    }
}
