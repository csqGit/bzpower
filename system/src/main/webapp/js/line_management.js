/**
 * 线路管理js
 */
// 异步加载表格数据
$(function() {
	getLineList(1);
})


//异步加载数据
function getLineList(page){
	if(page == null)
		page = 1;
	$.ajax({
		url : '../getLineList',
		type : 'post',
		data : {
			'startPage' : page
		},
		dataType : 'json',
		success : function(data) {
			getLineInfo(data);
		},
		error : function(data) {

		}
	});
	
}


//分页查询
$(function(){
	$("#firstPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage <= 1)
			return false;
		currentPage = 1;
		getLineList(currentPage);
	});
	$("#prePage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage <= 1)
			return false;
		currentPage--;
		getLineList(currentPage);
	});
	$("#nextPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage >= pages)
			return false;
		currentPage ++;
		getLineList(currentPage);
	});
	$("#lastPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage >= pages)
			return false;
		currentPage = pages;
		getLineList(currentPage);
	});
})


// 新增线路信息
function addLine(type) {
	if (type == 'addLine') {
		$("#win").window("open");
		// 清空表单中的元素
		$(".other").attr('value', "");
		$("#lineForm").attr('action', '../addLine');
	}
	//修改线路信息
	if (type == 'updateLine') {
		$("#win").window("open");
		// $("#lineForm").action = '../updateLine';
		$("#lineForm").attr("action", '../updateLine');
	}
}


//提交表单数据新增或修改
$(function() {
	$("#but").click(function() {
		var id = $("[class='other']input[name='id']").val();
		var line = $("[class='other']input[name='lineName']").val();
		var com = $("[class='other']input[name='companyName']").val();
		var bl = $("[class='other']input[name='beginLine']").val();
		var el = $("[class='other']input[name='endLine']").val();
		var tow = $("[class='other']input[name='towerNumber']").val();
		var vol = $("[class='other']input[name='voltageGrade']").val();
		var towerNumber = $("[class='other']input[name='towerNumber']").val();
		
		var num = parseInt(towerNumber);
		if(com == ""){
			alert("公司名称不能为空！");
			return false;
		}
		if(vol == ""){
			alert("电压等级不能为空！");
			return false;
		}
		if(line == ""){
			alert("线路名称不能为空！");
			return false;
		}
		if(isNaN(num)){
			alert("线路数量必须为数字！");
			return false;
		}
		$("#lineForm").submit();
	});
	var msg = $.cookie("msg");
	$("#msg").html(msg);
})


// 删除线路信息
function deleteLine(id) {
	$.messager.confirm('确认', '您确认要删除吗？', function(r) {
		if (r) {
			$.ajax({
				url : '../deleteLine',
				type : 'post',
				data : {
					'id' : id
				},
				dataType : 'json',
				success : function(data) {
					// alert(data.msg);
				},
				error : function(data) {

				}
			});
		}
	});
}


// 更新线路信息
function updateLine(id) {
	// 得到线路信息
	$.ajax({
		url : '../getLineById',
		type : 'post',
		dataType : 'json',
		data : {
			'id' : id
		},
		success : function(data) {
			var lineName = data.lineName;
			var companyName = data.companyName;
			var id = data.id;
			var beginLine = data.beginLine;
			var endLine = data.endLine;
			var towerNumber = data.towerNumber;
			var voltageGrade = data.voltageGrade;
			$("[class='other']input[name='id']").attr('value', id);
			$("[class='other']input[name='lineName']").attr('value', lineName);
			$("[class='other']input[name='companyName']").attr('value',
					companyName);
			$("[class='other']input[name='beginLine']")
					.attr('value', beginLine);
			$("[class='other']input[name='endLine']").attr('value', endLine);
			$("[class='other']input[name='towerNumber']").attr('value',
					towerNumber);
			$("[class='other']input[name='voltageGrade']").attr('value',
					voltageGrade);
		}
	});
	// 更新线路信息
	var type = "updateLine";
	addLine(type);
}



// 根据id编号得到线路信息
function getLineById(id) {
	alert(id);
	$.ajax({
		url : '../getLineById',
		type : 'post',
		dataType : 'json',
		data : {
			'id' : id
		},
		success : function(data) {
			getLineInfo(data);
		}
	});
}


//解析线路集合数据，添加到表格
function getLineInfo(data) {
	// var obj = eval(data);
	$
			.each(
					data,
					function(k, v) {
						var current = data.current;
						var pages = data.pages;
						var now = data.now;
						var size = data.size;
						var count = data.count;

						$("#now").html(now);
						$("#size").html(size);
						$("#count").html(count);
						$("#currentPage").html(current);
						$("#pages").html(pages);
						// 清空当前数据
						$(".tbody").empty();
						if (k == 'list') {
							$
									.each(
											v,
											function(k2, v2) {
												var id = v2.id;
												var lineName = v2.lineName;
												var companyName = v2.companyName;
												var voltageGrade = v2.voltageGrade;
												var beginLine = v2.beginLine;
												var endLine = v2.endLine;
												var towerNumber = v2.towerNumber;
												var trs = "<tbody class='tbody' "
														+ "style='background:rgb(6, 47, 103); height:35px; color:rgb(252, 193, 123)'><tr><td>"
														+ (k2 + 1)
														+ "</td><td>"
														+ companyName
														+ "</td><td>"
														+ voltageGrade
														+ "</td><td>"
														+ lineName
														+ "</td><td>"
														+ beginLine
														+ "</td><td>"
														+ endLine
														+ "</td><td>"
														+ towerNumber
														+ "</td><td>"
														+ "<a href='javascript:void(0)' onclick='updateLine("
														+ id
														+ ")'>修改</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;"
														+ "<a href='javascript:void(0)' onclick='deleteLine("
														+ id
														+ ")'>删除</a></td></tr></tbody>";
												$("#lineTab").append(trs);
											})
						}
					});
}

// 刷新页面
function flush() {
	$(".tbody").empty();
	$.ajax({
		url : '../getLineList',
		type : 'post',
		data : {
			'startPage' : 1
		},
		dataType : 'json',
		success : function(data) {
			getLineInfo(data);

		},
		error : function(data) {

		}
	});
}


//线路搜索查询
$(function() {
	$("#sub").click(function() {
		var companyName = $("[class='in']input[name='companyName']").val();
		var voltageGrade = $("[class='in']input[name='voltageGrade']").val();
		var lineName = $("[class='in']input[name='lineName']").val();
		$.ajax({
			url : '../getLineBylineNameAndOther',
			type : 'post',
			data : {
				'companyName' : companyName,
				'voltageGrade' : voltageGrade,
				'lineName' : lineName
			},
			dataType : 'json',
			success : function(data) {
				//alert(data);
				getLineInfo(data);
			}
		});
	});
})



