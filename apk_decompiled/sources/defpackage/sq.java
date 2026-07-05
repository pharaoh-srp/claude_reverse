package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.bell.b;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.sessions.types.CodeAgent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sq implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ sq(zy7 zy7Var, boolean z, iqb iqbVar, j9f j9fVar, int i) {
        this.E = 18;
        this.F = zy7Var;
        this.G = z;
        this.I = iqbVar;
        this.H = j9fVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        tkh tkhVar;
        tkh tkhVar2;
        boolean z;
        tkh tkhVar3;
        Object value;
        int i = this.E;
        int i2 = 6;
        fqb fqbVar = fqb.E;
        boolean z2 = this.G;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.F;
        Object obj5 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mok.a((CodeAgent) obj5, this.G, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 1:
                ((Integer) obj2).getClass();
                b.m((mj1) obj5, (zy7) obj4, this.G, (pl3) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 2:
                ((Integer) obj2).getClass();
                ztj.c((ModelSelectorEntry) obj5, this.G, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 3:
                ((Integer) obj2).getClass();
                lwj.f((hcb) obj5, this.G, (pl3) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 4:
                ((Integer) obj2).getClass();
                vjk.a((fn1) obj5, this.G, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(385));
                return ieiVar;
            case 5:
                ((Integer) obj2).getClass();
                xjk.d((List) obj5, this.G, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 6:
                ((Integer) obj2).getClass();
                a.e((kh2) obj5, (String) obj3, this.G, (zy7) obj4, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 7:
                c cVar = (c) obj5;
                zy7 zy7Var = (zy7) obj4;
                x0a x0aVar = (x0a) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.c(z2 && !((Boolean) cVar.F.getValue()).booleanValue(), zy7Var, x0aVar, null, e18Var, 0);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 8:
                String str = (String) obj5;
                whb whbVar = (whb) obj4;
                String str2 = (String) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                    return ieiVar;
                }
                iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
                q64 q64VarA = p64.a(ko0.e, lja.S, e18Var2, 6);
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
                z80 z80Var = cd4.f;
                d4c.i0(e18Var2, z80Var, q64VarA);
                z80 z80Var2 = cd4.e;
                d4c.i0(e18Var2, z80Var2, hycVarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                z80 z80Var3 = cd4.g;
                d4c.i0(e18Var2, z80Var3, numValueOf);
                bx bxVar = cd4.h;
                d4c.h0(e18Var2, bxVar);
                z80 z80Var4 = cd4.d;
                d4c.i0(e18Var2, z80Var4, iqbVarE);
                cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
                int iHashCode2 = Long.hashCode(e18Var2.T);
                hyc hycVarL2 = e18Var2.l();
                iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var, cxeVarA);
                d4c.i0(e18Var2, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                d4c.i0(e18Var2, z80Var4, iqbVarE2);
                boolean z3 = whbVar instanceof vhb;
                if (z3) {
                    e18Var2.a0(260554346);
                    qxh qxhVar = ((vhb) whbVar).a;
                    String messageText = qxhVar.getMessageText();
                    if (messageText == null) {
                        messageText = qxhVar.getToolName();
                    }
                    String toolName = qxhVar.getToolName();
                    if (x44.r(messageText, bsg.e1(toolName, ":", toolName))) {
                        e18Var2.a0(260694807);
                        tkhVar3 = (tkh) ((wk) gm3.c(e18Var2).e.F).i;
                        z = false;
                        e18Var2.p(false);
                    } else {
                        z = false;
                        e18Var2.a0(260774105);
                        tkhVar3 = ((jm3) gm3.c(e18Var2).e.E).f;
                        e18Var2.p(false);
                    }
                    tkhVar = tkhVar3;
                    e18Var2.p(z);
                } else if (whbVar instanceof uhb) {
                    e18Var2.a0(260916767);
                    tkhVar = (tkh) ((wk) gm3.c(e18Var2).e.F).h;
                    e18Var2.p(false);
                } else {
                    if (!(whbVar instanceof thb)) {
                        throw ebh.u(e18Var2, 1255329056, false);
                    }
                    e18Var2.a0(261041697);
                    tkhVar = ((jm3) gm3.c(e18Var2).e.E).f;
                    e18Var2.p(false);
                }
                tkh tkhVar4 = tkhVar;
                long j = gm3.a(e18Var2).M;
                hw9 hw9Var = new hw9(1.0f, true);
                boolean z4 = this.G;
                fhk.b(str2, hw9Var, tkhVar4, j, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 2, 2, null, z4, e18Var2, 14155776, 0, 816);
                Object objA = whbVar.a();
                uf8 uf8Var = objA instanceof uf8 ? (uf8) objA : null;
                if (uf8Var == null || !uf8Var.isError()) {
                    e18Var2.a0(-2043205502);
                    e18Var2.p(false);
                } else {
                    ij0.r(4.0f, -2043383287, e18Var2, e18Var2, fqbVar);
                    u4b.a(androidx.compose.foundation.layout.b.o(fqbVar, 16.0f), e18Var2, 6);
                    e18Var2.p(false);
                }
                e18Var2.p(true);
                if (str != null) {
                    sq6.A(8.0f, -2054845399, e18Var2, e18Var2, fqbVar);
                    if (z3) {
                        e18Var2.a0(1836774752);
                        tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).k;
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-356387729);
                        tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).k;
                        e18Var2.p(false);
                    }
                    fhk.b(str, null, tkhVar2, gm3.a(e18Var2).M, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 2, 2, null, z4, e18Var2, 14155776, 0, 818);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-2054356250);
                    e18Var2.p(false);
                }
                e18Var2.p(true);
                return ieiVar;
            case 9:
                ((Integer) obj2).getClass();
                jwk.d(this.G, (bz7) obj5, (zb0) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 10:
                ((Integer) obj2).getClass();
                mqk.a((String) obj5, this.G, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(385));
                return ieiVar;
            case 11:
                ud0 ud0Var = (ud0) obj5;
                String str3 = (String) obj4;
                jl3 jl3Var = (jl3) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ud0 ud0Var2 = ud0.d;
                    cv8.b(com.anthropic.claude.design.icon.a.a(ud0Var, e18Var3), str3, null, z2 ? jl3Var.M : jl3Var.O, e18Var3, 8, 4);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 12:
                zub zubVar = (zub) obj5;
                ffh ffhVar = (ffh) obj4;
                e0g e0gVar = (e0g) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k2e.K.m(this.G, false, zubVar, null, ffhVar, e0gVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var4, 100663296, 200);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 13:
                ((Integer) obj2).getClass();
                kik.b((gnd) obj5, this.G, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 14:
                ((Integer) obj2).getClass();
                qvk.a((whd) obj5, this.G, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                zy7 zy7Var2 = (zy7) obj4;
                zy7 zy7Var3 = (zy7) obj5;
                zy7 zy7Var4 = (zy7) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else if (z2) {
                    e18Var5.a0(1168890637);
                    qnc qncVar = q02.a;
                    n02 n02VarD = q02.d(0L, gm3.a(e18Var5).e, 0L, e18Var5, 13);
                    qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var5).u);
                    vve vveVarB = xve.b(8.0f);
                    iqb iqbVarC2 = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
                    boolean zF = e18Var5.f(zy7Var2) | e18Var5.f(zy7Var3);
                    Object objN = e18Var5.N();
                    if (zF || objN == jd4.a) {
                        objN = new kt0(zy7Var2, zy7Var3, 26);
                        e18Var5.k0(objN);
                    }
                    csg.j((zy7) objN, iqbVarC2, false, vveVarB, n02VarD, qu1VarA, null, ntk.c, e18Var5, 805306416, 420);
                    e18Var5.p(false);
                } else {
                    e18Var5.a0(1170378420);
                    qnc qncVar2 = q02.a;
                    csg.j(zy7Var4, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, xve.b(8.0f), q02.d(0L, gm3.a(e18Var5).e, 0L, e18Var5, 13), sf5.a(0.5f, gm3.a(e18Var5).u), null, ntk.d, e18Var5, 805306416, 420);
                    e18Var5.p(false);
                }
                return ieiVar;
            case 16:
                ((Integer) obj2).getClass();
                xzk.k((m29) obj5, this.G, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(3073));
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                jz0 jz0Var = (jz0) obj5;
                m83 m83Var = (m83) obj4;
                kg3 kg3Var = (kg3) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz7 pz7Var = m83Var.t;
                    iqb iqbVar = e93.a;
                    iqb iqbVarL = gb9.L(fqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    iqb iqbVar2 = fqbVar;
                    if (!z2) {
                        iqbVar2 = e93.a;
                    }
                    nuk.b(jz0Var, iqbVarL.B(iqbVar2), kg3Var, pz7Var, e18Var6, 512);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                tik.a((zy7) obj4, this.G, (iqb) obj3, (j9f) obj5, (ld4) obj, x44.p0(385));
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                o0h o0hVar = (o0h) obj5;
                gvg gvgVar = (gvg) obj;
                rl4 rl4Var = (rl4) obj2;
                gvgVar.getClass();
                c3d c3dVarU = ((h5b) w44.L0(gvgVar.p(new ta4(-1434269195, true, new ufe(o0hVar, 13, (ta4) obj4)), ase.E))).u(rl4Var.a);
                h5b h5bVar = (h5b) w44.L0(gvgVar.p(new ta4(1996401649, true, new tte((ta4) obj3, i2, z ? (byte) 1 : (byte) 0)), ase.F));
                long j2 = rl4Var.a;
                int i3 = c3dVarU.F;
                c3d c3dVarU2 = h5bVar.u(rl4.a(0, 0, i3, i3, 2, j2));
                int i4 = c3dVarU2.E;
                float f = z2 ? i4 : -i4;
                ry ryVar = o0hVar.a;
                ed6 ed6Var = new ed6();
                ed6Var.a(zre.E, MTTypesetterKt.kLineSkipLimitMultiplier);
                ed6Var.a(zre.F, f);
                float[] fArr = ed6Var.b;
                ArrayList arrayList = ed6Var.a;
                int size = arrayList.size();
                fArr.getClass();
                yfd.t(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                vq5 vq5Var = new vq5(arrayList, fArrCopyOfRange);
                hsc hscVar = ryVar.j;
                wz5 wz5Var = ryVar.i;
                if (Float.isNaN(hscVar.h()) || (value = vq5Var.a(ryVar.j.h())) == null) {
                    value = wz5Var.getValue();
                }
                ryVar.h(vq5Var, value);
                return gvgVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new q36(c3dVarU2, c3dVarU, 2));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                w79 w79Var = (w79) obj5;
                ffh ffhVar2 = (ffh) obj4;
                e0g e0gVar2 = (e0g) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    vz8.L.x(this.G, w79Var, ffhVar2, e0gVar2, e18Var7, 114822144);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 21:
                ((Integer) obj2).getClass();
                rtk.c((String) obj5, (String) obj4, (iqb) obj3, this.G, (ld4) obj, x44.p0(385));
                return ieiVar;
            default:
                List list = (List) obj5;
                gwg gwgVar = (gwg) obj4;
                bz7 bz7Var = (bz7) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dxj.d(list, gwgVar, bz7Var, null, this.G, e18Var8, 0);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ sq(mj1 mj1Var, zy7 zy7Var, boolean z, pl3 pl3Var, int i) {
        this.E = 1;
        this.H = mj1Var;
        this.F = zy7Var;
        this.G = z;
        this.I = pl3Var;
    }

    public /* synthetic */ sq(kh2 kh2Var, String str, boolean z, zy7 zy7Var, int i) {
        this.E = 6;
        this.H = kh2Var;
        this.I = str;
        this.G = z;
        this.F = zy7Var;
    }

    public /* synthetic */ sq(int i, int i2, Object obj, Object obj2, Object obj3, boolean z) {
        this.E = i2;
        this.H = obj;
        this.G = z;
        this.F = obj2;
        this.I = obj3;
    }

    public /* synthetic */ sq(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.E = i;
        this.H = obj;
        this.F = obj2;
        this.G = z;
        this.I = obj3;
    }

    public /* synthetic */ sq(String str, String str2, iqb iqbVar, boolean z, int i) {
        this.E = 21;
        this.H = str;
        this.F = str2;
        this.I = iqbVar;
        this.G = z;
    }

    public /* synthetic */ sq(List list, gwg gwgVar, bz7 bz7Var, boolean z) {
        this.E = 22;
        this.H = list;
        this.F = gwgVar;
        this.I = bz7Var;
        this.G = z;
    }

    public /* synthetic */ sq(boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3) {
        this.E = 15;
        this.G = z;
        this.F = zy7Var;
        this.H = zy7Var2;
        this.I = zy7Var3;
    }

    public /* synthetic */ sq(boolean z, bz7 bz7Var, zb0 zb0Var, iqb iqbVar, int i) {
        this.E = 9;
        this.G = z;
        this.H = bz7Var;
        this.F = zb0Var;
        this.I = iqbVar;
    }

    public /* synthetic */ sq(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.G = z;
        this.H = obj;
        this.F = obj2;
        this.I = obj3;
    }
}
