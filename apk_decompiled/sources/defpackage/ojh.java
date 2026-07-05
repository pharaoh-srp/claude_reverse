package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ojh implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zb0 F;
    public final /* synthetic */ mte G;

    public /* synthetic */ ojh(zb0 zb0Var, mte mteVar, int i) {
        this.E = i;
        this.F = zb0Var;
        this.G = mteVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        int i = this.E;
        mte mteVar = this.G;
        zb0 zb0Var = this.F;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                bl7 bl7VarF = tpk.f(zb0Var, mteVar.b, iIntValue);
                Iterator it = bl7VarF.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Boolean) bl7VarF.c.invoke(it.next())).booleanValue() == bl7VarF.b) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                gte gteVar = (gte) bnf.W(tpk.f(zb0Var, mteVar.b, iIntValue));
                if (gteVar != null) {
                    return gteVar.d;
                }
                return null;
            case 2:
                bl7 bl7VarF2 = tpk.f(zb0Var, mteVar.b, iIntValue);
                Iterator it2 = bl7VarF2.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((Boolean) bl7VarF2.c.invoke(it2.next())).booleanValue() == bl7VarF2.b) {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                gte gteVar2 = (gte) bnf.W(tpk.f(zb0Var, mteVar.b, iIntValue));
                if (gteVar2 != null) {
                    return gteVar2.d;
                }
                return null;
        }
    }
}
