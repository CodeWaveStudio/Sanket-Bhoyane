
const regBtn=document.getElementById('reg-Btn');
const okBtn=document.getElementById('ok-btn');

function validation(){
const username=document.getElementById('username').value;
const email=document.getElementById('email').value;
const password=document.getElementById('password').value;
const cPassword=document.getElementById('cpassword').value;
var emailRegex = /^\S+@\S+\.\S+$/;

 // Add event listeners for input fields to Reset previous alerts
document.getElementById('username').addEventListener('input', () => displayAlert('', 'username-alert'));
document.getElementById('email').addEventListener('input', () => displayAlert('', 'email-alert'));
document.getElementById('password').addEventListener('input', () => displayAlert('', 'password-alert'));
document.getElementById('cpassword').addEventListener('input', () => displayAlert('', 'cpassword-alert'));

 //checking all fields 
    if(username==''){
        displayAlert('Please enter username','username-alert');
       
        //prevent refresh the page
        event.preventDefault(); 
        return false;
    }
    else if(email==''){
        displayAlert('Please enter email.','email-alert');
        event.preventDefault(); 
        return false;
    }
    else if(!emailRegex.test(email)){
        displayAlert('Please enter valid email.','email-alert');
        event.preventDefault(); 
        return false;
    }
    else if(password==''){
        displayAlert('Please enter password.','password-alert');
        
        event.preventDefault(); 
        return false;
    }
    else if(password.length<8){
        displayAlert('Please enter atleast 8 charcters.','password-alert');
       
        event.preventDefault(); 
        return false;
    }
    else if(password!=cPassword){
        displayAlert('Password does not matched.','cpassword-alert');
       
        event.preventDefault(); 
        return false;
    }
    else{
        return true;
    }
}
 function displayAlert(message,alertId){
  const alertMsg=document.getElementById(alertId);
  alertMsg.innerHTML=message;
 }
regBtn.addEventListener('click',function(){
   
    if(validation()){
        //showing popup msg if validation is true
    
        document.querySelector('.pop-up').style.top='50%';
        
        event.preventDefault(); 
    }

    else{
        event.preventDefault(); 
        return false;
    }
})

okBtn.addEventListener('click',function(){
    //hiding popup msg
    document.querySelector('.pop-up').style.top='-200%';
     // Redirecting to login.html
    window.location.href='login.html';
   
})
   

