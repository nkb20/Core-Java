package LibrartManagement;

public class Details {
public String id="k",title,Author,Publish_Year,Status;
    public String addBook(){
        return  "id: "+id+
                "\n title of book:" +title+
                "\n Author ofbook: " + Author +
                "\n Publish year: " + Publish_Year;
    }

    public String showAllBook(){
        return "f";
    }

    public String showAvailableBook(){
        return "f";
    }

    public String borrowBook(){
        return "f";
    }

    public String returnBook(){
        return "f";
    }



}
