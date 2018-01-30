import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
public class Category
{

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<SubCategory> subCategories;

    public Category() {
        subCategories = new ArrayList<SubCategory>();
    }
    //* *Category*: with a numeric id, and a String name
    @Size(max = 128)
    @NotBlank
    @Column(unique = true)
    private String name;

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }


    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
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
