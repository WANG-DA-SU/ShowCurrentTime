# ShowCurrentTime
# 获取当前时间 ， 然后按照如下步骤计算出当前的秒数 、 分钟数和小时数 ：
###  1 ) 调用 System . currentTimeMillisO 方法获取 1970 年丨月 1 日午夜到现在的毫秒数 （ 例
###  如 ： 1203183086328 毫秒 ) ， 并存放在变童 totalMilliseconds 中 。
###  2 ) 通过将总毫秒数 total Mill i seconds 除以 1000 得到总秒数 total Seconds ( 例如 ：120 B 183086328 毫秒 / 1000 = 1203183068 秒 ） 。
### 3 ) 通过 totalSecondsX 60 得到当前的秒数 （ 例如 ： lMSlHO 68 秒 ％ 60 = 8 ， 这个值就是 当前秒数 ) 。
###  4 ) 通过将 total Seconds 除以 M 得到总的分钟数 total Minutes ( 例如 ： lWU 83 。68秒 / 60 = 20053051 分钟 ） 。
###  5 ) 通过 totalMinutesX 60 得到当前分钟数 （ 例如 ： 20053051 分钟 ％ 60 = 31 , 这个值就是当前分钟数 ) 。
###  6 ) 通过将总分钟数 totalMinutes 除以 60 获得总的小时数 totalHours ( 例如 ： MOSSOSl分钟 / 60 = 334217 小时 ) 。
###  7 ) 通过 t 0 talH 0 UrSX 24 得到当前的小时数 （ 例如 ： 33 « 17 小时 ％ 24 = 17 , 该值就是当前小时数 )