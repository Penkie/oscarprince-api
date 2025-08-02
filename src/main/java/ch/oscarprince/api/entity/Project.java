package ch.oscarprince.api.entity;
import ch.oscarprince.api.model.ProjectStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "projects")
@Getter
@Setter
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String github;

    private String url;

    private long sort_order;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "project_technology",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "technology_id")
    )
    private List<Technology> technologies;
}
