package com.security.authentication.authenticationserver.service;


import com.security.authentication.authenticationserver.model.AuthUserDetail;
import com.security.authentication.authenticationserver.model.User;
import com.security.authentication.authenticationserver.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("UserDetailsService")
public class UserDetailsServiceImple implements UserDetailsService {
    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userDetailRepository.findByUsername(username);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("username or pasword is not found"));

        UserDetails userDetails = new AuthUserDetail(optionalUser.get());

        new AccountStatusUserDetailsChecker().check(userDetails);

        return userDetails;
    }
}
