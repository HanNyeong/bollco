package cafe.jjdev.fileUpLoadBoard.service;


import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import cafe.jjdev.fileUpLoadBoard.dao.ArticleDao;
import cafe.jjdev.fileUpLoadBoard.dao.ArticleFileDao;
import cafe.jjdev.fileUpLoadBoard.model.Article;
import cafe.jjdev.fileUpLoadBoard.model.ArticleCommend;
import cafe.jjdev.fileUpLoadBoard.model.ArticleFile;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleDao articleDao;
	
	@Autowired
	private ArticleFileDao articleFileDao;
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor= {Exception.class})
	@Override
	public void addArticle(ArticleCommend articleCommend) {
		// TODO Auto-generated method stub
		//물리적인 저장소에다가 file을 저장
		//DAO에 넘겨줄 값을 가공
		String path = "c:\\upload\\";
		MultipartFile file = articleCommend.getFile();
		File destfile = new File(path+articleCommend.getFile().getOriginalFilename());
		
		try {
			file.transferTo(destfile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Article article = new Article();
		article.setArticleTitle(articleCommend.getArticleTitle());
		article.setArticleWriter(articleCommend.getArticleWriter());
		article.setArticleContent(articleCommend.getArticleContent());
		article.setArticlePw(articleCommend.getArticlePw());
		articleDao.insertArticle(article);
		
		if(articleCommend.getFile() != null){
					
			ArticleFile articleFile = new ArticleFile();		
			
			articleFile.setArticleNo(article.getArticleNo());
			articleFile.setFile(destfile.getPath());
			
			articleFileDao.insertArticleFile(articleFile);
		
		}

	}

}
