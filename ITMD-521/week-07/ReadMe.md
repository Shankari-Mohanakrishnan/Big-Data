# Week-07 
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
90-93 | 23.07| 

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


