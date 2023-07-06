package com.franca.api;

import com.franca.configuration.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId="DefaultApiClient", name="${marvelPublicAPIV1.name:marvelPublicAPIV1}", url="${marvelPublicAPIV1.url:http://gateway.marvel.com/v1/public}", configuration = ClientConfiguration.class)
public interface DefaultApiClient extends DefaultApi {
}
