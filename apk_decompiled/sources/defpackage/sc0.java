package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum sc0 {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String E;

    sc0(String str) {
        this.E = str == null ? mwj.n(name()) : str;
    }

    public final String a() {
        return this.E;
    }
}
