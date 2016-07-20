package cafe.jjdev.fileUpLoadBoard.model;


public class ArticleFile {
	private int articleFileNo;
	private int articleNo;
	private String file;
	
	public int getArticleFileNo() {
		return articleFileNo;
	}
	public void setArticleFileNo(int articleFileNo) {
		this.articleFileNo = articleFileNo;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "ArticleFile [articleFileNo=" + articleFileNo + ", articleNo=" + articleNo + ", file=" + file + "]";
	}
	
	
	
	
}
