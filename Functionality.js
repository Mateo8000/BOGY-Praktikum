
function zeigeText(){
document.getElementById("Lieblingsfächer").style.display = "block";
document.getElementById("liebButton").style.display= "none" ;
}

function hintergrund(){ 
    console.log("test");
    document.getElementsByTagName("body")[0].classList.toggle("mystyle");
    
    
    
    }


// document.getElementsByTagName("body")[0].style.backgroundImage= "url('20230105_104153.jpg')";