package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nc5 implements r5i {
    public final int b;

    public nc5(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        sz6.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.r5i
    public final z5i a(b11 b11Var, sx8 sx8Var) {
        if ((sx8Var instanceof hxg) && ((hxg) sx8Var).c != sg5.E) {
            return new pc5(b11Var, sx8Var, this.b);
        }
        return new n6c(b11Var, sx8Var);
    }
}
