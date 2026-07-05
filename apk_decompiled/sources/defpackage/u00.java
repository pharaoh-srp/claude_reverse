package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.SQLException;
import android.hardware.Camera;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.res.ResourceResolutionException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.EmailAddress;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonObject;
import org.xmlpull.v1.XmlPullParserException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class u00 {
    public static final tp4[] b = new tp4[0];
    public static final ta4 c = new ta4(21500508, false, new xe3(12));
    public static final Object d = new Object();
    public static final l9e e = new l9e(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final Object f = new Object();
    public static boolean g;
    public static int h;
    public static String i;
    public static int j;
    public static Boolean k;
    public final /* synthetic */ int a;

    public /* synthetic */ u00(int i2) {
        this.a = i2;
    }

    public static fhi A(fhi fhiVar) {
        fhiVar.getClass();
        fw5 fw5VarW = am4.w(fhiVar, false);
        if (fw5VarW != null) {
            return fw5VarW;
        }
        j7g j7gVarB = B(fhiVar);
        return j7gVarB != null ? j7gVarB : fhiVar.l0(false);
    }

    public static final j7g B(fhi fhiVar) {
        qa9 qa9Var;
        u9i u9iVarO = fhiVar.O();
        qa9 qa9Var2 = u9iVarO instanceof qa9 ? (qa9) u9iVarO : null;
        if (qa9Var2 != null) {
            LinkedHashSet<yr9> linkedHashSet = qa9Var2.b;
            ArrayList arrayList = new ArrayList(x44.y(linkedHashSet, 10));
            boolean z = false;
            for (yr9 yr9VarA : linkedHashSet) {
                if (fbi.e(yr9VarA)) {
                    yr9VarA = A(yr9VarA.k0());
                    z = true;
                }
                arrayList.add(yr9VarA);
            }
            if (z) {
                yr9 yr9VarA2 = qa9Var2.a;
                if (yr9VarA2 == null) {
                    yr9VarA2 = null;
                } else if (fbi.e(yr9VarA2)) {
                    yr9VarA2 = A(yr9VarA2.k0());
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                qa9Var = new qa9(linkedHashSet2);
                qa9Var.a = yr9VarA2;
            } else {
                qa9Var = null;
            }
            if (qa9Var != null) {
                return qa9Var.e();
            }
        }
        return null;
    }

    public static final iqb C(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new ur7(bz7Var));
    }

    public static final bpc D(int i2, int i3, ld4 ld4Var) {
        TypedValue typedValue;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        Context context = (Context) e18Var.j(w00.b);
        Resources resources = (Resources) e18Var.j(w00.c);
        rpe rpeVar = (rpe) e18Var.j(w00.e);
        synchronized (rpeVar) {
            typedValue = (TypedValue) rpeVar.a.b(i2);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                xub xubVar = rpeVar.a;
                int iD = xubVar.d(i2);
                Object[] objArr = xubVar.c;
                Object obj = objArr[iD];
                xubVar.b[iD] = i2;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !bsg.A0(charSequence, ".xml")) {
            e18Var.a0(-1771643000);
            Resources.Theme theme = context.getTheme();
            boolean zF = e18Var.f(charSequence);
            if ((((i3 & 14) ^ 6) <= 4 || !e18Var.d(i2)) && (i3 & 6) != 4) {
                z = false;
            }
            boolean zF2 = zF | z | e18Var.f(theme);
            Object objN = e18Var.N();
            if (zF2 || objN == jd4.a) {
                try {
                    objN = euk.q(resources, i2);
                    e18Var.k0(objN);
                } catch (Exception e2) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            BitmapPainter bitmapPainter = new BitmapPainter((r20) objN);
            e18Var.p(false);
            return bitmapPainter;
        }
        e18Var.a0(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i4 = typedValue.changingConfigurations;
        sy8 sy8Var = (sy8) e18Var.j(w00.d);
        ry8 ry8Var = new ry8(theme2, i2);
        WeakReference weakReference = (WeakReference) sy8Var.a.get(ry8Var);
        qy8 qy8VarU = weakReference != null ? (qy8) weakReference.get() : null;
        if (qy8VarU == null) {
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!x44.r(xml.getName(), "vector")) {
                sz6.p("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            qy8VarU = j8.U(theme2, resources, xml, i4);
            sy8Var.a.put(ry8Var, new WeakReference(qy8VarU));
        }
        VectorPainter vectorPainterB = yb5.B(qy8VarU.a, e18Var);
        e18Var.p(false);
        return vectorPainterB;
    }

    public static final Object E(cve cveVar, boolean z, boolean z2, bz7 bz7Var) {
        cveVar.getClass();
        ThreadLocal threadLocal = cveVar.i;
        cveVar.a();
        if (cveVar.k() && !cveVar.l()) {
            c45 c45Var = (c45) threadLocal.get();
            if ((c45Var != null ? (w4i) c45Var.x0(w4i.F) : null) != null) {
                sz6.j("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        c45 c45Var2 = (c45) threadLocal.get();
        if (c45Var2 == null) {
            c45Var2 = im6.E;
        }
        return yb5.J(new xe5(c45Var2, cveVar, z2, z, bz7Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.cve r8, defpackage.bz7 r9, defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.ye5
            if (r0 == 0) goto L13
            r0 = r10
            ye5 r0 = (defpackage.ye5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ye5 r0 = new ye5
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.G
            int r1 = r0.H
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            m45 r7 = defpackage.m45.E
            if (r1 == 0) goto L4a
            if (r1 == r5) goto L46
            if (r1 == r4) goto L42
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            defpackage.sf5.h0(r10)
            return r10
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r6
        L37:
            xzg r8 = r0.F
            r9 = r8
            bz7 r9 = (defpackage.bz7) r9
            cve r8 = r0.E
            defpackage.sf5.h0(r10)
            goto L95
        L42:
            defpackage.sf5.h0(r10)
            return r10
        L46:
            defpackage.sf5.h0(r10)
            return r10
        L4a:
            defpackage.sf5.h0(r10)
            boolean r10 = r8.k()
            if (r10 == 0) goto L63
            ny r10 = new ny
            r1 = 6
            r10.<init>(r8, r9, r6, r1)
            r0.H = r5
            java.lang.Object r8 = defpackage.oq5.X(r0, r10, r8)
            if (r8 != r7) goto L62
            goto La8
        L62:
            return r8
        L63:
            boolean r10 = r8.k()
            if (r10 == 0) goto L85
            boolean r10 = r8.n()
            if (r10 == 0) goto L85
            boolean r10 = r8.l()
            if (r10 == 0) goto L85
            zw r10 = new zw
            r10.<init>(r6, r9, r8)
            r0.H = r4
            r9 = 0
            java.lang.Object r8 = r8.q(r9, r10, r0)
            if (r8 != r7) goto L84
            goto La8
        L84:
            return r8
        L85:
            r0.E = r8
            r10 = r9
            xzg r10 = (defpackage.xzg) r10
            r0.F = r10
            r0.H = r3
            c45 r10 = v(r8, r5, r0)
            if (r10 != r7) goto L95
            goto La8
        L95:
            c45 r10 = (defpackage.c45) r10
            dx r1 = new dx
            r1.<init>(r6, r9, r8)
            r0.E = r6
            r0.F = r6
            r0.H = r2
            java.lang.Object r8 = defpackage.gb9.c0(r10, r1, r0)
            if (r8 != r7) goto La9
        La8:
            return r7
        La9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.F(cve, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.tp4 r16, defpackage.cve r17, boolean r18, boolean r19, defpackage.bz7 r20) throws java.lang.Throwable {
        /*
            r0 = r16
            boolean r1 = r0 instanceof defpackage.ze5
            if (r1 == 0) goto L16
            r1 = r0
            ze5 r1 = (defpackage.ze5) r1
            int r2 = r1.J
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.J = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            ze5 r1 = new ze5
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.I
            int r1 = r7.J
            r2 = 0
            r3 = 3
            r4 = 2
            r8 = 1
            m45 r9 = defpackage.m45.E
            if (r1 == 0) goto L4c
            if (r1 == r8) goto L48
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            defpackage.sf5.h0(r0)
            return r0
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r2
        L38:
            boolean r1 = r7.H
            boolean r4 = r7.G
            bz7 r5 = r7.F
            cve r6 = r7.E
            defpackage.sf5.h0(r0)
            r14 = r1
            r13 = r4
            r15 = r5
            r12 = r6
            goto L9b
        L48:
            defpackage.sf5.h0(r0)
            return r0
        L4c:
            defpackage.sf5.h0(r0)
            boolean r0 = r17.k()
            if (r0 == 0) goto L7d
            boolean r0 = r17.n()
            if (r0 == 0) goto L7d
            boolean r0 = r17.l()
            if (r0 == 0) goto L7d
            ve5 r0 = new ve5
            r4 = 0
            r6 = 1
            r3 = r17
            r2 = r18
            r1 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r0 = r3
            r7.J = r8
            java.lang.Object r0 = r0.q(r1, r2, r7)
            if (r0 != r9) goto L7c
            goto Laf
        L7c:
            return r0
        L7d:
            r0 = r17
            r1 = r18
            r5 = r19
            r7.E = r0
            r6 = r20
            r7.F = r6
            r7.G = r1
            r7.H = r5
            r7.J = r4
            c45 r4 = v(r0, r5, r7)
            if (r4 != r9) goto L96
            goto Laf
        L96:
            r12 = r0
            r13 = r1
            r0 = r4
            r14 = r5
            r15 = r6
        L9b:
            c45 r0 = (defpackage.c45) r0
            we5 r10 = new we5
            r11 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r7.E = r2
            r7.F = r2
            r7.J = r3
            java.lang.Object r0 = defpackage.gb9.c0(r0, r10, r7)
            if (r0 != r9) goto Lb0
        Laf:
            return r9
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.G(tp4, cve, boolean, boolean, bz7):java.lang.Object");
    }

    public static final void H(float[] fArr, float[] fArr2) {
        float fM = m(fArr2, 0, fArr, 0);
        float fM2 = m(fArr2, 0, fArr, 1);
        float fM3 = m(fArr2, 0, fArr, 2);
        float fM4 = m(fArr2, 0, fArr, 3);
        float fM5 = m(fArr2, 1, fArr, 0);
        float fM6 = m(fArr2, 1, fArr, 1);
        float fM7 = m(fArr2, 1, fArr, 2);
        float fM8 = m(fArr2, 1, fArr, 3);
        float fM9 = m(fArr2, 2, fArr, 0);
        float fM10 = m(fArr2, 2, fArr, 1);
        float fM11 = m(fArr2, 2, fArr, 2);
        float fM12 = m(fArr2, 2, fArr, 3);
        float fM13 = m(fArr2, 3, fArr, 0);
        float fM14 = m(fArr2, 3, fArr, 1);
        float fM15 = m(fArr2, 3, fArr, 2);
        float fM16 = m(fArr2, 3, fArr, 3);
        fArr[0] = fM;
        fArr[1] = fM2;
        fArr[2] = fM3;
        fArr[3] = fM4;
        fArr[4] = fM5;
        fArr[5] = fM6;
        fArr[6] = fM7;
        fArr[7] = fM8;
        fArr[8] = fM9;
        fArr[9] = fM10;
        fArr[10] = fM11;
        fArr[11] = fM12;
        fArr[12] = fM13;
        fArr[13] = fM14;
        fArr[14] = fM15;
        fArr[15] = fM16;
    }

    public static final Object I(hyc hycVar, fvd fvdVar) {
        fvdVar.getClass();
        Object objB = hycVar.get(fvdVar);
        if (objB == null) {
            objB = fvdVar.b();
        }
        return ((zqi) objB).a(hycVar);
    }

    public static final Object J(bg9 bg9Var, String str, JsonObject jsonObject, s06 s06Var) {
        bg9Var.getClass();
        str.getClass();
        return new ti9(bg9Var, jsonObject, str, s06Var.getDescriptor()).g(s06Var);
    }

    public static final yn8 K(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zH = e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new g03(m7fVar, 3);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(yn8.class));
        return (yn8) fd9.r0(kceVar.b(yn8.class), strB, (bz7) objN, e18Var);
    }

    public static final z09 L(int i2, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new ddi(26);
            e18Var.k0(objN);
        }
        bz7 bz7Var = (bz7) objN;
        boolean zD = ((e18) ld4Var).d(i2) | ((e18) ld4Var).f(bz7Var);
        e18 e18Var2 = (e18) ld4Var;
        Object objN2 = e18Var2.N();
        if (zD || objN2 == lz1Var) {
            bt7 bt7Var = bt7.b;
            objN2 = new z09(i2, bz7Var);
            e18Var2.k0(objN2);
        }
        return (z09) objN2;
    }

    public static final l4h M(ld4 ld4Var, bz7 bz7Var) {
        boolean zBooleanValue;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1328779074);
        e18Var.a0(-25683846);
        boolean zBooleanValue2 = ((Boolean) e18Var.j(p59.a)).booleanValue();
        lz1 lz1Var = jd4.a;
        if (zBooleanValue2) {
            e18Var.p(false);
            zBooleanValue = false;
        } else {
            Object objN = e18Var.N();
            if (objN == lz1Var) {
                objN = Boolean.valueOf(Camera.getNumberOfCameras() > 0);
                e18Var.k0(objN);
            }
            zBooleanValue = ((Boolean) objN).booleanValue();
            e18Var.p(false);
        }
        umg umgVar = w00.b;
        PackageManager packageManager = ((Context) e18Var.j(umgVar)).getPackageManager();
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 65536);
            listQueryIntentActivities.getClass();
            objN2 = Boolean.valueOf(true ^ listQueryIntentActivities.isEmpty());
            e18Var.k0(objN2);
        }
        boolean zBooleanValue3 = ((Boolean) objN2).booleanValue();
        if (!zBooleanValue || !zBooleanValue3) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str = "Camera or image capture app not available. hasCamera: " + zBooleanValue + ", hasImageCaptureApp: " + zBooleanValue3;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, "TakePictureHelper", str);
                    }
                }
            }
            e18Var.p(false);
            return null;
        }
        Context context = (Context) e18Var.j(umgVar);
        m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
        Object objN3 = e18Var.N();
        if (zF || objN3 == lz1Var) {
            objN3 = m7fVarN.a(jce.a.b(mn5.class), null, null);
            e18Var.k0(objN3);
        }
        e18Var.p(false);
        e18Var.p(false);
        mn5 mn5Var = (mn5) objN3;
        Object[] objArr = {context, mn5Var};
        context.getClass();
        mn5Var.getClass();
        y5f y5fVar = new y5f(new e6f(context, 3, mn5Var), new lwf(9));
        boolean zH = e18Var.h(context) | e18Var.h(mn5Var);
        Object objN4 = e18Var.N();
        if (zH || objN4 == lz1Var) {
            objN4 = new vc8(context, 22, mn5Var);
            e18Var.k0(objN4);
        }
        k4h k4hVar = (k4h) iuj.K(objArr, y5fVar, (zy7) objN4, e18Var, 0);
        int i2 = 4;
        vc vcVar = new vc(i2);
        boolean zH2 = e18Var.h(k4hVar) | e18Var.f(bz7Var);
        Object objN5 = e18Var.N();
        if (zH2 || objN5 == lz1Var) {
            objN5 = new e6f(k4hVar, i2, bz7Var);
            e18Var.k0(objN5);
        }
        xpa xpaVarD0 = sf5.d0(vcVar, (bz7) objN5, e18Var, 0);
        boolean zF2 = e18Var.f(k4hVar);
        Object objN6 = e18Var.N();
        if (zF2 || objN6 == lz1Var) {
            objN6 = new l4h(k4hVar, xpaVarD0);
            e18Var.k0(objN6);
        }
        l4h l4hVar = (l4h) objN6;
        e18Var.p(false);
        return l4hVar;
    }

    public static final void N(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final hyc O(hvd[] hvdVarArr, hyc hycVar, hyc hycVar2) {
        hyc hycVar3 = hyc.H;
        gyc gycVar = new gyc(hycVar3);
        gycVar.K = hycVar3;
        for (hvd hvdVar : hvdVarArr) {
            fvd fvdVar = (fvd) hvdVar.d;
            if (hvdVar.c || !hycVar.containsKey(fvdVar)) {
                gycVar.put(fvdVar, fvdVar.d(hvdVar, (zqi) hycVar2.get(fvdVar)));
            }
        }
        return gycVar.f();
    }

    public static final yig P(asb asbVar, ld4 ld4Var) {
        return t(((gwa) ((e18) ld4Var).j(jwa.a)).d, asbVar);
    }

    public static final iqb Q(iqb iqbVar, int i2, z09 z09Var) {
        iqbVar.getClass();
        z09Var.getClass();
        int i3 = z09Var.a;
        if (i2 >= 0 && i2 < i3) {
            return ez1.A(v40.u(iv1.s(iqbVar, z09Var.c[i2]), new zti(z09Var, i2, 0)));
        }
        xh6.j(grc.o(i2, i3, "Index ", " is out of bounds for size "));
        return null;
    }

    public static final l9e R(cu9 cu9Var) {
        l9e l9eVarP = nai.p(cu9Var, true);
        return d4c.v(cu9Var.w(l9eVarP.h()), cu9Var.w(l9eVarP.e()));
    }

    public static final j7g S(j7g j7gVar, j7g j7gVar2) {
        j7gVar.getClass();
        j7gVar2.getClass();
        return ttj.j(j7gVar) ? j7gVar : new q(j7gVar, j7gVar2);
    }

    public static final void T(oe4 oe4Var, bz7 bz7Var) {
        ga8 ga8Var = (ga8) yb5.o(oe4Var, ve4.g);
        ja8 ja8VarC = ga8Var.c();
        try {
            bz7Var.invoke(ja8VarC);
        } finally {
            ga8Var.a(ja8VarC);
        }
    }

    public static final void a(int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2029327411);
        int i3 = i2 | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e0g e0gVar = gm3.b(e18Var).n;
            long j2 = gm3.a(e18Var).M;
            long j3 = gm3.a(e18Var).o;
            long j4 = d54.h;
            wu8 wu8Var = new wu8(j2, j3, j4, j4);
            fqb fqbVar = fqb.E;
            ez1.d(zy7Var, gb9.M(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 8.0f, 8.0f), false, e0gVar, wu8Var, fd9.q0(-1966249133, new tp(z, 9), e18Var), e18Var, ((i3 >> 3) & 14) | 1572864, 36);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(z, zy7Var, iqbVar2, i2, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r36, int r37, defpackage.ld4 r38, defpackage.zy7 r39, defpackage.iqb r40, boolean r41, final boolean r42) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.b(int, int, ld4, zy7, iqb, boolean, boolean):void");
    }

    public static ih9 c(bz7 bz7Var) {
        ag9 ag9Var = bg9.d;
        ag9Var.getClass();
        og9 og9Var = new og9();
        rg9 rg9Var = ag9Var.a;
        og9Var.a = rg9Var.a;
        og9Var.b = rg9Var.f;
        og9Var.c = rg9Var.b;
        og9Var.d = rg9Var.c;
        og9Var.e = rg9Var.e;
        String str = rg9Var.g;
        og9Var.f = str;
        og9Var.g = rg9Var.h;
        og9Var.h = rg9Var.j;
        og9Var.i = rg9Var.i;
        og9Var.j = rg9Var.d;
        og9Var.k = ag9Var.b;
        og9Var.l = rg9Var.k;
        bz7Var.invoke(og9Var);
        if (og9Var.e) {
            if (!x44.r(str, "    ")) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        mr9.q("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!x44.r(str, "    ")) {
            sz6.p("Indent should not be specified when default printing mode is used");
            return null;
        }
        rg9 rg9Var2 = new rg9(og9Var.a, og9Var.c, og9Var.d, og9Var.j, og9Var.e, og9Var.b, og9Var.f, og9Var.g, og9Var.i, og9Var.h, og9Var.l);
        fof fofVar = og9Var.k;
        fofVar.getClass();
        ih9 ih9Var = new ih9(rg9Var2, fofVar);
        if (fofVar.equals(hof.a)) {
            return ih9Var;
        }
        ez8 ez8Var = new ez8();
        ez8Var.E = rg9Var2.j != ch3.E;
        fofVar.a(ez8Var);
        return ih9Var;
    }

    public static final void d(px9 px9Var, che cheVar, Object obj, iqb iqbVar, boolean z, iqb iqbVar2, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        boolean z2;
        ta4 ta4Var2;
        iqb iqbVarA;
        int i4;
        iqb iqbVarB;
        boolean z3;
        iqb iqbVarI0;
        iqb iqbVar3;
        boolean z4;
        iqb iqbVarI02;
        px9Var.getClass();
        cheVar.getClass();
        obj.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(346306449);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(px9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(cheVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(obj) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i3 |= e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            z2 = z;
        }
        if ((196608 & i2) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            ta4Var2 = ta4Var;
            i3 |= e18Var.h(ta4Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            ta4Var2 = ta4Var;
        }
        if ((599187 & i3) == 599186 && e18Var.C()) {
            e18Var.T();
            iqbVar3 = iqbVar2;
        } else {
            e18Var.V();
            int i6 = i2 & 1;
            fqb fqbVar = fqb.E;
            if (i6 == 0 || e18Var.A()) {
                iqbVarA = px9.a(px9Var, fqbVar, null, null, 7);
                i4 = i3 & (-458753);
            } else {
                e18Var.T();
                i4 = i3 & (-458753);
                iqbVarA = iqbVar2;
            }
            e18Var.q();
            e18Var.a0(-1662944964);
            int i7 = i4 & 112;
            boolean z5 = i7 == 32;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z5 || objN == lz1Var) {
                objN = new rge(cheVar, i5);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            wz5 wz5VarW = mpk.w((zy7) objN);
            wz5 wz5VarW2 = mpk.w(new mx1(obj, 14, cheVar));
            if (((Boolean) wz5VarW2.getValue()).booleanValue()) {
                e18Var.a0(-11568592);
                iqb iqbVarJ = lnk.j(fqbVar, 1.0f);
                int iOrdinal = ((ukc) wz5VarW.getValue()).ordinal();
                if (iOrdinal == 0) {
                    e18Var.a0(-1662937274);
                    e18Var.a0(-1662936840);
                    boolean z6 = i7 == 32;
                    Object objN2 = e18Var.N();
                    if (z6 || objN2 == lz1Var) {
                        objN2 = new uge(cheVar, 1);
                        e18Var.k0(objN2);
                    }
                    z4 = false;
                    e18Var.p(false);
                    iqbVarI02 = xn5.i0(fqbVar, (bz7) objN2);
                    e18Var.p(false);
                } else {
                    if (iOrdinal != 1) {
                        throw kgh.s(e18Var, -1663429177, false);
                    }
                    e18Var.a0(-1662932538);
                    e18Var.a0(-1662932104);
                    boolean z7 = i7 == 32;
                    Object objN3 = e18Var.N();
                    if (z7 || objN3 == lz1Var) {
                        objN3 = new uge(cheVar, 2);
                        e18Var.k0(objN3);
                    }
                    z4 = false;
                    e18Var.p(false);
                    iqbVarI02 = xn5.i0(fqbVar, (bz7) objN3);
                    e18Var.p(false);
                }
                iqbVarB = iqbVarJ.B(iqbVarI02);
                e18Var.p(z4);
            } else if (obj.equals(cheVar.r.getValue())) {
                e18Var.a0(-11128268);
                iqb iqbVarJ2 = lnk.j(fqbVar, 1.0f);
                int iOrdinal2 = ((ukc) wz5VarW.getValue()).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        throw kgh.s(e18Var, -1663429177, false);
                    }
                    e18Var.a0(-1662917900);
                    e18Var.a0(-1662917466);
                    boolean z8 = i7 == 32;
                    Object objN4 = e18Var.N();
                    if (z8 || objN4 == lz1Var) {
                        objN4 = new uge(cheVar, 4);
                        e18Var.k0(objN4);
                    }
                    z3 = false;
                    e18Var.p(false);
                    iqbVarI0 = xn5.i0(fqbVar, (bz7) objN4);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-1662923084);
                    e18Var.a0(-1662922650);
                    boolean z9 = i7 == 32;
                    Object objN5 = e18Var.N();
                    if (z9 || objN5 == lz1Var) {
                        objN5 = new uge(cheVar, 3);
                        e18Var.k0(objN5);
                    }
                    z3 = false;
                    e18Var.p(false);
                    iqbVarI0 = xn5.i0(fqbVar, (bz7) objN5);
                    e18Var.p(false);
                }
                iqbVarB = iqbVarJ2.B(iqbVarI0);
                e18Var.p(z3);
            } else {
                e18Var.a0(-10714728);
                e18Var.p(false);
                iqbVarB = iqbVarA;
            }
            j8.i(cheVar, obj, iqbVar.B(iqbVarB), z2, ((Boolean) wz5VarW2.getValue()).booleanValue(), ta4Var2, e18Var, (i4 >> 3) & 466046);
            iqbVar3 = iqbVarA;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zge(px9Var, cheVar, obj, iqbVar, z, iqbVar3, ta4Var, i2);
        }
    }

    public static final void e(m9j m9jVar, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        iqb iqbVar2;
        Object ty4Var;
        m9j m9jVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1477019823);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var.f(m9jVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            String strM1013unboximpl = ((EmailAddress) m9jVar.t.getValue()).m1013unboximpl();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                ty4Var = new ty4(1, m9jVar, m9j.class, "updateEmail", "updateEmail(Ljava/lang/String;)V", 0, 21);
                m9jVar2 = m9jVar;
                e18Var.k0(ty4Var);
            } else {
                ty4Var = objN;
                m9jVar2 = m9jVar;
            }
            jm9 jm9Var = (jm9) ty4Var;
            boolean z2 = !((Boolean) m9jVar2.r.getValue()).booleanValue();
            int i5 = 7;
            mp9 mp9Var = new mp9(i, 6, i5, 112);
            i = i4 == 4 ? 1 : 0;
            Object objN2 = e18Var.N();
            if (i != 0 || objN2 == lz1Var) {
                objN2 = new tz9(i5, m9jVar2);
                e18Var.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            kp9 kp9Var = new kp9(bz7Var, bz7Var, bz7Var, bz7Var, bz7Var, bz7Var);
            String strJ0 = d4c.j0(R.string.login_welcome_email_placeholder, e18Var);
            iqbVar.getClass();
            iqbVar2 = iqbVar;
            zh4.e(strM1013unboximpl, (bz7) jm9Var, strJ0, iqbVar2, z2, null, fd9.q0(266667209, new a21(15, m9jVar2), e18Var), null, mp9Var, kp9Var, 0L, null, 0, e18Var, 12582912, 14688);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2((Object) m9jVar, iqbVar2, i2, 9);
        }
    }

    public static final boolean f(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final zb0 g(int i2, Object[] objArr, ld4 ld4Var) {
        String strK0 = d4c.k0(i2, Arrays.copyOf(objArr, objArr.length), ld4Var);
        e18 e18Var = (e18) ld4Var;
        long j2 = ((d54) e18Var.j(on4.a)).a;
        wig wigVar = new wig(3);
        wigVar.a(strK0);
        wigVar.a(new d54(j2));
        wigVar.b(objArr);
        ArrayList arrayList = wigVar.a;
        boolean zF = false;
        for (Object obj : arrayList.toArray(new Object[arrayList.size()])) {
            zF |= e18Var.f(obj);
        }
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = h(j2, strK0);
            e18Var.k0(objN);
        }
        return (zb0) objN;
    }

    public static final zb0 h(long j2, String str) {
        str.getClass();
        int i2 = zb0.I;
        return mwa.z(str, new ekh(new egg(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61438), null, null, null), 4);
    }

    public static final kqc i(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i2) {
        zy7 zy7Var3;
        zy7 zy7Var4;
        int i3;
        float f2;
        float f3;
        int i4;
        cbj cbjVarA = dbj.a(ld4Var);
        int i5 = i2 & 2;
        lz1 lz1Var = jd4.a;
        if (i5 != 0) {
            e18 e18Var = (e18) ld4Var;
            Object objN = e18Var.N();
            if (objN == lz1Var) {
                objN = new nlh(13);
                e18Var.k0(objN);
            }
            zy7Var3 = (zy7) objN;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((i2 & 4) != 0) {
            e18 e18Var2 = (e18) ld4Var;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new zcd(15);
                e18Var2.k0(objN2);
            }
            zy7Var4 = (zy7) objN2;
        } else {
            zy7Var4 = zy7Var2;
        }
        cej cejVar = cbjVarA.a;
        int i6 = cejVar.b;
        dad dadVar = cbjVarA.b;
        float f4 = cejVar.a;
        int i7 = cej.c;
        float f5 = 360.0f;
        if (va6.b(f4, MTTypesetterKt.kLineSkipLimitMultiplier) || va6.b(f4, 600.0f)) {
            f2 = 0.0f;
            i3 = 1;
        } else if (va6.b(f4, 840.0f)) {
            f2 = 24.0f;
            i3 = 2;
        } else {
            f5 = 412.0f;
            i3 = 3;
            f2 = 24.0f;
        }
        float f6 = f5;
        boolean z = dadVar.a;
        ArrayList<ym8> arrayList = dadVar.b;
        if (z || (i3 == 1 && va6.b(i6, 900.0f))) {
            f3 = 24.0f;
            i4 = 2;
        } else {
            f3 = 0.0f;
            i4 = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ym8 ym8Var : arrayList) {
            l9e l9eVarA = (ym8Var.c() && ym8Var.b()) ? ym8Var.a() : null;
            if (l9eVarA != null) {
                arrayList2.add(l9eVarA);
            }
        }
        kqc kqcVar = new kqc(i3, f2, i4, f3, f6, arrayList2);
        zy7Var4.getClass();
        zy7Var3.getClass();
        boolean z2 = i6 >= 480;
        if (i3 > 1) {
            if (!z2 && ((Boolean) zy7Var4.a()).booleanValue()) {
                return kqc.a(kqcVar, 1, MTTypesetterKt.kLineSkipLimitMultiplier, 124);
            }
        } else if (cejVar.a >= 600 && z2 && ((Boolean) zy7Var3.a()).booleanValue()) {
            return kqc.a(kqcVar, 2, 24.0f, 124);
        }
        return kqcVar;
    }

    public static final boolean j(long j2, l9e l9eVar) {
        float f2 = l9eVar.a;
        float f3 = l9eVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = l9eVar.b;
        float f5 = l9eVar.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final ja8 k(cv9 cv9Var, gg8 gg8Var, float f2, long j2, long j3) {
        long jL = csg.L(k8g.g(f2, j2));
        if (((int) (jL >> 32)) <= 0 || ((int) (4294967295L & jL)) <= 0) {
            return null;
        }
        ja8 ja8VarC = ((ga8) yb5.o(gg8Var, ve4.g)).c();
        cv9Var.t(jL, new bt1(gg8Var, f2, j3), ja8VarC);
        return ja8VarC;
    }

    public static final ArrayList l(LinkedHashSet linkedHashSet, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            pf6.G.getClass();
            pf6 pf6VarU = efk.u(str);
            if (pf6VarU != null) {
                arrayList.add(pf6VarU);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (linkedHashSet.add((pf6) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final float m(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void n(cv9 cv9Var) {
        try {
            cv9Var.a();
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            if (!bsg.u0(message, "mViewFlags", false) && !bsg.u0(message, "LayoutNode", false)) {
                throw e2;
            }
        }
    }

    public static final void o(xd6 xd6Var, long j2, long j3, boolean z, bz7 bz7Var) {
        fj0 fj0VarB0;
        long jW;
        xd6Var.getClass();
        float fMax = Math.max(Float.intBitsToFloat((int) (xd6Var.g() >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L));
        fj0 fj0VarB02 = xd6Var.B0();
        long jW2 = fj0VarB02.w();
        fj0VarB02.p().g();
        try {
            efe efeVar = (efe) fj0VarB02.E;
            if (z) {
                efeVar.k(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat, fIntBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || fcc.c(j2, 0L)) {
                fj0VarB0 = xd6Var.B0();
                jW = fj0VarB0.w();
                fj0VarB0.p().g();
                try {
                    ((efe) fj0VarB0.E).C(0L, fMax, fMax);
                    bz7Var.invoke(xd6Var);
                } finally {
                }
            } else {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                ((efe) xd6Var.B0().E).G(fIntBitsToFloat3, fIntBitsToFloat4);
                try {
                    fj0VarB0 = xd6Var.B0();
                    jW = fj0VarB0.w();
                    fj0VarB0.p().g();
                    try {
                        ((efe) fj0VarB0.E).C(0L, fMax, fMax);
                        bz7Var.invoke(xd6Var);
                        fj0VarB0.p().p();
                        fj0VarB0.N(jW);
                    } finally {
                    }
                } finally {
                    ((efe) xd6Var.B0().E).G(-fIntBitsToFloat3, -fIntBitsToFloat4);
                }
            }
            grc.y(fj0VarB02, jW2);
        } catch (Throwable th) {
            grc.y(fj0VarB02, jW2);
            throw th;
        }
    }

    public static final void p(xd6 xd6Var, qg8 qg8Var, oe4 oe4Var, long j2, long j3) {
        xd6Var.getClass();
        qg8Var.getClass();
        jy1 jy1Var = qg8Var.c;
        if (jy1Var != null) {
            xd6.S0(xd6Var, jy1Var, j2, xd6Var.g(), MTTypesetterKt.kLineSkipLimitMultiplier, null, null, qg8Var.b, 56);
        } else {
            xd6Var.T0(qg8Var.a, 0L, (58 & 4) != 0 ? xd6.h0(xd6Var.g(), 0L) : j3, (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : qg8Var.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.g(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:45:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.lp7 r7, defpackage.d6e r8, boolean r9, defpackage.tp4 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.qp7
            if (r0 == 0) goto L13
            r0 = r10
            qp7 r0 = (defpackage.qp7) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            qp7 r0 = new qp7
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.I
            int r1 = r0.J
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.H
            sy1 r7 = r0.G
            d6e r8 = r0.F
            lp7 r1 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L3d:
            boolean r9 = r0.H
            sy1 r7 = r0.G
            d6e r8 = r0.F
            lp7 r1 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.sf5.h0(r10)
            boolean r10 = r7 instanceof defpackage.cph
            if (r10 != 0) goto L96
            sy1 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.E = r7     // Catch: java.lang.Throwable -> L35
            r0.F = r8     // Catch: java.lang.Throwable -> L35
            r0.G = r10     // Catch: java.lang.Throwable -> L35
            r0.H = r9     // Catch: java.lang.Throwable -> L35
            r0.J = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.E = r1     // Catch: java.lang.Throwable -> L35
            r0.F = r8     // Catch: java.lang.Throwable -> L35
            r0.G = r7     // Catch: java.lang.Throwable -> L35
            r0.H = r9     // Catch: java.lang.Throwable -> L35
            r0.J = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.g(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.d(r4)
        L8b:
            iei r7 = defpackage.iei.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            defpackage.oq5.s(r8, r7)
        L95:
            throw r10
        L96:
            cph r7 = (defpackage.cph) r7
            java.lang.Throwable r7 = r7.E
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.q(lp7, d6e, boolean, tp4):java.lang.Object");
    }

    public static final void r(lze lzeVar, String str) {
        lzeVar.getClass();
        tze tzeVarL0 = lzeVar.L0(str);
        try {
            tzeVarL0.H0();
            csg.o(tzeVarL0, null);
        } finally {
        }
    }

    public static ya s(qh9 qh9Var) {
        try {
            return new ya(qh9Var.s("count").k());
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Resource", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Resource", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Resource", e4);
            return null;
        }
    }

    public static final yig t(zrb zrbVar, asb asbVar) {
        int iOrdinal = asbVar.ordinal();
        if (iOrdinal == 0) {
            zrbVar.getClass();
            yig yigVar = zrb.b;
            yigVar.getClass();
            return yigVar;
        }
        if (iOrdinal == 1) {
            zrbVar.getClass();
            yig yigVar2 = zrb.c;
            yigVar2.getClass();
            return yigVar2;
        }
        if (iOrdinal == 2) {
            zrbVar.getClass();
            yig yigVar3 = zrb.d;
            yigVar3.getClass();
            return yigVar3;
        }
        if (iOrdinal == 3) {
            zrbVar.getClass();
            yig yigVar4 = zrb.e;
            yigVar4.getClass();
            return yigVar4;
        }
        if (iOrdinal == 4) {
            zrbVar.getClass();
            yig yigVar5 = zrb.f;
            yigVar5.getClass();
            return yigVar5;
        }
        if (iOrdinal != 5) {
            mr9.b();
            return null;
        }
        zrbVar.getClass();
        yig yigVar6 = zrb.g;
        yigVar6.getClass();
        return yigVar6;
    }

    public static final c45 v(cve cveVar, boolean z, vp4 vp4Var) {
        w4i w4iVar = (w4i) vp4Var.getContext().x0(w4i.F);
        c45 c45Var = w4iVar != null ? w4iVar.E : null;
        if (!cveVar.k()) {
            mp4 mp4Var = cveVar.a;
            if (mp4Var == null) {
                x44.o0("coroutineScope");
                throw null;
            }
            c45 c45Var2 = mp4Var.E;
            if (c45Var == null) {
                c45Var = im6.E;
            }
            return c45Var2.r0(c45Var);
        }
        if (c45Var != null) {
            mp4 mp4Var2 = cveVar.a;
            if (mp4Var2 != null) {
                return mp4Var2.E.r0(c45Var);
            }
            x44.o0("coroutineScope");
            throw null;
        }
        if (z) {
            c45 c45Var3 = cveVar.b;
            if (c45Var3 != null) {
                return c45Var3;
            }
            x44.o0("transactionContext");
            throw null;
        }
        mp4 mp4Var3 = cveVar.a;
        if (mp4Var3 != null) {
            return mp4Var3.E;
        }
        x44.o0("coroutineScope");
        throw null;
    }

    public static final long y(mif mifVar, long j2, nhf nhfVar) {
        cu9 cu9VarD;
        cu9 cu9VarE;
        int iA;
        float fD0;
        ztb ztbVarC = mifVar.c(nhfVar);
        if (ztbVarC == null || (cu9VarD = mifVar.d()) == null || (cu9VarE = ztbVarC.e()) == null || (iA = nhfVar.a()) > ztbVarC.c()) {
            return 9205357640488583168L;
        }
        fcc fccVarH = mifVar.h();
        fccVarH.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cu9VarE.G(cu9VarD, fccVarH.a) >> 32));
        long jH = ztbVarC.h(iA);
        if (kkh.d(jH)) {
            fD0 = ztbVarC.f(iA);
        } else {
            float f2 = ztbVarC.f((int) (jH >> 32));
            float fG = ztbVarC.g(((int) (jH & 4294967295L)) - 1);
            fD0 = wd6.d0(fIntBitsToFloat, Math.min(f2, fG), Math.max(f2, fG));
        }
        if (fD0 == -1.0f) {
            return 9205357640488583168L;
        }
        if (!g79.b(j2, 0L) && Math.abs(fIntBitsToFloat - fD0) > ((int) (j2 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        float fA = ztbVarC.a(iA);
        if (fA == -1.0f) {
            return 9205357640488583168L;
        }
        return cu9VarD.G(cu9VarE, (((long) Float.floatToRawIntBits(fD0)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L));
    }

    public static String z() throws Throwable {
        BufferedReader bufferedReader;
        if (i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                i = Application.getProcessName();
            } else {
                int iMyPid = j;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    j = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb.append("/proc/");
                        sb.append(iMyPid);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String line = bufferedReader.readLine();
                        dgj.v(line);
                        strTrim = line.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        htk.f(bufferedReader2);
                        throw th;
                    }
                    htk.f(bufferedReader);
                }
                i = strTrim;
            }
        }
        return i;
    }

    public int hashCode() {
        switch (this.a) {
            case BuildConfig.VERSION_CODE /* 25 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case BuildConfig.VERSION_CODE /* 25 */:
                String strF = jce.a.b(getClass()).f();
                strF.getClass();
                return strF;
            default:
                return super.toString();
        }
    }

    public Object u(int i2) {
        ra9 ra9VarC = w().c(i2);
        return ra9VarC.c.getType().invoke(Integer.valueOf(i2 - ra9VarC.a));
    }

    public abstract l94 w();

    public Object x(int i2) {
        Object objInvoke;
        ra9 ra9VarC = w().c(i2);
        int i3 = i2 - ra9VarC.a;
        bz7 key = ra9VarC.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i3))) == null) ? pvj.i(i2) : objInvoke;
    }
}
