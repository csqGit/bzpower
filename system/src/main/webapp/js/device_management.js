$(function() {
	getData(1);
})


//请求页面所有数据
function getData(page){
	$
	.ajax({
		url : '../getDeviceList',
		type : 'post',
		data : {
			'page' : page
		},
		dataType : 'json',
		success : function(data) {
			deviceFormat(data);
		}
	});
}



//解析集合数据
function deviceFormat(data){


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
						// alert(k);
						if (k == 'list') {
							$
									.each(
											v,
											function(k2, v2) {

												var id = v2.id;
												var deviceNumber = v2.deviceNumber;
												var iccId = v2.iccId;
												var dangerType = v2.dangerType;
												var description = v2.description;
												var installDate = v2.installDate;
												var installPerson = v2.installPerson;
												var lineName = v2.line.lineName;
												var towerName = v2.tower.towerName;
												var manufacturer = v2.manufacturer;
												var model = v2.model;
												var phoneNumber = v2.phoneNumber;
												var runType = v2.runType;
												var viewAddress = v2.viewAddress;
												//alert(id);
												var tbody = "<tbody class='tbody' style='background:rgb(6, 47, 103); color:rgb(252, 193, 123)'><tr><td>"
														+ (k2 + 1)
														+ "</td><td>"
														+ lineName
														+ "</td><td>"
														+ towerName
														+ "</td><td>"
														+  deviceNumber
														+ "</td><td>"
														+ phoneNumber
														+ "</td><td>"
														+ iccId
														+ "</td><td>"
														+ model
														+ "</td><td>"
														+ manufacturer
														+ "</td><td>"
														+ installDate
														+ "</td><td>"
														+ viewAddress
														+ "</td><td>"
														+ installPerson
														+ "</td><td>"
														+ dangerType
														+ "</td><td>"
														+ runType
														+ "</td><td>"
														+ description
														+ "</td><td><a href='javascript:void(0)' onclick='updateDevice("
														+ id
														+ ")'>修改&nbsp;|&nbsp;" + 
												"<a href='javascript:void(0)' onclick='deleteDevice("
														+ id
														+ ")'>删除</a></td></tr></tbody>";
												$("#deviceTab")
														.append(
																tbody);
											})
						}
					});


}




//新增设备
function addDevice(pro){
	
	if(pro == 'addDevice'){
		$("#win").window('open');
		$("#deviceForm").attr("action" , '../addDevice');
		$(".other").attr('value', '');
		$("textarea").attr('value', '');
	}  
}


//提交设备
$(function(){
	$("#but").click(function(){
		$("#deviceForm").submit();
	});
})


//根据id编号查询设备
function getDeviceById(id){
	$.ajax({
		url : '../getDeviceById',
		type : 'post',
		data : {
			'id' : id
		},
		dataType : 'json',
		success : function(v2){
			$.each(v2,function(k, v) {
				//alert(k2);
								var id = v2.id;
								var deviceNumber = v2.deviceNumber;
								var iccId = v2.iccId;
								var dangerType = v2.dangerType;
								var description = v2.description;
								var installDate = v2.installDate;
								var installPerson = v2.installPerson;
								var lineName = v2.line.lineName;
								var towerName = v2.tower.towerName;
								var manufacturer = v2.manufacturer;
								var model = v2.model;
								var phoneNumber = v2.phoneNumber;
								var runType = v2.runType;
								var viewAddress = v2.viewAddress;
								$("input[type='hidden']input[name='id']").attr('value' , id);
								
								$("temp='line'").attr('value' , lineName);
								$("temp='tower'").attr('value' , lineName);
								$("[id='cc'][class='tower']").attr('value' , towerName);
								var v = $(".tower").val();
								$("#deviceNumber").attr('value', deviceNumber);
								$("input[name='phoneNumber']").attr('value', phoneNumber);
								$("input[name='iccId']").attr('value', iccId);
								$("input[name='model']").attr('value', model);
								$("input[name='manufacturer']").attr('value', manufacturer);
								$("input[name='installDate']").attr('value', installDate);
								$("input[name='viewAddress']").attr('value', viewAddress);
								$("input[name='installPerson']").attr('value', installPerson);
								$("input[name='dangerType']").attr('value', dangerType);
								$("input[name='runType']").attr('value', runType);
								$("textarea[name='description']").attr('value', description);
								
							})
		
		}
	});
}



//修改设备

function updateDevice(id){
	getDeviceById(id);
	$("#win").window('open');
	$("#deviceForm").attr("action" , '../updateDevice');
}




//删除设备

function deleteDevice(id){
	//alert(id);
	$.messager.confirm('确认', '确认删除吗？', function(flag){
		if(flag){
			$.ajax({
				url : '../deleteDevice',
				type : 'post',
				data : {
					'id' : id
				},
				dataType : 'json',
				success : function(data){
					
				}
			});
		}else{
			
		}
	});
}


//刷新页面
function flush(){
	getData(1);
}



//页面模糊查询
$(function(){
	$("#sub").click(function(){
//		var lineName = $("[class='in']input[name='lineName'").val();
//		var towerName = $("[class='in']input[name='lineName'").val();
		var deviceNumber = $("input[name='deviceNumber'").val();
		
		$.ajax({
			url : '../getDeviceByDeviceNumber',
			type : 'post',
			data : {
				/*'lineName' : lineName,
				'towerName' : towerName,*/
				'deviceNumber' : deviceNumber
			},
			dataType : 'json',
			success : function(data){
				$(".tbody").empty();
				deviceFormat(data);
			}
		});
	});
})


//分页查询
$(function(){
	$("#firstPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var pagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(pagesStr);
		if (currentPage <= 1)
			return false;
		currentPage = 1;
		getData(currentPage);
	});
	$("#prePage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var pagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(pagesStr);
		if (currentPage <= 1)
			return false;
		currentPage--;
		getData(currentPage);
	});
$("#nextPage").on("click", function() {
		
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var pagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(pagesStr);
		if (currentPage >= pages)
			return false;
		currentPage ++;
		getData(currentPage);
	});
	$("#lastPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var pagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(pagesStr);
		if (currentPage >= pages)
			return false;
		currentPage = pages;
		getData(currentPage);
	});
})

