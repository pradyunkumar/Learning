import java.util.List;

public class NoteKeeper {
    class Note{
        private String note;

        public String getNote() {
            return note;
        }
    }
    private List<Note> noteList;

    public void printNotes(){
        for(int i = 0; i < noteList.size(); i++){
            System.out.println(i+1 + ". " + noteList.get(i).getNote());
        }
    }

    public void removeNotes(String str){
        for(int i = 0; i <noteList.size(); i++){
            if(noteList.get(i).getNote().contains(str))
                noteList.remove(noteList.get(i));
        }
    }
}
