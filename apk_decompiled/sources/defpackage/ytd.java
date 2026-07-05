package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ytd implements l89 {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    public final int E;

    ytd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
