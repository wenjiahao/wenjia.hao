$(function() {
/*$.ajax({
	type:"get",
	url:"/SpringMVCDemo/testData.action",
	success:function(data){
		alert(data);
	}
	
});
	*/
$("body").on("click",function(){
	alert($("#loginName").val());
});
});