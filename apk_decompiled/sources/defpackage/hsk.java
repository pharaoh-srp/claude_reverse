package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.types.strings.ForkId;
import com.google.android.gms.internal.measurement.zzlk;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hsk {
    public static final ta4 a = new ta4(-428974498, false, new wb4(8));
    public static final ta4 b = new ta4(-659461040, false, new ya4(15));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void a(final zv4 zv4Var, final bz7 bz7Var, bz7 bz7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        final bz7 bz7Var3;
        iqb iqbVar2;
        e18 e18Var;
        z80 z80Var;
        bx bxVar;
        Object obj;
        z80 z80Var2;
        z80 z80Var3;
        int i2;
        fqb fqbVar;
        boolean z;
        ?? r13;
        String strN;
        tkh tkhVar;
        long j;
        long jB;
        e18 e18Var2;
        Object obj2;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-1827022987);
        int i3 = i | (e18Var3.f(zv4Var) ? 4 : 2) | (e18Var3.h(bz7Var) ? 32 : 16) | (e18Var3.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var3.Q(i3 & 1, (i3 & 1171) != 1170)) {
            long j2 = gm3.a(e18Var3).c;
            wo1 wo1Var = lja.Q;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarV = xn5.V(b.c(fqbVar2, 1.0f), xve.b(10.0f));
            boolean z2 = zv4Var.e;
            boolean z3 = zv4Var.d;
            iqb iqbVarB = iqbVarV.B(z2 ? yfd.p(fqbVar2, d54.b(0.04f, j2), zni.b) : fqbVar2);
            int i4 = i3 & 14;
            boolean z4 = ((i3 & 112) == 32) | (i4 == 4);
            Object objN = e18Var3.N();
            Object obj3 = jd4.a;
            Object obj4 = objN;
            if (z4 || objN == obj3) {
                final int i5 = 0;
                Object obj5 = new zy7() { // from class: bw4
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i6 = i5;
                        iei ieiVar = iei.a;
                        zv4 zv4Var2 = zv4Var;
                        bz7 bz7Var4 = bz7Var;
                        switch (i6) {
                            case 0:
                                bz7Var4.invoke(ForkId.m1021boximpl(zv4Var2.a));
                                break;
                            default:
                                bz7Var4.invoke(ForkId.m1021boximpl(zv4Var2.a));
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var3.k0(obj5);
                obj4 = obj5;
            }
            iqb iqbVarC = androidx.compose.foundation.b.c(iqbVarB, false, null, null, null, (zy7) obj4, 15);
            boolean z5 = i4 == 4;
            Object objN2 = e18Var3.N();
            Object obj6 = objN2;
            if (z5 || objN2 == obj3) {
                Object py3Var = new py3(2, zv4Var);
                e18Var3.k0(py3Var);
                obj6 = py3Var;
            }
            iqb iqbVarK = gb9.K(tjf.b(iqbVarC, false, (bz7) obj6), 12.0f, 10.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var3, 48);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var3, z80Var4, cxeVarA);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var3, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var3, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var3, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var3, z80Var7, iqbVarE);
            iqb iqbVarT = b.t(fqbVar2, 16.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode2 = Long.hashCode(e18Var3.T);
            hyc hycVarL2 = e18Var3.l();
            iqb iqbVarE2 = kxk.E(e18Var3, iqbVarT);
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, z80Var4, o5bVarD);
            d4c.i0(e18Var3, z80Var5, hycVarL2);
            ij0.t(iHashCode2, e18Var3, z80Var6, e18Var3, bxVar2);
            d4c.i0(e18Var3, z80Var7, iqbVarE2);
            if (z2) {
                e18Var3.a0(202773425);
                z80Var3 = z80Var7;
                obj = obj3;
                z80Var2 = z80Var6;
                i2 = i4;
                fqbVar = fqbVar2;
                bxVar = bxVar2;
                r13 = 0;
                z80Var = z80Var5;
                z = true;
                iv1.b(ud0.C, null, null, ef2.F, j2, e18Var3, 3120, 4);
                e18Var3.p(false);
            } else {
                z80Var = z80Var5;
                bxVar = bxVar2;
                obj = obj3;
                z80Var2 = z80Var6;
                z80Var3 = z80Var7;
                i2 = i4;
                fqbVar = fqbVar2;
                z = true;
                r13 = 0;
                e18Var3.a0(203086711);
                e18Var3.p(false);
            }
            e18Var3.p(z);
            iqb iqbVarL = gb9.L(new hw9(1.0f, z), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, r13);
            int iHashCode3 = Long.hashCode(e18Var3.T);
            hyc hycVarL3 = e18Var3.l();
            iqb iqbVarE3 = kxk.E(e18Var3, iqbVarL);
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, z80Var4, q64VarA);
            d4c.i0(e18Var3, z80Var, hycVarL3);
            ij0.t(iHashCode3, e18Var3, z80Var2, e18Var3, bxVar);
            d4c.i0(e18Var3, z80Var3, iqbVarE3);
            if (z3) {
                strN = vb7.n(e18Var3, -335049168, R.string.conway_forks_pill_main_label, e18Var3, r13);
            } else {
                e18Var3.a0(-335047200);
                e18Var3.p(r13);
                strN = zv4Var.b;
            }
            String str = strN;
            if (z3) {
                e18Var3.a0(-335039805);
                tkhVar = ((jm3) gm3.c(e18Var3).e.E).h;
            } else {
                e18Var3.a0(-335038497);
                tkhVar = ((jm3) gm3.c(e18Var3).e.E).g;
            }
            e18Var3.p(r13);
            tkh tkhVar2 = tkhVar;
            if (z2) {
                e18Var3.a0(-335036927);
                e18Var3.p(r13);
                j = j2;
            } else {
                e18Var3.a0(-335035934);
                long j3 = gm3.a(e18Var3).M;
                e18Var3.p(r13);
                j = j3;
            }
            boolean z6 = r13;
            int i6 = i2;
            tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var3, 0, 0, 131066);
            e18 e18Var4 = e18Var3;
            String str2 = zv4Var.c;
            if (str2 == null) {
                e18Var4.a0(-1796117516);
                e18Var4.p(z6);
                e18Var2 = e18Var4;
            } else {
                e18Var4.a0(-1796117515);
                String strB = aw4.b(str2, e18Var4);
                tkh tkhVar3 = ((jm3) gm3.c(e18Var4).e.E).i;
                if (z2) {
                    e18Var4.a0(-1761599925);
                    e18Var4.p(z6);
                    jB = d54.b(0.7f, j2);
                } else {
                    e18Var4.a0(-1761598560);
                    jB = gm3.a(e18Var4).N;
                    e18Var4.p(z6);
                }
                tjh.b(strB, null, jB, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar3, e18Var4, 0, 0, 131066);
                e18 e18Var5 = e18Var4;
                e18Var5.p(z6);
                e18Var2 = e18Var5;
            }
            e18Var2.p(true);
            if (z3) {
                bz7Var3 = bz7Var2;
                e18Var2.a0(428731409);
                e18Var2.p(z6);
            } else {
                e18Var2.a0(428378722);
                boolean z7 = (i6 == 4 ? true : z6 ? 1 : 0) | ((i3 & 896) == 256 ? true : z6 ? 1 : 0);
                Object objN3 = e18Var2.N();
                if (z7 != 0 || objN3 == obj) {
                    bz7Var3 = bz7Var2;
                    final int i7 = 1;
                    Object obj7 = new zy7() { // from class: bw4
                        @Override // defpackage.zy7
                        public final Object a() {
                            int i62 = i7;
                            iei ieiVar = iei.a;
                            zv4 zv4Var2 = zv4Var;
                            bz7 bz7Var4 = bz7Var3;
                            switch (i62) {
                                case 0:
                                    bz7Var4.invoke(ForkId.m1021boximpl(zv4Var2.a));
                                    break;
                                default:
                                    bz7Var4.invoke(ForkId.m1021boximpl(zv4Var2.a));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var2.k0(obj7);
                    obj2 = obj7;
                } else {
                    bz7Var3 = bz7Var2;
                    obj2 = objN3;
                }
                ez1.e((zy7) obj2, null, false, null, null, hjk.b, e18Var2, 1572864, 62);
                e18Var2.p(z6);
            }
            e18Var2.p(true);
            iqbVar2 = fqbVar;
            e18Var = e18Var2;
        } else {
            bz7Var3 = bz7Var2;
            e18Var3.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn((Object) zv4Var, (Object) bz7Var, (Object) bz7Var3, iqbVar2, i, 25);
        }
    }

    public static final void b(List list, bz7 bz7Var, bz7 bz7Var2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-578057149);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            fqb fqbVar = fqb.E;
            otj.g(iuj.G(true, null, e18Var, 6, 2), zy7Var, d4c.j0(R.string.conway_forks_sheet_title, e18Var), fqbVar, null, false, false, null, fd9.q0(-1584691462, new f44(list, bz7Var, bz7Var2, 12), e18Var), e18Var, ((i2 >> 6) & 112) | 100666368, 240);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) list, (Object) bz7Var, (Object) bz7Var2, zy7Var, iqbVar2, i, 11);
        }
    }

    public static final void c(List list, bz7 bz7Var, bz7 bz7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-417878224);
        int i2 = (e18Var2.f(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarK0 = mpk.k0(b.c(fqbVar, 1.0f), mpk.o);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK0);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            dw1.a(yfd.p(b.q(gb9.N(new ko8(lja.T), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 5), 36.0f, 4.0f), gm3.a(e18Var2).v, xve.b(2.0f)), e18Var2, 0);
            qnc qncVar = new qnc(12.0f, 8.0f, 12.0f, 8.0f);
            iqb iqbVarB = b.c(fqbVar, 1.0f).B(new hw9(1.0f, false));
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new l6(list, bz7Var, bz7Var2, 27);
                e18Var2.k0(objN);
            }
            iqbVar2 = fqbVar;
            knk.h(iqbVarB, null, qncVar, false, null, null, null, false, null, (bz7) objN, e18Var2, 384, 506);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd((Object) list, (Object) bz7Var, (Object) bz7Var2, (Object) iqbVar2, i, 25);
        }
    }

    public static ire d(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext != null) {
            activity = applicationContext;
        }
        return new ire(new enk(activity));
    }

    public static String e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((b4i) it.next()).a.g.o;
            if (gkb.j(str2)) {
                return "video/mp4";
            }
            if (gkb.g(str2)) {
                z = true;
            } else if (gkb.h(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static String f(pl9 pl9Var) {
        pl9Var.getClass();
        Map map = jl8.a;
        if (map.get(pl9Var) == null) {
            e0.d(pl9Var, ".simpleName", "Given recordType is not valid : ");
            return null;
        }
        return "android.permission.health.READ_" + ((String) map.get(pl9Var));
    }

    public static final Object g(ApiResult apiResult) {
        apiResult.getClass();
        if (apiResult instanceof of0) {
            return ((of0) apiResult).b;
        }
        if (apiResult instanceof nf0) {
            return null;
        }
        wg6.i();
        return null;
    }

    public static final Throwable h(nf0 nf0Var) {
        mf0 mf0Var = nf0Var instanceof mf0 ? (mf0) nf0Var : null;
        if (mf0Var != null) {
            return mf0Var.a;
        }
        return null;
    }

    public static String i(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014e -> B:48:0x0154). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(int r17, defpackage.ic1 r18, defpackage.py3 r19, defpackage.um5 r20, defpackage.ak7 r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsk.j(int, ic1, py3, um5, ak7, vp4):java.lang.Object");
    }

    public static /* synthetic */ void k(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws zzlk {
        if (!o(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !o(b4) && !o(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzlk.a();
    }

    public static /* synthetic */ void l(byte b2, byte b3, byte b4, char[] cArr, int i) throws zzlk {
        if (o(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || o(b4)))) {
            throw zzlk.a();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static /* synthetic */ void m(byte b2, byte b3, char[] cArr, int i) throws zzlk {
        if (b2 < -62 || o(b3)) {
            throw zzlk.a();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static /* synthetic */ void n(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static boolean o(byte b2) {
        return b2 > -65;
    }
}
