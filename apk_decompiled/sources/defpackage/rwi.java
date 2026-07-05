package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum rwi {
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

    rwi(String str) {
        this.E = str;
    }
}
