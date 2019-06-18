(function(){
    const customer = $("#customer");
    const staff = $("#staff");
    const product = $("#product");
    const services = $("#services");

    let customer_menu = {
        name : "customer",
        menu : {
            url : ["/custom", "/custom", "update"],
            ko : ["고객정보", "신규등록", "수정"]
        }
    };
    let staff_menu = {
        name : "staff",
        menu : {
            url : ["read", "insert", "update"],
            ko : ["고객정보", "신규등록", "수정"]
        }
    };
    let product_menu = {
        name : "product",
        menu : {
            url : ["read", "insert", "update"],
            ko : ["고객정보", "신규등록", "수정"]
        }
    };
    let services_menu = {
        name : "services",
        menu : {
            url : ["read", "insert", "update"],
            ko : ["고객정보", "신규등록", "수정"]
        }
    };
    customer.after(makeCategoryList(customer_menu));
    staff.after(makeCategoryList(staff_menu));
    product.after(makeCategoryList(product_menu));
    services.after(makeCategoryList(services_menu));

    customer.on('click', function (e) {
        let customer_menu = $(".customer");
        e.preventDefault();
        console.log(customer_menu.css("display"));
        onOffList(customer_menu);
    });

    staff.on('click', function (e) {
        let staff_menu = $(".staff");
        e.preventDefault();
        onOffList(staff_menu);
    });

    product.on('click', function (e) {
        let product_menu = $(".product");
        e.preventDefault();
        onOffList(product_menu);
    });

    services.on('click', function (e) {
        let services_menu = $(".services");
        e.preventDefault();
        onOffList(services_menu);
    });
})();

// 카테고리 리스트 생성 ( {"name":"" , "menu":[]} )
function makeCategoryList(_list) {
    console.log(_list);
    let list = '<ul class="list-group '+_list.name+'" style="display: none">';
    for(let m in _list.menu.ko) {
        list += '<li class="category-menus"><a href="'+_list.menu.url[m]+'">'+_list.menu.ko[m]+'</a></li>';
    }
    list += '</ul>';

    return list;
}

// 카테고리 리스트 온오프
function onOffList(_group) {
    if(_group.css('display') === 'none')
        _group.css('display', '');
    else
        _group.css('display', 'none');
}