package defpackage;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yd4 implements f8b, ug6 {
    public final Object a;
    public tg6 b;
    public tg6 c;
    public final /* synthetic */ ae4 d;

    public yd4(ae4 ae4Var, Object obj) {
        this.d = ae4Var;
        this.b = new tg6(ae4Var.c.c, 0, null);
        this.c = new tg6(ae4Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.f8b
    public final void A(int i, z7b z7bVar, uba ubaVar, l7b l7bVar, int i2) {
        if (a(i, z7bVar)) {
            tg6 tg6Var = this.b;
            l7b l7bVarB = b(l7bVar, z7bVar);
            tg6Var.getClass();
            tg6Var.a(new b8b(tg6Var, ubaVar, l7bVarB, i2));
        }
    }

    public final boolean a(int i, z7b z7bVar) {
        z7b z7bVarS;
        Object obj = this.a;
        ae4 ae4Var = this.d;
        if (z7bVar != null) {
            z7bVarS = ae4Var.s(obj, z7bVar);
            if (z7bVarS == null) {
                return false;
            }
        } else {
            z7bVarS = null;
        }
        int iU = ae4Var.u(i, obj);
        tg6 tg6Var = this.b;
        if (tg6Var.a != iU || !Objects.equals(tg6Var.b, z7bVarS)) {
            this.b = new tg6(ae4Var.c.c, iU, z7bVarS);
        }
        tg6 tg6Var2 = this.c;
        if (tg6Var2.a == iU && Objects.equals(tg6Var2.b, z7bVarS)) {
            return true;
        }
        this.c = new tg6(ae4Var.d.c, iU, z7bVarS);
        return true;
    }

    public final l7b b(l7b l7bVar, z7b z7bVar) {
        long j = l7bVar.c;
        ae4 ae4Var = this.d;
        Object obj = this.a;
        long jT = ae4Var.t(j, obj);
        long j2 = l7bVar.d;
        long jT2 = ae4Var.t(j2, obj);
        return (jT == j && jT2 == j2) ? l7bVar : new l7b(l7bVar.a, l7bVar.b, jT, jT2);
    }

    @Override // defpackage.f8b
    public final void c(int i, z7b z7bVar, l7b l7bVar) {
        if (a(i, z7bVar)) {
            tg6 tg6Var = this.b;
            l7b l7bVarB = b(l7bVar, z7bVar);
            tg6Var.getClass();
            tg6Var.a(new u95(tg6Var, 9, l7bVarB));
        }
    }

    @Override // defpackage.f8b
    public final void g(int i, z7b z7bVar, uba ubaVar, l7b l7bVar) {
        if (a(i, z7bVar)) {
            tg6 tg6Var = this.b;
            l7b l7bVarB = b(l7bVar, z7bVar);
            tg6Var.getClass();
            tg6Var.a(new c8b(tg6Var, ubaVar, l7bVarB, 1));
        }
    }

    @Override // defpackage.f8b
    public final void j(int i, z7b z7bVar, uba ubaVar, l7b l7bVar) {
        if (a(i, z7bVar)) {
            tg6 tg6Var = this.b;
            l7b l7bVarB = b(l7bVar, z7bVar);
            tg6Var.getClass();
            tg6Var.a(new c8b(tg6Var, ubaVar, l7bVarB, 0));
        }
    }

    @Override // defpackage.f8b
    public final void k(int i, z7b z7bVar, uba ubaVar, l7b l7bVar, IOException iOException, boolean z) {
        if (a(i, z7bVar)) {
            tg6 tg6Var = this.b;
            l7b l7bVarB = b(l7bVar, z7bVar);
            tg6Var.getClass();
            tg6Var.a(new d8b(tg6Var, ubaVar, l7bVarB, iOException, z));
        }
    }
}
