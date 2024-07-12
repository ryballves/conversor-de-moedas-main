package com.br.conversordemoedas.model;

import com.google.gson.annotations.SerializedName;

public record Conversor(@SerializedName("base_code") String moedaEscolhida,
                        @SerializedName("target_code") String moedaAConverter,
                        @SerializedName("conversion_result") double valorCotacao) {
}
