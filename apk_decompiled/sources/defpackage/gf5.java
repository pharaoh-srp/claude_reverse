package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class gf5 extends nvk {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Serializable j;

    public gf5(bz7 bz7Var, dae daeVar) {
        this.h = 1;
        this.j = daeVar;
        this.i = bz7Var;
    }

    @Override // defpackage.nvk
    public void g(Object obj) {
        switch (this.h) {
            case 1:
                e92 e92Var = (e92) obj;
                e92Var.getClass();
                dae daeVar = (dae) this.j;
                if (daeVar.E == null && ((Boolean) ((bz7) this.i).invoke(e92Var)).booleanValue()) {
                    daeVar.E = e92Var;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nvk
    public final boolean k(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((bz7) obj2).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                break;
            case 1:
                ((e92) obj).getClass();
                if (((dae) obj3).E == null) {
                }
                break;
            default:
                qqb qqbVar = (qqb) obj;
                dae daeVar = (dae) obj3;
                qqbVar.getClass();
                String strG = bsk.g(qqbVar, (String) obj2);
                if (yj9.b.contains(strG)) {
                    daeVar.E = sj9.E;
                } else if (yj9.c.contains(strG)) {
                    daeVar.E = sj9.F;
                } else if (yj9.a.contains(strG)) {
                    daeVar.E = sj9.H;
                }
                if (daeVar.E == null) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.nvk
    public final Object t() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (e92) ((dae) obj).E;
            default:
                sj9 sj9Var = (sj9) ((dae) obj).E;
                return sj9Var == null ? sj9.G : sj9Var;
        }
    }

    public /* synthetic */ gf5(Object obj, Serializable serializable, int i) {
        this.h = i;
        this.i = obj;
        this.j = serializable;
    }
}
