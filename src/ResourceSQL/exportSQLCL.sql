set SQLFORMAT csv;
set encoding UTF-8;
SPOOL 'C:\Users\phatl\OneDrive\Desktop\file_Khachhang.csv'
select * from KHACHHANG;
SPOOL off
exit