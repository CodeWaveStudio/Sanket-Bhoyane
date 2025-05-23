const fromText=document.getElementById('from-text'),
toText=document.getElementById('to-text'),
selectTag=document.querySelectorAll('select'),
icons=document.querySelectorAll('.main i'),
exchangeIcon=document.querySelector('.exchange i'),
transBtn=document.getElementById('trans-Btn');
const countries = {
    "am-ET": "Amharic",
    "ar-SA": "Arabic",
    "be-BY": "Bielarus",
    "bem-ZM": "Bemba",
    "bi-VU": "Bislama",
    "bjs-BB": "Bajan",
    "bn-IN": "Bengali",
    "bo-CN": "Tibetan",
    "br-FR": "Breton",
    "bs-BA": "Bosnian",
    "ca-ES": "Catalan",
    "cop-EG": "Coptic",
    "cs-CZ": "Czech",
    "cy-GB": "Welsh",
    "da-DK": "Danish",
    "dz-BT": "Dzongkha",
    "de-DE": "German",
    "dv-MV": "Maldivian",
    "el-GR": "Greek",
    "en-GB": "English",
    "es-ES": "Spanish",
    "et-EE": "Estonian",
    "eu-ES": "Basque",
    "fa-IR": "Persian",
    "fi-FI": "Finnish",
    "fn-FNG": "Fanagalo",
    "fo-FO": "Faroese",
    "fr-FR": "French",
    "gl-ES": "Galician",
    "gu-IN": "Gujarati",
    "ha-NE": "Hausa",
    "he-IL": "Hebrew",
    "hi-IN": "Hindi",
    "hr-HR": "Croatian",
    "hu-HU": "Hungarian",
    "id-ID": "Indonesian",
    "is-IS": "Icelandic",
    "it-IT": "Italian",
    "ja-JP": "Japanese",
    "kk-KZ": "Kazakh",
    "km-KM": "Khmer",
    "kn-IN": "Kannada",
    "ko-KR": "Korean",
    "ku-TR": "Kurdish",
    "ky-KG": "Kyrgyz",
    "la-VA": "Latin",
    "lo-LA": "Lao",
    "lv-LV": "Latvian",
    "men-SL": "Mende",
    "mg-MG": "Malagasy",
    "mi-NZ": "Maori",
    "ms-MY": "Malay",
    "mt-MT": "Maltese",
    "my-MM": "Burmese",
    "ne-NP": "Nepali",
    "niu-NU": "Niuean",
    "nl-NL": "Dutch",
    "no-NO": "Norwegian",
    "ny-MW": "Nyanja",
    "ur-PK": "Pakistani",
    "pau-PW": "Palauan",
    "pa-IN": "Panjabi",
    "ps-PK": "Pashto",
    "pis-SB": "Pijin",
    "pl-PL": "Polish",
    "pt-PT": "Portuguese",
    "rn-BI": "Kirundi",
    "ro-RO": "Romanian",
    "ru-RU": "Russian",
    "sg-CF": "Sango",
    "si-LK": "Sinhala",
    "sk-SK": "Slovak",
    "sm-WS": "Samoan",
    "sn-ZW": "Shona",
    "so-SO": "Somali",
    "sq-AL": "Albanian",
    "sr-RS": "Serbian",
    "sv-SE": "Swedish",
    "sw-SZ": "Swahili",
    "ta-LK": "Tamil",
    "te-IN": "Telugu",
    "tet-TL": "Tetum",
    "tg-TJ": "Tajik",
    "th-TH": "Thai",
    "ti-TI": "Tigrinya",
    "tk-TM": "Turkmen",
    "tl-PH": "Tagalog",
    "tn-BW": "Tswana",
    "to-TO": "Tongan",
    "tr-TR": "Turkish",
    "uk-UA": "Ukrainian",
    "uz-UZ": "Uzbek",
    "vi-VN": "Vietnamese",
    "wo-SN": "Wolof",
    "xh-ZA": "Xhosa",
    "yi-YD": "Yiddish",
    "zu-ZA": "Zulu"
}
toText.addEventListener('input',()=>toText.placeholder=toText.value.length==0?'Translate...':'Translating...');
selectTag.forEach((tag, id) => {
    for (let country_code in countries) {
        let selected = id == 0 ? country_code == "en-GB" ? "selected" : "" : country_code == "hi-IN" ? "selected" : "";
        let option = `<option ${selected} value="${country_code}">${countries[country_code]}</option>`;
        tag.insertAdjacentHTML("beforeend", option);
    }
});

    transBtn.addEventListener('click',()=>{
        setTimeout(()=>{
            toText.setAttribute('placeholder','Translating....');
        });
       let text= fromText.value;
       console.log(text);
       let translateFrom=selectTag[0].value;
       let translateTo=selectTag[1].value;
       let apiUrl = `https://api.mymemory.translated.net/get?q=${text}&langpair=${translateFrom}|${translateTo}`;
       console.log(apiUrl);
       //fetch
       fetch(apiUrl).then(res=>res.json()).then(data=>{
        console.log(data);
        toText.value=data.responseData.translatedText;
        data.matches.forEach(data => {
            if(data.id === 0) {
                toText.setAttribute('placeholder','Translate');
                toText.value = data.translation;
            }
        });
       });
    });

    icons.forEach(icon => {
        icon.addEventListener("click", ({target}) => {
            if(!fromText.value || !toText.value) return;
            if(target.classList.contains("fa-copy")) {
    if(target.id=='from'){
        navigator.clipboard.writeText(fromText.value);
       
        

    }
    else{
        navigator.clipboard.writeText(toText.value);
    }
    target.style.color='#262626';
    setTimeout(() => {
        target.style.color='darkgrey';
        
    }, 2000);
}else{
    let utterance;
    if(target.id=='fromvoice'){
        utterance=new SpeechSynthesisUtterance(fromText.value);
        utterance.lang=selectTag[0].value;
        
    }
    else{
        utterance=new SpeechSynthesisUtterance(toText.value);
        utterance.lang=selectTag[1].value;
    }
    target.style.color='#262626';
    setTimeout(() => {
        target.style.color='darkgrey';
        
    }, 2000);
   
    speechSynthesis.speak(utterance);
}
    })
   });
   
   exchangeIcon.addEventListener('click',(e)=>{
    e.preventDefault();
    let text=fromText.value;
    fromText.value=toText.value;
    toText.value=text;
    let lang=selectTag[0].value;
    selectTag[0].value=selectTag[1].value;
    selectTag[1].value=lang;
    exchangeIcon.style.color = '#262626';
    setTimeout(() => {
        exchangeIcon.style.color = 'darkgrey';
    }, 2000);
    speechSynthesis.cancel();
   })