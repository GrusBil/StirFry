import org.hibernate.annotations.Parent;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SubCategory {


    @Id
    @GeneratedValue
    private Long id;
    //* *SubCategory*: with a numeric id, and a String name
    @ManyToOne @NotNull
    private Category parent;

    @NotBlank
    @Size(max = 128)
    private String name;

    public void setParent(Category parent) {
        this.parent = parent;
    }
    public Category getParent() {
        return parent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
