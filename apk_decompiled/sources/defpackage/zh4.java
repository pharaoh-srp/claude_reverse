package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.datadog.trace.bootstrap.config.provider.b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zh4 {
    public static final ob0 a = new ob0(Float.POSITIVE_INFINITY);
    public static final pb0 b = new pb0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final qb0 c = new qb0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final rb0 d = new rb0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ob0 e = new ob0(Float.NEGATIVE_INFINITY);
    public static final pb0 f = new pb0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final qb0 g = new qb0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final rb0 h = new rb0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final b i = new b(new gmf[0]);
    public static final xh6 j = new xh6(18);
    public static final j6c k = new j6c();
    public static final k6c l = new k6c();
    public static final q0g m = q0g.F;
    public static final o54 n = o54.M;
    public static final float o = 4.0f;
    public static final float p = 32.0f;
    public static final float q = 1.0f;

    public static final void A(EditorInfo editorInfo, CharSequence charSequence, long j2, xy8 xy8Var, String[] strArr) {
        int i2;
        int i3;
        int i4 = xy8Var.e;
        int i5 = xy8Var.d;
        boolean z = xy8Var.a;
        if (i4 == 1) {
            i2 = z ? 6 : 0;
        } else if (i4 == 0) {
            i2 = 1;
        } else if (i4 == 2) {
            i2 = 2;
        } else if (i4 == 6) {
            i2 = 5;
        } else if (i4 == 5) {
            i2 = 7;
        } else if (i4 == 3) {
            i2 = 3;
        } else if (i4 == 4) {
            i2 = 4;
        } else {
            if (i4 != 7) {
                sz6.j("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i2;
        gea geaVar = xy8Var.f;
        if (x44.r(geaVar, gea.G)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(x44.y(geaVar, 10));
            Iterator it = geaVar.E.iterator();
            while (it.hasNext()) {
                arrayList.add(((eea) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i3 = 1;
        } else if (i5 == 3) {
            i3 = 2;
        } else if (i5 == 4) {
            i3 = 3;
        } else if (i5 == 5) {
            i3 = 17;
        } else if (i5 == 6) {
            i3 = 33;
        } else if (i5 == 7) {
            i3 = 129;
        } else if (i5 == 8) {
            i3 = 18;
        } else {
            if (i5 != 9) {
                sz6.j("Invalid Keyboard Type");
                return;
            }
            i3 = 8194;
        }
        editorInfo.inputType = i3;
        if (!z && (i3 & 1) == 1) {
            editorInfo.inputType = 131072 | i3;
            if (xy8Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 1) == 1) {
            int i7 = xy8Var.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | FreeTypeConstants.FT_LOAD_MONOCHROME;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (xy8Var.c) {
                editorInfo.inputType |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
            }
        }
        int i8 = kkh.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        ez1.T(editorInfo, charSequence);
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        editorInfo.imeOptions |= 33554432;
        if (!tug.a || i5 == 7 || i5 == 8) {
            ez1.U(editorInfo, false);
            return;
        }
        ez1.U(editorInfo, true);
        editorInfo.setSupportedHandwritingGestures(x44.X(qh3.d(), qh3.m(), qh3.k(), qh3.l(), qh3.n(), qh3.o(), qh3.p()));
        editorInfo.setSupportedHandwritingGesturePreviews(mp0.Z0(new Class[]{qh3.d(), qh3.m(), qh3.k(), qh3.l()}));
    }

    public static a80 a(float f2) {
        return new a80(Float.valueOf(f2), dgj.f, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r25, defpackage.tkh r26, defpackage.u2a r27, defpackage.ld4 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.b(iqb, tkh, u2a, ld4, int, int):void");
    }

    public static final void c(Object obj, int i2, uz9 uz9Var, ta4 ta4Var, ld4 ld4Var, int i3) {
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(872548579);
        if ((i3 & 6) == 0) {
            i4 = (e18Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= e18Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= e18Var.h(uz9Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i3 & 3072) == 0) {
            i4 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = e18Var.f(obj) | e18Var.f(uz9Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new sz9(obj, uz9Var);
                e18Var.k0(objN);
            }
            sz9 sz9Var = (sz9) objN;
            sz9Var.c = i2;
            lsc lscVar = sz9Var.g;
            xe4 xe4Var = y2d.a;
            sz9 sz9Var2 = (sz9) e18Var.j(xe4Var);
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                if (sz9Var2 != ((sz9) lscVar.getValue())) {
                    lscVar.setValue(sz9Var2);
                    if (sz9Var.d > 0) {
                        sz9 sz9Var3 = sz9Var.e;
                        if (sz9Var3 != null) {
                            sz9Var3.b();
                        }
                        if (sz9Var2 != null) {
                            sz9Var2.a();
                        } else {
                            sz9Var2 = null;
                        }
                        sz9Var.e = sz9Var2;
                    }
                }
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                boolean zF2 = e18Var.f(sz9Var);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = new tz9(0, sz9Var);
                    e18Var.k0(objN2);
                }
                fd9.d(sz9Var, (bz7) objN2, e18Var);
                j8.c(xe4Var.a(sz9Var), ta4Var, e18Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                throw th;
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ba3(obj, i2, uz9Var, ta4Var, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.cjh r34, final defpackage.bz7 r35, final java.lang.String r36, final defpackage.iqb r37, boolean r38, defpackage.pz7 r39, java.lang.String r40, defpackage.pzi r41, final defpackage.mp9 r42, defpackage.kp9 r43, long r44, defpackage.tkh r46, int r47, defpackage.ld4 r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.d(cjh, bz7, java.lang.String, iqb, boolean, pz7, java.lang.String, pzi, mp9, kp9, long, tkh, int, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r35, final defpackage.bz7 r36, final java.lang.String r37, final defpackage.iqb r38, boolean r39, java.lang.String r40, defpackage.pz7 r41, defpackage.pzi r42, final defpackage.mp9 r43, defpackage.kp9 r44, long r45, defpackage.tkh r47, int r48, defpackage.ld4 r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.e(java.lang.String, bz7, java.lang.String, iqb, boolean, java.lang.String, pz7, pzi, mp9, kp9, long, tkh, int, ld4, int, int):void");
    }

    public static final void f(String str, tkh tkhVar, iqb iqbVar, mnc mncVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        iqb iqbVar3;
        str.getClass();
        tkhVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1903367325);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.f(tkhVar) ? 32 : 16) | 28032;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            int i4 = i2 & 1;
            fqb fqbVar = fqb.E;
            if (i4 == 0 || e18Var.A()) {
                iqbVar3 = fqbVar;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(iqbVar3, 1.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new xga(15);
                e18Var.k0(objN);
            }
            iqb iqbVarI = gb9.I(tjf.b(iqbVarC, true, (bz7) objN), mncVar);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqbVar, 8.0f));
            tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, tkhVar, e18Var, i3 & 14, ((i3 << 18) & 29360128) | 24960, 110586);
            e18Var = e18Var;
            e18Var.a0(-197677719);
            e18Var.p(false);
            e18Var.a0(-197530903);
            e18Var.p(false);
            e18Var.p(true);
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f73(str, tkhVar, iqbVar2, mncVar, i2, 8);
        }
    }

    public static final void g(int i2, int i3, ld4 ld4Var, iqb iqbVar, String str, boolean z) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-184843806);
        int i4 = i3 | (e18Var2.f(str) ? 4 : 2) | 48 | (e18Var2.d(i2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i5 = 1;
        if (e18Var2.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var2.V();
            int i6 = i3 & 1;
            iqb iqbVarA = fqb.E;
            if (i6 == 0 || e18Var2.A()) {
                iqbVar2 = iqbVarA;
            } else {
                e18Var2.T();
                iqbVar2 = iqbVar;
            }
            e18Var2.q();
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(iqbVar2, 1.0f);
            if (z) {
                e18Var2.a0(-1541214214);
                Object objN = e18Var2.N();
                if (objN == jd4.a) {
                    objN = new xga(i5);
                    e18Var2.k0(objN);
                }
                iqbVarA = tjf.a(iqbVarA, (bz7) objN);
            } else {
                e18Var2.a0(-1541213270);
            }
            e18Var2.p(false);
            e18Var = e18Var2;
            tjh.b(str, iqbVarC.B(iqbVarA), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, new fdh(i2), 0L, 0, false, 0, 0, null, null, e18Var, i4 & 14, (i4 >> 6) & 14, 261112);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nb1(i2, i3, iqbVar2, str, z);
        }
    }

    public static final void h(long j2, tkh tkhVar, pz7 pz7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-684938728);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(tkhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            xe4 xe4Var = tjh.a;
            j8.d(new hvd[]{sq6.m(j2, on4.a), xe4Var.a(((tkh) e18Var.j(xe4Var)).f(tkhVar))}, pz7Var, e18Var, ((i3 >> 3) & 112) | 8);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gvd(j2, tkhVar, pz7Var, i2, 0);
        }
    }

    public static final int i(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final Object k(r5l r5lVar, vp4 vp4Var) throws Exception {
        if (!r5lVar.f()) {
            ua2 ua2Var = new ua2(1, zni.I(vp4Var));
            ua2Var.t();
            r5lVar.i(z46.F, new w9h(ua2Var));
            return ua2Var.r();
        }
        Exception excD = r5lVar.d();
        if (excD != null) {
            throw excD;
        }
        if (!r5lVar.d) {
            return r5lVar.e();
        }
        throw new CancellationException("Task " + r5lVar + " was cancelled normally.");
    }

    public static final nwb m(w79 w79Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = mpk.P(Boolean.FALSE);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        boolean z = (((i2 & 14) ^ 6) > 4 && e18Var.f(w79Var)) || (i2 & 6) == 4;
        Object objN2 = e18Var.N();
        if (z || objN2 == lz1Var) {
            objN2 = new kb6(w79Var, nwbVar, null, 2);
            e18Var.k0(objN2);
        }
        fd9.i(e18Var, (pz7) objN2, w79Var);
        return nwbVar;
    }

    public static m2i n(long j2, ld4 ld4Var, int i2) {
        if ((i2 & 1) != 0) {
            j2 = ((gwa) ((e18) ld4Var).j(jwa.a)).a.n;
        }
        long j3 = j2;
        qnc qncVar = n2i.a;
        e18 e18Var = (e18) ld4Var;
        return n2i.d(j3, j3, gm3.a(ld4Var).N, ((d54) e18Var.j(on4.a)).a, gm3.a(e18Var).N, e18Var, 32);
    }

    public static StaticLayout o(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            c39.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            c39.a("invalid end value");
        }
        if (i4 < 0) {
            c39.a("invalid maxLines value");
        }
        if (i2 < 0) {
            c39.a("invalid width value");
        }
        if (i5 < 0) {
            c39.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i7);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i6);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i11 >= 33) {
            builderObtain.setLineBreakConfig(z5.e().setLineBreakStyle(i8).setLineBreakWordStyle(i9).build());
        }
        if (i11 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final Object p(bg9 bg9Var, s06 s06Var, InputStream inputStream) {
        bg9Var.getClass();
        s06Var.getClass();
        inputStream.getClass();
        n78 n78Var = new n78(inputStream);
        cj2 cj2Var = (cj2) n78Var.F;
        try {
            return iv1.p(bg9Var, s06Var, n78Var);
        } finally {
            cj2Var.getClass();
            n12 n12Var = n12.c;
            byte[] bArrArray = cj2Var.c.array();
            bArrArray.getClass();
            n12Var.getClass();
            n12Var.a(bArrArray);
        }
    }

    public static final void q(bg9 bg9Var, znf znfVar, Object obj, OutputStream outputStream) {
        bg9Var.getClass();
        znfVar.getClass();
        outputStream.getClass();
        zu2 zu2Var = new zu2(outputStream);
        byte[] bArr = (byte[]) zu2Var.H;
        try {
            iv1.q(bg9Var, zu2Var, znfVar, obj);
        } finally {
            zu2Var.j();
            fi2 fi2Var = fi2.c;
            char[] cArr = (char[]) zu2Var.I;
            fi2Var.getClass();
            cArr.getClass();
            fi2Var.b(cArr);
            o12 o12Var = o12.c;
            o12Var.getClass();
            bArr.getClass();
            o12Var.a(bArr);
        }
    }

    public static ApiException r(Status status) {
        return status.G != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static final np5 s(fvd fvdVar, ld4 ld4Var) {
        fvdVar.getClass();
        f10.a(0, ld4Var);
        return (np5) ((e18) ld4Var).j(fvdVar);
    }

    public static final int u(int i2, String str) {
        char cCharAt = str.charAt(i2);
        return (cCharAt << 7) + str.charAt(i2 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer v(defpackage.fof r6, defpackage.eo9 r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.v(fof, eo9, boolean):kotlinx.serialization.KSerializer");
    }

    public static final long w(float f2, long j2) {
        float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final cpc x(Object obj, Object obj2) {
        return new cpc(obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.tp4 r4, defpackage.bz7 r5) {
        /*
            boolean r0 = r4 instanceof defpackage.ci5
            if (r0 == 0) goto L13
            r0 = r4
            ci5 r0 = (defpackage.ci5) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            ci5 r0 = new ci5
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.E
            int r1 = r0.F
            r2 = 0
            switch(r1) {
                case 0: goto L5a;
                case 1: goto L51;
                case 2: goto L42;
                case 3: goto L42;
                case 4: goto L39;
                case 5: goto L2a;
                case 6: goto L2a;
                case 7: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L26:
            defpackage.sf5.h0(r4)
            return r4
        L2a:
            defpackage.sf5.h0(r4)     // Catch: java.lang.Throwable -> L2e
            throw r2
        L2e:
            defpackage.fsk.f()     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L32:
            r2.getClass()
            defpackage.mr9.y()
            return r2
        L39:
            defpackage.sf5.h0(r4)
            e07 r4 = (defpackage.e07) r4
            r4.getClass()
            throw r2
        L42:
            defpackage.sf5.h0(r4)     // Catch: java.lang.Throwable -> L46
            throw r2
        L46:
            defpackage.fsk.f()     // Catch: java.lang.Throwable -> L4a
            throw r2     // Catch: java.lang.Throwable -> L4a
        L4a:
            r2.getClass()
            defpackage.mr9.y()
            return r2
        L51:
            defpackage.sf5.h0(r4)
            e07 r4 = (defpackage.e07) r4
            r4.getClass()
            throw r2
        L5a:
            defpackage.sf5.h0(r4)
            r4 = 7
            r0.F = r4
            java.lang.Object r4 = r5.invoke(r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L69
            return r5
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.y(tp4, bz7):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.bt7 r4, long r5, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.c3f
            if (r0 == 0) goto L13
            r0 = r7
            c3f r0 = (defpackage.c3f) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            c3f r0 = new c3f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            bt7 r4 = r0.E
            defpackage.sf5.h0(r7)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r7)
            r0.E = r4
            r0.G = r3
            java.lang.Object r5 = defpackage.d4c.K(r5, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L3e
            return r6
        L3e:
            r4.getClass()
            defpackage.bt7.a(r4)     // Catch: java.lang.Throwable -> L45
            goto L52
        L45:
            r4 = move-exception
            com.anthropic.claude.core.telemetry.SilentException r5 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r6 = "Failed to request focus"
            r5.<init>(r6, r4)
            r4 = 3
            r6 = 0
            com.anthropic.claude.core.telemetry.SilentException.a(r5, r2, r6, r4)
        L52:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.z(bt7, long, vp4):java.lang.Object");
    }

    public abstract void j(zie zieVar, Object obj);

    public abstract List l(String str, List list);

    public abstract void t(Object obj);
}
