package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum mrk {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String E;

    mrk(String str) {
        this.E = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.E;
    }
}
