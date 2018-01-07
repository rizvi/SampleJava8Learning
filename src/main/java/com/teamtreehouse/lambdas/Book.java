package com.teamtreehouse.lambdas;

public class Book {

	private String mTitle;
	private String mAuthor;
	private int mPublicationDate;

	public Book(String mTitle, String mAuthor, int mPublicationDate) {
		super();
		this.mTitle = mTitle;
		this.mAuthor = mAuthor;
		this.mPublicationDate = mPublicationDate;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmAuthor() {
		return mAuthor;
	}

	public void setmAuthor(String mAuthor) {
		this.mAuthor = mAuthor;
	}

	public int getmPublicationDate() {
		return mPublicationDate;
	}

	public void setmPublicationDate(int mPublicationDate) {
		this.mPublicationDate = mPublicationDate;
	}

	@Override
	public String toString() {
		return "Book [mTitle=" + mTitle + ", mAuthor=" + mAuthor + ", mPublicationDate=" + mPublicationDate + "]";
	}

	public static void main(String[] args) {

	}

}
