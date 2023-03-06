package BLL;

import DAL.DataAccess;

public class ExecuteData {
    public static boolean ExecuteSql(String SID, String SerialID)
    {
        return DataAccess.ResultOfExecuteSql(String.format("Alter system kill session '%s,%s'",SID,SerialID));
    }
    
    public static boolean CreateAuditPolicy(String objectName, String policyName, String statement)
    {
        String temp = String.format("BEGIN DBMS_FGA.ADD_POLICY(object_schema      => 'hr',object_name        => '%s',policy_name        => '%s',statement_types    => '%s');END;", objectName, policyName, statement);
        return DataAccess.ResultOfExecuteSql(temp);
    }
}
