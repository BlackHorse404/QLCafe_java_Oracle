package BLL;

import DAL.DataAccess;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class ExecuteData {
    public static boolean ExecuteSql(String SID, String SerialID)
    {
        return DataAccess.ResultOfExecuteSql(String.format("Alter system kill session '%s,%s'",SID,SerialID));
    }
    public static boolean CreateAuditPolicy(String objectSchema, String objectName, String policyName, String statement)
    {
        String temp = String.format("BEGIN DBMS_FGA.ADD_POLICY(object_schema      => '%s',object_name        => '%s',policy_name        => '%s',statement_types    => '%s');END;",objectSchema, objectName, policyName, statement);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    public static boolean DeleteAuditPolicy(String objectSchema, String objectName, String policyName)
    {
        String temp = String.format("BEGIN DBMS_FGA.DROP_POLICY( object_schema  => '%s', object_name  => '%s', policy_name => '%s'); END;",objectSchema, objectName, policyName);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean EditStandardAudit(String auditMode, String statement, String objectSchema, String objectName)
    {
        String temp = String.format("%s %s on %s.%s",auditMode,statement,objectSchema,objectName);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean CreateStandardAudit(String statement, String objectSchema, String objectName)
    {
        String temp = String.format("audit %s on %s.%s",statement, objectSchema, objectName);
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
    
    public static boolean UpdateProfile(String profileName, String resourceName,String value){
        String temp = String.format("ALTER PROFILE %s LIMIT %s %s",profileName, resourceName, value);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean EditProfileOfUser(String user, String profileNew){
        String temp = String.format("ALTER USER %s PROFILE %s",user, profileNew);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    public static boolean DropUser(String user){
        String temp = String.format("DROP USER %s CASCADE",user);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean createUser(String user, String pass){
        String temp = String.format("create user %s identified by %s",user,pass);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean deleteKH(String MaKH)
    {
        String temp = String.format("DELETE FROM datacaphe.KhachHang where MAKH = '%s'",MaKH);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean addKH(String tenKH, String gioiTinh, String SDT, Integer diem, String HSD)
    {
        String temp = String.format("insert into datacaphe.KHACHHANG values (null, '%s','%s','%s',%s,TO_DATE('%s','DD/MM/YYYY'))",tenKH,gioiTinh,SDT,diem.toString(),HSD);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean editKH(String tenKH, String gioiTinh, String SDT, Integer diem, String HSD, String maKH)
    {
        String temp = String.format("update datacaphe.KHACHHANG set TENKH='%s',GIOITINH='%s',SDT='%s',diemtichluy=%s,HSD=TO_DATE('%s','DD/MM/YYYY') where MAKH='%s'",tenKH,gioiTinh,SDT,diem.toString(),HSD,maKH);
        return DataAccess.ResultOfExecuteSql(temp);
    }
}
