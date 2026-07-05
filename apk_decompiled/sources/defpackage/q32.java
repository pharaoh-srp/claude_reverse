package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q32 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ q32(lod lodVar, boolean z, znd zndVar, boolean z2, int i) {
        this.E = 8;
        this.H = lodVar;
        this.F = z;
        this.I = zndVar;
        this.G = z2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        boolean z = this.G;
        boolean z2 = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nuj.a(this.F, this.G, (String) obj4, (iqb) obj3, (ld4) obj, x44.p0(3073));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ns2.b((ChatFeedbackType) obj4, (bz7) obj3, this.F, this.G, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gmk.a((List) obj4, this.F, this.G, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                l9g l9gVar = (l9g) obj3;
                String str = (String) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else if (l9gVar != null) {
                    e18Var.a0(-2115136178);
                    qvj.b(l9gVar, null, e18Var, 0);
                    e18Var.p(false);
                } else if (!z2) {
                    e18Var.a0(-2115126669);
                    if (str == null) {
                        str = "";
                    }
                    npf.d(str, null, e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-2115133297);
                    boolean z3 = !z;
                    if (str == null) {
                        str = "";
                    }
                    npf.e(z3, str, null, e18Var, 0);
                    e18Var.p(false);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                d25.c((e25) obj4, this.F, this.G, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                cvk.i((String) obj4, this.F, this.G, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 6:
                String str2 = (String) obj4;
                wl5 wl5Var = (wl5) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    Object objN = e18Var2.N();
                    if (objN == jd4.a) {
                        objN = new qy4(9);
                        e18Var2.k0(objN);
                    }
                    iqb iqbVarA = tjf.a(fqbVar, (bz7) objN);
                    wl5Var.getClass();
                    tjh.b(str2, iqbVarA, ((d54) f8g.a(z ? wl5Var.j : z2 ? wl5Var.i : wl5Var.g, u00.P(asb.G, e18Var2), null, e18Var2, 0, 12).getValue()).a, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 261112);
                    e18Var2.p(true);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ksk.b((HealthConnectQueryV0Input) obj4, this.F, this.G, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                qik.d((lod) obj4, this.F, (znd) obj3, this.G, (ld4) obj, x44.p0(513));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ q32(l9g l9gVar, boolean z, boolean z2, String str) {
        this.E = 3;
        this.I = l9gVar;
        this.F = z;
        this.G = z2;
        this.H = str;
    }

    public /* synthetic */ q32(ChatFeedbackType chatFeedbackType, bz7 bz7Var, boolean z, boolean z2, int i) {
        this.E = 1;
        this.H = chatFeedbackType;
        this.I = bz7Var;
        this.F = z;
        this.G = z2;
    }

    public /* synthetic */ q32(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = z;
        this.G = z2;
        this.I = obj2;
    }

    public /* synthetic */ q32(String str, wl5 wl5Var, boolean z, boolean z2) {
        this.E = 6;
        this.H = str;
        this.I = wl5Var;
        this.F = z;
        this.G = z2;
    }

    public /* synthetic */ q32(boolean z, boolean z2, String str, iqb iqbVar, int i) {
        this.E = 0;
        this.F = z;
        this.G = z2;
        this.H = str;
        this.I = iqbVar;
    }
}
