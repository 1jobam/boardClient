package board.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import board.vo.BoardVO;

public interface BoardService extends Remote{
	
	public Object insertBoard(BoardVO bv) throws RemoteException;
	
	public int updateBoard(BoardVO bv) throws RemoteException;
	
	public int deleteBoard(BoardVO bv) throws RemoteException;
	
	public List<BoardVO> getAllBoard() throws RemoteException;
	
	public List<BoardVO> getSearchBoard(BoardVO bv) throws RemoteException;

}
