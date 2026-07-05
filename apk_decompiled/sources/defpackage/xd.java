package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.conway.HeartbeatRecord;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.bell.c;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xd implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ xd(ml3 ml3Var, g77 g77Var, String str, int i, zy7 zy7Var) {
        this.E = 16;
        this.H = ml3Var;
        this.F = g77Var;
        this.I = str;
        this.G = i;
        this.J = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = 9;
        int i3 = this.G;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.F;
        iei ieiVar = iei.a;
        Object obj6 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ae.a((McpServer) obj6, (bz7) obj5, (bz7) obj4, (i4g) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qk.d((fk) obj6, (String) obj4, (bz7) obj5, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gok.e((SessionResource) obj6, (c69) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                gok.a((ml3) obj6, (bz7) obj5, (iqb) obj4, (ep) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                zsk.a((rvh) obj6, (mr0) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ur0.c((String) obj6, (tkh) obj5, (iqb) obj4, (clh) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ouk.b((bpc) obj6, (String) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(9), this.G);
                break;
            case 7:
                ((Integer) obj2).getClass();
                dwk.d((l2i) obj6, (nwb) obj5, (iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                c.a((mj1) obj6, (t4g) obj5, (pl3) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                es1.b((zb0) obj6, (rz7) obj5, (iqb) obj4, (mnc) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                stj.b((dq8) obj6, (m3f) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                nuj.b((i) obj6, (bz7) obj5, (i4g) obj3, (iqb) obj4, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                gik.a((Set) obj6, (zy7) obj5, (zy7) obj4, (ah2) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                wjk.b((String) obj6, this.G, (zy7) obj5, (iqb) obj4, (db3) obj3, (ld4) obj, x44.p0(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                dlk.b((r64) obj6, (ukg) obj5, (vm3) obj4, (q68) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).intValue();
                a.v((String) obj6, (bz7) obj5, (i4g) obj3, (zy7) obj4, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 16:
                ml3 ml3Var = (ml3) obj6;
                q2i q2iVar = (q2i) obj5;
                String strN = (String) obj4;
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    if (strN == null) {
                        strN = vb7.n(e18Var, 1066346390, i3, e18Var, false);
                    } else {
                        e18Var.a0(1066346111);
                        e18Var.p(false);
                    }
                    iqb iqbVarC = b.c(fqb.E, 1.0f);
                    ta4 ta4VarQ0 = fd9.q0(-310418468, new tu(i2, zy7Var), e18Var);
                    int i4 = ml3.f;
                    e.b(ml3Var, q2iVar, strN, iqbVarC, null, ta4VarQ0, e18Var, 199680);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                lnk.e((String) obj6, (String) obj5, (ud0) obj4, (zy7) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                ((ta4) obj6).h(this.F, this.I, this.J, (ld4) obj, x44.p0(i3) | 1);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                ug4.e((eyh) obj6, (bz7) obj5, (pl3) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                aqk.a((List) obj6, (String) obj5, (zy7) obj4, (String) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ip4.d((u9d) obj6, (zy7) obj4, (yo4) obj3, (bz7) obj5, (ld4) obj, x44.p0(i3 | 1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                zrk.a((ir4) obj6, (String) obj4, (bz7) obj5, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                kr4.c((List) obj6, (ConwayAppScreen.Extension) obj4, (bz7) obj5, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i3 | 1);
                ((rt4) obj6).a(iP0, (ld4) obj, (zy7) obj4, (zy7) obj3, (iqb) obj5);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                hsk.c((List) obj6, (bz7) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                osk.c((String) obj6, (String) obj5, (String) obj4, (zy7) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ssk.a((HeartbeatRecord) obj6, (bz7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((fu5) obj6).d((bf3) obj4, (qbd) obj3, (bz7) obj5, (ld4) obj, x44.p0(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                h66.d((Notice) obj6, (zy7) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i3 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xd(fu5 fu5Var, bf3 bf3Var, qbd qbdVar, bz7 bz7Var, int i) {
        this.E = 28;
        this.H = fu5Var;
        this.I = bf3Var;
        this.J = qbdVar;
        this.F = bz7Var;
        this.G = i;
    }

    public /* synthetic */ xd(bpc bpcVar, String str, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = 6;
        this.H = bpcVar;
        this.F = str;
        this.I = zy7Var;
        this.J = iqbVar;
        this.G = i2;
    }

    public /* synthetic */ xd(u9d u9dVar, zy7 zy7Var, yo4 yo4Var, bz7 bz7Var, int i) {
        this.E = 21;
        this.H = u9dVar;
        this.I = zy7Var;
        this.J = yo4Var;
        this.F = bz7Var;
        this.G = i;
    }

    public /* synthetic */ xd(Object obj, bz7 bz7Var, i4g i4gVar, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = bz7Var;
        this.J = i4gVar;
        this.I = obj2;
        this.G = i;
    }

    public /* synthetic */ xd(Object obj, Object obj2, bz7 bz7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.F = bz7Var;
        this.J = iqbVar;
        this.G = i;
    }

    public /* synthetic */ xd(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = obj2;
        this.I = obj3;
        this.J = obj4;
        this.G = i;
    }

    public /* synthetic */ xd(String str, int i, zy7 zy7Var, iqb iqbVar, db3 db3Var, int i2) {
        this.E = 13;
        this.H = str;
        this.G = i;
        this.F = zy7Var;
        this.I = iqbVar;
        this.J = db3Var;
    }
}
