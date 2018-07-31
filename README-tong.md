### Fragment通信
#### Fragment与Fragment通信
+ 首先获取关联的Activity，然后再调用`findFragmentById()`方法得到Fragment对象，这样就可以进行通信了；
#### [Fragment与Activity通信](https://github.com/ningbaoqi/Fragment/commit/83d3c72d0c13cdff9a4f123ba11dd1b95d406329)
![image](https://github.com/ningbaoqi/Fragment/blob/master/gif/pic-6.gif)
+ Fragment可`调用getActivity()方法获取它所在的activity`；
#### [Activity与Fragment通信](https://github.com/ningbaoqi/Fragment/commit/696c893dc929477dc498be4cb65077451f05ec2e)
![image](https://github.com/ningbaoqi/Fragment/blob/master/gif/pic-5.gif)
+ 常用`接口回调`；在Fragment中创建一个`接口`，然后在`Activity实现`，这样就能实现Activity与Fragment通信；Activity向Fragment传递数据也可以在`Fragment`中写入方法，因为Activity有`Fragment对象`，可以很正常的调用Fragment的方法；
