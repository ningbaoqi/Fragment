### Fragment
+ `Fragment相比Activity更加节省内存，并且Fragment显示UI的效果比Activity更加的舒适`；Fragment必须被嵌入activity中使用，因此，虽然Fragment也拥有自己的生命周期，但Fragment的生命周期会受它所在的activity的生命周期控制：例如：当activity暂停时，该activity内的所有Fragment都会暂停，当activity被销毁时，该activity内的所有Fragment都会被销毁，只有当该activity处于活动状态时，程序员才可通过方法独立的操作Fragment；Fragment总是作为activity界面的组成部分，activity可`调用FragmentManager的findFragmentById()或findFragmentByTag()方法方法来获取Fragment`，在activity运行过程中，可`调用FragmentManager的add()、remove()、replace()方法动态的添加、删除或替换Fragment`，一个activity可以同时组合多个Fragment，反过来，一个Fragment也可被多个activity复用， Fragment可以响应自己的输入事件，并拥有自己的生命周期，但他们的生命周期直接被其所属的activity的生命周期控制；