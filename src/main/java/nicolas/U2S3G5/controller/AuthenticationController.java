package nicolas.U2S3G5.controller;

import nicolas.U2S3G5.services.AuthenticationService;
import nicolas.U2S3G5.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserRepository utenteRepository;
}