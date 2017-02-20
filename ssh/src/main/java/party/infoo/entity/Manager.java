package party.infoo.entity;

/**
 * Created by infoo on 2017/2/21.
 */
public class Manager  {
    private int managerId;
    private String managerName;
    private String managerPass;

    public Manager() {
        super();
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPass() {
        return managerPass;
    }

    public void setManagerPass(String managerPass) {
        this.managerPass = managerPass;
    }
}
