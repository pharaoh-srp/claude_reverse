package defpackage;

import android.content.ClipDescription;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.DragEvent;
import androidx.compose.foundation.layout.b;
import androidx.javascriptengine.common.LengthLimitExceededException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.sessions.types.SessionFileAttachment;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ttj {
    public static final ta4 a = new ta4(-154355413, false, new m14(24));
    public static final ta4 b = new ta4(-214227617, false, new p6(16));
    public static final ta4 c = new ta4(998127331, false, new m14(25));
    public static final ta4 d = new ta4(-333162608, false, new m14(26));
    public static final ta4 e = new ta4(1483780245, false, new m14(27));
    public static final o54 f = o54.K;
    public static final o54 g = o54.T;
    public static final q0g h = q0g.I;
    public static final o54 i = o54.S;
    public static final o54 j;
    public static final o54 k;
    public static final float l;
    public static final aci m;

    static {
        o54 o54Var = o54.M;
        j = o54Var;
        k = o54Var;
        l = 80.0f;
        m = aci.K;
    }

    public static final void a(final leb lebVar, final bz7 bz7Var, final iqb iqbVar, final pz7 pz7Var, final bz7 bz7Var2, ld4 ld4Var, final int i2) {
        r7e r7eVarS;
        pz7 pz7Var2;
        lebVar.getClass();
        List list = lebVar.d;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1687646039);
        int i3 = i2 | (e18Var.h(lebVar) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            if (lebVar.e) {
                r7eVarS = e18Var.s();
                if (r7eVarS == null) {
                    return;
                }
                final int i4 = 0;
                pz7Var2 = new pz7(lebVar, bz7Var, iqbVar, pz7Var, bz7Var2, i2, i4) { // from class: b32
                    public final /* synthetic */ int E;
                    public final /* synthetic */ leb F;
                    public final /* synthetic */ bz7 G;
                    public final /* synthetic */ iqb H;
                    public final /* synthetic */ pz7 I;
                    public final /* synthetic */ bz7 J;

                    {
                        this.E = i4;
                    }

                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = this.E;
                        iei ieiVar = iei.a;
                        switch (i5) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP0 = x44.p0(385);
                                ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                int iP02 = x44.p0(385);
                                ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP03 = x44.p0(385);
                                ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP03);
                                break;
                        }
                        return ieiVar;
                    }
                };
            } else {
                List<spf> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (spf spfVar : list2) {
                        if ((spfVar instanceof xdh) || ((spfVar instanceof wlh) && !bsg.I0(((wlh) spfVar).a))) {
                            iqb iqbVarN = gb9.N(b.c(iqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                            int iHashCode = Long.hashCode(e18Var.T);
                            hyc hycVarL = e18Var.l();
                            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
                            dd4.e.getClass();
                            re4 re4Var = cd4.b;
                            e18Var.e0();
                            if (e18Var.S) {
                                e18Var.k(re4Var);
                            } else {
                                e18Var.n0();
                            }
                            d4c.i0(e18Var, cd4.f, q64VarA);
                            d4c.i0(e18Var, cd4.e, hycVarL);
                            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                            d4c.h0(e18Var, cd4.h);
                            d4c.i0(e18Var, cd4.d, iqbVarE);
                            e18Var.a0(1160979376);
                            int i5 = 0;
                            for (Object obj : list2) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    x44.n0();
                                    throw null;
                                }
                                f((spf) obj, (jz0) bz7Var.invoke(Integer.valueOf(i5)), false, pz7Var, bz7Var2, e18Var, i3 & 64512, 4);
                                i5 = i6;
                            }
                            e18Var.p(false);
                            e18Var.p(true);
                        }
                    }
                }
                r7eVarS = e18Var.s();
                if (r7eVarS == null) {
                    return;
                }
                final int i7 = 1;
                pz7Var2 = new pz7(lebVar, bz7Var, iqbVar, pz7Var, bz7Var2, i2, i7) { // from class: b32
                    public final /* synthetic */ int E;
                    public final /* synthetic */ leb F;
                    public final /* synthetic */ bz7 G;
                    public final /* synthetic */ iqb H;
                    public final /* synthetic */ pz7 I;
                    public final /* synthetic */ bz7 J;

                    {
                        this.E = i7;
                    }

                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj22) {
                        int i52 = this.E;
                        iei ieiVar = iei.a;
                        switch (i52) {
                            case 0:
                                ((Integer) obj22).getClass();
                                int iP0 = x44.p0(385);
                                ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP0);
                                break;
                            case 1:
                                ((Integer) obj22).getClass();
                                int iP02 = x44.p0(385);
                                ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP02);
                                break;
                            default:
                                ((Integer) obj22).getClass();
                                int iP03 = x44.p0(385);
                                ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP03);
                                break;
                        }
                        return ieiVar;
                    }
                };
            }
            r7eVarS.d = pz7Var2;
        }
        e18Var.T();
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i8 = 2;
            pz7Var2 = new pz7(lebVar, bz7Var, iqbVar, pz7Var, bz7Var2, i2, i8) { // from class: b32
                public final /* synthetic */ int E;
                public final /* synthetic */ leb F;
                public final /* synthetic */ bz7 G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ pz7 I;
                public final /* synthetic */ bz7 J;

                {
                    this.E = i8;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj22) {
                    int i52 = this.E;
                    iei ieiVar = iei.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int iP0 = x44.p0(385);
                            ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP0);
                            break;
                        case 1:
                            ((Integer) obj22).getClass();
                            int iP02 = x44.p0(385);
                            ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP02);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int iP03 = x44.p0(385);
                            ttj.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP03);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var2;
        }
    }

    public static final void b(SessionFileAttachment sessionFileAttachment, String str, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        fqb fqbVar;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1245621072);
        int i3 = i2 | (e18Var.h(sessionFileAttachment) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | 384;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar2, 96.0f), xve.b(12.0f)), gm3.a(e18Var).q, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            if (!sessionFileAttachment.is_image() || str == null) {
                e18Var.a0(-1729258052);
                vo1 vo1Var = lja.T;
                ho0 ho0Var = new ho0(4.0f, false, new do0(i4, lja.Q));
                iqb iqbVarJ = gb9.J(fqbVar2, 8.0f);
                q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarJ);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var, q64VarA);
                d4c.i0(e18Var, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                d4c.i0(e18Var, z80Var4, iqbVarE2);
                cv8.b(u00.D(uaj.a(sessionFileAttachment.getFile_name()), 0, e18Var), null, b.o(fqbVar2, 32.0f), d54.h, e18Var, 3512, 0);
                fqbVar = fqbVar2;
                tjh.b(sessionFileAttachment.getFile_name(), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 24960, 110586);
                e18Var = e18Var;
                z = true;
                e18Var.p(true);
                e18Var.p(false);
            } else {
                e18Var.a0(-1729530666);
                nuk.e(str, sessionFileAttachment.getFile_name(), b.c, null, null, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, ((i3 >> 3) & 14) | 12583296, 3960);
                e18Var = e18Var;
                e18Var.p(false);
                fqbVar = fqbVar2;
                z = true;
            }
            e18Var.p(z);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(sessionFileAttachment, i2, str, iqbVar2, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v3, types: [e18] */
    /* JADX WARN: Type inference failed for: r15v8, types: [e18] */
    /* JADX WARN: Type inference failed for: r36v0, types: [bz7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void c(leb lebVar, boolean z, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, iqb iqbVar, pz7 pz7Var2, ld4 ld4Var, int i2, int i3) {
        bz7 bz7Var3;
        pz7 pz7Var3;
        ?? r15;
        eo0 eo0Var;
        List list;
        ArrayList<dw8> arrayList;
        wo1 wo1Var;
        ArrayList arrayList2;
        int i4;
        fqb fqbVar;
        ?? r6;
        boolean z2;
        e18 e18Var;
        ?? r10;
        pz7 pz7Var4;
        ?? r152;
        wo1 wo1Var2 = lja.P;
        List<SessionFileAttachment> list2 = lebVar.g;
        List list3 = lebVar.d;
        bz7Var.getClass();
        pz7Var.getClass();
        bz7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1629250296);
        int i5 = (e18Var2.h(lebVar) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i5 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i6 = i5 | (e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if ((196608 & i2) == 0) {
            i6 |= e18Var2.f(iqbVar) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        int i8 = i7 != 0 ? i6 | 1572864 : i6 | (e18Var2.h(pz7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var2.Q(i8 & 1, (599187 & i8) != 599186)) {
            pz7 pz7Var5 = i7 != 0 ? null : pz7Var2;
            List list4 = list3;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list4) {
                if (obj instanceof dw8) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list4) {
                if (!(((spf) obj2) instanceof dw8)) {
                    arrayList4.add(obj2);
                }
            }
            boolean zIsEmpty = arrayList4.isEmpty();
            iqb iqbVarN = gb9.N(b.c(iqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            vo1 vo1Var = lja.U;
            eo0 eo0Var2 = ko0.c;
            q64 q64VarA = p64.a(eo0Var2, vo1Var, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
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
            boolean zIsEmpty2 = list2.isEmpty();
            fqb fqbVar2 = fqb.E;
            if (zIsEmpty2) {
                eo0Var = eo0Var2;
                list = list3;
                arrayList = arrayList3;
                wo1Var = wo1Var2;
                e18Var2.a0(-398534464);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-399051792);
                arrayList = arrayList3;
                list = list3;
                ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                iqb iqbVarB0 = mpk.b0(gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (zIsEmpty && arrayList.isEmpty()) ? 0.0f : 8.0f, 7), mpk.Y(e18Var2), false);
                cxe cxeVarA = axe.a(ho0Var, wo1Var2, e18Var2, 6);
                wo1Var = wo1Var2;
                eo0Var = eo0Var2;
                int iHashCode2 = Long.hashCode(e18Var2.T);
                hyc hycVarL2 = e18Var2.l();
                iqb iqbVarE2 = kxk.E(e18Var2, iqbVarB0);
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
                e18Var2.a0(346116265);
                for (SessionFileAttachment sessionFileAttachment : list2) {
                    b(sessionFileAttachment, (String) bz7Var2.invoke(sessionFileAttachment), null, e18Var2, 0);
                }
                ij0.w(e18Var2, false, true, false);
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList4;
                i4 = i8;
                e18 e18Var3 = e18Var2;
                fqbVar = fqbVar2;
                r6 = 1;
                z2 = false;
                e18Var3.a0(-397509728);
                e18Var3.p(false);
                e18Var = e18Var3;
            } else {
                e18Var2.a0(-398427483);
                fqbVar = fqbVar2;
                boolean z3 = false;
                iqb iqbVarB02 = mpk.b0(gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, !zIsEmpty ? 8.0f : 0.0f, 7), mpk.Y(e18Var2), false);
                int i9 = 1;
                cxe cxeVarA2 = axe.a(new ho0(8.0f, true, new sz6(i9)), wo1Var, e18Var2, 6);
                int iHashCode3 = Long.hashCode(e18Var2.T);
                hyc hycVarL3 = e18Var2.l();
                iqb iqbVarE3 = kxk.E(e18Var2, iqbVarB02);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var2);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, cd4.f, cxeVarA2);
                d4c.i0(e18Var2, cd4.e, hycVarL3);
                d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode3));
                d4c.h0(e18Var2, cd4.h);
                d4c.i0(e18Var2, cd4.d, iqbVarE3);
                e18Var2.a0(-1724579476);
                for (dw8 dw8Var : arrayList) {
                    String str = dw8Var.a;
                    String strJ0 = d4c.j0(R.string.ccr_image_thumbnail_content_description, e18Var2);
                    iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar, 96.0f), xve.b(12.0f)), gm3.a(e18Var2).o, zni.b);
                    int i10 = ((i8 & 7168) == 2048 ? i9 : z3) | (e18Var2.h(dw8Var) ? 1 : 0);
                    Object objN = e18Var2.N();
                    if (i10 != 0 || objN == jd4.a) {
                        objN = new ik1(pz7Var, 7, dw8Var);
                        e18Var2.k0(objN);
                    }
                    boolean z4 = z3;
                    e18 e18Var4 = e18Var2;
                    rvk.a(str, strJ0, androidx.compose.foundation.b.c(iqbVarP, false, null, null, null, (zy7) objN, 15), null, ho4.a, 0, e18Var4, 24576, 104);
                    i8 = i8;
                    i9 = i9;
                    e18Var2 = e18Var4;
                    z3 = z4;
                }
                arrayList2 = arrayList4;
                i4 = i8;
                ?? r62 = i9;
                z2 = z3;
                e18 e18Var5 = e18Var2;
                ij0.w(e18Var5, z2, r62, z2);
                r6 = r62;
                e18Var = e18Var5;
            }
            if (arrayList2.isEmpty()) {
                r10 = r6;
                pz7Var4 = pz7Var5;
                bz7Var3 = bz7Var;
                e18Var.a0(-396454240);
                e18Var.p(z2);
                r152 = e18Var;
            } else {
                e18Var.a0(-397376800);
                iqb iqbVarC = b.c(fqbVar, 0.8f);
                o5b o5bVarD = dw1.d(lja.I, z2);
                int iHashCode4 = Long.hashCode(e18Var.T);
                hyc hycVarL4 = e18Var.l();
                iqb iqbVarE4 = kxk.E(e18Var, iqbVarC);
                dd4.e.getClass();
                re4 re4Var3 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var3);
                } else {
                    e18Var.n0();
                }
                z80 z80Var5 = cd4.f;
                d4c.i0(e18Var, z80Var5, o5bVarD);
                z80 z80Var6 = cd4.e;
                d4c.i0(e18Var, z80Var6, hycVarL4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                z80 z80Var7 = cd4.g;
                d4c.i0(e18Var, z80Var7, numValueOf2);
                bx bxVar2 = cd4.h;
                d4c.h0(e18Var, bxVar2);
                z80 z80Var8 = cd4.d;
                d4c.i0(e18Var, z80Var8, iqbVarE4);
                ArrayList<spf> arrayList5 = arrayList2;
                iqb iqbVarJ = gb9.J(yfd.p(fqbVar, gm3.a(e18Var).q, xve.b(12.0f)), 12.0f);
                o5b o5bVarD2 = dw1.d(lja.G, z2);
                int iHashCode5 = Long.hashCode(e18Var.T);
                hyc hycVarL5 = e18Var.l();
                iqb iqbVarE5 = kxk.E(e18Var, iqbVarJ);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var3);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var5, o5bVarD2);
                d4c.i0(e18Var, z80Var6, hycVarL5);
                ij0.t(iHashCode5, e18Var, z80Var7, e18Var, bxVar2);
                d4c.i0(e18Var, z80Var8, iqbVarE5);
                q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var, 0);
                int iHashCode6 = Long.hashCode(e18Var.T);
                hyc hycVarL6 = e18Var.l();
                iqb iqbVarE6 = kxk.E(e18Var, fqbVar);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var3);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var5, q64VarA2);
                d4c.i0(e18Var, z80Var6, hycVarL6);
                ij0.t(iHashCode6, e18Var, z80Var7, e18Var, bxVar2);
                d4c.i0(e18Var, z80Var8, iqbVarE6);
                e18Var.a0(-327250872);
                e18 e18Var6 = e18Var;
                for (spf spfVar : arrayList5) {
                    List list5 = list;
                    e18 e18Var7 = e18Var6;
                    f(spfVar, z ? null : (jz0) bz7Var.invoke(Integer.valueOf(list5.indexOf(spfVar))), z, pz7Var5, null, e18Var7, ((i4 >> 9) & 7168) | 384, 16);
                    list = list5;
                    e18Var6 = e18Var7;
                }
                bz7Var3 = bz7Var;
                pz7Var4 = pz7Var5;
                e18Var6.p(false);
                r10 = 1;
                e18Var6.p(true);
                e18Var6.p(true);
                e18Var6.p(true);
                e18Var6.p(false);
                r152 = e18Var6;
            }
            r152.p(r10);
            pz7Var3 = pz7Var4;
            r15 = r152;
        } else {
            bz7Var3 = bz7Var;
            e18 e18Var8 = e18Var2;
            e18Var8.T();
            pz7Var3 = pz7Var2;
            r15 = e18Var8;
        }
        r7e r7eVarS = r15.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a32(lebVar, z, bz7Var3, pz7Var, (bz7) bz7Var2, iqbVar, pz7Var3, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r28, defpackage.l1d r29, defpackage.zy7 r30, defpackage.iqb r31, java.lang.Integer r32, defpackage.ld4 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttj.d(java.lang.String, l1d, zy7, iqb, java.lang.Integer, ld4, int):void");
    }

    public static final void e(final l1d l1dVar, final Integer num, ld4 ld4Var, final int i2) {
        int i3;
        final l1d l1dVar2;
        final int i4;
        x2d x2dVar;
        String str;
        String strK0;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(510307471);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(l1dVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(num) ? 32 : 16;
        }
        int i5 = 1;
        final int i6 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = l1dVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                e18Var.a0(-1614176563);
                e18Var.p(false);
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new pz7() { // from class: g1d
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            iei ieiVar = iei.a;
                            int i8 = i2;
                            Integer num2 = num;
                            l1d l1dVar3 = l1dVar;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    ttj.e(l1dVar3, num2, ld4Var2, x44.p0(i8 | 1));
                                    break;
                                default:
                                    ttj.e(l1dVar3, num2, ld4Var2, x44.p0(i8 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    return;
                }
                return;
            }
            if (iOrdinal == 2) {
                e18Var.a0(779215426);
                x2dVar = new x2d(gm3.a(e18Var).q, gm3.a(e18Var).O, d4c.j0(R.string.phone_call_status_connecting, e18Var), true);
                e18Var.p(false);
            } else if (iOrdinal == 3) {
                e18Var.a0(779223236);
                x2dVar = new x2d(gm3.a(e18Var).E, gm3.a(e18Var).D, d4c.j0(R.string.phone_call_status_live, e18Var), true);
                e18Var.p(false);
            } else {
                if (iOrdinal != 4) {
                    throw ebh.u(e18Var, 779212246, false);
                }
                e18Var.a0(779231274);
                long j2 = gm3.a(e18Var).q;
                long j3 = gm3.a(e18Var).O;
                if (num == null) {
                    e18Var.a0(-1613509320);
                    e18Var.p(false);
                    strK0 = null;
                } else {
                    e18Var.a0(-1613509319);
                    int iIntValue = num.intValue();
                    int i7 = iIntValue / 3600;
                    int i8 = (iIntValue % 3600) / 60;
                    int i9 = iIntValue % 60;
                    if (i7 > 0) {
                        str = i7 + ":" + bsg.O0(2, String.valueOf(i8)) + ":" + bsg.O0(2, String.valueOf(i9));
                    } else {
                        str = i8 + ":" + bsg.O0(2, String.valueOf(i9));
                    }
                    strK0 = d4c.k0(R.string.phone_call_status_ended_with_duration, new Object[]{str}, e18Var);
                    e18Var.p(false);
                }
                if (strK0 == null) {
                    strK0 = vb7.n(e18Var, 779239263, R.string.phone_call_status_ended, e18Var, false);
                } else {
                    e18Var.a0(779234923);
                    e18Var.p(false);
                }
                x2dVar = new x2d(j2, j3, strK0, false);
                e18Var.p(false);
            }
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(i5));
            vve vveVar = xve.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(fqbVar, vveVar);
            wo8 wo8Var = zni.b;
            iqb iqbVarK = gb9.K(yfd.p(iqbVarV, x2dVar.a, wo8Var), 10.0f, 4.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            long j4 = x2dVar.b;
            if (x2dVar.d) {
                e18Var.a0(-692116810);
                dw1.a(yfd.p(xn5.V(b.o(fqbVar, 6.0f), vveVar), j4, wo8Var), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-691939025);
                e18Var.p(false);
            }
            i4 = 1;
            tjh.b(x2dVar.c, null, j4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            l1dVar2 = l1dVar;
        } else {
            l1dVar2 = l1dVar;
            i4 = 1;
            e18Var.T();
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new pz7() { // from class: g1d
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i4;
                    iei ieiVar = iei.a;
                    int i82 = i2;
                    Integer num2 = num;
                    l1d l1dVar3 = l1dVar2;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            ttj.e(l1dVar3, num2, ld4Var2, x44.p0(i82 | 1));
                            break;
                        default:
                            ttj.e(l1dVar3, num2, ld4Var2, x44.p0(i82 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.spf r32, defpackage.jz0 r33, boolean r34, defpackage.pz7 r35, defpackage.bz7 r36, defpackage.ld4 r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttj.f(spf, jz0, boolean, pz7, bz7, ld4, int, int):void");
    }

    public static final void g(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1733320979);
        int i4 = (e18Var.h(zy7Var) ? 4 : 2) | i2 | 48;
        int i5 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(i5));
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(xn5.V(b.c(fqbVar, 1.0f), xve.b(12.0f)), false, null, null, null, zy7Var, 15), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            ud0 ud0Var = ud0.h0;
            long j2 = gm3.a(e18Var).O;
            i3 = 1;
            ef2 ef2Var = ef2.F;
            iqbVar2 = fqbVar;
            iv1.b(ud0Var, null, null, ef2Var, j2, e18Var, 3120, 4);
            tjh.b(d4c.j0(R.string.ccr_thinking_thought_process, e18Var), new hw9(1.0f, false), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110584);
            e18Var = e18Var;
            iv1.b(ud0.C, null, null, ef2Var, gm3.a(e18Var).O, e18Var, 3120, 4);
            e18Var.p(true);
        } else {
            i3 = 1;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar2, i2, i3);
        }
    }

    public static void h(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor.getStartOffset() < 0) {
            sz6.p("AssetFileDescriptor offset should be >= 0");
            return;
        }
        if (assetFileDescriptor.getLength() != -1 && assetFileDescriptor.getLength() < 0) {
            sz6.p("AssetFileDescriptor should have valid length");
            return;
        }
        if (assetFileDescriptor.getDeclaredLength() != -1 && assetFileDescriptor.getDeclaredLength() < 0) {
            sz6.p("AssetFileDescriptor should have valid declared length");
            return;
        }
        if (assetFileDescriptor.getLength() == -1 && assetFileDescriptor.getStartOffset() != 0) {
            pmf.n("AssetFileDescriptor offset should be 0 for unknown length");
        } else {
            if (assetFileDescriptor.getLength() != -1) {
                return;
            }
            pmf.n("AssetFileDescriptor should have known length");
        }
    }

    public static final long i(gb6 gb6Var) {
        DragEvent dragEvent = gb6Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final boolean j(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof ku6) {
            return true;
        }
        return (fhiVarK0 instanceof sn7) && (((sn7) fhiVarK0).o0() instanceof ku6);
    }

    public static final boolean k(j7g j7gVar) {
        return fbi.e(j7gVar);
    }

    public static final Set l(gb6 gb6Var) {
        ClipDescription clipDescription = gb6Var.a.getClipDescription();
        if (clipDescription == null) {
            return um6.E;
        }
        pwf pwfVar = new pwf(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i2 = 0; i2 < mimeTypeCount; i2++) {
            pwfVar.add(clipDescription.getMimeType(i2));
        }
        return sf5.k(pwfVar);
    }

    public static final iqb m(iqb iqbVar, i4g i4gVar) {
        iqbVar.getClass();
        i4gVar.getClass();
        return gb9.I(iqbVar, i4gVar.b());
    }

    public static String n(AssetFileDescriptor assetFileDescriptor, int i2, boolean z) throws IOException {
        try {
            h(assetFileDescriptor);
            int length = (int) assetFileDescriptor.getLength();
            if (assetFileDescriptor.getLength() <= i2) {
                i2 = length;
            } else if (!z) {
                throw new LengthLimitExceededException("AssetFileDescriptor.getLength() should be <= " + i2);
            }
            byte[] bArr = new byte[i2];
            ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = fileInputStream.read(bArr, i3, i2 - i3);
                    if (i4 < 0) {
                        break;
                    }
                    i3 += i4;
                }
                if (i3 != i2) {
                    throw new IOException("Couldn't read " + i2 + " bytes from the AssetFileDescriptor");
                }
                parcelFileDescriptor.close();
                assetFileDescriptor.close();
                if (z) {
                    i2--;
                    while (true) {
                        if (i2 < 0) {
                            i2 = -1;
                            break;
                        }
                        if ((bArr[i2] & (-64)) != -128) {
                            break;
                        }
                        i2--;
                    }
                }
                return new String(bArr, 0, i2, StandardCharsets.UTF_8);
            } finally {
            }
        } catch (Throwable th) {
            assetFileDescriptor.close();
            throw th;
        }
        assetFileDescriptor.close();
        throw th;
    }

    public static final DragEvent o(gb6 gb6Var) {
        return gb6Var.a;
    }
}
