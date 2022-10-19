package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired // 알아서 객체생성
    private BoardRepository boardRepository;

    //글작성
    public void write(Board board){
        boardRepository.save(board);
    }

    //게시글 리스트
    public List<Board> boardList(){
        return boardRepository.findAll();
    }

    //특정 게시글 불러오기
    public Board boardView(Integer id){
        return boardRepository.findById(id).get();
    }

}
