set SQLFORMAT csv;
set encoding UTF-8;
SPOOL 'C:\Users\phatl\OneDrive\Desktop\test\test.csv'
select * from CHITIETHOADON;
SPOOL off
exit