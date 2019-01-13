
$(function() {
	var floor = "逸夫楼";
	getClassSchedule(floor);
})

// 请求课程表数据
function getClassSchedule(floor) {
	$.ajax({
		url : '../getClassSchedule',
		type : 'post',
		dataType : 'json',
		data : {
			'floor' : floor
		},
		success : function(data) {
			formatData(data);
		}
	});
}

// 格式化数据并添加到页面中
function formatData(data) {
	$(".tbody").empty();
	$
			.each(
					data,
					function(k, v) {
						$
								.each(
										v,
										function(k3, v3) {
											if (k3 == 'className') {
												var tbody = "<tbody class='tbody'><tr class='bg' style='height:35px;'><td colspan='8'>"
														+ v3
														+ "</td></tr></tbody>";
												$("#table").append(tbody);
											}
											if (k3 == 'list') {
												$
														.each(
																v3,
																function(k1, v1) {
																	var tb = "<tbody class='tbody'><tr><td>"
																			+ v1.time
																			+ "</td><td>"
																			+ v1.monday
																			+ "</td><td>"
																			+ v1.tuesday
																			+ "</td><td>"
																			+ v1.wednesday
																			+ "</td><td>"
																			+ v1.thursday
																			+ "</td><td>"
																			+ v1.friday
																			+ "</td><td>"
																			+ v1.saturday
																			+ "</td><td>"
																			+ v1.sunday
																			+ "</td></tr></thody>";
																	//alert(v1);
																	$("#table")
																			.append(
																					tb);
																})
											}
										})
					});
}

function get(floor) {
	getClassSchedule(floor);
}


$(function(){
	
	//改变表格得到焦点的背景色
	$(".bg").hover(function(){
		$(this).css('background' , '#AEEEEE');
	
	});
})

