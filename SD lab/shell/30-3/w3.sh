i=1
s=0
while test "$i" -le 10
do
echo adding "$i" into s
s=`expr $s + $i`
i=`expr $i + 1`
done
echo sum is "$s"
