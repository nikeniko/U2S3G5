package nicolas.U2S3G5.services;

import nicolas.U2S3G5.entity.User;
import nicolas.U2S3G5.exceptions.UnauthorizedException;
import nicolas.U2S3G5.payloads.AuthenticationDTO;
import nicolas.U2S3G5.security.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthenticationService {
    @Autowired
    private UserService utenteService;

    @Autowired
    private JWTTools jwtTools;

    public String generateToken(@RequestBody @Validated AuthenticationDTO body){
        User found = this.utenteService.findByEmail(body.email());
        if(found.getPassword().equals(body.password())){
            return jwtTools.createToken(found);
        } else {
            throw new UnauthorizedException("Invalid credentials");
        }
    }
}