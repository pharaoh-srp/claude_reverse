package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.chat.input.images.a;
import com.anthropic.claude.tool.ui.chat.f;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bg6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bg6(e1a e1aVar, iqb iqbVar, String str, ta4 ta4Var, int i) {
        this.E = 18;
        this.H = e1aVar;
        this.F = iqbVar;
        this.I = str;
        this.J = ta4Var;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.G;
        Object obj3 = this.H;
        Object obj4 = this.I;
        iei ieiVar = iei.a;
        Object obj5 = this.J;
        Object obj6 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dgj.g((pf6) obj3, (List) obj4, (bz7) obj5, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                pd8.g((n18) obj3, (zy7) obj4, (zy7) obj5, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                tw8.f((ImageGalleryItem) obj3, (String) obj4, (yw8) obj5, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ytk.c((j50) obj3, (String) obj4, (q68) obj5, (e54) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                a.b(this.H, (iqb) obj6, (String) obj4, (String) obj5, (ld4) obj, x44.p0(1), this.G);
                break;
            case 5:
                ((Integer) obj2).getClass();
                mwa.e(this.H, this.I, (m4a) obj6, (bz7) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                fd9.h((vt6) obj3, (zy7) obj4, (zy7) obj5, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                jlk.e((tkh) obj3, (ote) obj4, (iqb) obj6, (ta4) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((dua) obj3).a((cte) obj4, (String) obj5, (String) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                gqk.a((mnc) obj3, (String) obj4, (zy7) obj5, (zy7) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                kpb.e((List) obj4, (String) obj3, (bz7) obj5, (i4g) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                kkc.c((s64) obj3, (List) obj4, (Organization) obj6, (bz7) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                nuj.d((rp6) obj3, (zy7) obj4, (iqb) obj6, (qi3) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                gwj.b((MessageBlobFile) obj3, (ej7) obj4, (zy7) obj5, (rc8) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                jwj.b((MessageDocumentFile) obj3, (ej7) obj4, (zy7) obj5, (hed) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                jwj.a((MessageDocumentFile) obj3, (String) obj4, (hed) obj5, (zy7) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                lwj.j((ej7) obj3, (String) obj4, (String) obj5, (qi3) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                rwj.c((String) obj3, (String) obj4, (zy7) obj5, (e1a) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                rwj.b((e1a) obj3, (iqb) obj6, (String) obj4, (ta4) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                kik.a((gnd) obj3, (List) obj4, (bz7) obj5, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                zqd.a((Experience) obj3, (zy7) obj4, (zy7) obj5, (pz7) obj6, fqb.E, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                f.b((List) obj4, (Map) obj3, (pz7) obj5, (i4g) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                lvk.c((yih) obj3, (String) obj4, (i4g) obj5, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                ovk.c((t53) obj3, (f03) obj4, (t4g) obj5, (i4g) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                rvk.f((f03) obj3, (String) obj4, (t4g) obj5, (i4g) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                xvk.d((iqb) obj6, (ohf) obj3, (bz7) obj5, (ta4) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ac1.c((List) obj4, (bz7) obj5, (i4g) obj3, (iqb) obj6, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((tqh) obj3).u((String) obj4, (wu8) obj5, (zy7) obj6, (ld4) obj, x44.p0(3073), this.G);
                break;
            case 28:
                ((Integer) obj2).getClass();
                cjk.g((o0h) obj3, (ta4) obj4, (iqb) obj6, (ta4) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                cte cteVar = (cte) obj3;
                tkh tkhVar = (tkh) obj4;
                iqb iqbVar = (iqb) obj6;
                rz7 rz7Var = (rz7) obj5;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xe4 xe4Var = ste.a;
                    cteVar.getClass();
                    ((rte) e18Var.j(ste.a)).b.i(tkhVar, fd9.q0(10533588, new rf2(iqbVar, i2, rz7Var), e18Var), e18Var, 48);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ bg6(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.F = obj3;
        this.J = obj4;
        this.G = i;
    }

    public /* synthetic */ bg6(iqb iqbVar, ohf ohfVar, bz7 bz7Var, ta4 ta4Var, int i) {
        this.E = 25;
        this.F = iqbVar;
        this.H = ohfVar;
        this.J = bz7Var;
        this.I = ta4Var;
        this.G = i;
    }

    public /* synthetic */ bg6(cte cteVar, tkh tkhVar, iqb iqbVar, int i, rz7 rz7Var) {
        this.E = 29;
        this.H = cteVar;
        this.I = tkhVar;
        this.F = iqbVar;
        this.G = i;
        this.J = rz7Var;
    }

    public /* synthetic */ bg6(tqh tqhVar, String str, wu8 wu8Var, zy7 zy7Var, int i, int i2) {
        this.E = 27;
        this.H = tqhVar;
        this.I = str;
        this.J = wu8Var;
        this.F = zy7Var;
        this.G = i2;
    }

    public /* synthetic */ bg6(Experience experience, zy7 zy7Var, zy7 zy7Var2, pz7 pz7Var, int i) {
        this.E = 20;
        this.H = experience;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.F = pz7Var;
        this.G = i;
    }

    public /* synthetic */ bg6(Object obj, iqb iqbVar, String str, String str2, int i, int i2) {
        this.E = 4;
        this.H = obj;
        this.F = iqbVar;
        this.I = str;
        this.J = str2;
        this.G = i2;
    }

    public /* synthetic */ bg6(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.F = obj4;
        this.G = i;
    }

    public /* synthetic */ bg6(List list, bz7 bz7Var, i4g i4gVar, iqb iqbVar, int i) {
        this.E = 26;
        this.I = list;
        this.J = bz7Var;
        this.H = i4gVar;
        this.F = iqbVar;
        this.G = i;
    }

    public /* synthetic */ bg6(List list, Object obj, qz7 qz7Var, i4g i4gVar, int i, int i2) {
        this.E = i2;
        this.I = list;
        this.H = obj;
        this.J = qz7Var;
        this.F = i4gVar;
        this.G = i;
    }
}
