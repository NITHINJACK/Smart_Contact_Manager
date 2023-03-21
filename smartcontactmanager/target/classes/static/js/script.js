console.log("this is script file");
/*
function openNav(){
	
	document.getElementById("sidebar").style.display="block";
	document.getElementById("content").style.marginLeft="20%";
	
}
function closeNav(){
	document.getElementById("sidebar").style.display="none";
	document.getElementById("content").style.marginLeft="0%";
}
*/
const toggleSidebar =() => {
	
	if($(".sidebar").is(":visible")){
		$(".sidebar").css("display", "none");
		$(".content").css("margin-left", "0%");
	}
	else{
		$(".sidebar").css("display", "block");
		$(".content").css("margin-left", "20%");
	}
	
};



