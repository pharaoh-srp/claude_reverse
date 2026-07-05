package defpackage;

import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lv2 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ lv2(bpc bpcVar, String str, boolean z, bz7 bz7Var, iqb iqbVar, boolean z2, int i, int i2) {
        this.L = bpcVar;
        this.F = str;
        this.H = z;
        this.M = bz7Var;
        this.G = iqbVar;
        this.I = z2;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.K;
        int i3 = this.J;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        Object obj4 = this.M;
        Object obj5 = this.F;
        Object obj6 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i3 | 1);
                d4c.k((bpc) obj6, (String) obj5, this.H, (bz7) obj4, (iqb) obj3, this.I, (ld4) obj, iP0, this.K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i3 | 1);
                zlk.a((String) obj5, (String) obj6, (iqb) obj3, this.H, this.I, (n3f) obj4, (ld4) obj, iP02, this.K);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                iv4.b((ConwayAppScreen.Extension) obj6, (vs8) obj5, this.H, (bz7) obj4, this.I, this.J, (iqb) obj3, (ld4) obj, iP03);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                y45.b((List) obj6, this.J, this.H, this.I, (zy7) obj4, (i4g) obj3, (String) obj5, (ld4) obj, iP04);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i3 | 1);
                etj.f((PermissionMode) obj6, (String) obj5, (String) obj4, this.H, (zy7) obj3, this.I, (ld4) obj, iP05, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lv2(ConwayAppScreen.Extension extension, vs8 vs8Var, boolean z, bz7 bz7Var, boolean z2, int i, iqb iqbVar, int i2) {
        this.L = extension;
        this.F = vs8Var;
        this.H = z;
        this.M = bz7Var;
        this.I = z2;
        this.J = i;
        this.G = iqbVar;
        this.K = i2;
    }

    public /* synthetic */ lv2(PermissionMode permissionMode, String str, String str2, boolean z, zy7 zy7Var, boolean z2, int i, int i2) {
        this.L = permissionMode;
        this.F = str;
        this.M = str2;
        this.H = z;
        this.G = zy7Var;
        this.I = z2;
        this.J = i;
        this.K = i2;
    }

    public /* synthetic */ lv2(String str, String str2, iqb iqbVar, boolean z, boolean z2, n3f n3fVar, int i, int i2) {
        this.F = str;
        this.L = str2;
        this.G = iqbVar;
        this.H = z;
        this.I = z2;
        this.M = n3fVar;
        this.J = i;
        this.K = i2;
    }

    public /* synthetic */ lv2(List list, int i, boolean z, boolean z2, zy7 zy7Var, i4g i4gVar, String str, int i2) {
        this.L = list;
        this.J = i;
        this.H = z;
        this.I = z2;
        this.M = zy7Var;
        this.G = i4gVar;
        this.F = str;
        this.K = i2;
    }
}
