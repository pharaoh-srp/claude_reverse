package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bc2 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ pz7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ bc2(hcb hcbVar, boolean z, boolean z2, pl3 pl3Var, bz7 bz7Var, zy7 zy7Var, String str, qi3 qi3Var, MemorySynthesisResponse memorySynthesisResponse, boolean z3, pz7 pz7Var, nwb nwbVar) {
        this.J = hcbVar;
        this.F = z;
        this.G = z2;
        this.K = pl3Var;
        this.L = bz7Var;
        this.M = zy7Var;
        this.N = str;
        this.O = qi3Var;
        this.P = memorySynthesisResponse;
        this.H = z3;
        this.I = pz7Var;
        this.Q = nwbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MemorySynthesisResponse memorySynthesisResponse;
        boolean z;
        boolean z2;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.Q;
        Object obj5 = this.P;
        Object obj6 = this.O;
        Object obj7 = this.N;
        qz7 qz7Var = this.M;
        Object obj8 = this.L;
        Object obj9 = this.K;
        Object obj10 = this.J;
        switch (i) {
            case 0:
                hcb hcbVar = (hcb) obj10;
                pl3 pl3Var = (pl3) obj9;
                bz7 bz7Var = (bz7) obj8;
                zy7 zy7Var = (zy7) qz7Var;
                String str = (String) obj7;
                qi3 qi3Var = (qi3) obj6;
                MemorySynthesisResponse memorySynthesisResponse2 = (MemorySynthesisResponse) obj5;
                nwb nwbVar = (nwb) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                boolean z3 = (iIntValue & 17) != 16;
                int i2 = iIntValue & 1;
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(i2, z3)) {
                    boolean z4 = this.F;
                    if (!z4 || this.G) {
                        memorySynthesisResponse = memorySynthesisResponse2;
                        z = false;
                    } else {
                        memorySynthesisResponse = memorySynthesisResponse2;
                        z = true;
                    }
                    boolean zD = e18Var.d(hcbVar.ordinal()) | e18Var.f(bz7Var);
                    Object objN = e18Var.N();
                    if (zD || objN == jd4.a) {
                        objN = new l6(hcbVar, bz7Var, nwbVar, 13);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var2 = (bz7) objN;
                    MemorySynthesisResponse memorySynthesisResponse3 = memorySynthesisResponse;
                    lwj.f(hcbVar, z, pl3Var, bz7Var2, e18Var, 0);
                    if (z4) {
                        e18Var.a0(705536405);
                        int iOrdinal = hcbVar.ordinal();
                        if (iOrdinal == 0) {
                            z2 = false;
                            e18Var.a0(-1916901722);
                            if (zy7Var != null) {
                                e18Var.a0(705615455);
                                lwj.c(zy7Var, null, e18Var, 0);
                                e18Var.p(false);
                            } else {
                                e18Var.a0(705710811);
                                lwj.e(str, qi3Var, null, e18Var, 0);
                                e18Var.p(false);
                            }
                            e18Var.p(false);
                        } else if (iOrdinal == 1) {
                            z2 = false;
                            e18Var.a0(-1916893359);
                            lwj.h(memorySynthesisResponse3, this.H, this.I, e18Var, 0);
                            e18Var.p(false);
                        } else {
                            if (iOrdinal != 2) {
                                throw ebh.u(e18Var, -1916903411, false);
                            }
                            e18Var.a0(-1916885011);
                            z2 = false;
                            e18Var.p(false);
                        }
                        e18Var.p(z2);
                    } else {
                        e18Var.a0(706164186);
                        tjh.b(d4c.j0(R.string.tool_setting_disabled_by_organization, e18Var), gb9.I(fqb.E, qf2.a), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            default:
                cjh cjhVar = (cjh) obj10;
                pzi pziVar = (pzi) obj9;
                zub zubVar = (zub) obj8;
                pz7 pz7Var = (pz7) qz7Var;
                pz7 pz7Var2 = (pz7) obj7;
                pz7 pz7Var3 = (pz7) obj6;
                ffh ffhVar = (ffh) obj5;
                e0g e0gVar = (e0g) obj4;
                pz7 pz7Var4 = (pz7) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).h(pz7Var4) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    k2e k2eVar = k2e.K;
                    String str2 = cjhVar.a.F;
                    boolean z5 = this.F;
                    boolean z6 = this.H;
                    k2eVar.n(str2, pz7Var4, z5, this.G, pziVar, zubVar, z6, this.I, pz7Var, null, null, pz7Var2, pz7Var3, ffhVar, null, fd9.q0(1409265477, new iw0(z5, z6, zubVar, ffhVar, e0gVar), e18Var2), e18Var2, (iIntValue2 << 3) & 112);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ bc2(cjh cjhVar, boolean z, boolean z2, pzi pziVar, zub zubVar, boolean z3, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4, ffh ffhVar, e0g e0gVar) {
        this.J = cjhVar;
        this.F = z;
        this.G = z2;
        this.K = pziVar;
        this.L = zubVar;
        this.H = z3;
        this.I = pz7Var;
        this.M = pz7Var2;
        this.N = pz7Var3;
        this.O = pz7Var4;
        this.P = ffhVar;
        this.Q = e0gVar;
    }
}
