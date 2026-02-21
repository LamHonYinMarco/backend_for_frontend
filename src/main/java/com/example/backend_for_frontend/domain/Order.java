package com.example.backend_for_frontend.domain;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "orders") // Specify the collection name in MongoDB
public class Order {
    @Id
    private String orderId; // Use String for MongoDB ObjectId

    @Field("item_name") // Specify the field name in the MongoDB document
    private String itemName;

    private double price;

}