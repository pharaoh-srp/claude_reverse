package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class u8h implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;

    public /* synthetic */ u8h(List list, int i) {
        this.E = i;
        this.F = list;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        List list = this.F;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var.T();
                } else {
                    b9h b9hVar = (b9h) list.get(iIntValue);
                    e18Var.a0(-1332221092);
                    w8h.a(b9hVar, px9.a(px9Var, fqb.E, null, null, 2), e18Var, 0);
                    e18Var.p(false);
                }
                break;
            case 1:
                px9 px9Var2 = (px9) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((e18) ld4Var2).f(px9Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((e18) ld4Var2).d(iIntValue3) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    cpc cpcVar = (cpc) list.get(iIntValue3);
                    e18Var2.a0(1470716574);
                    String str = (String) cpcVar.E;
                    JsonElement jsonElement = (JsonElement) cpcVar.F;
                    fqb fqbVar = fqb.E;
                    iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, 0, 0, 131066);
                    kxk.g(e18Var2, b.e(fqbVar, 2.0f));
                    tjh.b(jsonElement instanceof JsonPrimitive ? ((JsonPrimitive) jsonElement).getContent() : jsonElement.toString(), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).c, e18Var2, 0, 0, 131066);
                    e18Var2.p(true);
                    e18Var2.p(false);
                }
                break;
            default:
                px9 px9Var3 = (px9) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((e18) ld4Var3).f(px9Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= ((e18) ld4Var3).d(iIntValue5) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var3.T();
                } else {
                    spf spfVar = (spf) list.get(iIntValue5);
                    e18Var3.a0(-1275943349);
                    boolean z = spfVar instanceof xdh;
                    fqb fqbVar2 = fqb.E;
                    if (z) {
                        e18Var3.a0(-1275879645);
                        tjh.b(((xdh) spfVar).a, gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), gm3.a(e18Var3).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var3).e.F).c, e18Var3, 48, 0, 131064);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-1275513101);
                        tjh.b(d4c.k0(R.string.ccr_tool_content_type, new Object[]{spfVar.getType()}, e18Var3), gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var3).e.F).c, e18Var3, 48, 0, 131064);
                        e18Var3.p(false);
                    }
                    e18Var3.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
