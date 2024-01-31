const textArea=document.querySelector('textarea');
const voiceList=document.querySelector('select');
const conBtn=document.querySelector('button');
let synth=speechSynthesis;

conBtn.addEventListener('click',e=>{
    e.preventDefault();
    document.querySelector('textarea').addEventListener('input',()=>{
        document.querySelector('.error').style.display='none';
    })
    if(textArea.value!=''){
        textToVoice(textArea.value);
    }
    else{
        document.querySelector('.error').style.display='block';
    }  
});

function textToVoice(text){
    let utterance=new SpeechSynthesisUtterance(text);
    for(let voice of synth.getVoices()){
        if(voice.name == voiceList.value){
            utterance.voice = voice;
        }
        
    }
    synth.speak(utterance);
}
function poppulatedvoices(){
    console.log(synth.getVoices());
    for(let voice of synth.getVoices()){
        let selected=voice.name=='Google हिन्दी'?'selected':'';
        let option=`<option value="${voice.name}"${selected}>${voice.name} ${voice.lang}</option>`;
       
        voiceList.insertAdjacentHTML('beforeend',option);
    }
}
synth.addEventListener('voiceschanged',poppulatedvoices);
