package ssau.esa.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    private long mobile;
    private String name;
    private  String surname;
    private int passport;
    private Citizenship citizenship;

    public Person(){}

    @Id
    @Column(name = "mobile_phone", nullable = false, length = 100)
    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname", nullable = false, length = 100)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "passport", nullable = false)
    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    @ManyToOne(optional = false, cascade = {CascadeType.ALL})
    @JoinColumn(name = "citizenship_id")
    public Citizenship getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }
}
