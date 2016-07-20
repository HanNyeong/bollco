package cafe.jjdev.fileUpLoadBoard.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cafe.jjdev.fileUpLoadBoard.model.ArticleFile;
@Repository
public class ArticleFileDaoImpl implements ArticleFileDao {
	
	
	private final String  NS = "cafe.jjdev.fileUpLoadBoard.model.ArticleMapper";
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void insertArticleFile(ArticleFile articleFile) {
		sqlSession.insert(NS+".insertArticleFile", articleFile);
	}

}
