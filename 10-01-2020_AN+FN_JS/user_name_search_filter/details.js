var users=['allu-arjun','babar-azam','catherine','domnick','ethan','faf-duplesis','gunatilaka','hardik','ishant sharma','jasprit bumrah','kuldeep yadav','lucky','manish','naman','oram','praneeth','quershi','qualis','rashmi','reshmi','sanchit','shikar','tisara perara','usman','virat kohli','vikas','wridhiman','xavier','xander','yusuf','zampa','zaheer']
function myfunction(){
    let user_name=document.getElementById('user1').value;
    let reg=new RegExp(user_name)
    if(user_name.length==0 && (user_name==' '||user_name=='  ')){
      return ;
    }
    var arr=users.filter(user=>reg.test(user));
    document.getElementById('names').innerHTML="";
    for(item in arr){
        document.getElementById('names').innerHTML+=arr[item]+"<br>";   
    }
}
function sorted(){
    var arr1=document.getElementById('names').innerHTML.split('<br>');
    arr1.sort();
    if(arr1[0]=' '){
      return;
    }
    document.getElementById('sorted').innerHTML="";
    for(item in arr1){
      document.getElementById('sorted').innerHTML+=arr1[item]+"<br>";
  }
}
