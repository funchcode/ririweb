$("#enroll").submit(function(e) {
    console.log("버튼을 눌렀습니다!");
    e.preventDefault();

    const product_name = $("#name").val();
    const product_company = $("#company").val();
    const product_stock = $("#stock").val();
    const product_memo = $("#memo").val();
    const staff_inPrice = $("#in-price").val();
    const staff_salePrice = $("#sale-price").val();

    const sendJson = {
        name : product_name,
        company : product_company,
        stock : Number(product_stock),
        memo : product_memo,
        inPrice : getNum(staff_inPrice),
        salePrice : getNum(staff_salePrice)
    };

    console.log("JSON : ", sendJson);

    $.ajax({
        type: "POST",
        url: "/product/enroll",
        data: JSON.stringify(sendJson),
        contentType: "application/json",
        success: function(s) {
            location.href = '/';
        },
        error: function(e) {

        }
    });
});

$("#in-price").keyup(function(e) {
    this.value = autoCommaPrice(this.value);
});

$("#sale-price").keyup(function(e) {
    this.value = autoCommaPrice(this.value);
});