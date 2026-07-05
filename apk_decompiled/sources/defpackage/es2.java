package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class es2 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ Object J;

    public /* synthetic */ es2(zb0 zb0Var, boolean z, boolean z2, bz7 bz7Var, String str) {
        this.G = zb0Var;
        this.F = z;
        this.H = z2;
        this.I = bz7Var;
        this.J = str;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        Object obj4 = this.J;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                ChatFeedbackType chatFeedbackType = (ChatFeedbackType) obj5;
                nwb nwbVar = (nwb) obj4;
                wb7 wb7Var = (wb7) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                wb7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var).f(wb7Var) : ((e18) ld4Var).h(wb7Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarB = wb7Var.b(b.c(fqbVar, 1.0f), "PrimaryEditable", true);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    tjh.b(d4c.j0(ns2.c(chatFeedbackType), e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                    kxk.g(e18Var, new hw9(1.0f, true));
                    iv1.b(ud0.B, null, null, ef2.F, 0L, e18Var, 3120, 20);
                    e18Var.p(true);
                    boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = new ve(27, nwbVar);
                        e18Var.k0(objN);
                    }
                    j8.b(zBooleanValue, (zy7) objN, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(180037428, new es2(this.F, chatFeedbackType, this.H, this.I, nwbVar), e18Var), e18Var, 48, 2044);
                }
                break;
            case 1:
                ChatFeedbackType chatFeedbackType2 = (ChatFeedbackType) obj5;
                nwb nwbVar2 = (nwb) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    d8a d8aVarE = x44.E();
                    d8aVarE.addAll(ns2.a);
                    if (this.F || chatFeedbackType2 == ChatFeedbackType.FLAG_MEMORY) {
                        d8aVarE.add(ChatFeedbackType.FLAG_MEMORY);
                    }
                    if (this.H) {
                        d8aVarE.add(ChatFeedbackType.FLAG_FILE);
                    }
                    int i2 = 0;
                    ListIterator listIterator = x44.v(d8aVarE).listIterator(0);
                    while (true) {
                        c8a c8aVar = (c8a) listIterator;
                        if (c8aVar.hasNext()) {
                            ChatFeedbackType chatFeedbackType3 = (ChatFeedbackType) c8aVar.next();
                            ta4 ta4VarQ0 = fd9.q0(1184091706, new fs2(chatFeedbackType3, i2), e18Var2);
                            bz7 bz7Var = this.I;
                            boolean zF = e18Var2.f(bz7Var) | e18Var2.d(chatFeedbackType3.ordinal());
                            Object objN2 = e18Var2.N();
                            if (zF || objN2 == lz1Var) {
                                objN2 = new ei(bz7Var, chatFeedbackType3, nwbVar2, 15);
                                e18Var2.k0(objN2);
                            }
                            t30.b(ta4VarQ0, (zy7) objN2, null, null, null, false, null, null, e18Var2, 6, 508);
                        }
                    }
                }
                break;
            default:
                zb0 zb0Var = (zb0) obj5;
                String str = (String) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    e0g e0gVar = gm3.b(e18Var3).h;
                    ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
                    iqb iqbVarJ = gb9.J(ez1.t(yfd.p(xn5.V(xn5.a0(b.c(gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), e0gVar, new tzf(4.0f, d54.b(0.08f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 56)), e0gVar), gm3.a(e18Var3).n, zni.b), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var3).v, e0gVar), 12.0f);
                    q64 q64VarA = p64.a(ho0Var, lja.S, e18Var3, 6);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var3, z80Var, q64VarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var3, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var3, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var3, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var3, z80Var4, iqbVarE2);
                    tjh.c(zb0Var, null, gm3.a(e18Var3).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 0, 262138);
                    ho0 ho0Var2 = new ho0(12.0f, true, new sz6(1));
                    wo1 wo1Var2 = lja.Q;
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    cxe cxeVarA2 = axe.a(ho0Var2, wo1Var2, e18Var3, 54);
                    int iHashCode3 = Long.hashCode(e18Var3.T);
                    hyc hycVarL3 = e18Var3.l();
                    iqb iqbVarE3 = kxk.E(e18Var3, iqbVarC);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var, cxeVarA2);
                    d4c.i0(e18Var3, z80Var2, hycVarL3);
                    ij0.t(iHashCode3, e18Var3, z80Var3, e18Var3, bxVar);
                    d4c.i0(e18Var3, z80Var4, iqbVarE3);
                    Object objN3 = e18Var3.N();
                    if (objN3 == lz1Var) {
                        objN3 = new hz6(19);
                        e18Var3.k0(objN3);
                    }
                    iqb iqbVarB2 = tjf.b(fqbVar, false, (bz7) objN3);
                    boolean z = this.F;
                    boolean z2 = this.H;
                    bz7 bz7Var2 = this.I;
                    grk.b(z, z2, bz7Var2, iqbVarB2, e18Var3, 0);
                    tjh.c(u00.h(d54.h, str), kzj.h(new hw9(1.0f, true), z2, z, new vue(2), bz7Var2, 8), gm3.a(e18Var3).O, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 0, 262136);
                    e18Var3.p(true);
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ es2(ChatFeedbackType chatFeedbackType, nwb nwbVar, boolean z, boolean z2, bz7 bz7Var) {
        this.G = chatFeedbackType;
        this.J = nwbVar;
        this.F = z;
        this.H = z2;
        this.I = bz7Var;
    }

    public /* synthetic */ es2(boolean z, ChatFeedbackType chatFeedbackType, boolean z2, bz7 bz7Var, nwb nwbVar) {
        this.F = z;
        this.G = chatFeedbackType;
        this.H = z2;
        this.I = bz7Var;
        this.J = nwbVar;
    }
}
