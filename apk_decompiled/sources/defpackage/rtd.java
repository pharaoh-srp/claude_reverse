package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum rtd implements l89 {
    IN(0),
    OUT(1),
    INV(2);

    public final int E;

    rtd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
