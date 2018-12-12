$(function() {
	// 请求页面参数
	getList(1);

	// 根据姓名查找用户

	// 新增用户信息
	addMyForm();

	// 打开新增用户窗口
	$("#add").on("click", function() {
		$('#win').window('open');
	});

	// 关闭新增窗口
	$("#closed").on("click", function() {
		
		$('#win').window('close');
	});

	
});

// 分页查询
$(function(){
	$("#first").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage <= 1)
			return false;
		currentPage = 1;
		getList(currentPage);
	});
	$("#prePage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage <= 1)
			return false;
		currentPage--;
		getList(currentPage);
	});
	$("#nextPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage >= pages)
			return false;
		currentPage ++;
		getList(currentPage);
	});
	$("#lastPage").on("click", function() {
		var currentPageStr = $("#currentPage").text();//获取当前页数
		var PagesStr = $("#pages").text();//获取总页数
		var currentPage = parseInt(currentPageStr);
		var pages = parseInt(PagesStr);
		if (currentPage >= pages)
			return false;
		currentPage = pages;
		getList(currentPage);
	});
})

// 新增用户信息
function addMyForm() {
	// 提交用户信息
	$("#myBut").on("click", function() {
		var com = $("input[name='company']").val();
		var name = $("#name").val();
		var pass = $("input[name='password'").val();
		if (com == null || com == "") {
			$("#msg").html("公司名称不能为空！");
			return false;
		}
		if (name == null || name == "") {
			$("#msg").html("姓名不能为空！");
			return false;
		}
		if (pass == null || pass == "") {
			$("#msg").html("密码不能为空！");
			return false;
		} else {
			$("#addForm").attr("action", "../addUser");
			$("#addForm").submit();
		}
	});
}

// Ajax异步加载数据
function getList(prePage) {
	var username = $("#username").val();
	// ajax异步请求用户信息
	$.ajax({
				url : '../getUserList',
				dataType : 'json',
				data : {
					'page' : prePage,
					'username' : username
				},
				type : 'post',
				success : function(data) {
					var obj = eval(data);
					// 循环遍历将数据添加到表格中
					var count = "";//总条数
					var currentPage = "";//当前页数
					var pages = "";//总页数
					var now = "";//当前为第几条
					var size = ""; //当前到第几条
					count = data.count;
					currentPage = data.current;
					pages = data.pages;
					now = data.now;
					size = data.size;

					$("#now").html(now);
					$("#size").html(size);
					$("#cou").html(count);
					$("#currentPage").html(currentPage);
					$("#pages").html(pages);

					// 清空当前表格的所有数据,为了搜索查询
					$(".tbody").empty();
					$.each(data,function(k, value) {
										var trs = "";
										var company = "";
										var department = "";
										var role = "";
										var name = "";
										var username = "";
										var weChat = "";
										var weChatName = "";
										var enterpriseNumber = "";
										var phone = "";
										var id = "";
										if (k == 'list') {
											$.each(value,function(n, v) {// value为遍历的对象，n为循环的次数，v为循环取出的对象
																role = v.role.roleName;
																department = v.department.departmentName;
																company = v.company;
																username = v.username;
																name = v.name;
																phone = v.phone;
																weChat = v.weChat;
																weChatName = v.weChatName;
																enterpriseNumber = v.enterpriseNumber;
																id = v.id;
																
																trs = "<tbody class='tbody'><tr><td>"
																		+ (n + 1)
																		+ "</td><td>"
																		+ company
																		+ "</td><td>"
																		+ department
																		+ "</td><td>"
																		+ role
																		+ "</td><td>"
																		+ username
																		+ "</td><td>"
																		+ name
																		+ "</td><td>"
																		+ phone
																		+ "</td><td>"
																		+ weChat
																		+ "</td><td>"
																		+ weChatName
																		+ "</td><td>"
																		+ enterpriseNumber
																		+ "</td><td><a id='updateUser' onclick='updateUser("+ id + ")' class='color' style='color: rgb(252, 193, 123); text-decoration: none;' href='javascript:void(0)"
																		+ "'>修改"
																		+ "&nbsp;&nbsp;|&nbsp;&nbsp;<a id='deleteUser' onclick='deleteUser("+ id + ")' class='color' style='color: rgb(252, 193, 123); text-decoration: none;' href='javascript:void(0)"
																		+ "'>删除</a></td></tr></tbody>";
																$("#tab")
																		.append(
																				trs);
															})
										}
									});
				}
			});
}

//更具用户名查询用户
$(function() {
	$("#but").click(function() {
		getList(1);
	});
	
	//刷新用户信息
	$("#flush").click(function() {
		getList(1);
	});
})

