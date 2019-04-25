
if [ $1 -lt $2 ]
then 

echo "the less value is" $2

elif [ $1 == $2 ]
then
echo $1 "and" $2 "are equal";
else
echo "the greater value is" $1

fi
