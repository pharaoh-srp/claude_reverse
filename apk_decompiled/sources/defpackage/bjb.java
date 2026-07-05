package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bjb implements gud {
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int E;

    bjb(int i) {
        this.E = i;
    }

    @Override // defpackage.gud
    public final int a() {
        return this.E;
    }
}
