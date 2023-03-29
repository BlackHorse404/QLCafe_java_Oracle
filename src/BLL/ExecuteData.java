package BLL;

import DAL.DataAccess;

public class ExecuteData {
    public static boolean ExecuteSql(String SID, String SerialID)
    {
        return DataAccess.ResultOfExecuteSql(String.format("Alter system kill session '%s,%s'",SID,SerialID));
    }
    public static boolean CreateAuditPolicy(String objectSchema, String objectName, String policyName, String statement)
    {
        String temp = String.format("BEGIN DBMS_FGA.ADD_POLICY(object_schema      => '%s',object_name        => '%s',policy_name        => '%s',statement_types    => '%s');END;commit work;",objectSchema, objectName, policyName, statement);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    public static boolean DeleteAuditPolicy(String objectSchema, String objectName, String policyName)
    {
        String temp = String.format("BEGIN DBMS_FGA.DROP_POLICY( object_schema  => '%s', object_name  => '%s', policy_name => '%s'); END;commit work;",objectSchema, objectName, policyName);
        return DataAccess.ResultOfExecuteSql(temp);
    }
   
    public static boolean ChangePassword(String username, String newPass){
        String temp = String.format("ALTER USER %s IDENTIFIED BY %s",username, newPass);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean DeleteProfile(String profilename){
        String temp = String.format("DROP PROFILE %s CASCADE",profilename);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean CreateProfile(String profilename, String sessionPer, String failLoginAttempts, String passLifetime, String IdleTime){
        String temp = String.format("CREATE PROFILE %s LIMIT\n" +
                            " SESSIONS_PER_USER %s\n" +
                            " FAILED_LOGIN_ATTEMPTS %s\n" +
                            " PASSWORD_LIFE_TIME %s\n" +
                            " IDLE_TIME %s\n",profilename, sessionPer, failLoginAttempts, passLifetime, IdleTime);
        return DataAccess.ResultOfExecuteSql(temp);
    }
}
