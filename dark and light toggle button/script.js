const textTitle=document.getElementById('text-title');
const moonImg=document.getElementById('moon-theme');
const sunImg=document.getElementById('sun-theme');
document.getElementById('toggle-checkBox').addEventListener('change',function(){
    document.body.style.backgroundColor= this.checked?'#262626':'aliceblue';
    textTitle.style.color=this.checked?'#fff':'#000';
    moonImg.style.filter= this.checked?'invert(100%)':'invert(0%)';
    sunImg.style.filter= this.checked?'invert(0%)':'invert(100%)';

})