package ssau.esa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "citizenship")
public class Citizenship {
    private long id;
    private String name;
    List<Person> person;

    public Citizenship() { }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "citizenship", cascade = {CascadeType.ALL})
    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
