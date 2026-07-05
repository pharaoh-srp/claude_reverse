package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum kyi implements lyi {
    MANUAL("manual"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSE("compose"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITY("activity"),
    /* JADX INFO: Fake field, exist only in values array */
    FRAGMENT("fragment");

    public final String E;

    kyi(String str) {
        this.E = str;
    }

    @Override // defpackage.lyi
    public final String getValue() {
        return this.E;
    }
}
