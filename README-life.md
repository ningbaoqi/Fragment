### Fragment生命周期
#### Fragment存在的状态

|状态|说明|
|-------|-------|
|运行状态|当前Fragment位于前台，用户可见，可以获得焦点|
|暂停状态|其他Activity位于前台，该Fragment仍然可见，只是不能获取焦点|
|停止状态|该Fragment不可见，失去焦点|
|销毁状态|该Fragment被完全删除，或该Fragment所在的Activity被结束|

#### Fragment生命周期
image1

|方法|说明|
|------|------|
|onCreateView()|方法返回的必须是Fragment显示的布局的根视图|

#### Activity和Fragment的生命周期总结
image2
