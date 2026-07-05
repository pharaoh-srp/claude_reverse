package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ nwh(String str, pz7 pz7Var) {
        this.E = 8;
        this.G = str;
        this.F = pz7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        Object[] objArr = 0;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                Tool.CustomTool customTool = (Tool.CustomTool) obj3;
                String str = (String) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarB0 = mpk.b0(fqbVar, mpk.Y(e18Var), true);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarB0);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    if (customTool != null) {
                        e18Var.a0(361564654);
                        pwh.c(customTool, e18Var, 0);
                        e18Var.p(false);
                    } else if (str != null) {
                        e18Var.a0(361709021);
                        tjh.b(str, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(361918116);
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                t1i.b((mnc) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 2:
                nwb nwbVar = (nwb) obj3;
                pz7 pz7Var = (pz7) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    Object objN = e18Var2.N();
                    if (objN == jd4.a) {
                        objN = new shf(9, nwbVar);
                        e18Var2.k0(objN);
                    }
                    iqb iqbVarP0 = xn5.p0(fqbVar, (bz7) objN);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarP0);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    sq6.B(0, pz7Var, e18Var2, true);
                }
                break;
            case 3:
                String str2 = (String) obj4;
                List list = (List) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var3, 0);
                    int iHashCode3 = Long.hashCode(e18Var3.T);
                    hyc hycVarL3 = e18Var3.l();
                    iqb iqbVarE3 = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var3);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA2);
                    d4c.i0(e18Var3, cd4.e, hycVarL3);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE3);
                    if (str2 != null) {
                        e18Var3.a0(729492178);
                        tjh.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).j, e18Var3, 0, 0, 131070);
                        grc.z(fqbVar, 4.0f, e18Var3, false);
                    } else {
                        e18Var3.a0(729690144);
                        e18Var3.p(false);
                    }
                    tjh.a(((jm3) gm3.c(e18Var3).e.E).i, fd9.q0(1571299089, new ss2(list), e18Var3), e18Var3, 48);
                    e18Var3.p(true);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                pqi.f((uli) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                rkj.e((UserLocationV0OutputUserLocationResult) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 6:
                j0a j0aVar = (j0a) obj;
                mnc mncVar = (mnc) obj2;
                j0aVar.getClass();
                mncVar.getClass();
                fuk.p(j0aVar, (List) obj3, (bz7) obj4, new hzh(objArr == true ? 1 : 0), mncVar);
                break;
            case 7:
                ((Integer) obj2).getClass();
                wjk.e((ParsedContentBlock$McpToolInvocation) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            default:
                String str3 = (String) obj4;
                pz7 pz7Var2 = (pz7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    nrk.b(str3, pz7Var2, null, tkh.b(((jm3) gm3.c(e18Var4).e.E).e, gm3.a(e18Var4).M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), 0, 8.0f, e18Var4, 196608, 20);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ nwh(Object obj, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = iqbVar;
    }

    public /* synthetic */ nwh(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public /* synthetic */ nwh(String str, List list) {
        this.E = 3;
        this.G = str;
        this.F = list;
    }
}
