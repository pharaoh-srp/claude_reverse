package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zib implements gud {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);

    public final int E;

    zib(int i) {
        this.E = i;
    }

    @Override // defpackage.gud
    public final int a() {
        return this.E;
    }
}
