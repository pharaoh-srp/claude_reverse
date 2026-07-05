package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r48 extends i2 {
    public final int E;
    public final a2 F;

    public r48(int i, a2 a2Var) {
        this.E = i;
        this.F = a2Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.F.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E;
    }
}