//设置选项卡的信息
$(function() {
	$(".combo-text").css({
		'width' : '140px',
		'height' : '25px',
		'line-height' : '25px'
	});
	$(".combo").css({
		'width' : '170px',
		'height' : '25px',
		'border-radius' : '3px'
	});
	$(".combobox-item").css({
		'width' : '140px'
	});
	$(".combo-panel").css({
		'width' : '170px'
	});

	//获取当前鼠标选中的行的信息
	$("#deleteUser").click(function() {
		alert("delete");
	});
	$("#updateUser").click(function() {
		alert("update");
	});

})

/*
 * 更新用户信息
 */
function updateUser(id){
	$("#updateWindow").window('open');
	$.ajax({
		url : '../getUserById',
		type : 'post',
		dataType : 'json',
		data : {
			'id' : id,
		},
		success : function(data){
			var obj = eval(data);
			$.each(obj,function(k, value) {
						var trs = "";
						var company = "";
						var department = "";
						var role = "";
						var name = "";
						var username = "";
						var pass = "";
						var weChat = "";
						var weChatName = "";
						var enterpriseNumber = "";
						var phone = "";
						var id = "";
						if (k == 'users') {
							$.each(value,function(n, v) {// value为遍历的对象，n为循环的次数，v为循环取出的对象
												
												role = v.role.roleName;
												department = v.department.departmentName;
												company = v.company;
												username = v.username;
												name = v.name;
												pass = v.password;
												phone = v.phone;
												weChat = v.weChat;
												weChatName = v.weChatName;
												enterpriseNumber = v.enterpriseNumber;
												id = v.id;
												$("input[name='company'").attr('value', company);
												$("#dept2").attr('value', department);
												$("#role2").attr('value', role);
												$("#us").attr('value', username);
												$("#name2").attr('value', name);
												$("input[name='password'").attr('value', pass);
												$("input[name='phone'").attr('value', phone);
												$("input[name='weChat'").attr('value', weChat);
												$("input[name='weChatName'").attr('value', weChatName);
												$("input[name='enterpriseNumber'").attr('value', enterpriseNumber);
												$("input[name='id'").attr('value', id);
											})
						}
					});
		}
	});
}

$(function(){
	$("#updateBut").click(function(){
		$.messager.confirm('确认','您确认想要修改用户信息吗？',function(flag){ 
			//flag的值为true或者false
		    if (flag){    
		    	$("#updateForm").attr("action", "../updateUser");
		       $("#updateForm").submit(); 
//		    	var com = $("input[name='company'").val();
//				var dept = $("dept2").val();
//				var role = $("#role2").val();
//				var username = $("#us").val();
//				var neme = $("#name2").val();
//				var pass = $("input[name='password'").val();
//				var phone = $("input[name='phone'").val();
//				var weChat = $("input[name='weChat'").val();
//				var weChatName = $("input[name='weChatName'").val();
//				var enter = $("input[name='enterpriseNumber'").val();
//				var id = $("input[name='id'").val();
//		    	$.ajax({
//		    		url : '../updateUser',
//		    		type : 'post',
//		    		data : {
//		    			'id' : id,
//		    			'company' : com,
//		    			'department' : dept,
//		    			'role' : role,
//		    			'username' : username,
//		    			'name' : name,
//		    			'password' : pass,
//		    			'phone' : phone,
//		    			'weChat' : weChat,
//		    			'weChatName' : weChatName,
//		    			'enterpriseNumber' : enter
// 		    		},
//		    		dataType : 'json',
//		    		success : function(data){
//		    			$(".msg").html(data.msg);
//		    			$("#updateForm").empty();
//		    			$("#updateWindow").window('close');
//		    		}
//		    	});
		    }    
		});  
	});
	//定义关闭窗口
	$("#updateCancle").click(function(){
		$("#updateWindow").window('close');
	});
})

/*
 * 删除用户信息
 */
function deleteUser(id){
	$.messager.confirm('确认','您确认想要删除记录吗？',function(flag){ 
		//flag的值为true或者false
	    if (flag){    
	       $.ajax({
	    	   url : "../deleteUserById",
	    	   type : 'post',
	    	   data : {
	    		   'id' : id
	    	   },
	    	   dataType : 'json',
	    	   success :   function(data){
	    		   //重新刷新页面加载数据
	    		   alert("删除成功！");
	    		   getList(1);
	    	   } ,
	    	   error : function(data){
	    		   alert("删除失败");
	    	   }
	       });    
	    }    
	});  
}






