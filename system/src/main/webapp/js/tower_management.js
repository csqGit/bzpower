/**
 * 
 */

$(function(){
	getTower(1);
})

//异步加载数据
function getTower(page){
	if(page == null)
		page = 1;
	$.ajax({
		url : '../getTower',
		type : 'post',
		data : {
			'page' : page
		},
		dataType : 'json',
		success : function(data) {
			getTowerInfo(data);
		},
		error : function(data) {

		}
	});
}



function getTowerInfo(data) {
	$.each(data,function(k, v) {
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
							$.each(v,function(k2, v2) {
												var id = v2.id;
												var towerName = v2.towerName;
												var towerType = v2.towerType;
												var towerAddress = v2.towerAddress;
												var installDate = v2.installDate;
												var runDate = v2.runDate;
												var lineName = v2.line_id.lineName;
												var lineId = v2.line_id.id;
												var trs = "<tbody class='tbody' "
														+ "style='background:rgb(6, 47, 103); color:rgb(252, 193, 123)'><tr><td>"
														+ (k2 + 1)
														+ "</td><td>"
														+ lineName
														+ "</td><td>"
														+ towerName
														+ "</td><td>"
														+ towerType
														+ "</td><td>"
														+ towerAddress
														+ "</td><td>"
														+ installDate
														+ "</td><td>"
														+ runDate
														+ "</td><td>"
														+ "<a href='javascript:void(0)' onclick='updateTower("
														+ id
														+ ")'>修改</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;"
														+ "<a href='javascript:void(0)' onclick='deleteTower("
														+ id
														+ ")'>删除</a></td></tr></tbody>";
												$("#lineTab").append(trs);
											})
						}
					});
}


//修改杆塔信息
function updateTower(id){
	getTowerById(id);
	$("#win").window('open');
	$('.towerForm').attr('action', '../updateTower');
}


//添加杆塔信息
function addTower(pre){
	if(pre == 'addTower'){
		$("#win").window('open');
		$("input[type='text']").attr('value', '');
		$('.towerForm').attr('action', '../addTower');
	}
}


//提交修改或新增
$(function(){
	$("#but").click(function(){
		$('.towerForm').submit();
	});
})

//查询杆塔信息根据id
function getTowerById(id){
	$.ajax({
		url : '../getTowerById',
		type : 'post',
		data : {'id' : id},
		dataType : 'json',
		success : function(v2){
			var id = v2.id;
			var towerName = v2.towerName;
			var towerType = v2.towerType;
			var towerAddress = v2.towerAddress;
			var installDate = v2.installDate;
			var runDate = v2.runDate;
			var line_id = v2.line_id.id;
			var lineName = v2.line_id.lineName;
			$("[class='other']input[name='id']").attr('value', id);
			$("[class='other']input[name='line_id.id']").attr('value', lineName);
			$("[class='other']input[name='towerName']").attr('value', towerName);
			$("[class='other']input[name='towerType']").attr('value', towerType);
			$("[class='other']input[name='towerAddress']").attr('value', towerAddress);
			$("[class='other']input[name='installDate']").attr('value', installDate);
			$("[class='other']input[name='runDate']").attr('value', runDate);
			$("[class='other']input[name='line_id.id']").attr('value', lineName);
		}
	});
}


//删除杆塔信息
function deleteTower(id){
	$.messager.confirm('确认？', '你确认要删除吗？', function(flag){
		if(flag){
			$.ajax({
				url : '../deleteTower',
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
	})
			
}


//杆塔检索
$(function(){
	$("#sub").click(function(){
		//清空表格当前的所有数据
		$(".tbody").empty();
		var lineName = $("#lineName").val();
		var towerName = $("[class='in']input[name='towerName']").val();
		var towerType = $("[class='in']input[name='towerType']").val();
		$.ajax({
			url : '../getTowerByTowerAndOther',
			type : 'post',
			data : {
				'lineName' : lineName,
				'towerName' : towerName,
				'towerType' : towerType
			},
			dataType : 'json',
			success : function(data){
				getTowerInfo(data);
			}
		});
	});
})

$(function(){
	$("#lineName").click(function(){
		$(this).empty();
		$.ajax({
			url : '../getLineList',
			type : 'post',
			data : {
				'startPage' : 1
			},
			dataType : 'json',
			success : function(data){
				
				$.each(data , function(k, v){
					if(k == 'list'){
						$.each(v, function(k2, v2){
							var id = v2.id;
							var lineName = v2.lineName;
							var opt  =  "<option style='height: 40px; width:146px; display; block;' value=' " + id + "'>" + lineName + "</option>";
							
							$("#lineName").append(opt);
						});
					}
				});
			}
		});
	});
})




// 刷新页面
function flush() {
	$(".tbody").empty();
	$("input[type='text'").attr('value', '');
	$("#win").window("close");
	getTower(1);
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
		getTower(currentPage);
	});
	$("#prePage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage <= 1)
			return false;
		currentPage--;
		getTower(currentPage);
	});
$("#nextPage").on("click", function() {
		
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage >= pages)
			return false;
		currentPage ++;
		getTower(currentPage);
	});
	$("#lastPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage >= pages)
			return false;
		currentPage = pages;
		getTower(currentPage);
	});
})