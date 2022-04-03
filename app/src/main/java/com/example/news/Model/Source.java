/*
 * Copyright Text :
 * Created by Tuan on 4/3/22, 8:42 PM
 *  Copyright (c) 2022 . All rights reserved.
 *  Last modified 4/3/22, 8:42 PM
 */

package com.example.news.Model;

public class Source {
    String id = "";
    String name = "";

    public Source(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
