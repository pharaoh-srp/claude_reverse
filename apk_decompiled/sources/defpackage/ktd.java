package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ktd implements l89 {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);

    public final int E;

    ktd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
