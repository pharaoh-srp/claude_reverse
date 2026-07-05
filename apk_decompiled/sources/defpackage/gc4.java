package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gc4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ SttSupportedLanguage F;

    public /* synthetic */ gc4(SttSupportedLanguage sttSupportedLanguage, int i) {
        this.E = i;
        this.F = sttSupportedLanguage;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        SttSupportedLanguage sttSupportedLanguage = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarC = b.c(gb9.K(fqbVar, 16.0f, 14.0f), 1.0f);
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarC);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var, z80Var, cxeVarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var, z80Var4, iqbVarE);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    tjh.b(d4c.j0(R.string.stt_eduction_language_label, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                    kxk.g(e18Var, b.e(fqbVar, 8.0f));
                    tjh.b(sttSupportedLanguage.getDisplay_name(), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 131066);
                    e18Var.p(true);
                    kxk.g(e18Var, new hw9(1.0f, true));
                    iv1.b(ud0.B, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
                    e18Var.p(true);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(sttSupportedLanguage.getDisplay_name(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 262142);
                }
                break;
        }
        return ieiVar;
    }
}
