package com.itfinn.utils.base;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 用于Jmail返回邮箱账号和密码的校验(在这里被Jmail类所用)
 *
 */
class SMTPAuthenticator extends Authenticator {
    private String name = "";
    private String password = "";

    public SMTPAuthenticator(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(name, password);
    }

}
