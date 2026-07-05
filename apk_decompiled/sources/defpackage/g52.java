package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g52 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ h52 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g52(h52 h52Var, int i) {
        super(0);
        this.F = i;
        this.G = h52Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        h52 h52Var = this.G;
        switch (i) {
            case 0:
                y42 y42Var = y42.n;
                return fd9.o0(h52Var.f);
            default:
                String strA = h52Var.f.a("Content-Type");
                if (strA == null) {
                    return null;
                }
                ide ideVar = p8b.e;
                try {
                    return nai.D(strA);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
