import java.util.ArrayList;
import java.util.List;

public class LibraryService {


    private List<Library> libraries = new ArrayList<>();


    public void addLibrary(Library newLibrary) {
        libraries.add(newLibrary);
        System.out.println("Library added successfully!");
    }


    public List<Library> getAllLibraries() {
        return libraries;
    }


    public Library getLibraryById(Long libraryId) {
        for (Library library : libraries) {
            if (library.getUniqueId().equals(libraryId)) {
                return library;
            }
        }
        System.out.println("Library not found!");
        return null;
    }

    public String updateLibraryById(Long libraryId, Library updatedLibrary) {
        for (int i = 0; i < libraries.size(); i++) {
            if (libraries.get(i).getUniqueId().equals(libraryId)) {
                libraries.set(i, updatedLibrary);
                return "Library updated successfully!";
            }
        }
        return "Library not found!";
    }


    public String deleteLibraryById(Long libraryId) {
        for (int i = 0; i < libraries.size(); i++) {
            if (libraries.get(i).getUniqueId().equals(libraryId)) {
                libraries.remove(i);
                return "Library deleted successfully!";
            }
        }
        return "Library not found!";
    }
}