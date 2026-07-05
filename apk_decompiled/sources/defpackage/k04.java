package defpackage;

import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.code.remote.e;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k04 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ k04(zy7 zy7Var, py8 py8Var, String str, iqb iqbVar, boolean z, int i, int i2) {
        this.E = 4;
        this.I = zy7Var;
        this.J = py8Var;
        this.K = str;
        this.F = iqbVar;
        this.G = z;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.H;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(385);
                e.h((vsf) obj6, (oz3) obj5, this.G, (iqb) obj3, (mnc) obj4, (ld4) obj, iP0, this.H);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                opk.b((LocalDate) obj6, (bz7) obj5, (String) obj4, (iqb) obj3, this.G, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                spk.a((ek4) obj6, this.G, (zy7) obj5, (iqb) obj3, (ta4) obj4, (ld4) obj, iP03);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                d25.b((WebhookRecord) obj6, this.G, (bz7) obj5, (rz7) obj3, (zy7) obj4, (ld4) obj, iP04);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(1);
                cn5.h((zy7) obj6, (py8) obj5, (String) obj4, (iqb) obj3, this.G, (ld4) obj, iP05, this.H);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                jvk.a(this.G, (zy7) obj6, (zy7) obj5, (qi3) obj3, (u2a) obj4, (ld4) obj, iP06);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP07 = x44.p0(i2 | 1);
                dpk.d((z4b) obj6, this.G, (zy7) obj5, (mnc) obj4, (iqb) obj3, (ld4) obj, iP07);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP08 = x44.p0(i2 | 1);
                foi.d((String) obj6, (String) obj5, this.G, (zy7) obj4, (iqb) obj3, (ld4) obj, iP08);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ k04(z4b z4bVar, boolean z, zy7 zy7Var, mnc mncVar, iqb iqbVar, int i) {
        this.E = 6;
        this.I = z4bVar;
        this.G = z;
        this.J = zy7Var;
        this.K = mncVar;
        this.F = iqbVar;
        this.H = i;
    }

    public /* synthetic */ k04(vsf vsfVar, oz3 oz3Var, boolean z, iqb iqbVar, mnc mncVar, int i, int i2) {
        this.E = 0;
        this.I = vsfVar;
        this.J = oz3Var;
        this.G = z;
        this.F = iqbVar;
        this.K = mncVar;
        this.H = i2;
    }

    public /* synthetic */ k04(Object obj, boolean z, qz7 qz7Var, Object obj2, qz7 qz7Var2, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.G = z;
        this.J = qz7Var;
        this.F = obj2;
        this.K = qz7Var2;
        this.H = i;
    }

    public /* synthetic */ k04(String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, int i) {
        this.E = 7;
        this.I = str;
        this.J = str2;
        this.G = z;
        this.K = zy7Var;
        this.F = iqbVar;
        this.H = i;
    }

    public /* synthetic */ k04(LocalDate localDate, bz7 bz7Var, String str, iqb iqbVar, boolean z, int i) {
        this.E = 1;
        this.I = localDate;
        this.J = bz7Var;
        this.K = str;
        this.F = iqbVar;
        this.G = z;
        this.H = i;
    }

    public /* synthetic */ k04(boolean z, zy7 zy7Var, zy7 zy7Var2, qi3 qi3Var, u2a u2aVar, int i) {
        this.E = 5;
        this.G = z;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.F = qi3Var;
        this.K = u2aVar;
        this.H = i;
    }
}
