package defpackage;

import com.anthropic.claude.api.kyc.KycStatusResponse;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.sessions.types.GitHubBranch;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pg1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ pg1(iqb iqbVar, mag magVar, boolean z, zub zubVar, ta4 ta4Var, rz7 rz7Var, int i) {
        this.E = 11;
        this.H = iqbVar;
        this.I = magVar;
        this.F = z;
        this.J = zubVar;
        this.L = ta4Var;
        this.K = rz7Var;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                dwk.c((u9d) obj7, (l2i) obj6, (l45) obj5, this.F, (nwb) obj4, (ta4) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                jwk.p(this.F, (y49) obj7, (pl3) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iP03 = x44.p0(i2 | 1);
                xzk.f((s64) obj7, (zy7) obj6, this.F, (ovg) obj5, (KycStatusResponse) obj4, (String) obj3, (ld4) obj, iP03);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                pj2.b((ChartDisplayV0Input) obj7, (iqb) obj6, (qi3) obj5, (fk0) obj4, (x89) obj3, this.F, (ld4) obj, iP04);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                ckk.b(this.F, (wrh) obj7, (iqb) obj6, (ce3) obj5, (ksg) obj4, (ksg) obj3, (ld4) obj, iP05);
                break;
            case 5:
                ((Integer) obj2).intValue();
                int iP06 = x44.p0(i2 | 1);
                a.d((bx1) obj7, (i4g) obj6, (GitHubBranch) obj5, (bz7) obj4, (x0a) obj3, this.F, (ld4) obj, iP06);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP07 = x44.p0(i2 | 1);
                wi4.e((DirectoryServer) obj7, (ek4) obj6, this.F, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, iP07);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iP08 = x44.p0(i2 | 1);
                ip4.c((String) obj7, this.F, (yo4) obj6, (iqb) obj5, (rz7) obj4, (zy7) obj3, (ld4) obj, iP08);
                break;
            case 8:
                ((Integer) obj2).intValue();
                int iP09 = x44.p0(i2 | 1);
                vuk.b((String) obj7, (bz7) obj6, (String) obj5, (bz7) obj4, this.F, (i4g) obj3, (ld4) obj, iP09);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iP010 = x44.p0(i2 | 1);
                pd8.c((n18) obj7, this.F, (bz7) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, iP010);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iP011 = x44.p0(i2 | 1);
                jpi.c((ud0) obj7, (String) obj6, (String) obj5, this.F, (zy7) obj4, (iqb) obj3, (ld4) obj, iP011);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int iP012 = x44.p0(i2 | 1);
                lag.d((iqb) obj7, (mag) obj6, this.F, (zub) obj5, (ta4) obj3, (rz7) obj4, (ld4) obj, iP012);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP013 = x44.p0(i2 | 1);
                ((dxh) obj7).b((String) obj6, (dlb) obj5, this.F, (e5h) obj4, (iqb) obj3, (ld4) obj, iP013);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pg1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
        this.F = z;
        this.G = i;
    }

    public /* synthetic */ pg1(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.F = z;
        this.K = obj4;
        this.L = obj5;
        this.G = i;
    }

    public /* synthetic */ pg1(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.F = z;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
        this.G = i;
    }

    public /* synthetic */ pg1(Object obj, boolean z, Object obj2, Object obj3, qz7 qz7Var, Object obj4, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = z;
        this.I = obj2;
        this.J = obj3;
        this.K = qz7Var;
        this.L = obj4;
        this.G = i;
    }

    public /* synthetic */ pg1(String str, bz7 bz7Var, String str2, bz7 bz7Var2, boolean z, i4g i4gVar, int i) {
        this.E = 8;
        this.H = str;
        this.I = bz7Var;
        this.J = str2;
        this.K = bz7Var2;
        this.F = z;
        this.L = i4gVar;
        this.G = i;
    }

    public /* synthetic */ pg1(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
        this.G = i;
    }
}
