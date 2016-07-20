package cafe.jjdev.fileUpLoadBoard.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cafe.jjdev.fileUpLoadBoard.model.Article;
import cafe.jjdev.fileUpLoadBoard.model.ArticleCommend;
@Repository
public class ArticleDaoImpl implements ArticleDao {

	private final String  NS = "cafe.jjdev.fileUpLoadBoard.model.ArticleMapper";
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public int insertArticle(Article article) {
		return sqlSession.insert(NS+".insertArticle", article);
	}

}
