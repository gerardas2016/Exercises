
carousel();
/*istraukia po viena nuotrauka pagal indeksa*/
				function carousel() {
					var myIndex = 0;
					var i;
					var x = document.getElementsByClassName("mySlides");
					for (i = 0; i < x.length; i++) {
					   x[i].style.display = "none";  // PANAKINA ANKSTESNE FOTO
					}
					/* naudojamas, keist foto, kas 4s*/
					myIndex++;
					if (myIndex > x.length) {myIndex = 1}    
					x[myIndex-1].style.display = "block";  
					setTimeout(carousel, 4000); // Keicia nuotraukas kas 4 sekundes
					
				}
				//uzvedus pelyte padidina foto iki 32x32 px *naudojama onmouseover ir onmouseout
function bigImg(x) {
							x.style.height = "32px";
							x.style.width = "32px";
						}
				//Nuvedus pelyte padidina foto iki 32x32 px *naudojama onmouseover ir onmouseout
function normalImg(x) {
							x.style.height = "24px";
							x.style.width = "24px";
						}
						

				
function password(){
					var enter_ps;
					var password="1234"; //Password

						while (enter_ps!=password) {
							enter_ps=prompt('Please enter the password:',''); /* "Please enter the password:',''" paskutines kabutes naudojamos ivedimo nuskaitymui */
							if (enter_ps!=password && enter_ps!= null ) {alert("Paswword incorect");}
							else if (enter_ps === null) { break;} // Kai paspaudziamas "Cancel " prompt grazina === null, funkcija sustabdoma
						    else {alert("Paswword corect");}
							}

						
						}
						/* uzvedus pelyte ant copy Vardas Pavadre (footer) pakeicia spalva*/
function mouseEnter() {
					var x=document.getElementById("copy").style.color = "gray";
					
					
						}
					/*atitraukus pelyte pakeicia spalva */
function mouseLeave() {
					var x=document.getElementById("copy").style.color = "black";
					
						}
						
								

//Tikrina ar yra 18 metu			
function birth(){
	var year= prompt('Please enter the year of birdh:','');
	var yearNumber= Number (year);
	
	
	var date = new Date();// Sukuriame objekta date
	var n = date.getUTCFullYear().toString(); //Konvertuoja "data" tipa i "String"
	var y= Number(n); //Konvertuoja String i Number * tiesiogiai konvertuoti is date i number negalima, reikia konvertuoti per String tipa
	
	var month = date.getUTCMonth().toString();
	var m= Number (month)+1; // +1 nes skaiciuojami menesiai nuo 0 iki 11
	
	
	var day = date.getUTCDate().toString();
	var d= Number (day); 
	
		 if (year=== null ){brake;} // Jei paspaudzia Cancel sustabdo cikla
		 
		 else if (year.length <= 3|| year.trim() <= 2 ){alert ("Eroor")}// Tikrina ar nepaspausta "Ok" nieko neivedus, trim() tikrina ar nera tusciu tarpu
		 
		 else if (y-yearNumber>=18){
			 if (y-yearNumber>=19) {alert ("you can enter")} // jei asmeniui daugiau uz 19 metu, vygdomas ileidimas * nevygdo tolimesniu funkciju menesio ir dienos ivedimui
			 else { //Tikrinas ar asmeniui yra 18 metu, skaiciuoja pagal dienas ir menesius
				var month1= prompt('Please enter the month of birdh:','');
				var montNumber= Number (month1);
				
				var day1= prompt('Please enter the day of birdh:','');
				var dayNumber= Number (day1);
				var test= (((y-yearNumber)*365)+ ((m-montNumber)*30.4368499)+ (d-dayNumber))/365; //30.43.... gaunasi 365 dienas padalinus is 12 menesiu
				
					if (test>=18){//tikrina ar test yra virs 18
						alert ("you can enter")
					}
					else {alert ("Almost, you can enter after: " + ((test-18)*365*-1)+ " days") //Skaiciuoja kiek sienu liko iki 18 metu
					}
				}
		 }
		
		else{alert("Too young")}
		
		
}


//Nustato portrait nuotrauku masyva 
function arr(){
var myImage = document.getElementById("mainImage");

var imageArray = ["images/2.jpg","images/3.jpg", "images/4.jpg","images/5.jpg"];

var imageIndex = 0; 

function changeImage() {
  myImage.setAttribute("src",imageArray[imageIndex]);
  imageIndex = (imageIndex + 1) % imageArray.length;
}

setInterval(changeImage, 3000);}


// pakiecia kontaktuose varda i didziasias raides onblur() funkicija
function uperCase(){
	
    var x = document.getElementById("fname");
    x.value = x.value.toUpperCase();
}
//Pakeicia fono spalva paspaudus ant "ask question"
function backroundQ(x) {
    x.style.background = " #b9b3b2 ";
}

//Paspaudus ant formos send paklausia ar nori dar ivest koki klausima
function form2(){
	var name2= document.getElementById("fname").value;
	
	var n=  prompt('Mr(s) '+name2+ ' do you have other question: ', '');//  ideda i klausima suvesta varda
	
}

// Pasirinkus ,,Portrait" is objekto atspauzdina pavadinima + kaina
 function price() {
	 var portraitPrice= {
		name: 'Portrait shoot',
		time: 1, 
		price: 50, 
		full: function pr(){
		return "Photoshoot: "+this.name+" Time: "+ this.time+" h. "+ " Price: "+this.price+"eur.";
	}   
	
	};
	 
	 document.getElementById("price").innerHTML = portraitPrice.full();// atspauzdina HTML dokumente
 }
 
 // Pasirinkus ,,Weding" is objekto atspauzdina pavadinima + kaina
 function price2() {
	 var portraitPrice= {
		name: 'Wedding shoot',
		time: 8, 
		price: 500, 
		full: function pr2(){
		return "Photoshoot: "+this.name+" Time: "+ this.time+" h. "+ " Price: "+this.price+"eur."; // atspauzdina HTML dokumente
	}   
	
	};
	 
	 document.getElementById("price").innerHTML = portraitPrice.full();
 }
 

