package test.task.handbook;

import javax.validation.constraints.NotNull;

//Справочник (свойства: идентификатор, наименование, сокращённое наименование)
public class Handbook {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String nameShort;

    public Handbook(Long id, String name, String nameShort) {
        this.id = id;
        this.name = name;
        this.nameShort = nameShort;
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

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + nameShort + '\'' +
                '}';
    }
}
