$("#enroll").submit(function (e){
    console.log("등록 버튼을 눌렀습니다.");
    e.preventDefault();
    const month = $("#month");
    const day = $("#day");
    const email1 = $("#email1");
    const email2 = $("#email2");

    const custom_name = $("#name").val();
    const custom_phone = $("#phone").val();
    const custom_staff = $("#staff").val();
    const custom_memo = $("#memo").val();
    const custom_gender = $("#sex").val();
    //const custom_job = $("#job").val();
    let custom_birthday, custom_email;

    if(month.val().length !== 0 && day.val().length !== 0) {
        custom_birthday = "2018-" + month.val() + "-" + day.val();
    }

    if(email1.val().length !== 0 && email2.val().length !== 0) {
        custom_email= email1.val() + "@" + email2.val();
    }

    console.log(custom_birthday);
    console.log(custom_email);

    console.log("고객의 성별은 " + custom_gender);
    console.log("직원 " + custom_staff);
    const sendJson = {
        name : custom_name,
        birthday : custom_birthday,
        phone : custom_phone,
        staff : custom_staff,
        email : custom_email,
        gender : custom_gender,
        //job : custom_job,
        memo : custom_memo
    };

    $.ajax({
        type: "POST",
        url: "/custom/enroll",
        data: JSON.stringify(sendJson),
        contentType: "application/json",
        success: function() {
            location.href = '/';
        },
        error: function(e) {
            console.log(e);
        }
    });
});

$("#month").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    console.log($(this).val());
    $(this).val(checkMonth($(this).val()));
});

$("#day").blur(function(e) {
    console.log("Input Focus가 벗어났습니다.");
    $(this).val(checkDay($(this).val()));
});

$("#phone").keyup(function(e) {
    console.log("휴대폰 번호 입력란에 입력했습니다. " + this.value);
    this.value = autoHypenPhone(this.value);
});