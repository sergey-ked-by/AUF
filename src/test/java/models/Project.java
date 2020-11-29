package models;

public class Project {
    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private int typeOfProject;
    private boolean isCompleted;

    public Project() {
    }

    public Project(String name, String announcement, boolean isShowAnnouncement, int typeOfProject, boolean isCompleted) {
        this.name = name;
        this.announcement = announcement;
        this.isShowAnnouncement = isShowAnnouncement;
        this.typeOfProject = typeOfProject;
        this.isCompleted = isCompleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public void setShowAnnouncement(boolean showAnnouncement) {
        isShowAnnouncement = showAnnouncement;
    }

    public int getTypeOfProject() {
        return typeOfProject;
    }

    public void setTypeOfProject(int typeOfProject) {
        this.typeOfProject = typeOfProject;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
