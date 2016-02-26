package at.hfock.tgm.dezsys09.data;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Die Klasse die fuer die Account Objekte zustaendig ist
 *
 * @author hfock
 */
@Entity
public class Account implements Serializable {

    @Id
    @Size(max = 20)
    @NotEmpty
    private String email;

    @Size(max = 20)
    private String username;

    private String password;

    public Account(){

    }

    /**
     * Konstruktor
     * @param email E-Mail
     * @param username Benutzername
     * @param password Passwort
     */
    public Account(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
