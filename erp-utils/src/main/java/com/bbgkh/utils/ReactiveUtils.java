package com.bbgkh.utils;

import reactor.core.publisher.Flux;

/**
 * Created by lixiang on 12/16/2016.
 */
public class ReactiveUtils {
    public static void main(String[] args) {
        /*Flux.just("red", "white", "blue")
                .log()
                .map(value -> value.toUpperCase())
                .subscribe();*/
        Flux<String> flux = Flux.just("red","white","blue");
        Flux<String> upper = flux
                .log()
                .map(String::toUpperCase);

        upper.subscribe(null,null,JsonUtils::doOnComple);
      //  upper.toIterable().forEach(System.out::println);
    }


}
