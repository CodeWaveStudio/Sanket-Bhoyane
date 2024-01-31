const textArea = document.querySelector('textarea');
const voices = document.querySelector('select');
const conBtn = document.querySelector('button');

let synth = speechSynthesis;

conBtn.addEventListener('click', e => {
    e.preventDefault(); 
    if (textArea.value !== '') {
        textToVoice(textArea.value);
    } else {
        alert('Please enter some text to convert.');
    }
});

function textToVoice(text) {
    let utterance = new SpeechSynthesisUtterance(text);
    for (let voice of synth.getVoices()) {
        if(voice.name==voices.value){
            utterance.voice=voice;
        }
    }
    synth.speak(utterance);
}

function voicelist() {
  
    for (let voice of synth.getVoices()) {
        let select = voice.name == 'Microsoft Ravi - English (India)' ? 'selected' : '';
        let option = `<option value="${voice.name}" ${select}>${voice.name} (${voice.lang})</option>`;
        voices.insertAdjacentHTML('beforeend', option);
    }
}


synth.addEventListener('voiceschanged', voicelist);

