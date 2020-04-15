package domain;

public class Artist extends Employee {
    /**
     *Initialize Artist
     * @param skiils SkiLls of Artist
     * @param name Name of Artist
     * @param jobTitle Job of Artist
     * @param level Level of Artist
     * @param dept Dept of Artist
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Assign ID to Artist
     * @param skiils SkiLls of Artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Assign ID to Artist
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Get skills of Artist
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Get skills of Artist
     * @return
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}
