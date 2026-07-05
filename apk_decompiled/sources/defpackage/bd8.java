package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bd8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cd8 F;
    public final /* synthetic */ String G;

    public /* synthetic */ bd8(cd8 cd8Var, String str, int i) {
        this.E = i;
        this.F = cd8Var;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        String str = this.G;
        cd8 cd8Var = this.F;
        switch (i) {
            case 0:
                Object obj = cd8Var.b.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            case 1:
                Object obj2 = cd8Var.b.get(str);
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            default:
                return Boolean.valueOf(x44.r(cd8Var.a.get(str), Boolean.TRUE));
        }
    }
}
