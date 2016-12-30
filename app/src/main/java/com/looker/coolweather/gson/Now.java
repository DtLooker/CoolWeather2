package com.looker.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by looker on 2016/12/29.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }

}
