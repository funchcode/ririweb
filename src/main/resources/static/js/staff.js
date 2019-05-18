$("#enroll").submit(function(e) {
    console.log("버튼을 눌렀습니다!");
    e.preventDefault();
    const staff_name = $("#name").val();
    const staff_phone = $("#phone").val();
    const staff_part = $("#part").val();
    const staff_certificate = $("#certificate").val();
    const staff_state = $("#state").val();
    let staff_birth, staff_start;
    let birth_month = document.getElementById("birth-month");
    let birth_day = document.getElementById("birth-day");
    let start_year = document.getElementById("start-year");
    let start_month = document.getElementById("start-month");
    let start_day = document.getElementById("start-day");

    if(birth_month.value.length !== 0 && birth_day.value.length !== 0) {
        staff_birth = "2018-" + birth_month.value + "-" + birth_day.value;
    }
    if(start_year.value.length !== 0 && start_month.value.length !== 0 && start_day.value.length !== 0) {
        staff_start = start_year.value + "-" + start_month.value + "-" + start_day.value;
    }

    console.log("생일 " + staff_birth);
    console.log("근무시작 " + staff_start);

});

$("#start-year").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    console.log($(this).val());
    $(this).val(checkYear($(this).val()));
});

$("#start-month").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    console.log($(this).val());
    $(this).val(checkMonth($(this).val()));
});

$("#start-day").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    $(this).val(checkDay($(this).val()));
});

$("#birth-month").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    console.log($(this).val());
    $(this).val(checkMonth($(this).val()));
});

$("#birth-day").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    $(this).val(checkDay($(this).val()));
});

$("#phone").keyup(function(e) {
    console.log("휴대폰 번호 입력란에 입력했습니다. " + this.value);
    this.value = autoHypenPhone(this.value);
});