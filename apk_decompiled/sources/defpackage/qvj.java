package defpackage;

import android.text.style.BulletSpan;
import android.text.style.DrawableMarginSpan;
import android.text.style.IconMarginSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.QuoteSpan;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qvj {
    public static final ta4 c;
    public static final ta4 m;
    public static final ta4 n;
    public static final ta4 o;
    public static final ta4 p;
    public static final o54 q;
    public static final o54 r;
    public static final float s;
    public static final o54 t;
    public static final float u;
    public static final o54 v;
    public static final ta4 a = new ta4(167657779, false, new xa4(4));
    public static final ta4 b = new ta4(667860337, false, new xa4(14));
    public static final ta4 d = new ta4(-14854741, false, new ua4(16));
    public static final ta4 e = new ta4(-883647331, false, new xa4(7));
    public static final ta4 f = new ta4(1360911067, false, new xa4(8));
    public static final ta4 g = new ta4(-1953588746, false, new ua4(17));
    public static final ta4 h = new ta4(-831309547, false, new ua4(18));
    public static final ta4 i = new ta4(-1490009952, false, new ua4(19));
    public static final ta4 j = new ta4(661768275, false, new xa4(9));
    public static final ta4 k = new ta4(-1548290922, false, new xa4(10));
    public static final ta4 l = new ta4(-1494180082, false, new xa4(11));

    static {
        int i2 = 15;
        c = new ta4(-264956020, false, new ua4(i2));
        new ta4(697665110, false, new ua4(20));
        new ta4(-1415735961, false, new xa4(12));
        new ta4(-1674147350, false, new xa4(13));
        m = new ta4(494488070, false, new ua4(21));
        n = new ta4(1154760509, false, new xa4(i2));
        o = new ta4(-927508492, false, new xa4(5));
        p = new ta4(2031304968, false, new xa4(6));
        o54 o54Var = o54.L;
        q = o54Var;
        r = o54Var;
        s = 20.0f;
        t = o54.P;
        u = 40.0f;
        v = o54.M;
    }

    public static final void a(final boolean z, final v0i v0iVar, final boolean z2, final boolean z3, final boolean z4, final zy7 zy7Var, final iqb iqbVar, ld4 ld4Var, final int i2) {
        int i3;
        lz1 lz1Var;
        boolean z5;
        boolean zBooleanValue;
        ta4 ta4VarQ0;
        v0iVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1855264309);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? e18Var.f(v0iVar) : e18Var.h(v0iVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.d(R.drawable.anthropicon_calendar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.g(z3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var.g(z4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        int i4 = i3;
        final int i5 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 4793491) != 4793490)) {
            lz1 lz1Var2 = jd4.a;
            if (z) {
                e18Var.a0(-497562481);
                lz1Var = lz1Var2;
                final wxc wxcVarX0 = wd6.x0("android.permission.WRITE_CALENDAR", null, new xxc(false), e18Var, 6, 2);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = mpk.w(new zy7() { // from class: q82
                        @Override // defpackage.zy7
                        public final Object a() {
                            boolean zR;
                            int i6 = i5;
                            yxc yxcVar = yxc.a;
                            wxc wxcVar = wxcVarX0;
                            switch (i6) {
                                case 0:
                                    zR = x44.r(wxcVar.e(), yxcVar);
                                    break;
                                default:
                                    zR = x44.r(wxcVar.e(), yxcVar);
                                    break;
                            }
                            return Boolean.valueOf(zR);
                        }
                    });
                    e18Var.k0(objN);
                }
                zBooleanValue = ((Boolean) ((wlg) objN).getValue()).booleanValue();
                z5 = false;
            } else {
                lz1Var = lz1Var2;
                z5 = false;
                e18Var.a0(-497561138);
                final wxc wxcVarX02 = wd6.x0("android.permission.READ_CALENDAR", null, new xxc(false), e18Var, 6, 2);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    final int i6 = z5 ? 1 : 0;
                    objN2 = mpk.w(new zy7() { // from class: q82
                        @Override // defpackage.zy7
                        public final Object a() {
                            boolean zR;
                            int i62 = i6;
                            yxc yxcVar = yxc.a;
                            wxc wxcVar = wxcVarX02;
                            switch (i62) {
                                case 0:
                                    zR = x44.r(wxcVar.e(), yxcVar);
                                    break;
                                default:
                                    zR = x44.r(wxcVar.e(), yxcVar);
                                    break;
                            }
                            return Boolean.valueOf(zR);
                        }
                    });
                    e18Var.k0(objN2);
                }
                zBooleanValue = ((Boolean) ((wlg) objN2).getValue()).booleanValue();
            }
            e18Var.p(z5);
            if (!zBooleanValue && z4 && z2) {
                e18Var.a0(-497550744);
                ta4VarQ0 = fd9.q0(-1466672876, new tu(4, zy7Var), e18Var);
                e18Var.p(z5);
            } else {
                e18Var.a0(1756015323);
                e18Var.p(z5);
                ta4VarQ0 = null;
            }
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new oob(19);
                e18Var.k0(objN3);
            }
            int i7 = i4 >> 3;
            auk.b(v0iVar, R.drawable.anthropicon_calendar, z2, z3, (zy7) objN3, iqbVar, false, 0L, false, null, ta4VarQ0, e18Var, (i7 & 7168) | (i7 & 14) | 1597440 | (i7 & 112) | (i7 & 896) | (458752 & (i4 >> 6)), 0, 896);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: p82
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qvj.a(z, v0iVar, z2, z3, z4, zy7Var, iqbVar, (ld4) obj, x44.p0(i2 | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void b(l9g l9gVar, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        l9gVar.getClass();
        boolean z = l9gVar.b;
        String strConcat = l9gVar.a;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-760142255);
        int i3 = (e18Var.f(l9gVar) ? 4 : 2) | i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            cxe cxeVarA = axe.a(new ho0(4.0f, true, new sz6(1)), lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            xn5.N(yb5.B((py8) k9g.a.getValue(), e18Var), null, b.o(fqbVar, 14.0f), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            if (strConcat == null || !z) {
                e18Var.a0(-949224243);
                e18Var.p(false);
            } else {
                e18Var.a0(-949485635);
                iv1.b(ud0.H0, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
                e18Var.p(false);
            }
            if (strConcat == null) {
                strConcat = vb7.n(e18Var, 2047592675, R.string.code_agent_from_slack, e18Var, false);
            } else if (z) {
                e18Var.a0(2047595520);
                e18Var.p(false);
            } else {
                e18Var.a0(2047596685);
                e18Var.p(false);
                strConcat = "#".concat(strConcat);
            }
            String str = strConcat;
            tjh.b(str, new hw9(1.0f, false), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(l9gVar, iqbVar2, i2, 10);
        }
    }

    public static byte[] c(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final boolean d(LeadingMarginSpan leadingMarginSpan) {
        return (leadingMarginSpan instanceof QuoteSpan) || (leadingMarginSpan instanceof BulletSpan) || (leadingMarginSpan instanceof IconMarginSpan) || (leadingMarginSpan instanceof DrawableMarginSpan) || (leadingMarginSpan instanceof LeadingMarginSpan.Standard);
    }

    public static oti e(String str) {
        String strGroup;
        if (str == null || bsg.I0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i2 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i3 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i4 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
        strGroup4.getClass();
        return new oti(strGroup4, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0161 -> B:54:0x016d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.p8d r18, defpackage.b33 r19, defpackage.e9 r20, defpackage.x43 r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvj.f(p8d, b33, e9, x43, vp4):java.lang.Object");
    }

    public static byte[] g(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                sz6.j(grc.p(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long i(InputStream inputStream, int i2) {
        byte[] bArrG = g(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrG[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        j(byteArrayOutputStream, i2, 2);
    }
}
