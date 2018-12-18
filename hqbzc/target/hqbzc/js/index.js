layui.use([ 'carousel', 'form' ], function() {
		var carousel = layui.carousel, form = layui.form;

		//常规轮播
		carousel.render({
			elem : '#test1',
			arrow : 'always'
		});
		//图片轮播
		carousel.render({
			elem : '#test1',
			width : '1200px',
			height : '300px',
			interval : 5000
			,indicator: 'none'
		});

	});

	layui.use('table', function() {
		var table = layui.table;

		table.render({
			elem : '#test',
			height: 355,
			url : 'getNewInfo',
			page :true,/*{ //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
				layout : [ 'limit',  'prev', 'page', 'next', 'skip' , 'count'] //自定义分页布局
			,curr : 1 //设定初始在第 5 页
			,groups : 1 //只显示 1 个连续页码
			,first : false //不显示首页
			,last : false//不显示尾页
		},*/
			limits:[7],
			limit: 7,
			cols : [ [ {  
				field : 'id',
				width : 80,
				title : '编号',
				sort : true,
				unresize : true
			}, {
				field : 'title',
				width : 310,
				title : '标题',
				unresize : true
			}, {
				field : 'type',
				width : 150,
				title : '内容类型',
				sort : true,
				unresize : true
			}, {
				field : 'time',
				width : 150,
				title : '发部时间',
				unresize : true
			}, {
				field : 'author',
				title : '发布人',
				minWidth : 100,
				unresize : true
			} ] ]

		});
	});

	layui.use('table', function() {
		var table = layui.table;

		table.render({
			elem : '#test2',
			height: 240,
			url : 'getRepairInfoAll',
			page : true,/*{ //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
				layout : [  'limit',  'prev', 'page', 'next', 'skip' , 'count' ] //自定义分页布局
				,curr : 1 //设定初始在第 5 页
				,groups : 1 //只显示 1 个连续页码
				,first : false //不显示首页
				,last : false//不显示尾页
			},*/
			limits:[4],
			limit: 4,
			loading:true,
			cols : [ [ {
				field : 'id',
				width : 80,
				title : '编号',
				unresize : true
			}, {
				field : 'content',
				width : 313,
				title : '报修内容',
				unresize : true
			}, {
				field : 'repair_type',
				width : 150,
				title : '报修类型',
				unresize : true
			}, {
				field : 'time',
				title : '报修时间',
				width : 150,
				unresize : true
			} , {
				field : 'repair_name',
				width : 100,
				title : '姓名',
				unresize : true,
				sort : true
			}
			] ]
		});
	});

	//请求页面导航数据
		$(function(){
			$.ajax({
				url:'getSystemInfo',
				type:'POST',
				dataType:'text',
				async:true
			});
		});
//页面左边轮播图片
layui.use('carousel', function(){
  var carousel = layui.carousel;
  //建造实例
  carousel.render({
    elem: '#test3'
    ,width: '370px' //设置容器宽度
    ,height: '220px'
    ,arrow: 'none' //始终显示箭头
    ,indicator: 'none'
    ,anim: 'updown' //切换动画方式
    ,interval:3000
  });
});