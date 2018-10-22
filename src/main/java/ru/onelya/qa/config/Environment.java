package ru.onelya.qa.config;

public enum Environment {

    DEFAULT {
        @Override
        public EnvironmentProperties getProperties() {
            return EnvironmentProperties.get("/default.properties");
        }
    };

    public static Environment get() {
        switch (System.getProperty("run.environment")) {
            default:
                return DEFAULT;
        }
    }

    public abstract EnvironmentProperties getProperties();
}
