package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum msd implements l89 {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    public final int E;

    msd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
