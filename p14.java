     class dates {
    public static void main(String[] args) {
        dates d=new dates(3,7,2024);
        dates d1=new dates(23,5,2026);

        d.display();
        d1.display();
    }
    
    int day,month,year;


    public dates(int day, int month, int year) {
        this.day =day;
        this.month = month;
        this.year = year;
    }


    public int getday() {
        return day;
    }

    public void setday(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void display() {
        System.out.println(month +"/"+day+"/"+year);
    }
    
}