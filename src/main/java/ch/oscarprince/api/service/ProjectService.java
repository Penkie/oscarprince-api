package ch.oscarprince.api.service;

import ch.oscarprince.api.entity.Project;
import ch.oscarprince.api.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjects() {
        return this.projectRepository.findAll();
    }
}
