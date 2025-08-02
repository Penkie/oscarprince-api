package ch.oscarprince.api.repository;

import ch.oscarprince.api.entity.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    @NonNull
    List<Project> findAll();
}
