$(document).ready(function () {
    var subTotal = parseFloat($(".subTotal").text());

    $(".add").click(function () {
        var sum = parseInt($(".text_box").val());
        subTotal = add(subTotal, p(subTotal, sum));
        sum = add(sum, 1);
        $(".text_box").val(sum);
        $(".subTotal").text(subTotal);
        $(".realSubTotal").val(subTotal);
        $(".realCounts").val(sum);
    });

    $(".sub").click(function () {
        var sum = parseInt($(".text_box").val());
        if (sum > 1) {
            subTotal = sub(subTotal, p(subTotal, sum));
            sum = sub(sum, 1);
            $(".text_box").val(sum);
            $(".subTotal").text(subTotal);
            $(".realSubTotal").val(subTotal);
            $(".realCounts").val(sum);
        }
    });

    function add(a, b) {
        var c, d, e;
        try {
            c = a.toString().split(".")[1].length;
        } catch (f) {
            c = 0;
        }
        try {
            d = b.toString().split(".")[1].length;
        } catch (f) {
            d = 0;
        }
        return e = Math.pow(10, Math.max(c, d)), (mul(a, e) + mul(b, e)) / e;
    }

    function sub(a, b) {
        var c, d, e;
        try {
            c = a.toString().split(".")[1].length;
        } catch (f) {
            c = 0;
        }
        try {
            d = b.toString().split(".")[1].length;
        } catch (f) {
            d = 0;
        }
        return e = Math.pow(10, Math.max(c, d)), (mul(a, e) - mul(b, e)) / e;
    }

    function mul(a, b) {
        var c = 0,
            d = a.toString(),
            e = b.toString();
        try {
            c += d.split(".")[1].length;
        } catch (f) {}
        try {
            c += e.split(".")[1].length;
        } catch (f) {}
        return Number(d.replace(".", "")) * Number(e.replace(".", "")) / Math.pow(10, c);
    }

    function p(a, b) {
        var c, d, e = 0,
            f = 0;
        try {
            e = a.toString().split(".")[1].length;
        } catch (g) {}
        try {
            f = b.toString().split(".")[1].length;
        } catch (g) {}
        return c = Number(a.toString().replace(".", "")), d = Number(b.toString().replace(".", "")), mul(c / d, Math.pow(10, f - e));
    }
});