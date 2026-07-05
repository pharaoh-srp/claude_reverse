package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xtd implements l89 {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final int E;

    xtd(int i) {
        this.E = i;
    }

    @Override // defpackage.l89
    public final int a() {
        return this.E;
    }
}
