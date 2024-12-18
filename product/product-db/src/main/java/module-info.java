module com.mg.shop.product.db {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.jpa;
    requires com.fasterxml.jackson.databind;

    requires com.mg.shop.product.domain;
    requires jakarta.persistence;

    // requires deep reflection
    exports com.mg.shop.product.db.model;
    exports com.mg.shop.product.db.repositories;
    exports com.mg.shop.product.db;

}
