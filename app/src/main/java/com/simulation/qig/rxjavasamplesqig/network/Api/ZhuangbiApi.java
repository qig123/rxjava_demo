package com.simulation.qig.rxjavasamplesqig.network.Api;

import com.simulation.qig.rxjavasamplesqig.model.ZhuangbiImage;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by qig on 2018/1/30.
 */

public interface ZhuangbiApi {
    @GET("search")
    Observable<List<ZhuangbiImage>> search(@Query("q") String query);
}
