package cafe.jjdev.fileUpLoadBoard.model;

import org.springframework.web.multipart.MultipartFile;

public class ArticleCommend {
	private int articleNo;
	private String articleTitle;
	private String articleContent;
	private String articleWriter;
	private String articleDate;
	private String articlePw;
	private MultipartFile file;
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getArticleWriter() {
		return articleWriter;
	}
	public void setArticleWriter(String articleWriter) {
		this.articleWriter = articleWriter;
	}
	public String getArticleDate() {
		return articleDate;
	}
	public void setArticleDate(String articleDate) {
		this.articleDate = articleDate;
	}
	public String getArticlePw() {
		return articlePw;
	}
	public void setArticlePw(String articlePw) {
		this.articlePw = articlePw;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "ArticleCommend [articleNo=" + articleNo + ", articleTitle=" + articleTitle + ", articleContent="
				+ articleContent + ", articleWriter=" + articleWriter + ", articleDate=" + articleDate + ", articlePw="
				+ articlePw + ", file=" + file + "]";
	}
	

}
