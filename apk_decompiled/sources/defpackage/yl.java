package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yl implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Set F;

    public /* synthetic */ yl(int i, Set set) {
        this.E = i;
        this.F = set;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.E;
        Set set = this.F;
        switch (i) {
            case 0:
                ol olVar = (ol) obj;
                olVar.getClass();
                zContains = set.contains(olVar.a);
                break;
            case 1:
                o32 o32Var = (o32) obj;
                o32Var.getClass();
                zContains = set.contains(o32Var.a);
                break;
            default:
                o32 o32Var2 = (o32) obj;
                o32Var2.getClass();
                zContains = set.contains(o32Var2.a);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
