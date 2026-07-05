package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rwk {
    public static final xb a = new xb(2);

    public static final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1489670360);
        if (e18Var.Q(i & 1, i != 0)) {
            me7.a(d4c.j0(R.string.caps_badge_beta, e18Var), null, 0L, 0L, null, null, null, null, e18Var, 0, 254);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new te(i, 8);
        }
    }

    public static final void b(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1952499782);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            jl3 jl3VarA = gm3.a(e18Var);
            iqb iqbVarP = yfd.p(xn5.V(fqb.E, xve.b(4.0f)), d54.b(0.12f, jl3VarA.F), zni.b);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            iqb iqbVarK = gb9.K(b.b(iqbVarP, (zub) objN, null, false, null, null, zy7Var, 28), 10.0f, 4.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            g("clear", jl3VarA.G, e18Var, 6);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, i3, zy7Var);
        }
    }

    public static final void c(long j, float f, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1743081619);
        int i2 = (e18Var.e(j) ? 4 : 2) | i | (e18Var.c(f) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            long j2 = gm3.a(e18Var).F;
            iqb iqbVarO = androidx.compose.foundation.layout.b.o(fqb.E, 40.0f);
            vve vveVar = xve.a;
            iqb iqbVarT = ez1.t(yfd.p(xn5.V(iqbVarO, vveVar), j, zni.b), 1.0f, d54.b(0.6f, j2), vveVar);
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarT);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            mpk.b(String.valueOf(mwa.L(f)), null, new tkh(j2, eve.B(12), null, null, xt7.H, 0L, 0L, 0, 0, 0L, null, 16777180), null, 0, false, 0, 0, e18Var, 0, 1018);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wc9(j, f, i);
        }
    }

    public static final void d(final by5 by5Var, final zy7 zy7Var, final zy7 zy7Var2, final String str, final String str2, String str3, int i, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        String strJ0;
        e18 e18Var;
        final int i5;
        final String str4;
        int i6;
        int i7;
        by5Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        str.getClass();
        str2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(775868610);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? e18Var2.f(by5Var) : e18Var2.h(by5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= e18Var2.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= e18Var2.f(str2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                strJ0 = str3;
                int i8 = e18Var2.f(strJ0) ? 131072 : 65536;
                i4 |= i8;
            } else {
                strJ0 = str3;
            }
            i4 |= i8;
        } else {
            strJ0 = str3;
        }
        int i9 = i4 | 1572864;
        byte b = 0;
        int i10 = 1;
        if (e18Var2.Q(i9 & 1, (599187 & i9) != 599186)) {
            e18Var2.V();
            if ((i2 & 1) == 0 || e18Var2.A()) {
                if ((i3 & 32) != 0) {
                    strJ0 = d4c.j0(R.string.delete_dialog_default_subtitle, e18Var2);
                    i9 &= -458753;
                }
                i6 = i9;
                str4 = strJ0;
                i7 = 3;
            } else {
                e18Var2.T();
                if ((i3 & 32) != 0) {
                    i9 &= -458753;
                }
                i6 = i9;
                str4 = strJ0;
                i7 = i;
            }
            e18Var2.q();
            gh2 gh2VarM = by5Var.M();
            boolean z = (i6 & 112) == 32;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new zg2(zy7Var, null, i10);
                e18Var2.k0(objN);
            }
            x44.b(gh2VarM, (pz7) objN, e18Var2, 0);
            boolean z2 = ((i6 & 14) == 4 || ((i6 & 8) != 0 && e18Var2.h(by5Var))) | ((i6 & 896) == 256);
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new w95(by5Var, 11, zy7Var2);
                e18Var2.k0(objN2);
            }
            i5 = i7;
            e18Var = e18Var2;
            trk.b((zy7) objN2, fd9.q0(1085509221, new cy5(by5Var, str2), e18Var2), null, fd9.q0(1105050343, new wh(17, zy7Var2), e18Var2), fd9.q0(1124591465, new lp1(str, i7, i10, b), e18Var2), fd9.q0(1134362026, new cy5(str4, by5Var), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            i5 = i;
            str4 = strJ0;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: dy5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rwk.d(by5Var, zy7Var, zy7Var2, str, str2, str4, i5, (ld4) obj, x44.p0(i2 | 1), i3);
                    return iei.a;
                }
            };
        }
    }

    public static final void e(Map map, Set set, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1153028698);
        int i2 = i | (e18Var.f(set) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            jl3 jl3VarA = gm3.a(e18Var);
            vve vveVarB = xve.b(8.0f);
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(ez1.t(yfd.p(xn5.V(fqbVar, vveVarB), d54.b(0.88f, d54.b), zni.b), 1.0f, d54.b(0.15f, jl3VarA.F), xve.b(8.0f)), 12.0f, 8.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (map.isEmpty()) {
                e18Var.a0(-1941892638);
                g("jank: idle", jl3VarA.H, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-1941799018);
                e18Var.a0(-2140847143);
                int i3 = 0;
                for (Object obj : w44.i1(map.entrySet(), new g67(9))) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        x44.n0();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    String str = (String) entry.getKey();
                    zc9 zc9Var = (zc9) entry.getValue();
                    if (i3 > 0) {
                        sq6.A(6.0f, 1284837012, e18Var, e18Var, fqbVar);
                    } else {
                        e18Var.a0(1175269579);
                    }
                    e18Var.p(false);
                    h(str, zc9Var, !set.contains(str), e18Var, 0);
                    i3 = i4;
                }
                e18Var.p(false);
                kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 8.0f));
                b(zy7Var, e18Var, (i2 >> 6) & 14);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(map, set, zy7Var, i, 8);
        }
    }

    public static final void f(md9 md9Var, ld4 ld4Var, int i) {
        md9 md9Var2;
        md9 md9Var3;
        nwb nwbVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1680074691);
        int i2 = i | 2;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.V();
            int i3 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(md9.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                md9Var3 = (md9) objN;
            } else {
                e18Var.T();
                md9Var3 = md9Var;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new mdg();
                e18Var.k0(objN2);
            }
            mdg mdgVar = (mdg) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(null);
                e18Var.k0(objN3);
            }
            nwb nwbVar2 = (nwb) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(um6.E);
                e18Var.k0(objN4);
            }
            nwb nwbVar3 = (nwb) objN4;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(new fcc(0L));
                e18Var.k0(objN5);
            }
            nwb nwbVar4 = (nwb) objN5;
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN6);
            }
            nwb nwbVar5 = (nwb) objN6;
            boolean zH = e18Var.h(md9Var3);
            Object objN7 = e18Var.N();
            if (zH || objN7 == lz1Var) {
                nwbVar = nwbVar3;
                w14 w14Var = new w14(md9Var3, mdgVar, nwbVar2, nwbVar, null, 28);
                e18Var.k0(w14Var);
                objN7 = w14Var;
            } else {
                nwbVar = nwbVar3;
            }
            fd9.i(e18Var, (pz7) objN7, md9Var3);
            zc9 zc9Var = (zc9) nwbVar2.getValue();
            float fP = zc9Var != null ? p(zc9Var.d, zc9Var.a) : MTTypesetterKt.kLineSkipLimitMultiplier;
            nwb nwbVar6 = nwbVar;
            md9 md9Var4 = md9Var3;
            md9Var2 = md9Var4;
            u40.b(lja.N, (((long) mwa.L(Float.intBitsToFloat((int) (((fcc) nwbVar4.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) mwa.L(Float.intBitsToFloat((int) (((fcc) nwbVar4.getValue()).a >> 32)))) << 32), null, fd9.q0(46145056, new g46(nwbVar4, nwbVar5, mdgVar, md9Var4, fP, nwbVar6), e18Var), e18Var, 24582);
        } else {
            e18Var.T();
            md9Var2 = md9Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mk4(md9Var2, i, 27);
        }
    }

    public static final void g(String str, long j, ld4 ld4Var, int i) {
        String str2;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-716351962);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (e18Var.f(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        int i3 = i2 | (e18Var.e(j) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            mpk.b(str2, null, new tkh(j, eve.B(11), null, null, xt7.H, 0L, 0L, 0, 0, 0L, null, 16777180), null, 0, false, 0, 0, e18Var, i3 & 14, 1018);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xc9(str, j, i, 0);
        }
    }

    public static final void h(String str, zc9 zc9Var, boolean z, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1853414954);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(zc9Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            jl3 jl3VarA = gm3.a(e18Var);
            int i3 = zc9Var.d;
            int i4 = zc9Var.f;
            int i5 = zc9Var.e;
            int i6 = zc9Var.a;
            float fP = p(i3, i6);
            float fP2 = p(i5, i6);
            float fP3 = p(i4, i6);
            String strO = z ? kgh.o(str, " (done)") : str;
            long jL = l(jl3VarA.F, z);
            long jL2 = l(jl3VarA.G, z);
            g(strO, jL, e18Var, 0);
            g("  " + i6 + " frames · max " + zc9Var.c + "ms", jL2, e18Var, 0);
            g(String.format("  jank   %5.1f%%  (%d > 16ms)", Arrays.copyOf(new Object[]{Float.valueOf(fP), Integer.valueOf(zc9Var.d)}, 2)), l(j(fP, jl3VarA), z), e18Var, 0);
            g(String.format("  slow   %5.1f%%  (%d > 25ms)", Arrays.copyOf(new Object[]{Float.valueOf(fP2), Integer.valueOf(i5)}, 2)), l(j(fP2, jl3VarA), z), e18Var, 0);
            g(String.format("  frozen %5.1f%%  (%d > 700ms)", Arrays.copyOf(new Object[]{Float.valueOf(fP3), Integer.valueOf(i4)}, 2)), l(j(fP3, jl3VarA), z), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(str, zc9Var, z, i, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.jwf r4, java.lang.String r5, java.lang.String r6, defpackage.bz7 r7, defpackage.bz7 r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwk.i(jwf, java.lang.String, java.lang.String, bz7, bz7, vp4):java.lang.Object");
    }

    public static final long j(float f, jl3 jl3Var) {
        return f < 2.0f ? jl3Var.D : f < 10.0f ? jl3Var.Q : jl3Var.z;
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_NO_RECURSE];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static final long l(long j, boolean z) {
        return z ? d54.b(d54.d(j) * 0.5f, j) : j;
    }

    public static long m(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? ke0.e(packageInfo) : packageInfo.versionCode;
    }

    public static File n(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer o(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final float p(int i, int i2) {
        return i2 == 0 ? MTTypesetterKt.kLineSkipLimitMultiplier : (i / i2) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.jwf r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, defpackage.bz7 r8, defpackage.bz7 r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwk.q(jwf, java.lang.String, java.lang.String, java.lang.String, bz7, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.jwf r4, java.lang.String r5, java.lang.String r6, defpackage.bz7 r7, defpackage.bz7 r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwk.r(jwf, java.lang.String, java.lang.String, bz7, bz7, vp4):java.lang.Object");
    }
}
