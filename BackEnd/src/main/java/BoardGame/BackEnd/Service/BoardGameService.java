package BoardGame.BackEnd.Service;

import BoardGame.BackEnd.Entity.BoardGame;
import BoardGame.BackEnd.Repository.BoardGameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardGameService {

    private final BoardGameRepository boardGameRepository;

    public BoardGame findOne(String name){
        return boardGameRepository.findByName(name);
    }

    public List<BoardGame> findType(String type){
        return boardGameRepository.findByTypeContaning(type);
    }

    public List<BoardGame> findDifficulty(String difficulty){
        return boardGameRepository.findByDifficultyContaning(difficulty);
    }
}
