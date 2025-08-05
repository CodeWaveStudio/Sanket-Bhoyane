if('SpeechRecognition' in window || 'webkitSpeechRecognition' in window){
    const textRecognition=document.getElementById('speechTotext');
    const micBtn=document.getElementById('voice-btn');
    const recognition=new(window.SpeechRecognition || window.webkitSpeechRecognition)();
     
    //set some recognition options
    recognition.continuoues=true;
    recognition.interimResults=true;
    recognition.lang='en-US';  //set the language
    
    //Event Handler when speech recognition start
    
    recognition.onstart=()=>{
        micBtn.src='/icons8-mic-48 (1).png';
    };
    //Event Handler when speech recognition stop
    recognition.onend=()=>{
        micBtn.src='/icons8-mic-48.png';
    };
    //Event Handler for when speech recognized
    recognition.onresult=(event)=>{
       const result=event.results[event.results.length - 1][0].transcript;
       textRecognition.textContent=result;
    };
     //event listner for start button
     micBtn.addEventListener('click',()=>{
    recognition.start();
     });
     
    
    }
    else{
        alert('Speech recognition is not supported in this browser.')
    }
    
    