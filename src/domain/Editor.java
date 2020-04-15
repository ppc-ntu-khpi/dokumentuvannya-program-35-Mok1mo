package domain;
public class Editor extends Artist {
    /**
     * Initialize Editor
     * @param electronicEditing Electronic editing of Editor
     * @param skiils Skills of Editor
     * @param name Name of Editor
     * @param jobTitle Job of Editor
     * @param level Level of Editor
     * @param dept Dept of Editor
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Assign skills and electronic editing
     * @param electronicEditing Electronic editing of Editor
     * @param skiils Skills of Editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Assign ID and electronic editing
     * @param electronicEditing Electronic editing of Editor
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Assign ID and electronic editing
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     *Create string "s"
     * @return Skills: S,k,i,l,l,s Editing preferences= electronic
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
