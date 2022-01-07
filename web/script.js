/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function sendMail() {
    var link = "mailto:" + document.getElementById('userTexting').value
             + "?subject=" + escape(document.getElementById('headerTexting').value)
             + "&body=" + escape(document.getElementById('messageText').value)
    ;

    window.location.href = link;
}

var mail="";

function sendMailTo(mail) {
    var link = "mailto:" + mail
             + "?subject=" + ""
             + "&body=" + ""
    ;

    window.location.href = link;
}