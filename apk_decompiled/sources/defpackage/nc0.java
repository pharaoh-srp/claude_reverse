package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum nc0 {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");

    public final String E;

    nc0(String str) {
        this.E = str;
    }
}
