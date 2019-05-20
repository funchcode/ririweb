// 유효 년도 확인 (param = 숫자)
function checkYear(yearValue) {
    if(yearValue.length < 4 || yearValue.length > 4) return new Date().getFullYear();
    return yearValue;
}

// 유효 월 확인 (param = 숫자)
function checkMonth(monthValue) {
    if(monthValue > 12 || monthValue <= 0) return "0"+1;
    if(0 < monthValue && monthValue.length < 2) return "0"+monthValue;
    return monthValue;
}

// 유효 일 확인 (param = 숫자)
function checkDay(dayValue) {
    if(dayValue > 31 || dayValue <= 0) return "0"+1;
    if(0 < dayValue && dayValue.length < 2) return "0"+dayValue;
    return dayValue;
}

// 휴대폰 번호 하이픈 추가 (param = 숫자)
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

// 가격 콤마 추가 (param = 숫자)
function autoCommaPrice(str) {
    str = str.replace(/[^0-9]/g, '');
    str = str.replace(/,/g, '');
    return str.replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

// 콤마 텍스트 넘버로 (param = 콤마포함숫자텍스트)
function getNum(str) {
    return Number(str.replace(/,/g, ''));
}