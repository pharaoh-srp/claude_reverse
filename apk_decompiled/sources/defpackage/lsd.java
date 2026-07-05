package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum lsd implements l89 {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);

    public final int E;

    lsd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
