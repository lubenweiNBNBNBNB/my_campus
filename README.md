深 圳 大 学 实 验 报 告


      课程名称：          移动互联网应用     	              

      实验项目名称：              我的校园                 

# 实验目的与内容：
目的：掌握安卓中活动的编写、自定义用户界面的开发、碎片开发、广播机制以及数据持久化技术等；并能通过对课堂知识进行扩展来完善该界面，并使界面尽量美观。
内容要求：
1. 请尽量模拟如下深大校园主页的功能，参考：
https://www1.szu.edu.cn/
2. 具体要求：
1) 该实现的界面在某些地方应体现出如下功能：
a. 界面能对平板与手机平台进行自适应（参考第4章碎片）；
b. 能对用户身份有强制下线的功能，比如网络中断，登录界面强行退出并显示提示错误的界面；
c. 界面某些地方体现数据持久化的技术，如文件数据的读取、存储的多种实现方式，并简单阐述几种实现方式具体的适用场景；
d. 界面要比较工整，没必要实现参考界面上的所有子项，能保证自己的界面实现能有扩展到参考界面的能力即可。
2) 功能并不局限于上面的要求，可以根据自己的理解设计一些新的功能，并在报告文档中进行详细的阐述，作为报告的亮点；
3）APP的布局尽快模仿参考界面，如果有较大的困难，可以只实现出右半边部分的界面，并尽量按上面要求进行完善；
4) 对于某一种功能，可以在不同的子项处采用多种实现方式，并比较这些实现方式的不同及优劣势。

3. 参考：尽量多的应用参考书《第一行代码 Android》第二版第2章活动、第3章UI开发第4章碎片、第5章广播机制与第6章数据持久化技术的各个知识点。

注意：
1. 实验报告中需要有功能的描述、实验结果的截屏图像及详细说明；
2. 也欢迎采用其它章节的知识点完成本次实验报告，如果实现的功能言之合理，会考虑酌情加分。

# 成果简介：

## 1.确定视图，平板会有单独的布局文件。界面能对平板与手机平台进行自适应

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/5a948bae-393d-4b30-b3c0-7f066d7a10f7)

同时代码中可以根据视图成员的不同来区分是平板还是手机，从而执行不同的操作。
![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/32e1a96b-dc2d-425b-90f9-460aa0c15d29)

对于界面选项功能，手机为跳转活动，平板为更换右边的碎片：

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/85fbd132-0f73-4608-9ab7-3eea25b71318)


![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/d2d5d106-0836-4d5a-af3e-98446efde756)

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/5451107c-e085-4dc2-82d7-e78a680eaac6)


所有活动均已在注册文件注册：

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/60d06be9-6a2e-4064-810f-0317a63a0850)

类总览：

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/f34816de-9593-462b-824e-a8d4d88af570)

每个活动或者碎片都是单独的类，实现时便于进行不同的修改。
不过像右边碎片，都是RecyclerView,每一项以及适配器可以复用代码。

## 2.登录界面有密码保存功能，体现数据持久化的技术


![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/eee6cf0b-37b0-4d71-ae9f-8e466e9a1eb1)


![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/236d32e8-8fbc-4651-8b69-0066defe5af7)

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/5ff1777a-e6e8-4406-b274-6b5e5aefa37b)

## 3.主活动按钮列表选项中增加了强制下线按钮，用户按下后就会强行退出并显示提示错误的界面；

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/768d7fd1-be75-416f-8842-53130052080c)

实现上为了让强制下线功能不依附于任何界面，创建BaseActivity类作为所有活动的父类，ActivityCollector类用于管理所有的活动。

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/3255e00d-f297-4c80-a247-9a47e77bae4e)

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/63979f3a-2b8b-46a5-8ef0-91443fdeffbb)


同时，下线的实现也在BaseActivity中：

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/e7e48309-3f2f-4b4a-8509-82f6e8dca085)

效果：

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/da5b78b4-5097-4708-9280-45c8cef29552)

![image](https://github.com/lubenweiNBNBNBNB/my_campus/assets/109973657/fcf4e3b5-ec9e-4db7-9280-7fbaa5523fa8)

