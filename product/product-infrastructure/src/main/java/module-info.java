module com.mg.shop.product.infra {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires com.fasterxml.jackson.databind;

    requires com.mg.shop.product.domain;
    requires com.mg.shop.product.db;

    // requires deep reflection
    exports com.mg.shop.product.infra.api;
    exports com.mg.shop.product.infra.config;
}
