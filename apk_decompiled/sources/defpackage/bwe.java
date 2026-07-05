package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bwe implements ge1, ym4 {
    public final pna a;
    public final ke1 b;
    public j0g c;

    public bwe(pna pnaVar, le1 le1Var, awe aweVar) {
        this.a = pnaVar;
        ke1 ke1VarA = aweVar.a.a();
        this.b = ke1VarA;
        le1Var.d(ke1VarA);
        ke1VarA.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
    }
}
