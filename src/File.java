public class File {
    private String name;
    private String location;
    private int size;

    public File(String name, String location, int size) {
        this.name = name;
        this.location = location;
        this.size = size;
    }

    public void showFile(File f){
        System.out.println("Fisierul %s se afla in locatia %d si are dimensiunea de %d kB", f.name, f.location, f.size);
    }
}
