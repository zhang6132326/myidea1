package com.zxf.returnJson;

public class Permission {
    private String  permissionId;

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId='" + permissionId + '\'' +
                '}';
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public Permission() {
    }

    public Permission(String permissionId) {
        this.permissionId = permissionId;
    }
}
