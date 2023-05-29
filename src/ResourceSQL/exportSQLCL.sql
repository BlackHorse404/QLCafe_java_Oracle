set SQLFORMAT csv;
set encoding UTF-8;
SPOOL 'D:\khachhang.txt'
select * from KHACHHANG;
SPOOL off
exit