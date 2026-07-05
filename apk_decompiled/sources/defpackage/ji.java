package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.conway.protocol.ConwaySearchHit;
import com.anthropic.claude.conway.protocol.ModelInfo;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ji implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ji(iqb iqbVar, int i, bz7 bz7Var, wl5 wl5Var, int i2) {
        this.E = 24;
        this.F = iqbVar;
        this.G = i;
        this.H = bz7Var;
        this.I = wl5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.G;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.F;
        Object obj5 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xnk.a((ggc) obj5, (iqb) obj4, (mn5) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qk.c((fk) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gok.d((Set) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(49);
                zp.a(this.G, (zy7) obj5, (bz7) obj4, (rc8) obj3, (ld4) obj, iP0);
                break;
            case 4:
                ((Integer) obj2).getClass();
                zp.b((ol) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                rqk.d((qcc) obj5, (tt) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                x21.b((List) obj5, (qnc) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                bwk.a((iqb) obj4, (fvd) obj5, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                zhk.b((vt6) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                zhk.d((Integer) obj5, (zb0) obj3, (iqb) obj4, (ld4) obj, x44.p0(1), this.G);
                break;
            case 10:
                ((Integer) obj2).getClass();
                xik.a((by2) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                blk.a((ukg) obj5, (q68) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                cmk.c((mxc) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                a.C((ud0) obj5, (String) obj4, (yw8) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                a.A((String) obj5, (i4g) obj4, (z74) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                ah4.d((eyh) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ip4.e((u9d) obj5, (zy7) obj4, (bz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                ip4.b((iqb) obj4, (yo4) obj5, (bz7) obj3, (ld4) obj, x44.p0(1), this.G);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                ip4.a((yo4) obj5, (iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                psk.b((ModelInfo) obj5, (bz7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                psk.c((ModelInfo) obj5, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                vsk.a((ConwaySearchHit) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                d25.a((WebhookRecord) obj5, (rz7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                cvk.e((List) obj5, (bz7) obj4, (znd) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(7);
                cn5.f((iqb) obj4, this.G, (bz7) obj5, (wl5) obj3, (ld4) obj, iP02);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).intValue();
                ou5.c((meh) obj5, (beh) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                csg.d((vx5) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                i56.a((DirectoryServer) obj5, (ek4) obj3, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                h66.n((Notice) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ssj.a((j66) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ji(int i, zy7 zy7Var, bz7 bz7Var, rc8 rc8Var, int i2) {
        this.E = 3;
        this.G = i;
        this.H = zy7Var;
        this.F = bz7Var;
        this.I = rc8Var;
    }

    public /* synthetic */ ji(int i, int i2, iqb iqbVar, Object obj, Object obj2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.F = iqbVar;
        this.G = i;
    }

    public /* synthetic */ ji(iqb iqbVar, yo4 yo4Var, bz7 bz7Var, int i, int i2) {
        this.E = 17;
        this.F = iqbVar;
        this.H = yo4Var;
        this.I = bz7Var;
        this.G = i2;
    }

    public /* synthetic */ ji(iqb iqbVar, fvd fvdVar, ta4 ta4Var, int i) {
        this.E = 7;
        this.F = iqbVar;
        this.H = fvdVar;
        this.I = ta4Var;
        this.G = i;
    }

    public /* synthetic */ ji(u9d u9dVar, zy7 zy7Var, bz7 bz7Var, int i) {
        this.E = 16;
        this.H = u9dVar;
        this.F = zy7Var;
        this.I = bz7Var;
        this.G = i;
    }

    public /* synthetic */ ji(Integer num, zb0 zb0Var, iqb iqbVar, int i, int i2) {
        this.E = 9;
        this.H = num;
        this.I = zb0Var;
        this.F = iqbVar;
        this.G = i2;
    }

    public /* synthetic */ ji(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = obj2;
        this.I = obj3;
        this.G = i;
    }
}
