package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ola {
    BLUETOOTH("bluetooth"),
    CELLULAR("cellular"),
    ETHERNET("ethernet"),
    WIFI("wifi"),
    WIMAX("wimax"),
    /* JADX INFO: Fake field, exist only in values array */
    MIXED("mixed"),
    OTHER("other"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public final String E;

    ola(String str) {
        this.E = str;
    }
}
