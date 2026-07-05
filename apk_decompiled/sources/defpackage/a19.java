package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a19 extends bbi {
    public final qai[] b;
    public final vai[] c;
    public final boolean d;

    public a19(qai[] qaiVarArr, vai[] vaiVarArr, boolean z) {
        qaiVarArr.getClass();
        vaiVarArr.getClass();
        this.b = qaiVarArr;
        this.c = vaiVarArr;
        this.d = z;
    }

    @Override // defpackage.bbi
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.bbi
    public final vai e(yr9 yr9Var) {
        xh3 xh3VarA = yr9Var.O().a();
        qai qaiVar = xh3VarA instanceof qai ? (qai) xh3VarA : null;
        if (qaiVar != null) {
            int index = qaiVar.getIndex();
            qai[] qaiVarArr = this.b;
            if (index < qaiVarArr.length && x44.r(qaiVarArr[index].p(), qaiVar.p())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // defpackage.bbi
    public final boolean f() {
        return this.c.length == 0;
    }
}
