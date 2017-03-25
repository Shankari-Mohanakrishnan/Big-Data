#Week-07 
### Item-01
#### Results :

* hadoop jar mt.jar MaxTemperature /user/root/ncdc/1990/1990.txt /user/$USER/output/ssm/ncdc/Item-one/90
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/90and92/1990and1992.txt /user/$USER/output/ssm/ncdc/Item-one/90and92
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/90-93/90919293.txt /user/$USER/output/ssm/ncdc/Item-one/9093

#### Analysis :

Data Set        | MaxTemperature   |
------------ | --------- |
 1990 | 5.20| 
90and92 | 12.11| 
90-93| 23.07| 

### Item-02

#### Results :

* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/1990/1990.txt /user/$USER/output/ssm/ncdc/Item-two/90
* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/90and92/1990and1992.txt /user/$USER/output/ssm/ncdc/Item-two/90and92
* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/90-93/90919293.txt /user/$USER/output/ssm/ncdc/Item-two/9093

#### Analysis :
Data Set        | MaxTemperatureWithCombiner |
------------ | --------- |
1990 | 16.26| 
90and92 | 13.12| 
90-93 | 21.39|
### Item-03

#### Results :
#### GZip :
###### MaxTemperature :

* hadoop jar mt.jar MaxTemperature /user/root/ncdc/1990/1990.txt.gz /user/$USER/output/ssm/ncdc/Item-three/wcomb/90.gz
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/90and92/1990and1992.txt.gz /user/$USER/output/ssm/ncdc/Item-three/wcomb/90and92.gz
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/90-93/90919293.txt.gz /user/$USER/output/ssm/ncdc/Item-three/wcomb/9093.gz

###### MaxTemperatureWithCombiner :

* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/1990/1990.txt.gz /user/$USER/output/ssm/ncdc/Item-three/90.gz
* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/90and92/1990and1992.txt.gz /user/$USER/output/ssm/ncdc/Item-three/90and92.gz
* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/90-93/90919293.txt.gz /user/$USER/output/ssm/ncdc/Item-three/9093.gz

#### Analysis :

Data Set | MaxTemperature| MaxTemperatureWithCombiner
------------ | --------- |---------------------
1990 | 3.48| 12.41
90and92 | 9.51 | 7.01
90-93 | 11.20| 13.38


#### BZip :
###### MaxTemperature :
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/1990/1990.txt.bz2 /user/$USER/output/ssm/ncdc/Item-three/wcomb/90.bz2
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/90and92/1990and1992.txt.bz2 /user/$USER/output/ssm/ncdc/Item-three/wcomb/90and92.bz2
* hadoop jar mt.jar MaxTemperature /user/root/ncdc/90-93/90919293.txt.bz2 /user/$USER/output/ssm/ncdc/Item-three/wcomb/9093.bz2

###### MaxTemperatureWithCombiner :

* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/1990/1990.txt.bz2 /user/$USER/output/ssm/ncdc/Item-three/90.bz2
* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/90and92/1990and1992.txt.bz2 /user/$USER/output/ssm/ncdc/Item-three/wcomb/90and92.bz2
* hadoop jar mt.jar MaxTemperatureWithCombiner /user/root/ncdc/90-93/90919293.txt.bz2 /user/$USER/output/ssm/ncdc/Item-three/9093.bz2

#### Analysis :

Data Set | MaxTemperature| MaxTemperatureWithCombiner
------------ | --------- |---------------------
1990 | 3.22| 4.48
90and92 | 7.01 | 6.50
90-93 | 13.38| 12.05


