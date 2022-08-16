package BoardGame.BackEnd.Repository;

import BoardGame.BackEnd.Entity.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardGameRepository extends JpaRepository<BoardGame, Long> {


    Optional<BoardGame> findByNameContaining(String name); //이름 검색


    List<BoardGame> findByTypeContaining(String type); //장르별 검색


    List<BoardGame> findByPlayersContaining(String players); //인원별 검색


    List<BoardGame> findByDifficultyContaining(String difficulty); //난이도 검색












}
