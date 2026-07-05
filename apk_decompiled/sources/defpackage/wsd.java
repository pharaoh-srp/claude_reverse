package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum wsd implements l89 {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);

    public final int E;

    wsd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
