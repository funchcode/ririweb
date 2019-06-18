const danger = $("#danger");
const category = $("#services-category");


$(function() {
    $.ajax({
        type : "GET",
        url : "category/menus",
        success : function(s) {
            console.log("성공 메세지 : ", s);
            if(s.length !== 0) {
                let str = "";
                s.forEach(function(menu) {
                    str += "<option value='"+menu.categoryNo+"'>"+menu.name+"</option>";
                });
                category.append(str);
            }
        },
        error : function(e) {
        }
    });
});

/* 1차 분류 메뉴 등록 */
$("#category-enroll").submit(function(e) {
    console.log("카테고리 등록을 눌렀습니다!");
    e.preventDefault();

    const category_name = $("#category-name").val();
    const category_useYn = $("#category-useYn").val();
    const sendJson = {
        name : category_name,
        useYn : category_useYn
    };

    console.log("카테고리 JSON : ", sendJson);

    $.ajax({
        type: "POST",
        url: "/category/enroll",
        data: JSON.stringify(sendJson),
        contentType: "application/json",
        success: function(s) {
            location.reload();
        },
        error: function(e) {

        }
    });
});

/* 2차 분류 메뉴 등록 */
$("#services-enroll").submit(function(e) {
    console.log("서비스 등록을 눌렀습니다!");
    e.preventDefault();

    const services_name = $("#services-name").val();
    const services_price = $("#services-price").val();
    const services_useYn = $("#services-useYn").val();
    const services_category = category.val();

    console.log(services_category);

    /* 카테고리 선택 유무 처리 */
    if(services_category === 'none') {
        console.log("카테고리 재 선택");
        $(".danger-message").text("카테고리를 선택해주세요.");
        danger.show();
        window.setTimeout(function() {
            danger.hide();
        }, 2000);
        return;
    }

    const sendJson = {
        name : services_name,
        price : getNum(services_price),
        useYn : services_useYn,
        categoryNo : services_category
    };

    console.log("서비스 JSON 정보 = ", sendJson);

    $.ajax({
        type: "POST",
        url: "/services/enroll",
        data: JSON.stringify(sendJson),
        contentType: "application/json",
        success: function(s) {
            location.reload();
        },
        error: function(e) {

        }
    });
});

$("#services-price").keyup(function(e) {
    this.value = autoCommaPrice(this.value);
});