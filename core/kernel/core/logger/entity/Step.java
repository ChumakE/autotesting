package kernel.core.logger.entity;


import javax.persistence.*;

/**
 * Created by user on 26.07.2016.
 */

@Entity
@Table(name = "Steps", uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class Step {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION", unique = false, nullable = false, length = 200)
    private String description;


    public void Step() { // Default constructor

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
