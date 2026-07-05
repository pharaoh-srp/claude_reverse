package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum rsd implements l89 {
    TRUE(0),
    FALSE(1),
    NULL(2);

    public final int E;

    rsd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
