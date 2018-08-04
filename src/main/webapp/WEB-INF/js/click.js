$(document).ready(function(){

	$("#deleteForm").on("submit", function(){
	    $.ajax({
	        url: 'rest/userInfo',
	        type: 'DELETE',
	        dataType: "json",
	        data:$("#deleteForm").serialize(),
	        success: function(xml) {
	            console.log(xml);
	            $(xml).find('User').each(function(){
	                $(this).find("id").each(function(){
	                    var id = $(this).text();
	                    console.log(id);
	                    alert("Deleted the user with id "+id);
	                });
	            });
	           
	        }
	    });
	   return true;
   });
});