package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x63 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lsc F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ gj1 H;
    public final /* synthetic */ pl3 I;
    public final /* synthetic */ rwe J;
    public final /* synthetic */ t4g K;
    public final /* synthetic */ isc L;
    public final /* synthetic */ hw2 M;
    public final /* synthetic */ z09 N;
    public final /* synthetic */ nwb O;
    public final /* synthetic */ zy7 P;
    public final /* synthetic */ zy7 Q;
    public final /* synthetic */ fk0 R;
    public final /* synthetic */ nwb S;
    public final /* synthetic */ rwe T;
    public final /* synthetic */ t4g U;
    public final /* synthetic */ zy7 V;
    public final /* synthetic */ l45 W;
    public final /* synthetic */ bt7 X;
    public final /* synthetic */ j9f Y;
    public final /* synthetic */ lvh Z;
    public final /* synthetic */ nwb a0;
    public final /* synthetic */ nwb b0;

    public /* synthetic */ x63(lsc lscVar, t53 t53Var, gj1 gj1Var, pl3 pl3Var, rwe rweVar, t4g t4gVar, isc iscVar, hw2 hw2Var, z09 z09Var, nwb nwbVar, zy7 zy7Var, zy7 zy7Var2, fk0 fk0Var, nwb nwbVar2, rwe rweVar2, t4g t4gVar2, zy7 zy7Var3, l45 l45Var, bt7 bt7Var, j9f j9fVar, lvh lvhVar, nwb nwbVar3, nwb nwbVar4, int i) {
        this.E = i;
        this.F = lscVar;
        this.G = t53Var;
        this.H = gj1Var;
        this.I = pl3Var;
        this.J = rweVar;
        this.K = t4gVar;
        this.L = iscVar;
        this.M = hw2Var;
        this.N = z09Var;
        this.O = nwbVar;
        this.P = zy7Var;
        this.Q = zy7Var2;
        this.R = fk0Var;
        this.S = nwbVar2;
        this.T = rweVar2;
        this.U = t4gVar2;
        this.V = zy7Var3;
        this.W = l45Var;
        this.X = bt7Var;
        this.Y = j9fVar;
        this.Z = lvhVar;
        this.a0 = nwbVar3;
        this.b0 = nwbVar4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xn5.R("chat.input.bottom_sheet", null, fd9.q0(797994062, new x63(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, 1), e18Var), e18Var, 3126);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    Object objN = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = new ml0(2, null, 1);
                        e18Var2.k0(objN);
                    }
                    fd9.i(e18Var2, (pz7) objN, ieiVar);
                    Object objN2 = e18Var2.N();
                    final t53 t53Var = this.G;
                    if (objN2 == lz1Var) {
                        objN2 = mpk.w(new t43(t53Var, 2));
                        e18Var2.k0(objN2);
                    }
                    final wlg wlgVar = (wlg) objN2;
                    Object objN3 = e18Var2.N();
                    if (objN3 == lz1Var) {
                        objN3 = mpk.w(new i33(t53Var, 8));
                        e18Var2.k0(objN3);
                    }
                    final wlg wlgVar2 = (wlg) objN3;
                    final String strJ0 = d4c.j0(R.string.continue_prompt, e18Var2);
                    final boolean z = this.F.getValue() != null;
                    fx2 fx2VarL0 = t53Var.L0();
                    fx2 fx2Var = fx2VarL0 != null ? fx2VarL0 : null;
                    Object objN4 = e18Var2.N();
                    if (objN4 == lz1Var) {
                        objN4 = new a73(3);
                        e18Var2.k0(objN4);
                    }
                    bz7 bz7Var = (bz7) objN4;
                    Object objN5 = e18Var2.N();
                    if (objN5 == lz1Var) {
                        objN5 = new a73(4);
                        e18Var2.k0(objN5);
                    }
                    final gj1 gj1Var = this.H;
                    final pl3 pl3Var = this.I;
                    final rwe rweVar = this.J;
                    final t4g t4gVar = this.K;
                    final isc iscVar = this.L;
                    final hw2 hw2Var = this.M;
                    final z09 z09Var = this.N;
                    final nwb nwbVar = this.O;
                    final zy7 zy7Var = this.P;
                    final zy7 zy7Var2 = this.Q;
                    final fk0 fk0Var = this.R;
                    final nwb nwbVar2 = this.S;
                    final rwe rweVar2 = this.T;
                    final t4g t4gVar2 = this.U;
                    final zy7 zy7Var3 = this.V;
                    final l45 l45Var = this.W;
                    final bt7 bt7Var = this.X;
                    final j9f j9fVar = this.Y;
                    final lvh lvhVar = this.Z;
                    final nwb nwbVar3 = this.a0;
                    final nwb nwbVar4 = this.b0;
                    xn5.G(fx2Var, null, bz7Var, null, "chat input ↔ voice controls", (bz7) objN5, fd9.q0(-237194783, new sz7() { // from class: h73
                        /* JADX WARN: Removed duplicated region for block: B:145:0x03d2  */
                        /* JADX WARN: Removed duplicated region for block: B:195:0x053f  */
                        /* JADX WARN: Removed duplicated region for block: B:201:0x0577  */
                        /* JADX WARN: Removed duplicated region for block: B:204:0x0593  */
                        /* JADX WARN: Removed duplicated region for block: B:205:0x05ad  */
                        /* JADX WARN: Removed duplicated region for block: B:208:0x05bf  */
                        /* JADX WARN: Removed duplicated region for block: B:211:0x05d4  */
                        /* JADX WARN: Removed duplicated region for block: B:220:0x0616  */
                        /* JADX WARN: Removed duplicated region for block: B:224:0x0630  */
                        /* JADX WARN: Removed duplicated region for block: B:228:0x064c  */
                        /* JADX WARN: Removed duplicated region for block: B:232:0x066b  */
                        /* JADX WARN: Removed duplicated region for block: B:236:0x0697  */
                        /* JADX WARN: Removed duplicated region for block: B:240:0x06b5  */
                        /* JADX WARN: Removed duplicated region for block: B:246:0x06d0  */
                        /* JADX WARN: Removed duplicated region for block: B:250:0x06f3  */
                        /* JADX WARN: Removed duplicated region for block: B:254:0x0718  */
                        /* JADX WARN: Removed duplicated region for block: B:258:0x0736  */
                        /* JADX WARN: Removed duplicated region for block: B:262:0x0750  */
                        /* JADX WARN: Removed duplicated region for block: B:268:0x0780  */
                        /* JADX WARN: Removed duplicated region for block: B:272:0x07a2  */
                        /* JADX WARN: Removed duplicated region for block: B:276:0x07c4  */
                        /* JADX WARN: Removed duplicated region for block: B:296:0x08a7  */
                        /* JADX WARN: Type inference failed for: r5v57 */
                        /* JADX WARN: Type inference failed for: r5v58, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r5v60 */
                        @Override // defpackage.sz7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object i(java.lang.Object r67, java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
                            /*
                                Method dump skipped, instruction units count: 2240
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.h73.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, e18Var2), e18Var2, 1794432, 10);
                }
                break;
        }
        return ieiVar;
    }
}
