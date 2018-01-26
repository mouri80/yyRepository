package cn.itcast.springboot.javaconfig;

public class Role {

    private String id;

    private String roleName;

    private Integer roleAlias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleAlias() {
        return roleAlias;
    }

    public void setRoleAlias(Integer roleAlias) {
        this.roleAlias = roleAlias;
    }
    
    
}
