//展示申请信息
	$(function() {
		//展示教室信息
		$(".show_classroom").click(function() {
			//设置表单展示信息
			$(".layui-form-item").css('display', 'none');
			$("#show").css('display', 'block');

			$.ajax({
				url : '../getApplyClass',
				type : 'post',
				success : function(data) {
					if (!data) {
						alert(data);
					}
				}

			});
		});

		//申请教室
		$(".apply_classroom").click(function() {
			//设置表单展示信息
			$(".layui-form-item").css('display', 'block');
			$("#show").css('display', 'none');

		});

		//form 表单提交
		$(".layui-btn").click(function(){
			$(".layui-form").submit();
		}); 
	});