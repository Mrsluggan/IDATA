package com.idata.eboks.Services;

import org.springframework.stereotype.Service;

import com.idata.eboks.models.UserMatch;

@Service
public class UserMatchService {

    public UserMatch matchUsers(UserMatch request) {



        UserMatch result = new UserMatch();
        result.setSsns(request.getSsns()); 
        return result;
    }
}