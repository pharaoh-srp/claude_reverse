package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import androidx.media3.common.util.GlUtil$GlException;
import com.anthropic.claude.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wpk {
    public static final ta4 a = new ta4(1121996006, false, new ub4(15));

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy7 r17, defpackage.c36 r18, defpackage.ta4 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpk.a(zy7, c36, ta4, ld4, int, int):void");
    }

    public static final void b(iqb iqbVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1090521195);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = t10.b;
                e18Var.k0(objN);
            }
            o5b o5bVar = (o5b) objN;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVar);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            sq6.B((i3 >> 6) & 14, pz7Var, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new u10(iqbVar, pz7Var, i);
        }
    }

    public static epk c(Context context) {
        n11 n11Var = new n11();
        n11Var.D();
        int color = context.getColor(R.color.bg100) | (-16777216);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", color);
        n11Var.J = bundle;
        n11Var.C(2);
        n11Var.q();
        n11Var.z();
        n11Var.F = false;
        n11Var.p();
        return n11Var.k();
    }

    public static void d(String str, boolean z) throws GlUtil$GlException {
        if (z) {
            return;
        }
        iz8 iz8Var = nz8.F;
        throw new GlUtil$GlException(str, vde.I);
    }

    public static uoe e(qh9 qh9Var) {
        int i;
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("operationType");
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                for (int i2 : sq6.H(3)) {
                    if (gid.j(i2).equals(strM)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            bh9 bh9VarS2 = qh9Var.s("operationName");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("payload");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("variables");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("error_count");
            Long lValueOf = bh9VarS5 != null ? Long.valueOf(bh9VarS5.k()) : null;
            bh9 bh9VarS6 = qh9Var.s("errors");
            if (bh9VarS6 != null) {
                ArrayList arrayList2 = bh9VarS6.e().E;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(spk.d(((bh9) it.next()).g()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return new uoe(i, strM2, strM3, strM4, lValueOf, arrayList);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Graphql", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Graphql", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Graphql", e3);
            return null;
        }
    }

    public static final float f(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int[] g(wjh wjhVar, Layout layout, el5 el5Var, RectF rectF, int i, fp fpVar) {
        qff ea8Var;
        int i2;
        if (i == 1) {
            ea8Var = new dke(wjhVar.f.getText(), wjhVar.j());
        } else {
            CharSequence text = wjhVar.f.getText();
            ea8Var = Build.VERSION.SDK_INT >= 29 ? new ea8(text, wjhVar.a) : new fa8(text);
        }
        qff qffVar = ea8Var;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > wjhVar.e(lineForVertical) && (lineForVertical = lineForVertical + 1) >= wjhVar.g) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < wjhVar.g(0)) {
            return null;
        }
        int iH = h(wjhVar, layout, el5Var, i3, rectF, qffVar, fpVar, true);
        while (true) {
            i2 = i3;
            if (iH != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            iH = h(wjhVar, layout, el5Var, i3, rectF, qffVar, fpVar, true);
        }
        if (iH == -1) {
            return null;
        }
        int iH2 = h(wjhVar, layout, el5Var, lineForVertical2, rectF, qffVar, fpVar, false);
        while (iH2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            iH2 = h(wjhVar, layout, el5Var, i4, rectF, qffVar, fpVar, false);
            lineForVertical2 = i4;
        }
        if (iH2 == -1) {
            return null;
        }
        return new int[]{qffVar.p(iH + 1), qffVar.q(iH2 - 1)};
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int h(defpackage.wjh r19, android.text.Layout r20, defpackage.el5 r21, int r22, android.graphics.RectF r23, defpackage.qff r24, defpackage.fp r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpk.h(wjh, android.text.Layout, el5, int, android.graphics.RectF, qff, fp, boolean):int");
    }

    public static boolean i(String str) throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        d("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        d("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new GlUtil$GlException("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), nz8.u(Integer.valueOf(iEglGetError)));
    }

    public static void j(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            c(context).u(context, Uri.parse(str));
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Exception opening MCP auth custom tab", null, null, 28);
        }
    }

    public static void k(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void l(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(grc.p(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public abstract void m(yyk yykVar, yyk yykVar2);

    public abstract void n(yyk yykVar, Thread thread);

    public abstract boolean o(x0l x0lVar, tjk tjkVar, tjk tjkVar2);

    public abstract boolean p(x0l x0lVar, Object obj, Object obj2);

    public abstract boolean q(x0l x0lVar, yyk yykVar, yyk yykVar2);
}
