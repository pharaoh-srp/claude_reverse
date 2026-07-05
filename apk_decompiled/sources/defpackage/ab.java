package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ab {
    /* JADX INFO: Fake field, exist only in values array */
    RAGE_CLICK("rage_click"),
    /* JADX INFO: Fake field, exist only in values array */
    DEAD_CLICK("dead_click"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CLICK("error_click"),
    /* JADX INFO: Fake field, exist only in values array */
    RAGE_TAP("rage_tap"),
    ERROR_TAP("error_tap");

    public final String E;

    ab(String str) {
        this.E = str;
    }

    public final vh9 a() {
        return new vh9(this.E);
    }
}
