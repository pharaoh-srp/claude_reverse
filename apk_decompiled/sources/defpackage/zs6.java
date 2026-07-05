package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zs6 {
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

    zs6(String str) {
        this.E = str;
    }
}
