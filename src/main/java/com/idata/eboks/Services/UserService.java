package com.idata.eboks.Services;

import com.idata.eboks.models.EndUser;
import com.idata.eboks.models.UserMatch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserService extends BaseService {

    @Autowired
    private RestTemplate billoApiRestTemplateBean;

    public UserMatch matchUsers(String tenantKey, UserMatch listOfEndUsers) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserMatch> entity = new HttpEntity<>(listOfEndUsers, headers);
        UserMatch response = billoApiRestTemplateBean.exchange(
                createSlug(tenantKey, "/usermatch"),
                HttpMethod.POST,
                entity,
                new ParameterizedTypeReference<UserMatch>() {
                }).getBody();

        return response;
    }

        public List<EndUser> findUsersFromTenants(String tenantKey) {
        List<EndUser> chatResponse = billoApiRestTemplateBean.exchange(
                createSlug(tenantKey, "/user"),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EndUser>>() {
                }).getBody();

        return chatResponse;
    }
}
