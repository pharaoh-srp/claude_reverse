package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i2e extends bbi {
    public static final ze9 c = ze9.a(oyk.j(2, false, null, 5), 3, false, null, null, 61);
    public static final ze9 d = ze9.a(oyk.j(2, false, null, 5), 2, false, null, null, 61);
    public final cbf b = new cbf(new lja(26));

    @Override // defpackage.bbi
    public final vai e(yr9 yr9Var) {
        return new wai(i(yr9Var, new ze9(2, false, false, null, 62)));
    }

    public final cpc h(j7g j7gVar, qqb qqbVar, ze9 ze9Var) {
        if (j7gVar.O().getParameters().isEmpty()) {
            return new cpc(j7gVar, Boolean.FALSE);
        }
        if (or9.x(j7gVar)) {
            vai vaiVar = (vai) j7gVar.H().get(0);
            int iA = vaiVar.a();
            yr9 yr9VarB = vaiVar.b();
            yr9VarB.getClass();
            return new cpc(yfd.c0(j7gVar.K(), j7gVar.O(), x44.W(new wai(iA, i(yr9VarB, ze9Var))), j7gVar.b0()), Boolean.FALSE);
        }
        if (ttj.j(j7gVar)) {
            return new cpc(nu6.c(mu6.ERROR_RAW_TYPE, j7gVar.O().toString()), Boolean.FALSE);
        }
        fab fabVarO = qqbVar.o(this);
        fabVarO.getClass();
        r9i r9iVarK = j7gVar.K();
        u9i u9iVarP = qqbVar.p();
        u9iVarP.getClass();
        List parameters = qqbVar.p().getParameters();
        parameters.getClass();
        List<qai> list = parameters;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        for (qai qaiVar : list) {
            qaiVar.getClass();
            cbf cbfVar = this.b;
            arrayList.add(lja.g(qaiVar, ze9Var, cbfVar, cbfVar.f(qaiVar, ze9Var)));
        }
        return new cpc(yfd.e0(r9iVarK, u9iVarP, arrayList, j7gVar.b0(), fabVarO, new h4(qqbVar, this, j7gVar, ze9Var)), Boolean.TRUE);
    }

    public final yr9 i(yr9 yr9Var, ze9 ze9Var) {
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA instanceof qai) {
            return i(this.b.f((qai) xh3VarA, ze9Var.h(true)), ze9Var);
        }
        if (!(xh3VarA instanceof qqb)) {
            xh6.d("Unexpected declaration kind: ", xh3VarA);
            return null;
        }
        xh3 xh3VarA2 = yb5.S(yr9Var).O().a();
        if (xh3VarA2 instanceof qqb) {
            cpc cpcVarH = h(yb5.A(yr9Var), (qqb) xh3VarA, c);
            j7g j7gVar = (j7g) cpcVarH.E;
            boolean zBooleanValue = ((Boolean) cpcVarH.F).booleanValue();
            cpc cpcVarH2 = h(yb5.S(yr9Var), (qqb) xh3VarA2, d);
            j7g j7gVar2 = (j7g) cpcVarH2.E;
            return (zBooleanValue || ((Boolean) cpcVarH2.F).booleanValue()) ? new j2e(j7gVar, j7gVar2) : yfd.z(j7gVar, j7gVar2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + xh3VarA2 + "\" while for lower it's \"" + xh3VarA + '\"').toString());
    }
}
