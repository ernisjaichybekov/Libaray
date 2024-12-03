public class Library {

    private Long uniqueId;
    private String name;
    private String address;
    private int numberOfBooks;
    private String librarian;
    private String libraryType;


    public Library(Long uniqueId, String name, String address, int numberOfBooks, String librarian, LibararyType university) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.address = address;
        this.numberOfBooks = numberOfBooks;
        this.librarian = librarian;
        this.libraryType = libraryType;
    }


    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public String getLibrarian() {
        return librarian;
    }
    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public String getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(String libraryType) {
        this.libraryType = libraryType;
}


}
