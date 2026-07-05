package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lp implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ lp(List list, bz7 bz7Var, qz7 qz7Var, int i) {
        this.E = i;
        this.F = list;
        this.G = bz7Var;
        this.H = qz7Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        mnc mncVar = (mnc) this.H;
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            List list = (List) this.F.get(iIntValue);
            e18Var.a0(519891275);
            String str = (String) w44.O0(0, list);
            if (str != null) {
                e18Var.a0(519946051);
                String str2 = 1 < list.size() ? list.get(1) : "–";
                fqb fqbVar = fqb.E;
                ouk.d(0, e18Var, gb9.I(b.c(fqbVar, 1.0f), mncVar), str, (String) str2);
                if (iIntValue < ((List) this.G).size() - 1) {
                    e18Var.a0(520233607);
                    iuj.e(gb9.I(b.c(fqbVar, 1.0f), mncVar), 0.5f, gm3.a(e18Var).v, e18Var, 48, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(520500238);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else {
                e18Var.a0(520510158);
                e18Var.p(false);
            }
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Throwable] */
    @Override // defpackage.sz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 3196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ lp(List list, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = list;
        this.H = obj;
        this.G = obj2;
    }
}
