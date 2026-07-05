package defpackage;

import android.content.ClipboardManager;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.models.organization.configtypes.HealthConsentConfig;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fsk {
    public static final ta4 a = new ta4(-1564594765, false, new wb4(7));
    public static final ta4 b = new ta4(1735063844, false, new vb4(16));

    static {
        new ta4(694335979, false, new vb4(17));
        new ta4(-1110630874, false, new vb4(18));
    }

    public static final void a(final m15 m15Var, final k2g k2gVar, final hi6 hi6Var, final w05 w05Var, final String str, final String str2, final boolean z, final bz7 bz7Var, final zy7 zy7Var, final zy7 zy7Var2, final pz7 pz7Var, final rz7 rz7Var, final bz7 bz7Var2, final ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem, final boolean z2, final bz7 bz7Var3, final bz7 bz7Var4, iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        m15 m15Var2;
        final iqb iqbVar2;
        int i2;
        int i3;
        l45 l45Var;
        l45 l45Var2;
        String strG;
        String str3;
        String str4;
        Instant instant;
        boolean z3;
        List list;
        l45 l45Var3;
        int i4;
        lz1 lz1Var;
        k2g k2gVar2;
        x0a x0aVar;
        e18 e18Var2;
        wlg wlgVar;
        tp4 tp4Var;
        z80 z80Var;
        FillElement fillElement;
        z80 z80Var2;
        vo1 vo1Var;
        re4 re4Var;
        lz1 lz1Var2;
        fqb fqbVar;
        z80 z80Var3;
        bx bxVar;
        z80 z80Var4;
        float f;
        qnc qncVar;
        List list2;
        ho0 ho0Var;
        boolean z4;
        e18 e18Var3;
        fqb fqbVar2;
        e18 e18Var4;
        boolean z5;
        vo1 vo1Var2 = lja.T;
        m15Var.getClass();
        boolean z6 = m15Var.b;
        List list3 = m15Var.a;
        k2gVar.getClass();
        hi6Var.getClass();
        w05Var.getClass();
        str.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        pz7Var.getClass();
        rz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        bz7Var4.getClass();
        e18 e18Var5 = (e18) ld4Var;
        e18Var5.c0(-895470616);
        int i5 = i | (e18Var5.f(m15Var) ? 4 : 2) | (e18Var5.f(k2gVar) ? 32 : 16) | (e18Var5.h(hi6Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var5.h(w05Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024) | (e18Var5.f(str) ? 16384 : 8192) | (e18Var5.f(str2) ? 131072 : 65536) | (e18Var5.g(z) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var5.h(bz7Var) ? 8388608 : 4194304) | (e18Var5.h(zy7Var) ? 67108864 : 33554432) | (e18Var5.h(zy7Var2) ? 536870912 : 268435456);
        int i6 = (e18Var5.h(pz7Var) ? (char) 4 : (char) 2) | (e18Var5.h(rz7Var) ? ' ' : (char) 16) | (e18Var5.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var5.f(conwaySuggestConnectorsOutputConnectorsItem) ? (char) 2048 : (char) 1024) | (e18Var5.g(z2) ? (char) 16384 : (char) 8192) | (e18Var5.h(bz7Var3) ? (char) 0 : (char) 0) | (e18Var5.h(bz7Var4) ? (char) 0 : (char) 0) | 12582912;
        if (e18Var5.Q(i5 & 1, ((i5 & 306783379) == 306783378 && (4793491 & i6) == 4793490) ? false : true)) {
            x0a x0aVarA = a1a.a(0, 3, e18Var5);
            Object objN = e18Var5.N();
            lz1 lz1Var3 = jd4.a;
            if (objN == lz1Var3) {
                objN = fd9.O(im6.E, e18Var5);
                e18Var5.k0(objN);
            }
            l45 l45Var4 = (l45) objN;
            boolean zF = e18Var5.f(LocalDate.now());
            Object objN2 = e18Var5.N();
            if (zF || objN2 == lz1Var3) {
                objN2 = Instant.now();
                e18Var5.k0(objN2);
            }
            Instant instant2 = (Instant) objN2;
            boolean zF2 = e18Var5.f(list3);
            Object objN3 = e18Var5.N();
            tp4 tp4Var2 = null;
            if (zF2 || objN3 == lz1Var3) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                i2 = i5;
                List list4 = list3;
                ArrayList arrayList = new ArrayList(x44.y(list4, 10));
                Iterator it = list4.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        x44.n0();
                        throw null;
                    }
                    Iterator it2 = it;
                    wpg wpgVar = (wpg) next;
                    int i9 = i6;
                    if (wpgVar instanceof npg) {
                        l45Var2 = l45Var4;
                        strG = "html:".concat(((npg) wpgVar).b);
                    } else {
                        l45Var2 = l45Var4;
                        if (wpgVar instanceof opg) {
                            str3 = ((opg) wpgVar).a;
                            str4 = "speak:";
                        } else if (wpgVar instanceof qpg) {
                            str3 = ((qpg) wpgVar).a;
                            str4 = "suggest-connectors:";
                        } else if (wpgVar instanceof ppg) {
                            str3 = ((ppg) wpgVar).a;
                            str4 = "suggest-actions:";
                        } else {
                            String str5 = jce.a.b(wpgVar.getClass()).f() + "#" + wpgVar.a();
                            Object obj = linkedHashMap.get(str5);
                            if (obj == null) {
                                obj = 0;
                            }
                            int iIntValue = ((Number) obj).intValue();
                            linkedHashMap.put(str5, Integer.valueOf(iIntValue + 1));
                            StringBuilder sb = new StringBuilder();
                            sb.append(str5);
                            strG = ij0.g(iIntValue, "#", sb);
                        }
                        strG = ij0.i(str4, str3);
                    }
                    wpg wpgVar2 = (wpg) w44.O0(i7 - 1, list3);
                    arrayList.add(new op9(strG, i7, wpgVar, wpgVar2 != null ? Long.valueOf(wpgVar2.a()) : null));
                    i6 = i9;
                    i7 = i8;
                    it = it2;
                    l45Var4 = l45Var2;
                }
                i3 = i6;
                l45Var = l45Var4;
                objN3 = new mva(arrayList);
                e18Var5.k0(objN3);
            } else {
                i2 = i5;
                i3 = i6;
                l45Var = l45Var4;
            }
            final List list5 = (List) objN3;
            int i10 = i2 & 14;
            nwb nwbVarZ = mpk.Z(m15Var, e18Var5);
            nwb nwbVarZ2 = mpk.Z(list5, e18Var5);
            boolean zF3 = ((i2 & 112) == 32) | e18Var5.f(nwbVarZ2) | ((i2 & 1879048192) == 536870912) | e18Var5.f(nwbVarZ) | e18Var5.f(x0aVarA);
            Object objN4 = e18Var5.N();
            if (zF3 || objN4 == lz1Var3) {
                instant = instant2;
                z3 = z6;
                list = list3;
                l45Var3 = l45Var;
                i4 = 4;
                lz1Var = lz1Var3;
                mt4 mt4Var = new mt4((Object) k2gVar, (Object) zy7Var2, (Object) x0aVarA, (Object) nwbVarZ2, (Object) nwbVarZ, (tp4) null, 0);
                k2gVar2 = k2gVar;
                e18Var5.k0(mt4Var);
                objN4 = mt4Var;
            } else {
                k2gVar2 = k2gVar;
                instant = instant2;
                z3 = z6;
                list = list3;
                l45Var3 = l45Var;
                i4 = 4;
                lz1Var = lz1Var3;
            }
            fd9.j(k2gVar2, x0aVarA, (pz7) objN4, e18Var5);
            Object objN5 = e18Var5.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.w(new i23(x0aVarA, 2));
                e18Var5.k0(objN5);
            }
            wlg wlgVar2 = (wlg) objN5;
            wpg wpgVar3 = (wpg) w44.V0(list);
            Object[] objArr = {Integer.valueOf(list.size()), Long.valueOf(wpgVar3 != null ? wpgVar3.a() : 0L), Boolean.valueOf(z3), Boolean.valueOf(m15Var.g)};
            boolean zF4 = e18Var5.f(x0aVarA) | (i10 == i4);
            Object objN6 = e18Var5.N();
            if (zF4 || objN6 == lz1Var) {
                x0aVar = x0aVarA;
                e18Var2 = e18Var5;
                t74 t74Var = new t74(m15Var, x0aVar, wlgVar2, tp4Var2, 10);
                wlgVar = wlgVar2;
                tp4Var = null;
                e18Var2.k0(t74Var);
                objN6 = t74Var;
            } else {
                e18Var2 = e18Var5;
                wlgVar = wlgVar2;
                x0aVar = x0aVarA;
                tp4Var = null;
            }
            fd9.l(objArr, (pz7) objN6, e18Var2);
            boolean zG = e18Var2.g(m15Var.i);
            Object objN7 = e18Var2.N();
            if (zG || objN7 == lz1Var) {
                objN7 = mpk.w(new d44(m15Var, 9, x0aVar));
                e18Var2.k0(objN7);
            }
            wlg wlgVar3 = (wlg) objN7;
            Boolean bool = (Boolean) wlgVar3.getValue();
            bool.getClass();
            boolean zF5 = e18Var2.f(wlgVar3) | ((i2 & 234881024) == 67108864);
            Object objN8 = e18Var2.N();
            if (zF5 || objN8 == lz1Var) {
                objN8 = new u73(zy7Var, wlgVar3, tp4Var, 11);
                e18Var2.k0(objN8);
            }
            fd9.i(e18Var2, (pz7) objN8, bool);
            boolean zIsEmpty = list.isEmpty();
            fqb fqbVar3 = fqb.E;
            if (zIsEmpty && !z3) {
                e18Var2.a0(-917464980);
                xo1 xo1Var = lja.K;
                FillElement fillElement2 = b.c;
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var2.T);
                hyc hycVarL = e18Var2.l();
                iqb iqbVarE = kxk.E(e18Var2, fillElement2);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var2);
                } else {
                    e18Var2.n0();
                }
                z80 z80Var5 = cd4.f;
                d4c.i0(e18Var2, z80Var5, o5bVarD);
                z80 z80Var6 = cd4.e;
                d4c.i0(e18Var2, z80Var6, hycVarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                z80 z80Var7 = cd4.g;
                d4c.i0(e18Var2, z80Var7, numValueOf);
                bx bxVar2 = cd4.h;
                d4c.h0(e18Var2, bxVar2);
                z80 z80Var8 = cd4.d;
                d4c.i0(e18Var2, z80Var8, iqbVarE);
                if (m15Var.k) {
                    e18Var2.a0(-1075554202);
                    q64 q64VarA = p64.a(ko0.c, vo1Var2, e18Var2, 48);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    fqbVar2 = fqbVar3;
                    iqb iqbVarE2 = kxk.E(e18Var2, fqbVar2);
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, z80Var5, q64VarA);
                    d4c.i0(e18Var2, z80Var6, hycVarL2);
                    ij0.t(iHashCode2, e18Var2, z80Var7, e18Var2, bxVar2);
                    d4c.i0(e18Var2, z80Var8, iqbVarE2);
                    e18 e18Var6 = e18Var2;
                    tjd.a(b.o(fqbVar2, 20.0f), gm3.a(e18Var2).N, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var6, 390, 56);
                    tjh.b(d4c.j0(R.string.conway_loading_fork, e18Var6), gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var6).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var6).e.E).i, e18Var6, 48, 0, 131064);
                    e18Var6.p(true);
                    e18Var6.p(false);
                    z5 = false;
                    e18Var4 = e18Var6;
                } else {
                    fqbVar2 = fqbVar3;
                    e18 e18Var7 = e18Var2;
                    e18Var7.a0(-1074890523);
                    tjh.b(d4c.j0(R.string.conway_empty_state, e18Var7), null, gm3.a(e18Var7).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).g, e18Var7, 0, 0, 131066);
                    e18Var4 = e18Var7;
                    z5 = false;
                    e18Var4.p(false);
                }
                e18Var4.p(true);
                e18Var4.p(z5);
                r7e r7eVarS = e18Var4.s();
                if (r7eVarS != null) {
                    final int i11 = 0;
                    final k2g k2gVar3 = k2gVar2;
                    final fqb fqbVar4 = fqbVar2;
                    r7eVarS.d = new pz7(m15Var, k2gVar3, hi6Var, w05Var, str, str2, z, bz7Var, zy7Var, zy7Var2, pz7Var, rz7Var, bz7Var2, conwaySuggestConnectorsOutputConnectorsItem, z2, bz7Var3, bz7Var4, fqbVar4, i, i11) { // from class: it4
                        public final /* synthetic */ int E;
                        public final /* synthetic */ m15 F;
                        public final /* synthetic */ k2g G;
                        public final /* synthetic */ hi6 H;
                        public final /* synthetic */ w05 I;
                        public final /* synthetic */ String J;
                        public final /* synthetic */ String K;
                        public final /* synthetic */ boolean L;
                        public final /* synthetic */ bz7 M;
                        public final /* synthetic */ zy7 N;
                        public final /* synthetic */ zy7 O;
                        public final /* synthetic */ pz7 P;
                        public final /* synthetic */ rz7 Q;
                        public final /* synthetic */ bz7 R;
                        public final /* synthetic */ ConwaySuggestConnectorsOutputConnectorsItem S;
                        public final /* synthetic */ boolean T;
                        public final /* synthetic */ bz7 U;
                        public final /* synthetic */ bz7 V;
                        public final /* synthetic */ iqb W;

                        {
                            this.E = i11;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj2, Object obj3) {
                            int i12 = this.E;
                            iei ieiVar = iei.a;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iP0 = x44.p0(4609);
                                    fsk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (ld4) obj2, iP0);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iP02 = x44.p0(4609);
                                    fsk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (ld4) obj2, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    return;
                }
                return;
            }
            e18 e18Var8 = e18Var2;
            e18Var8.a0(-916405958);
            e18Var8.p(false);
            final String strJ0 = d4c.j0(R.string.conway_fork_inherited_message, e18Var8);
            FillElement fillElement3 = b.c;
            o5b o5bVarD2 = dw1.d(lja.G, false);
            int iHashCode3 = Long.hashCode(e18Var8.T);
            hyc hycVarL3 = e18Var8.l();
            iqb iqbVarE3 = kxk.E(e18Var8, fillElement3);
            dd4.e.getClass();
            re4 re4Var3 = cd4.b;
            e18Var8.e0();
            if (e18Var8.S) {
                e18Var8.k(re4Var3);
            } else {
                e18Var8.n0();
            }
            z80 z80Var9 = cd4.f;
            d4c.i0(e18Var8, z80Var9, o5bVarD2);
            z80 z80Var10 = cd4.e;
            d4c.i0(e18Var8, z80Var10, hycVarL3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            z80 z80Var11 = cd4.g;
            d4c.i0(e18Var8, z80Var11, numValueOf2);
            bx bxVar3 = cd4.h;
            d4c.h0(e18Var8, bxVar3);
            x0a x0aVar2 = x0aVar;
            z80 z80Var12 = cd4.d;
            d4c.i0(e18Var8, z80Var12, iqbVarE3);
            qnc qncVar2 = new qnc(20.0f, 16.0f, 20.0f, 16.0f);
            ho0 ho0Var2 = new ho0(12.0f, false, new do0(0, lja.R));
            boolean z7 = i10 == 4;
            final Instant instant3 = instant;
            int i12 = i3;
            int i13 = i2;
            boolean zH = ((i12 & 57344) == 16384) | ((i2 & 57344) == 16384) | z7 | e18Var8.h(list5) | e18Var8.h(instant3) | e18Var8.f(strJ0) | ((i3 & 14) == 4) | ((i2 & 458752) == 131072) | ((i2 & 29360128) == 8388608) | ((i2 & 3670016) == 1048576) | ((i12 & 7168) == 2048) | ((i12 & 458752) == 131072) | ((i12 & 3670016) == 1048576) | ((i12 & 896) == 256) | ((i13 & 7168) == 2048 || e18Var8.h(w05Var)) | ((i13 & 896) == 256 || e18Var8.h(hi6Var)) | ((i12 & 112) == 32);
            Object objN9 = e18Var8.N();
            if (zH || objN9 == lz1Var) {
                z80Var = z80Var11;
                fillElement = fillElement3;
                z80Var2 = z80Var10;
                vo1Var = vo1Var2;
                re4Var = re4Var3;
                lz1Var2 = lz1Var;
                fqbVar = fqbVar3;
                z80Var3 = z80Var12;
                bxVar = bxVar3;
                z80Var4 = z80Var9;
                f = 12.0f;
                qncVar = qncVar2;
                list2 = list;
                ho0Var = ho0Var2;
                z4 = z3;
                bz7 bz7Var5 = new bz7() { // from class: jt4
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj2) {
                        int i14;
                        Object obj3;
                        j0a j0aVar = (j0a) obj2;
                        j0aVar.getClass();
                        m15 m15Var3 = m15Var;
                        int i15 = 2;
                        int i16 = 1;
                        if (m15Var3.b) {
                            j0a.V(j0aVar, "loading", null, new ta4(-183424610, true, new kt4(m15Var3, i16)), 2);
                        }
                        if (!m15Var3.l.isEmpty()) {
                            j0a.V(j0aVar, "debug-unknown-frames", null, new ta4(334386453, true, new kt4(m15Var3, i15)), 2);
                        }
                        fc4 fc4Var = new fc4(21);
                        List list6 = list5;
                        j0aVar.W(list6.size(), new z04(fc4Var, 8, list6), new tq(list6, 12), new ta4(802480018, true, new ot4(w05Var, m15Var3, hi6Var, bz7Var, bz7Var3, bz7Var4, bz7Var2, pz7Var, rz7Var, conwaySuggestConnectorsOutputConnectorsItem, strJ0, str, str2, instant3, list6, z, z2)));
                        if (m15Var3.h) {
                            i14 = 2;
                            obj3 = null;
                            j0a.V(j0aVar, "load-older", null, djk.a, 2);
                        } else {
                            i14 = 2;
                            obj3 = null;
                        }
                        if (m15Var3.k) {
                            j0a.V(j0aVar, "load-fork-prefix", obj3, djk.b, i14);
                        }
                        return iei.a;
                    }
                };
                m15Var2 = m15Var;
                e18Var3 = e18Var8;
                e18Var3.k0(bz7Var5);
                objN9 = bz7Var5;
            } else {
                z80Var = z80Var11;
                e18Var3 = e18Var8;
                fillElement = fillElement3;
                z80Var2 = z80Var10;
                vo1Var = vo1Var2;
                re4Var = re4Var3;
                lz1Var2 = lz1Var;
                fqbVar = fqbVar3;
                z80Var3 = z80Var12;
                bxVar = bxVar3;
                z80Var4 = z80Var9;
                f = 12.0f;
                m15Var2 = m15Var;
                qncVar = qncVar2;
                list2 = list;
                ho0Var = ho0Var2;
                z4 = z3;
            }
            e18 e18Var9 = e18Var3;
            knk.h(fillElement, x0aVar2, qncVar, true, ho0Var, null, null, false, null, (bz7) objN9, e18Var9, 28038, 480);
            e18Var = e18Var9;
            ho0 ho0Var3 = new ho0(8.0f, true, new sz6(1));
            fqb fqbVar5 = fqbVar;
            iqb iqbVarN = gb9.N(nw1.a.a(fqbVar5, lja.N), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, 7);
            q64 q64VarA2 = p64.a(ho0Var3, vo1Var, e18Var, 54);
            int iHashCode4 = Long.hashCode(e18Var.T);
            hyc hycVarL4 = e18Var.l();
            iqb iqbVarE4 = kxk.E(e18Var, iqbVarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var4, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL4);
            ij0.t(iHashCode4, e18Var, z80Var, e18Var, bxVar);
            d4c.i0(e18Var, z80Var3, iqbVarE4);
            boolean z8 = z4 && !((Boolean) wlgVar.getValue()).booleanValue();
            wp6 wp6VarE = gp6.e(null, 3);
            Object objN10 = e18Var.N();
            int i14 = 8;
            lz1 lz1Var4 = lz1Var2;
            if (objN10 == lz1Var4) {
                objN10 = new xga(i14);
                e18Var.k0(objN10);
            }
            wp6 wp6VarA = wp6VarE.a(gp6.n(1, (bz7) objN10));
            d77 d77VarF = gp6.f(null, 3);
            Object objN11 = e18Var.N();
            if (objN11 == lz1Var4) {
                objN11 = new xga(i14);
                e18Var.k0(objN11);
            }
            d77 d77VarA = d77VarF.a(gp6.p(1, (bz7) objN11));
            ta4 ta4VarQ0 = fd9.q0(558468028, new kt4(m15Var2, 0), e18Var);
            s64 s64Var = s64.a;
            wd6.H(s64Var, z8, null, wp6VarA, d77VarA, null, ta4VarQ0, e18Var, 1600518, 18);
            wd6.H(s64Var, (((Boolean) wlgVar.getValue()).booleanValue() || list2.isEmpty()) ? false : true, null, gp6.e(null, 3).a(gp6.g(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7)), gp6.f(null, 3).a(gp6.h(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7)), null, fd9.q0(734123379, new ii(l45Var3, 25, x0aVar2), e18Var), e18Var, 1600518, 18);
            e18Var.p(true);
            e18Var.p(true);
            iqbVar2 = fqbVar5;
        } else {
            e18Var = e18Var5;
            m15Var2 = m15Var;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            final int i15 = 1;
            final m15 m15Var3 = m15Var2;
            r7eVarS2.d = new pz7(m15Var3, k2gVar, hi6Var, w05Var, str, str2, z, bz7Var, zy7Var, zy7Var2, pz7Var, rz7Var, bz7Var2, conwaySuggestConnectorsOutputConnectorsItem, z2, bz7Var3, bz7Var4, iqbVar2, i, i15) { // from class: it4
                public final /* synthetic */ int E;
                public final /* synthetic */ m15 F;
                public final /* synthetic */ k2g G;
                public final /* synthetic */ hi6 H;
                public final /* synthetic */ w05 I;
                public final /* synthetic */ String J;
                public final /* synthetic */ String K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ zy7 O;
                public final /* synthetic */ pz7 P;
                public final /* synthetic */ rz7 Q;
                public final /* synthetic */ bz7 R;
                public final /* synthetic */ ConwaySuggestConnectorsOutputConnectorsItem S;
                public final /* synthetic */ boolean T;
                public final /* synthetic */ bz7 U;
                public final /* synthetic */ bz7 V;
                public final /* synthetic */ iqb W;

                {
                    this.E = i15;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    int i122 = this.E;
                    iei ieiVar = iei.a;
                    switch (i122) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iP0 = x44.p0(4609);
                            fsk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (ld4) obj2, iP0);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iP02 = x44.p0(4609);
                            fsk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (ld4) obj2, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }

    public static final void b(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1038746800);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            wo1 wo1Var = lja.Q;
            iqb iqbVarL = gb9.L(b.c(iqbVar, 1.0f), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            long j = gm3.a(e18Var).u;
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            iuj.e(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), MTTypesetterKt.kLineSkipLimitMultiplier, j, e18Var, 0, 2);
            tjh.b(d4c.j0(R.string.conway_forked_from_main, e18Var), gb9.L(fqb.E, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            long j2 = gm3.a(e18Var).u;
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            iuj.e(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), MTTypesetterKt.kLineSkipLimitMultiplier, j2, e18Var, 0, 2);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 16, iqbVar);
        }
    }

    public static final void c(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static final String d(HealthConsentConfig healthConsentConfig) {
        return String.valueOf(healthConsentConfig.getConsent_config_android().getVersion());
    }

    public static boolean e(String[] strArr, String[] strArr2) {
        if (strArr2.length != 2) {
            sz6.p("Ill-formatted MIME type filter. Must be type/subtype.");
            return false;
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            sz6.p("Ill-formatted MIME type filter. Type or subtype empty.");
            return false;
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }

    public static final void f() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ea A[EDGE_INSN: B:134:0x01ea->B:107:0x01ea BREAK  A[LOOP:0: B:3:0x0005->B:136:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oo0 g(defpackage.xv8 r23, defpackage.do0 r24, defpackage.wg6 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsk.g(xv8, do0, wg6):oo0");
    }

    public static String h(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbX = sq6.x("<", str2, " threw ");
                    sbX.append(e.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
