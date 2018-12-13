$(function() {
	$
			.ajax({
				url : '../getDeviceList',
				type : 'post',
				data : {
					'page' : 1
				},
				dataType : 'json',
				success : function(data) {

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
																		+ phoneNumber
																		+ "</td><td>"
																		+ deviceNumber
																		+ "</td><td>"
																		+ phoneNumber
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
																		+ ")'>修改&nbsp;&nbsp;|&nbsp;&nbsp;" + 
																"<a href='javascript:void(0)' onclick='deletedevice("
																		+ id
																		+ ")'>删除</a></td></tr></tbody>";
																$("#deviceTab")
																		.append(
																				tbody);
															})
										}
									});

				}
			});
})




//新增设备
function addDevice(pro){
	//alert(pro);
	if(pro == 'addDevice'){
		$("#win").window('open');
	}
}


//根据id编号查询设备
function getDeviceById(id){
	$.ajax({
		
	});
}



//修改设备




//删除设备




