package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qx9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ rx9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx9(rx9 rx9Var, int i) {
        super(0);
        this.F = i;
        this.G = rx9Var;
    }

    @Override // defpackage.zy7
    public final Object a() throws IllegalAccessException, InvocationTargetException {
        int i = this.F;
        rx9 rx9Var = this.G;
        switch (i) {
            case 0:
                ArrayList<abe> arrayListC = rx9Var.b.c();
                ArrayList arrayList = new ArrayList();
                for (abe abeVar : arrayListC) {
                    sxb sxbVar = abeVar.a;
                    if (sxbVar == null) {
                        sxbVar = mj9.b;
                    }
                    il4 il4VarA = rx9Var.a(abeVar);
                    cpc cpcVar = il4VarA != null ? new cpc(sxbVar, il4VarA) : null;
                    if (cpcVar != null) {
                        arrayList.add(cpcVar);
                    }
                }
                return sta.p0(arrayList);
            case 1:
                return yae.a(ez1.I(ez1.H(rx9Var.b.a))).b();
            default:
                ww7 ww7VarE = rx9Var.e();
                zae zaeVar = rx9Var.b;
                el5 el5Var = rx9Var.a;
                if (ww7VarE == null) {
                    return nu6.c(mu6.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, zaeVar.toString());
                }
                ke9 ke9Var = (ke9) el5Var.E;
                ke9 ke9Var2 = (ke9) el5Var.E;
                or9 or9VarF = ke9Var.o.f();
                or9VarF.getClass();
                String str = ue9.a;
                gh3 gh3VarF = ue9.f(ww7VarE);
                qqb qqbVarI = gh3VarF != null ? or9VarF.i(gh3VarF.b()) : null;
                if (qqbVarI == null) {
                    jbe jbeVar = new jbe(ez1.I(ez1.H(zaeVar.a)));
                    tk5 tk5Var = (tk5) ke9Var2.k.F;
                    if (tk5Var == null) {
                        x44.o0("resolver");
                        throw null;
                    }
                    qqbVarI = tk5Var.s(jbeVar);
                    if (qqbVarI == null) {
                        qqbVarI = kxk.v(ke9Var2.o, gh3.j(ww7VarE), ke9Var2.d.c().l);
                    }
                }
                return qqbVarI.W();
        }
    }
}
