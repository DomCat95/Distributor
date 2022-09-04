"use strict";

let username = null;
let isLoggedIn = false;
let loginModal = null;

function pageInit(){
	
	let loggedInData = document.getElementById("h-i-logged-in");
	if(isLoggedIn!=null){
		isLoggedIn = loggedInData.value;
		
		console.log(isLoggedIn);
		
		if(isLoggedIn == true){
			username = document.getElementById("h-i-username").value;
			let welcome_span = document.getElementById("span-welcome-msg");
		    welcome_span.textContent = "Welcome "+username;
		}	
	}
	
	initLoginModal();
	buildLogInOutBtn();
}

function buildLogInOutBtn(){
	let logInOutDiv = document.getElementById("div-log-in-out");
	let url = "", text = "";
	let new_btn = document.createElement("button");
	if(isLoggedIn == true){
		url = "logout";
		text = "<i class=\"bi bi-unlock-fill\"></i> logout";
	}
	else{
		url = "login";
		text = "<i class=\"bi bi-lock-fill\"></i> login";
		new_btn.addEventListener("click", ()=>loginModal.show());
	}
	
	new_btn.classList.add("btn","btn-secondary");
	new_btn.setAttribute("data-url",url);
	new_btn.innerHTML=text;
	logInOutDiv.appendChild(new_btn);
}

function initLoginModal(){
	loginModal = new bootstrap.Modal(document.getElementById('login_modal'))
}

document.addEventListener("DOMContentLoaded", pageInit);