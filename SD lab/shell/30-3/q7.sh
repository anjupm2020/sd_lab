echo enter the limit
read n
for((i=1; i<=n; i++))
do
  f=0
 for((j=2; j<i; j++))
do
  if [ $((i % j)) == 0 ]
   then
   f=1
  fi
done
if [ $f -eq 0 ]
echo $i
fi

done


