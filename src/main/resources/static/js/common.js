function checkYear(yearValue) {
    if(yearValue.length < 4 || yearValue.length > 4) return new Date().getFullYear();
    return yearValue;
}

function checkMonth(monthValue) {
    if(monthValue > 12 || monthValue <= 0) return "0"+1;
    if(0 < monthValue && monthValue.length < 2) return "0"+monthValue;
    return monthValue;
}

function checkDay(dayValue) {
    if(dayValue > 31 || dayValue <= 0) return "0"+1;
    if(0 < dayValue && dayValue.length < 2) return "0"+dayValue;
    return dayValue;
}

function autoHypenPhone(str) {
    str = str.replace(/[^0-9]/g, '');
    var tmp = '';
    if(str.length < 4) {
        return str;
    }else if(str.length < 7) {
        tmp += str.substr(0,3);
        tmp += "-";
        tmp += str.substr(3);
        return tmp;
    }else if(str.length < 11) {
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 3);
        tmp += '-';
        tmp += str.substr(6);
        return tmp;
    }else {
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 4);
        tmp += '-';
        tmp += str.substr(7);
        return tmp;
    }
    return str;
}