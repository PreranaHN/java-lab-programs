package week6;

import student.Student;
import requestbook.requestbook;
import issuebook.IssueBook;
public class demoSRP 
{
	public static void main(String[] args) {
        Student sony = new Student();
        sony.setname("Sony Mathew");
        sony.setregisterNO("119cs22042");
        requestbook rb = new requestbook();
        rb.setbookName("java programming");
        rb.setduration(2);
        rb.setStudent(sony);
        rb.searchBook();
        IssueBook ibOrder = new IssueBook(rb);
        ibOrder.issubook();
    }


}