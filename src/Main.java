//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();


        libraryService.addLibrary(new Library(1L, "Central Library", "123 Main St", 5000, "Alice", LibararyType.PUBLIC));
        libraryService.addLibrary(new Library(2L, "University Library", "456 Campus Dr", 10000, "Bob", LibararyType.UNIVERSITY));


        System.out.println("All Libraries:");
        for (Library library : libraryService.getAllLibraries()) {
            System.out.println(library.getName());
        }


        Library library = libraryService.getLibraryById(1L);
        if (library != null) {
            System.out.println("Library found: " + library.getName());
        }


        String updateMessage = libraryService.updateLibraryById(1L, new Library(1L, "Updated Library", "789 New St", 7000, "Eve",LibararyType.DIGITAL));
        System.out.println(updateMessage);

        String deleteMessage = libraryService.deleteLibraryById(2L);
        System.out.println(deleteMessage);


        System.out.println("Libraries after update and delete:");
        for (Library updatedLibrary : libraryService.getAllLibraries()) {
            System.out.println(updatedLibrary.getName());
 }

    }
}