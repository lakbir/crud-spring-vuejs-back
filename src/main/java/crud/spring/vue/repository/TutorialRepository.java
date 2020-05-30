package crud.spring.vue.repository;

import crud.spring.vue.entities.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    public List<Tutorial> findByPublished(boolean published);
    public List<Tutorial> findByTitleContaining(String title);
}
