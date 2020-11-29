package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

//@Setter
@Getter
//@Value
@Builder

public class ProjectBuilderLombok {
    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private int typeOfProject;
    private boolean isCompleted;

}