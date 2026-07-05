package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ajb implements gud {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int E;

    ajb(int i) {
        this.E = i;
    }

    @Override // defpackage.gud
    public final int a() {
        return this.E;
    }
}
