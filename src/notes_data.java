
public class notes_data 
{
    String notes_id;
    String teacher_id;
    String topic;
    String details;
    String date;
    String type;
    String path;
    String course;
    String semester;

     notes_data( String notes_id,String teacher_id,String topic,String details,String date,String type,String path,String course,String semester) 
    {
        this.notes_id=notes_id;
        this.teacher_id=teacher_id;
        this.topic=topic;
        this.details=details;
        this.date=date;
        this.type=type;
        this.path=path;
        this.course=course;
        this.semester=semester;
    }
    
}
