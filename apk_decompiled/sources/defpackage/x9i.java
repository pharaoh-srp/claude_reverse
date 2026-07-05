package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x9i extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ aai G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9i(aai aaiVar, int i) {
        super(1);
        this.F = i;
        this.G = aaiVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        aai aaiVar = this.G;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                wk wkVar = aaiVar.a;
                gh3 gh3VarU = iv1.u((txb) wkVar.e, iIntValue);
                boolean z = gh3VarU.c;
                r06 r06Var = (r06) wkVar.d;
                if (!z) {
                    return kxk.u(r06Var.b, gh3VarU);
                }
                bh3 bh3Var = r06Var.t;
                Set set = bh3.c;
                return bh3Var.a(gh3VarU, null);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                wk wkVar2 = aaiVar.a;
                gh3 gh3VarU2 = iv1.u((txb) wkVar2.e, iIntValue2);
                if (gh3VarU2.c) {
                    return null;
                }
                tqb tqbVar = ((r06) wkVar2.d).b;
                tqbVar.getClass();
                xh3 xh3VarU = kxk.u(tqbVar, gh3VarU2);
                if (xh3VarU instanceof q16) {
                    return (q16) xh3VarU;
                }
                return null;
        }
    }
}
