package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ftd implements l89 {
    CLASS(0),
    PACKAGE(1),
    LOCAL(2);

    public final int E;

    ftd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
