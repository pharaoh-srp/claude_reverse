package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lw8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ l45 F;
    public final /* synthetic */ koc G;

    public /* synthetic */ lw8(l45 l45Var, koc kocVar, int i) {
        this.E = i;
        this.F = l45Var;
        this.G = kocVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        boolean z = false;
        l45 l45Var = this.F;
        koc kocVar = this.G;
        switch (i) {
            case 0:
                gb9.D(l45Var, null, null, new rw8(0, null, kocVar), 3);
                break;
            case 1:
                gb9.D(l45Var, null, null, new rw8(1, null, kocVar), 3);
                break;
            case 2:
                if (kocVar.b()) {
                    gb9.D(l45Var, null, null, new rw8(2, null, kocVar), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (kocVar.d()) {
                    gb9.D(l45Var, null, null, new rw8(3, null, kocVar), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                if (kocVar.b()) {
                    gb9.D(l45Var, null, null, new rw8(2, null, kocVar), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (kocVar.d()) {
                    gb9.D(l45Var, null, null, new rw8(3, null, kocVar), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ lw8(koc kocVar, l45 l45Var, int i) {
        this.E = i;
        this.G = kocVar;
        this.F = l45Var;
    }
}
