package com.playonlinux.ui.dtos;


import java.io.File;

public class VirtualDriveDTO {
    private final File icon;
    private final String name;

    public VirtualDriveDTO(Builder builder) {
        this.name = builder.name;
        this.icon = builder.icon;
    }

    public String getName() {
        return name;
    }

    public File getIcon() {
        return icon;
    }

    public static class Builder {
        private String name;
        private File icon;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withIcon(File icon) {
            this.icon = icon;
            return this;
        }

        public VirtualDriveDTO build() {
            return new VirtualDriveDTO(this);
        }
    }
}