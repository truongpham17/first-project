/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongpmse.dtos;

/**
 *
 * @author windos 10
 */
public class SateDTO {
    private String id;
    private String name;
    private String location;
    private String description, status, time;

    public SateDTO() {
    }

    public SateDTO(String Id, String name, String location, String description, String status, String time) {
        this.id = Id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.status = status;
        this.time = time;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
