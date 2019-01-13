//定义全局变量和定时器
var i = 0 ;
var timer;
 
$(function(){
  // 用jquery方法设置第一张图片显示，其余隐藏
  $('.ig').eq(0).show().siblings('.ig').hide();
   
  // 调用showTime()函数（轮播函数）
  showTime();
   
  // 当鼠标经过下面的数字时，触发两个事件（鼠标悬停和鼠标离开）
  $('.tab').hover(function(){
    // 获取当前i的值，并显示，同时还要清除定时器
    i = $(this).index();
    Show();
    clearInterval(timer);
  },function(){
    //
    showTime();
  });
   
  // 鼠标点击左侧的箭头
  $('.btn1').click(function(){
    clearInterval(timer);
    if(i == 0){
      i = 4;// 注意此时i的值
    }
    i--;
    Show();
    showTime();
  });
   
  // 鼠标点击右侧的箭头
  $('.btn2').click(function(){
    clearInterval(timer);
    if(i == 3){
      i = -1;// 注意此时i的值
    }
    i++;
    Show();
    showTime();
  });
   
});
 
 
// 创建一个showTime函数
function showTime(){
  // 定时器
  timer = setInterval(function(){
    // 调用一个Show()函数
    Show();
    i++;
    // 当图片是最后一张的后面时，设置图片为第一张
    if(i==5){
      i=0;
    }
  },2000);
}
 
 
// 创建一个Show函数
function Show(){
  // 在这里可以用其他jquery的动画
  $('.ig').eq(i).fadeIn(300).siblings('.ig').fadeOut(300);
   
  // 给.tab创建一个新的Class为其添加一个新的样式，并且要在css代码中设置该样式
  $('.tab').eq(i).addClass('bg').siblings('.tab').removeClass('bg');
   
  /*
	 * css中添加的代码： .bg{ background-color: #f00; }
	 */
}

	var currentPage = 0 ;
	var pages = 0;
	$(function(){
		getNewInfo(1);
	})
	
	// 请求页面数据
	function getNewInfo(page){
		$.ajax({
			url : 'getNewInfoList',
			type : 'post',
			data : {
				'page' : page
			},
			dataType : 'json',
			success : function(data){
				formatNewInfo(data);
			}, 
			error : function(data){
				// alert(1);
			}
		});
	}
	
	// 解析新闻信息函数
	function formatNewInfo(data){
		// 首先清空原有的数据
		$(".trBg").empty();
		currentPage = data.currentPage;
		pages = data.pages;
		$("#currentPage").html(currentPage);
		$("#pages").html(pages);
		$.each(data, function(k1, v1){
			if(k1 == 'list'){
				$.each(v1, function(k2, v2){
					var id = v2.id;
					var title = v2.title;
					var author = v2.author;
					var time = v2.time;
					var newType = v2.type.typeName;
					var newInfo = "<tbody class='trBg'><tr height='30'><td width='10%'>"
					+ id 
					+ "</td><td width='20%'>"
					+ title
					+ "</td><td width='20%'>"
					+ newType
					+ "</td><td width='15%'>"
					+ time 
					+ "</td><td width='15%'>" 
					+ author
					+ "</td><td width='10%'>"
					+ "<a href='javascript:void(0)' onclick='newInfo("+ id +")'>查看详情"
					+ "</a></td></tr></tbody>";
					$("#newTab").append(newInfo);
				})
			}
			
		})
	}
	
	function getNewById(id){
		// alert(id);
	}
	
	$(function(){
		/*
		 * var currentPageStr = $("#currentPage").html(); var pagesStr =
		 * $("#pages").html(); var currentPage = parseInt(currentPageStr); var
		 * pages = parseInt(pagesStr);
		 */
		$("#firstPage").on('click', function(){
			// alert(currentPage);
			if(currentPage == 1)
				return false;
			currentPage = 1;
			getNewInfo(currentPage);
		});
		$("#prePage").on('click', function(){
			if(currentPage == 1)
				return false;
			currentPage --;
			getNewInfo(currentPage);
		});
		$("#nextPage").on('click', function(){
			if(currentPage == pages)
				return false;
			currentPage ++;
			getNewInfo(currentPage);
		});
		$("#lastPage").on('click', function(){
			if(currentPage == pages)
				return false;
			currentPage = pages;
			getNewInfo(currentPage);
		});
	})
	
	
	var currentPage2 = 0 ;
	var pages2 = 0;
	
	$(function(){
		getRepairInfo(1);
	})
	
	// 请求页面数据
	function getRepairInfo(page){
		$.ajax({
			url : 'getRepairInfoAll',
			type : 'post',
			data : {
				page : page
			},
			dataType : 'json',
			success : function(data){
				formatRepairInfo(data);
			}, 
			error : function(data){
				// alert(1);
			}
		});
	}
	
	// 解析新闻信息函数
	function formatRepairInfo(data){
		// 首先清空原有的数据
		$(".trBg2").empty();
		currentPage2 = data.current;
		pages2 = data.pages;
		$("#currentPage2").html(currentPage2);
		$("#pages2").html(pages2);
		$.each(data, function(k1, v1){
			
			if(k1 == 'list'){
				$.each(v1, function(k2, v2){
						var id = v2.id;
						var content = v2.content;
						var repair_name = v2.repair_name;
						var repair_type = v2.repair_type;
						var repair_address = v2.repair_address;
						var time = v2.time;
						var repair = "<tbody class='trBg2'><tr height='30'><td width='10%'>"
						+ id 
						+ "</td><td width='40%'>"
						+ content
						+ "</td><td width='10%'>"
						+ repair_type
						+ "</td><td width='15%'>"
						+ time 
						+ "</td><td width='15%'>" 
						+ repair_address
						+ "</td><td width='10%'>"
						+ repair_name
						+ "</td></tr></tbody>";
						$("#repairTab").append(repair);
					
				})
			}
			
		})
	}
	
	function getNewById(id){
		// alert(id);
	}
	
	$(function(){
		/*
		 * var currentPageStr = $("#currentPage").html(); var pagesStr =
		 * $("#pages").html(); var currentPage = parseInt(currentPageStr); var
		 * pages = parseInt(pagesStr);
		 */
		$("#firstPage2").on('click', function(){
			if(currentPage2 == 1)
				return false;
			currentPage2 = 1;
			getRepairInfo(currentPage2);
		});
		$("#prePage2").on('click', function(){
			if(currentPage2 == 1)
				return false;
			currentPage2 --;
			getRepairInfo(currentPage2);
		});
		$("#nextPage2").on('click', function(){
			if(currentPage2 == pages2)
				return false;
			currentPage2 ++;
			getRepairInfo(currentPage2);
		});
		$("#lastPage2").on('click', function(){
			if(currentPage2 == pages2)
				return false;
			currentPage2 = pages2;
			getRepairInfo(currentPage2);
		});
	})