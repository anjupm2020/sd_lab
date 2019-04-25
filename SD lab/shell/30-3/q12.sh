#fibanossi series 

c=0
a=1
b=1
echo "enter the limit"
read n
echo "$a"
echo "$b"
while test "$c" -le "$n"
do
c=`expr $a + $b`
echo "$c"
a=$b
b=$c

done
