package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mg6 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ qz7 K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;

    public /* synthetic */ mg6(List list, Object obj, Object obj2, Object obj3, Object obj4, qz7 qz7Var, qz7 qz7Var2, Object obj5, int i) {
        this.E = i;
        this.F = list;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = qz7Var;
        this.L = qz7Var2;
        this.M = obj5;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        zy7 zy7Var;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.M;
        qz7 qz7Var = this.L;
        qz7 qz7Var2 = this.K;
        Object obj6 = this.H;
        List list = this.F;
        Object obj7 = this.G;
        Object obj8 = this.I;
        Object obj9 = this.J;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((e18) ld4Var).f(px9Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var.T();
                } else {
                    rf6 rf6Var = (rf6) list.get(iIntValue);
                    e18Var.a0(-718381840);
                    boolean zContains = ((Set) obj7).contains(ho8.d(rf6Var.a));
                    zy7 zy7Var2 = (zy7) ((Map) obj6).get(rf6Var.a);
                    if (zy7Var2 == null) {
                        zy7Var2 = dgj.b;
                    }
                    dgj.f(px9Var, rf6Var, zContains, zy7Var2, (ag6) obj8, false, null, (che) obj9, (m63) qz7Var2, (dg8) qz7Var, (ow1) obj5, null, e18Var, (i2 & 14) | 1769472);
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
                    rf6 rf6Var2 = (rf6) list.get(iIntValue3);
                    e18Var2.a0(1919477168);
                    boolean zContains2 = ((Set) obj7).contains(ho8.d(rf6Var2.a));
                    zy7 zy7Var3 = (zy7) ((Map) obj6).get(rf6Var2.a);
                    if (zy7Var3 == null) {
                        zy7Var3 = dgj.b;
                    }
                    dgj.f(px9Var2, rf6Var2, zContains2, zy7Var3, (ag6) obj8, true, null, (che) obj9, (m63) qz7Var2, (dg8) qz7Var, (ow1) obj5, null, e18Var2, (i3 & 14) | 1769472);
                    e18Var2.p(false);
                }
                break;
            default:
                px9 px9Var3 = (px9) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                nwb nwbVar = (nwb) obj9;
                bz7 bz7Var = (bz7) obj8;
                McpServer mcpServer = (McpServer) obj7;
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((e18) ld4Var3).f(px9Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= ((e18) ld4Var3).d(iIntValue5) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var3.T();
                } else {
                    int i5 = i4 & 126;
                    McpTool mcpTool = (McpTool) ((ArrayList) list).get(iIntValue5);
                    e18Var3.a0(68414310);
                    String iconUrl = mcpServer.getIconUrl();
                    String name = mcpServer.getName();
                    z4b z4bVar = (z4b) ((bz7) obj6).invoke(mcpTool);
                    lz1 lz1Var = jd4.a;
                    if (bz7Var == null) {
                        e18Var3.a0(68664230);
                        e18Var3.p(false);
                        zy7Var = null;
                    } else {
                        e18Var3.a0(68664231);
                        boolean zF = e18Var3.f(bz7Var) | e18Var3.f(mcpTool);
                        Object objN = e18Var3.N();
                        if (zF || objN == lz1Var) {
                            objN = new p4(bz7Var, 25, mcpTool);
                            e18Var3.k0(objN);
                        }
                        zy7Var = (zy7) objN;
                        e18Var3.p(false);
                    }
                    if (zy7Var == null) {
                        e18Var3.a0(68716621);
                        boolean zF2 = e18Var3.f(nwbVar) | e18Var3.f(mcpTool);
                        Object objN2 = e18Var3.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new p4(mcpTool, 26, nwbVar);
                            e18Var3.k0(objN2);
                        }
                        zy7Var = (zy7) objN2;
                    } else {
                        e18Var3.a0(-136332682);
                    }
                    e18Var3.p(false);
                    jpk.c(mcpTool, iconUrl, name, z4bVar, zy7Var, ybi.p(b.c((iqb) ((bz7) qz7Var2).invoke(Integer.valueOf(iIntValue5)), 1.0f), (oxf) ((rz7) qz7Var).invoke(Integer.valueOf(iIntValue5), e18Var3, Integer.valueOf((i5 >> 3) & 14))), (mnc) obj5, e18Var3, 0);
                    e18Var3.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
