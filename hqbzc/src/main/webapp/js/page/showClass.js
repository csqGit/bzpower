
		$(function(){
			var currentPageStr = $("#currentPage").html();
			var pagesStr = $("#pages").html();
			var currentPage = parseInt(currentPageStr);
			var pages = parseInt(pagesStr);
			$("#firstPage").on('click', function(){
				//alert(currentPage);
				if(currentPage == 1)
					return false;
				currentPage = 1;
				window.location.href="getApplyClass?page=" + currentPage; 
			});
			$("#prePage").on('click', function(){
				if(currentPage == 1)
					return false;
				currentPage --;
				window.location.href="getApplyClass?page=" + currentPage; 
			});
			$("#nextPage").on('click', function(){
				alert(currentPage);
				if(currentPage == pages)
					return false;
				currentPage ++;
				window.location.href="getApplyClass?page=" + currentPage; 
			});
			$("#lastPage").on('click', function(){
				if(currentPage == pages)
					return false;
				currentPage = pages;
				window.location.href="getApplyClass?page=" + currentPage; 
			});
			
			
			var obj = $("#box");
			var height = obj.css("height");
			height = parseInt(height.substring(0, height.length - 2));
			//定义当页面高度小于400px 时，固定页面高度
			var fixHeight = 486;
			if(height < fixHeight)
				obj.css('height', "400px");
		})