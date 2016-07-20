package cafe.jjdev.fileUpLoadBoard.model;

public class Comment {
	private int commentNo;
	private ArticleCommend article;
	private String commentContent;
	private String 	commentWriter;
	private String commentPw;
	private String commentDate;
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public ArticleCommend getArticle() {
		return article;
	}
	public void setArticle(ArticleCommend article) {
		this.article = article;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentWriter() {
		return commentWriter;
	}
	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}
	public String getCommentPw() {
		return commentPw;
	}
	public void setCommentPw(String commentPw) {
		this.commentPw = commentPw;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", article=" + article + ", commentContent=" + commentContent
				+ ", commentWriter=" + commentWriter + ", commentPw=" + commentPw + ", commentDate=" + commentDate
				+ "]";
	}
	
	
	
}
