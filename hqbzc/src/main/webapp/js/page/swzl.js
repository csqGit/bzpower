/**
 * 失物招领
 */

$(function() {
			var curPageStr = $("#currentPage").text();
			var pageStr = $("#pages").text();
			var curPage = parseInt(curPageStr);
			var page = parseInt(pageStr);
			$("#firstPage").click(function() {
				if (curPage == 1)
					return false;
				window.location.href = "getGoodList?startPosition=1";
			});
			$("#prePage").click(function() {
				if (curPage > 1)
					curPage--;
				window.location.href = "getGoodList?startPosition=" + curPage;
			});
			$("#nextPage").click(function() {
				if (curPage < page)
					curPage++;
				window.location.href = "getGoodList?startPosition=" + curPage;
			});
			$("#lastPage").click(function() {
				if (curPage == page)
					return false;
				window.location.href = "getGoodList?startPosition=" + page;
			});

			var obj = $("#box");
			var height = obj.css("height");
			height = parseInt(height.substring(0, height.length - 2));
			//定义当页面高度小于400px 时，固定页面高度
			//alert(height);
			var fixHeight = 486;
			if (height < fixHeight)
				obj.css('height', "400px");
		})