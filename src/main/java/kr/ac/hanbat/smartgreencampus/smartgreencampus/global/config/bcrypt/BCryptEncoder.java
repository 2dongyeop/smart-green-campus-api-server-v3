package kr.ac.hanbat.smartgreencampus.smartgreencampus.global.config.bcrypt;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptEncoder implements EncryptHelper {
    @Override
    public String encrypt(final String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    @Override
    public boolean isMatch(final String password, final String hashed) {
        return BCrypt.checkpw(password, hashed);
    }
}
