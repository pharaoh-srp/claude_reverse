package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum rk5 {
    G("us1", "browser-intake-datadoghq.com"),
    /* JADX INFO: Fake field, exist only in values array */
    US3("us3"),
    US5("us5"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("eu1", "browser-intake-datadoghq.eu"),
    /* JADX INFO: Fake field, exist only in values array */
    AP1("ap1"),
    /* JADX INFO: Fake field, exist only in values array */
    AP2("ap2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("us1_fed", "browser-intake-ddog-gov.com"),
    /* JADX INFO: Fake field, exist only in values array */
    EF89("us2_fed", "browser-intake-us2-ddog-gov.com"),
    /* JADX INFO: Fake field, exist only in values array */
    EF102("staging", "browser-intake-datad0g.com");

    public final String E;
    public final String F;

    rk5(String str, String str2) {
        this.E = str;
        this.F = "https://".concat(str2);
    }

    rk5(String str) {
        this(str, ij0.j("browser-intake-", str, "-datadoghq.com"));
    }
}
