package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh7 implements qd7 {
    @Override // defpackage.qd7
    public final int a() {
        return 3;
    }

    @Override // defpackage.qd7
    public final int b(c92 c92Var, c92 c92Var2, qqb qqbVar) {
        c92Var.getClass();
        c92Var2.getClass();
        if (!(c92Var2 instanceof hrd) || !(c92Var instanceof hrd)) {
            return 4;
        }
        hrd hrdVar = (hrd) c92Var2;
        hrd hrdVar2 = (hrd) c92Var;
        if (!x44.r(hrdVar.getName(), hrdVar2.getName())) {
            return 4;
        }
        if (kyk.h(hrdVar) && kyk.h(hrdVar2)) {
            return 1;
        }
        return (kyk.h(hrdVar) || kyk.h(hrdVar2)) ? 3 : 4;
    }
}
