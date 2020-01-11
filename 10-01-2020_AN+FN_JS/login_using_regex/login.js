function form_validate(){
    let user_name=document.getElementById('user').value;
    if(user_name.length==0){
        alert('user_name cannot be empty');
        return;
    }
    let pass_word=document.getElementById('pass').value;
    let re_pass=document.getElementById('pass1').value;
    let re=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    let reg=/abc/
    if(re.test(pass_word)==false){
        alert('password should contain atleast 8 letters, 1 cap,1small,1special and \'abc\' pattern');
        return;
    }
    else{
        if(!reg.test(pass_word)){
            alert('must contain abc pattern');
        }
        if(pass_word!=re_pass){
            alert('passwords are not equal');
            return;
        }
    }
    if(user_name==pass_word){
        alert('user_name and passwords can\'t be same');
        return;
    }
    document.getElementById('userid').innerHTML=user_name;
    document.getElementById('passid').innerHTML=pass_word;

}