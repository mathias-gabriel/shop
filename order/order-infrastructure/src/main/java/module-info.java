module com.mg.shop.order.infra {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.data.jpa;
    requires java.persistence;
    requires com.fasterxml.jackson.databind;

    requires com.mg.shop.order.domain;

    // requires deep reflection
    exports com.mg.shop.order.infra.api;
    exports com.mg.shop.order.infra.repositories;
    exports com.mg.shop.order.infra.model;
    exports com.mg.shop.order.infra.config;
}
