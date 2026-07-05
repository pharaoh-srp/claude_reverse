package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t3b implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ rz7 H;
    public final /* synthetic */ pz7 I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ bz7 K;
    public final /* synthetic */ rz7 L;
    public final /* synthetic */ bz7 M;
    public final /* synthetic */ pl3 N;
    public final /* synthetic */ mnc O;

    public t3b(List list, String str, boolean z, rz7 rz7Var, pz7 pz7Var, bz7 bz7Var, bz7 bz7Var2, rz7 rz7Var2, bz7 bz7Var3, pl3 pl3Var, mnc mncVar) {
        this.E = list;
        this.F = str;
        this.G = z;
        this.H = rz7Var;
        this.I = pz7Var;
        this.J = bz7Var;
        this.K = bz7Var2;
        this.L = rz7Var2;
        this.M = bz7Var3;
        this.N = pl3Var;
        this.O = mncVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        zy7 zy7Var;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
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
            int i2 = i & 126;
            McpServer mcpServer = (McpServer) this.E.get(iIntValue);
            e18Var.a0(1783929044);
            o3b.E.getClass();
            mcpServer.getClass();
            String strM346getUuidowoRr7k = mcpServer.m346getUuidowoRr7k();
            String str = this.F;
            o3b o3bVar = str == null ? false : McpServerId.m1032equalsimpl0(strM346getUuidowoRr7k, str) ? o3b.G : x44.r(mcpServer.getConnected(), Boolean.TRUE) ? o3b.H : (mcpServer.getConnected() == null && this.G) ? o3b.F : o3b.I;
            String str2 = (String) this.H.invoke(mcpServer, e18Var, 0);
            pz7 pz7Var = (pz7) this.I.invoke(mcpServer, o3bVar);
            int iOrdinal = o3bVar.ordinal();
            lz1 lz1Var = jd4.a;
            zy7 zy7Var2 = null;
            if (iOrdinal == 0) {
                e18Var.a0(1784233927);
                e18Var.p(false);
                zy7Var = null;
            } else {
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    throw ebh.u(e18Var, 1027385113, false);
                }
                e18Var.a0(1784401483);
                bz7 bz7Var = this.J;
                boolean zF = e18Var.f(bz7Var) | e18Var.f(mcpServer);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = new s3b(bz7Var, mcpServer, 0);
                    e18Var.k0(objN);
                }
                zy7Var = (zy7) objN;
                e18Var.p(false);
            }
            bz7 bz7Var2 = this.K;
            if (bz7Var2 != null) {
                e18Var.a0(1784571022);
                boolean zF2 = e18Var.f(bz7Var2) | e18Var.f(mcpServer);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = new s3b(bz7Var2, mcpServer, 1);
                    e18Var.k0(objN2);
                }
                zy7Var2 = (zy7) objN2;
                e18Var.p(false);
            } else {
                e18Var.a0(1784636679);
                e18Var.p(false);
            }
            cpk.b(mcpServer, str2, pz7Var, zy7Var, this.N, b.c((iqb) this.M.invoke(Integer.valueOf(iIntValue)), 1.0f), zy7Var2, (oxf) this.L.invoke(Integer.valueOf(iIntValue), e18Var, Integer.valueOf((i2 >> 3) & 14)), this.O, e18Var, 0);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
