package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cjj implements oh7 {
    public final h1 a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final fnc e;

    public cjj(fnc fncVar) {
        y28 y28Var = hjj.a;
        Integer numValueOf = Integer.valueOf(fncVar != fnc.E ? 1 : 4);
        Integer num = fncVar == fnc.F ? 4 : null;
        y28Var.getClass();
        this.a = y28Var;
        this.b = numValueOf;
        this.c = num;
        this.d = 4;
        this.e = fncVar;
    }

    @Override // defpackage.oh7
    public final af4 a() {
        this.a.a();
        Integer num = this.b;
        int iIntValue = num != null ? num.intValue() : 0;
        af4 af4Var = new af4();
        if (iIntValue < 0) {
            mr9.q(grc.u("The minimum number of digits (", iIntValue, ") is negative"));
            return null;
        }
        if (iIntValue <= 9) {
            return this.c != null ? new af4() : af4Var;
        }
        mr9.q(grc.u("The minimum number of digits (", iIntValue, ") exceeds the length of an Int"));
        return null;
    }

    @Override // defpackage.oh7
    public final auc b() {
        h1 h1Var = this.a;
        drd drdVarA = h1Var.a();
        String strC = h1Var.c();
        drdVarA.getClass();
        strC.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList arrayListA0 = x44.a0(t9e.x(num, null, num2, drdVarA, strC, true));
        Integer num3 = this.d;
        lm6 lm6Var = lm6.E;
        if (num3 != null) {
            arrayListA0.add(t9e.x(num, num3, num2, drdVarA, strC, false));
            arrayListA0.add(new auc(x44.X(new h4d("+"), new bac(x44.W(new ahi(Integer.valueOf(num3.intValue() + 1), null, drdVarA, strC, false)))), lm6Var));
        } else {
            arrayListA0.add(t9e.x(num, null, num2, drdVarA, strC, false));
        }
        return new auc(lm6Var, arrayListA0);
    }

    @Override // defpackage.oh7
    public final h1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjj) {
            return this.e == ((cjj) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.e.hashCode() * 31);
    }
}
