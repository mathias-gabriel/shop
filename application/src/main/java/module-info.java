module com.mg.shop.application {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    requires com.mg.shop.order.domain;
    requires com.mg.shop.order.infra;
    requires com.mg.shop.product.infra;

    opens com.mg.shop.application to spring.core, spring.context;
}
