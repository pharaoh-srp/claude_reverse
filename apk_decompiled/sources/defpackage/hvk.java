package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.media.AudioDescriptor;
import android.os.Build;
import android.security.identity.IdentityCredential;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.tool.model.Tool;
import java.security.Signature;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hvk {
    public static final ta4 a = new ta4(1217068944, false, new ic4(4));
    public static final ta4 b = new ta4(533366407, false, new ic4(5));
    public static final ta4 c = new ta4(-967117689, false, new ic4(6));

    public static final void a(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1091570384);
        int i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i | 48;
        int i3 = 0;
        int i4 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, fqb.E);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new ij8(24);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            boolean zF = e18Var2.f(nwbVar);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new d29(i3, nwbVar);
                e18Var2.k0(objN2);
            }
            ez1.e((zy7) objN2, null, false, null, null, tnk.a, e18Var2, 1572864, 62);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF2 = e18Var2.f(nwbVar);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new d29(i4, nwbVar);
                e18Var2.k0(objN3);
            }
            zy7Var2 = zy7Var;
            jvk.a(zBooleanValue, (zy7) objN3, zy7Var2, null, null, e18Var2, (i2 << 6) & 8064);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            zy7Var2 = zy7Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wh(i, 29, zy7Var2);
        }
    }

    public static final long b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void c(Tool tool, ld4 ld4Var, int i) {
        int i2;
        tool.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-873017959);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(tool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.T();
        } else if (tool instanceof Tool.DriveSearch) {
            e18Var.a0(-2050935344);
            wtk.c(null, d54.d, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, bc4.a, e18Var, 196656, 29);
            e18Var.p(false);
        } else if (tool instanceof Tool.WebSearch) {
            e18Var.a0(-2050533677);
            wtk.c(null, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, bc4.b, e18Var, 196608, 31);
            e18Var.p(false);
        } else {
            e18Var.a0(-2050240014);
            wtk.c(null, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, bc4.c, e18Var, 196608, 31);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ay3(tool, i, 5);
        }
    }

    public static nz8 d(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            iz8 iz8Var = nz8.F;
            return vde.I;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new a41(0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorC = q00.c(it.next());
            if (audioDescriptorC.getStandard() == 1) {
                byte[] descriptor = audioDescriptorC.getDescriptor();
                if (descriptor.length != 3) {
                    ysj.u("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b2 = descriptor[0];
                    int i = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(tpi.m(i)));
                    }
                }
            }
        }
        return nz8.q(treeSet);
    }

    public static final dk6 e(nf0 nf0Var) {
        nf0Var.getClass();
        lf0 lf0Var = nf0Var instanceof lf0 ? (lf0) nf0Var : null;
        if (lf0Var != null && lf0Var.a == 403) {
            return f(lf0Var.b);
        }
        return null;
    }

    public static final dk6 f(bj3 bj3Var) {
        String d;
        Integer e = bj3Var.getF();
        if (e == null || e.intValue() != 403) {
            return null;
        }
        String strF = bj3Var.getG();
        dk6.F.getClass();
        dk6 dk6VarL = zl4.l(strF);
        if (dk6VarL != null) {
            return dk6VarL;
        }
        if (bj3Var.getG() != null) {
            return null;
        }
        if ((x44.r(bj3Var.getD(), "permission_denied") || x44.r(bj3Var.getD(), "permission_error")) && (d = bj3Var.getE()) != null && bsg.u0(d, "trusted device", true)) {
            return dk6.G;
        }
        return null;
    }

    public static final long g(float f, long j, long j2) {
        float fW = d4c.W(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fW2 = d4c.W(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
    }

    public static BiometricPrompt.CryptoObject h(c61 c61Var) {
        IdentityCredential identityCredential;
        if (c61Var == null) {
            return null;
        }
        Cipher cipher = (Cipher) c61Var.G;
        if (cipher != null) {
            return tc5.b(cipher);
        }
        Signature signature = (Signature) c61Var.F;
        if (signature != null) {
            return tc5.a(signature);
        }
        Mac mac = (Mac) c61Var.H;
        if (mac != null) {
            return tc5.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) c61Var.I) == null) {
            return null;
        }
        return uc5.a(identityCredential);
    }
}
