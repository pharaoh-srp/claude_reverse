package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum bud implements l89 {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public final int E;

    bud(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
