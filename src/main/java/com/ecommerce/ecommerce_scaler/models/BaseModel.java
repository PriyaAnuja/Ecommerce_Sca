package com.ecommerce.ecommerce_scaler.models;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
//cls contains all the common attributes, which every model cls is going to have.
public class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;

}
