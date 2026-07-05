package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum vsd implements l89 {
    /* JADX INFO: Fake field, exist only in values array */
    DECLARATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAKE_OVERRIDE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHESIZED(3);

    public final int E;

    vsd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
