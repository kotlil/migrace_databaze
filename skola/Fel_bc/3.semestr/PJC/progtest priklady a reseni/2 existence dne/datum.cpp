(
 ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d <= 31 && d >= 1) && ( y >= 0)) || 
		((m == 4 || m == 6 || m == 11) && ((d <= 30 && d >= 1) && ( y >=0 ))) ||
		(y==1752 && m ==9 && (d ==1 || d==2 || (d>=14 && d<=30))) ||
		(y>=0 && y != 1752 && m==9 && (d <= 30 && d >= 1)) ||
		(m==2 && y>=0 && y%4 !=0 && (d>=1 && d <=28)) || 
		(m==2 && y>=0 && y <=1752 && y%4==0 && (d>=1 && d <=29)) ||
		(m==2 && y>=0 && y > 1752 && y%4==0 && y%100!=0 && (d>=1 && d <=29)) ||
		(m==2 && y>=0 && y > 1752 && y%100==0 && y%400!=0 && (d>=1 && d <=28)) ||
		(m==2 && y>=0 && y > 1752 && y%400==0 && (d>=1 && d <=29))
? 1:0 )
