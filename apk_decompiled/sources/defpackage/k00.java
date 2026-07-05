package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k00 extends h5 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final wub r0;
    public final AndroidComposeView H;
    public int I = Integer.MIN_VALUE;
    public final j00 J = new j00(this, 0);
    public final AccessibilityManager K;
    public long L;
    public List M;
    public final f00 N;
    public int O;
    public int P;
    public i6 Q;
    public i6 R;
    public boolean S;
    public final xub T;
    public final xub U;
    public final jgg V;
    public final jgg W;
    public int X;
    public Integer Y;
    public final ip0 Z;
    public final zy1 a0;
    public boolean b0;
    public g00 c0;
    public xub d0;
    public final yub e0;
    public final vub f0;
    public final vub g0;
    public final String h0;
    public final String i0;
    public final w3c j0;
    public final xub k0;
    public xjf l0;
    public boolean m0;
    public final vub n0;
    public final y0 o0;
    public final ArrayList p0;
    public final j00 q0;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        wub wubVar = u69.a;
        wub wubVar2 = new wub(32);
        int i = wubVar2.b;
        if (i < 0) {
            gtk.h("");
            throw null;
        }
        int i2 = i + 32;
        wubVar2.b(i2);
        int[] iArr2 = wubVar2.a;
        int i3 = wubVar2.b;
        if (i != i3) {
            mp0.r0(i2, i, i3, iArr2, iArr2);
        }
        mp0.u0(i, 0, 12, iArr, iArr2);
        wubVar2.b += 32;
        r0 = wubVar2;
    }

    public k00(AndroidComposeView androidComposeView) {
        this.H = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.K = (AccessibilityManager) systemService;
        this.L = 100L;
        new Handler(Looper.getMainLooper());
        this.N = new f00(this);
        this.O = Integer.MIN_VALUE;
        this.P = Integer.MIN_VALUE;
        this.T = new xub();
        this.U = new xub();
        this.V = new jgg(0);
        this.W = new jgg(0);
        this.X = -1;
        this.Z = new ip0(0);
        int i = 1;
        this.a0 = wd6.P(1, 6, null);
        this.b0 = true;
        xub xubVar = x69.a;
        xubVar.getClass();
        this.d0 = xubVar;
        this.e0 = new yub();
        this.f0 = new vub();
        this.g0 = new vub();
        this.h0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.i0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.j0 = new w3c((byte) 0, 12);
        this.k0 = new xub();
        this.l0 = new xjf(androidComposeView.getSemanticsOwner().a(), xubVar);
        int i2 = s69.a;
        this.n0 = new vub();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.o0 = new y0(i, this);
        this.p0 = new ArrayList();
        this.q0 = new j00(this, i);
    }

    public static Rect G(knk knkVar, float f, float f2) {
        if (!(knkVar instanceof flc) && !(knkVar instanceof glc)) {
            return null;
        }
        l9e l9eVarW = knkVar.w();
        return new Rect((int) (l9eVarW.a + f), (int) (l9eVarW.b + f2), (int) (l9eVarW.c + f), (int) (l9eVarW.d + f2));
    }

    public static float[] I(knk knkVar) {
        if (!(knkVar instanceof glc)) {
            return null;
        }
        sve sveVar = ((glc) knkVar).k;
        long j = sveVar.h;
        long j2 = sveVar.g;
        long j3 = sveVar.f;
        long j4 = sveVar.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region J(knk knkVar, float f, float f2) {
        if (knkVar instanceof elc) {
            elc elcVar = (elc) knkVar;
            l9e l9eVarL = elcVar.w().l(f, f2);
            Region region = new Region(new Rect((int) (l9eVarL.a + MTTypesetterKt.kLineSkipLimitMultiplier), (int) (l9eVarL.b + MTTypesetterKt.kLineSkipLimitMultiplier), (int) (l9eVarL.c + MTTypesetterKt.kLineSkipLimitMultiplier), (int) (l9eVarL.d + MTTypesetterKt.kLineSkipLimitMultiplier)));
            Region region2 = new Region();
            c40 c40Var = elcVar.k;
            if (c40Var instanceof c40) {
                Path path = c40Var.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            pmf.n("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String o(wjf wjfVar) {
        zb0 zb0Var;
        if (wjfVar != null) {
            qjf qjfVar = wjfVar.d;
            ewb ewbVar = qjfVar.E;
            dkf dkfVar = akf.a;
            if (ewbVar.c(dkfVar)) {
                return qaa.a((List) qjfVar.g(dkfVar), ",", null, 62);
            }
            dkf dkfVar2 = akf.G;
            if (ewbVar.c(dkfVar2)) {
                Object objG = ewbVar.g(dkfVar2);
                if (objG == null) {
                    objG = null;
                }
                zb0 zb0Var2 = (zb0) objG;
                if (zb0Var2 != null) {
                    return zb0Var2.F;
                }
            } else {
                Object objG2 = ewbVar.g(akf.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (zb0Var = (zb0) w44.N0(list)) != null) {
                    return zb0Var.F;
                }
            }
        }
        return null;
    }

    public static final boolean s(v8f v8fVar, float f) {
        zy7 zy7Var = v8fVar.a;
        if (f >= MTTypesetterKt.kLineSkipLimitMultiplier || ((Number) zy7Var.a()).floatValue() <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return f > MTTypesetterKt.kLineSkipLimitMultiplier && ((Number) zy7Var.a()).floatValue() < ((Number) v8fVar.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean t(v8f v8fVar) {
        zy7 zy7Var = v8fVar.a;
        boolean z = v8fVar.c;
        if (((Number) zy7Var.a()).floatValue() <= MTTypesetterKt.kLineSkipLimitMultiplier || z) {
            return ((Number) zy7Var.a()).floatValue() < ((Number) v8fVar.b.a()).floatValue() && z;
        }
        return true;
    }

    public static final boolean u(v8f v8fVar) {
        zy7 zy7Var = v8fVar.a;
        boolean z = v8fVar.c;
        if (((Number) zy7Var.a()).floatValue() >= ((Number) v8fVar.b.a()).floatValue() || z) {
            return ((Number) zy7Var.a()).floatValue() > MTTypesetterKt.kLineSkipLimitMultiplier && z;
        }
        return true;
    }

    public static /* synthetic */ void z(k00 k00Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        k00Var.y(i, i2, num, null);
    }

    public final void A(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventJ = j(v(i), 32);
        accessibilityEventJ.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i) {
        g00 g00Var = this.c0;
        if (g00Var != null) {
            if (i != g00Var.d().f) {
                return;
            }
            if (SystemClock.uptimeMillis() - g00Var.f() <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(g00Var.d().f), 131072);
                accessibilityEventJ.setFromIndex(g00Var.b());
                accessibilityEventJ.setToIndex(g00Var.e());
                accessibilityEventJ.setAction(g00Var.a());
                accessibilityEventJ.setMovementGranularity(g00Var.c());
                accessibilityEventJ.getText().add(o(g00Var.d()));
                x(accessibilityEventJ);
            }
        }
        this.c0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x04dc A[PHI: r37 r41
      0x04dc: PHI (r37v8 boolean) = (r37v7 boolean), (r37v7 boolean), (r37v7 boolean), (r37v7 boolean), (r37v7 boolean), (r37v9 boolean) binds: [B:208:0x04e5, B:215:0x04f5, B:218:0x0504, B:225:0x0510, B:222:0x050b, B:205:0x04da] A[DONT_GENERATE, DONT_INLINE]
      0x04dc: PHI (r41v7 int) = (r41v6 int), (r41v6 int), (r41v6 int), (r41v6 int), (r41v6 int), (r41v8 int) binds: [B:208:0x04e5, B:215:0x04f5, B:218:0x0504, B:225:0x0510, B:222:0x050b, B:205:0x04da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.w69 r57) {
        /*
            Method dump skipped, instruction units count: 1685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.C(w69):void");
    }

    public final void D(av9 av9Var, yub yubVar) {
        qjf qjfVarI;
        if (av9Var.X() && !this.H.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(av9Var)) {
            av9 av9Var2 = null;
            if (!av9Var.k0.i(8)) {
                av9Var = av9Var.G();
                while (true) {
                    if (av9Var == null) {
                        av9Var = null;
                        break;
                    } else if (av9Var.k0.i(8)) {
                        break;
                    } else {
                        av9Var = av9Var.G();
                    }
                }
            }
            if (av9Var == null || (qjfVarI = av9Var.I()) == null) {
                return;
            }
            if (!qjfVarI.G) {
                av9 av9VarG = av9Var.G();
                while (true) {
                    if (av9VarG != null) {
                        qjf qjfVarI2 = av9VarG.I();
                        if (qjfVarI2 != null && qjfVarI2.G) {
                            av9Var2 = av9VarG;
                            break;
                        }
                        av9VarG = av9VarG.G();
                    } else {
                        break;
                    }
                }
                if (av9Var2 != null) {
                    av9Var = av9Var2;
                }
            }
            int i = av9Var.F;
            if (yubVar.a(i)) {
                z(this, v(i), FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, 1, 8);
            }
        }
    }

    public final void E(av9 av9Var) {
        if (av9Var.X() && !this.H.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(av9Var)) {
            int i = av9Var.F;
            v8f v8fVar = (v8f) this.T.b(i);
            v8f v8fVar2 = (v8f) this.U.b(i);
            if (v8fVar == null && v8fVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i, FreeTypeConstants.FT_LOAD_MONOCHROME);
            if (v8fVar != null) {
                accessibilityEventJ.setScrollX((int) ((Number) v8fVar.a.a()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) v8fVar.b.a()).floatValue());
            }
            if (v8fVar2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) v8fVar2.a.a()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) v8fVar2.b.a()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(wjf wjfVar, int i, int i2, boolean z) {
        String strO;
        qjf qjfVar = wjfVar.d;
        int i3 = wjfVar.f;
        dkf dkfVar = ojf.j;
        if (qjfVar.E.c(dkfVar) && mwa.n(wjfVar)) {
            rz7 rz7Var = (rz7) ((e5) wjfVar.d.g(dkfVar)).b;
            if (rz7Var != null) {
                return ((Boolean) rz7Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.X) && (strO = o(wjfVar)) != null) {
            if (i < 0 || i != i2 || i2 > strO.length()) {
                i = -1;
            }
            this.X = i;
            boolean z2 = strO.length() > 0;
            x(k(v(i3), z2 ? Integer.valueOf(this.X) : null, z2 ? Integer.valueOf(this.X) : null, z2 ? Integer.valueOf(strO.length()) : null, strO));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        AndroidComposeView androidComposeView = this.H;
        long jT = androidComposeView.t(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jT2 = androidComposeView.t((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jT >> 32);
        int i2 = (int) (jT2 >> 32);
        int i3 = (int) (jT & 4294967295L);
        int i4 = (int) (jT2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.L():void");
    }

    @Override // defpackage.h5
    public final efe a(View view) {
        return this.N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, i6 i6Var, String str, Bundle bundle) {
        wjf wjfVar;
        int i2;
        int i3;
        AndroidComposeView androidComposeView;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = i6Var.a;
        yjf yjfVar = (yjf) n().b(i);
        if (yjfVar == null || (wjfVar = yjfVar.a) == null) {
            return;
        }
        av9 av9Var = wjfVar.c;
        qjf qjfVar = wjfVar.d;
        ewb ewbVar = qjfVar.E;
        String strO = o(wjfVar);
        if (x44.r(str, this.h0)) {
            int iD = this.f0.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (x44.r(str, this.i0)) {
            int iD2 = this.g0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = ewbVar.c(ojf.a);
        AndroidComposeView androidComposeView2 = this.H;
        m5c m5cVar = null;
        if (zC && bundle != null && x44.r(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strO != null ? strO.length() : Integer.MAX_VALUE)) {
                    yjh yjhVarZ = iuj.z(qjfVar);
                    if (yjhVarZ == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        if (i7 >= yjhVarZ.a.a.F.length()) {
                            arrayList.add(m5cVar);
                            i2 = i4;
                            i3 = i5;
                            androidComposeView = androidComposeView2;
                        } else {
                            l9e l9eVarB = yjhVarZ.b(i7);
                            m5c m5cVarD = wjfVar.d();
                            long jK = 0;
                            if (m5cVarD != null) {
                                if (!m5cVarD.h1().R) {
                                    m5cVarD = m5cVar;
                                }
                                if (m5cVarD != null) {
                                    jK = m5cVarD.K(0L);
                                }
                            }
                            l9e l9eVarM = l9eVarB.m(jK);
                            l9e l9eVarG = wjfVar.g();
                            l9e l9eVarI = l9eVarM.k(l9eVarG) ? l9eVarM.i(l9eVarG) : m5cVar;
                            if (l9eVarI != 0) {
                                long jT = androidComposeView2.t((((long) Float.floatToRawIntBits(l9eVarI.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(l9eVarI.a)) << 32));
                                androidComposeView = androidComposeView2;
                                long jT2 = androidComposeView.t((((long) Float.floatToRawIntBits(l9eVarI.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(l9eVarI.c)) << 32));
                                int i8 = (int) (jT >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (jT2 >> 32);
                                int i10 = (int) (jT & 4294967295L);
                                int i11 = (int) (jT2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                            } else {
                                i2 = i4;
                                i3 = i5;
                                androidComposeView = androidComposeView2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i6++;
                        i5 = i3;
                        androidComposeView2 = androidComposeView;
                        i4 = i2;
                        m5cVar = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        dkf dkfVar = akf.A;
        if (ewbVar.c(dkfVar) && bundle != null && x44.r(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = ewbVar.g(dkfVar);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (x44.r(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, wjfVar.f);
            return;
        }
        if (x44.r(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = ewbVar.g(akf.S);
            e0g e0gVar = (e0g) (objG2 == null ? null : objG2);
            if (e0gVar != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                l9e l9eVarP = p(wjfVar, rect, e0gVar);
                float f = l9eVarP.b;
                float f2 = l9eVarP.a;
                knk knkVarA = e0gVar.a(l9eVarP.g(), av9Var.e0, androidComposeView2.getDensity());
                if (knkVarA instanceof flc) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(knkVarA, f2, f));
                    return;
                } else if (knkVarA instanceof glc) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(knkVarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I(knkVarA));
                    return;
                } else if (!(knkVarA instanceof elc)) {
                    mr9.b();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", J(knkVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (x44.r(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = ewbVar.g(akf.S);
            e0g e0gVar2 = (e0g) (objG3 == null ? null : objG3);
            if (e0gVar2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                l9e l9eVarP2 = p(wjfVar, rect2, e0gVar2);
                Rect rectG = G(e0gVar2.a(l9eVarP2.g(), av9Var.e0, androidComposeView2.getDensity()), l9eVarP2.a, l9eVarP2.b);
                if (rectG != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
                    return;
                }
                return;
            }
            return;
        }
        if (x44.r(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = ewbVar.g(akf.S);
            e0g e0gVar3 = (e0g) (objG4 == null ? null : objG4);
            if (e0gVar3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrI = I(e0gVar3.a(p(wjfVar, rect3, e0gVar3).g(), av9Var.e0, androidComposeView2.getDensity()));
                if (fArrI != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI);
                    return;
                }
                return;
            }
            return;
        }
        if (x44.r(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = ewbVar.g(akf.S);
            e0g e0gVar4 = (e0g) (objG5 == null ? null : objG5);
            if (e0gVar4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                l9e l9eVarP3 = p(wjfVar, rect4, e0gVar4);
                Region regionJ = J(e0gVar4.a(l9eVarP3.g(), av9Var.e0, androidComposeView2.getDensity()), l9eVarP3.a, l9eVarP3.b);
                if (regionJ != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionJ);
                }
            }
        }
    }

    public final Rect f(yjf yjfVar) {
        c79 c79Var = yjfVar.b;
        return H(c79Var.a, c79Var.b, c79Var.c, c79Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (defpackage.d4c.K(r7, r0) == r5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vp4 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.h00
            if (r0 == 0) goto L13
            r0 = r11
            h00 r0 = (defpackage.h00) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            h00 r0 = new h00
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.G
            int r1 = r0.I
            r2 = 2
            ip0 r3 = r10.Z
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 != r2) goto L35
            sy1 r1 = r0.F
            yub r6 = r0.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L32
        L2f:
            r11 = r6
            r6 = r1
            goto L56
        L32:
            r10 = move-exception
            goto Lc4
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            r10 = 0
            return r10
        L3c:
            sy1 r1 = r0.F
            yub r6 = r0.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L32
            goto L67
        L44:
            defpackage.sf5.h0(r11)
            yub r11 = new yub     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            zy1 r1 = r10.a0     // Catch: java.lang.Throwable -> L32
            r1.getClass()     // Catch: java.lang.Throwable -> L32
            sy1 r6 = new sy1     // Catch: java.lang.Throwable -> L32
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
        L56:
            r0.E = r11     // Catch: java.lang.Throwable -> L32
            r0.F = r6     // Catch: java.lang.Throwable -> L32
            r0.I = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r6.b(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 != r5) goto L63
            goto Lbd
        L63:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L67:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L32
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto Lbe
            r1.c()     // Catch: java.lang.Throwable -> L32
            boolean r11 = r10.q()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto La2
            int r11 = r3.G     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L7b:
            if (r7 >= r11) goto L8c
            java.lang.Object[] r8 = r3.F     // Catch: java.lang.Throwable -> L32
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L32
            av9 r8 = (defpackage.av9) r8     // Catch: java.lang.Throwable -> L32
            r10.D(r8, r6)     // Catch: java.lang.Throwable -> L32
            r10.E(r8)     // Catch: java.lang.Throwable -> L32
            int r7 = r7 + 1
            goto L7b
        L8c:
            r6.b()     // Catch: java.lang.Throwable -> L32
            androidx.compose.ui.platform.AndroidComposeView r11 = r10.H     // Catch: java.lang.Throwable -> L32
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.m0     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto La2
            if (r11 == 0) goto La2
            r10.m0 = r4     // Catch: java.lang.Throwable -> L32
            y0 r7 = r10.o0     // Catch: java.lang.Throwable -> L32
            r11.post(r7)     // Catch: java.lang.Throwable -> L32
        La2:
            r3.clear()     // Catch: java.lang.Throwable -> L32
            xub r11 = r10.T     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            xub r11 = r10.U     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            long r7 = r10.L     // Catch: java.lang.Throwable -> L32
            r0.E = r6     // Catch: java.lang.Throwable -> L32
            r0.F = r1     // Catch: java.lang.Throwable -> L32
            r0.I = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = defpackage.d4c.K(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r5) goto L2f
        Lbd:
            return r5
        Lbe:
            r3.clear()
            iei r10 = defpackage.iei.a
            return r10
        Lc4:
            r3.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.g(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.h(int, long, boolean):boolean");
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.H.getSemanticsOwner().a(), this.l0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        yjf yjfVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.H;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (q() && (yjfVar = (yjf) n().b(i)) != null) {
            wjf wjfVar = yjfVar.a;
            accessibilityEventObtain.setPassword(wjfVar.d.E.c(akf.N));
            Object objG = wjfVar.d.E.g(akf.o);
            if (objG == null) {
                objG = null;
            }
            yjk.n(accessibilityEventObtain, x44.r(objG, Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int l(wjf wjfVar) {
        qjf qjfVar = wjfVar.d;
        if (!qjfVar.E.c(akf.a)) {
            dkf dkfVar = akf.H;
            if (qjfVar.E.c(dkfVar)) {
                return (int) (((kkh) qjfVar.g(dkfVar)).a & 4294967295L);
            }
        }
        return this.X;
    }

    public final int m(wjf wjfVar) {
        qjf qjfVar = wjfVar.d;
        if (!qjfVar.E.c(akf.a)) {
            dkf dkfVar = akf.H;
            if (qjfVar.E.c(dkfVar)) {
                return (int) (((kkh) qjfVar.g(dkfVar)).a >> 32);
            }
        }
        return this.X;
    }

    public final w69 n() {
        if (this.b0) {
            this.b0 = false;
            AndroidComposeView androidComposeView = this.H;
            this.d0 = v40.x(androidComposeView.getSemanticsOwner(), bx.H);
            if (q()) {
                xub xubVar = this.d0;
                Resources resources = androidComposeView.getContext().getResources();
                vub vubVar = this.f0;
                vubVar.a();
                vub vubVar2 = this.g0;
                vubVar2.a();
                yjf yjfVar = (yjf) xubVar.b(-1);
                wjf wjfVar = yjfVar != null ? yjfVar.a : null;
                wjfVar.getClass();
                ArrayList arrayListB = fkf.b(wjfVar, new h4(3, xubVar), new h4(4, resources), x44.W(wjfVar));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((wjf) arrayListB.get(i - 1)).f;
                        int i3 = ((wjf) arrayListB.get(i)).f;
                        vubVar.f(i2, i3);
                        vubVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.d0;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.M = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.M = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.K;
        if (accessibilityManager.isEnabled()) {
            this.M = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.H.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.o0);
        AccessibilityManager accessibilityManager = this.K;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[LOOP:0: B:4:0x0016->B:36:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a A[EDGE_INSN: B:47:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0077], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l9e p(defpackage.wjf r10, android.graphics.Rect r11, defpackage.e0g r12) {
        /*
            r9 = this;
            i00 r0 = new i00
            r0.<init>(r12)
            av9 r10 = r10.c
            g5c r12 = r10.k0
            java.lang.Object r12 = r12.K
            hqb r12 = (defpackage.hqb) r12
            int r1 = r12.H
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L7a
        L16:
            if (r12 == 0) goto L7a
            int r1 = r12.G
            r1 = r1 & 8
            if (r1 == 0) goto L71
            r1 = r12
            r5 = r2
        L20:
            if (r1 == 0) goto L71
            boolean r6 = r1 instanceof defpackage.ujf
            if (r6 == 0) goto L34
            r6 = r1
            ujf r6 = (defpackage.ujf) r6
            r6.X0(r0)
            boolean r6 = r0.b()
            if (r6 == 0) goto L6c
            r2 = r1
            goto L7a
        L34:
            int r6 = r1.G
            r6 = r6 & 8
            if (r6 == 0) goto L6c
            boolean r6 = r1 instanceof defpackage.qw5
            if (r6 == 0) goto L6c
            r6 = r1
            qw5 r6 = (defpackage.qw5) r6
            hqb r6 = r6.T
            r7 = r4
        L44:
            if (r6 == 0) goto L69
            int r8 = r6.G
            r8 = r8 & 8
            if (r8 == 0) goto L66
            int r7 = r7 + 1
            if (r7 != r3) goto L52
            r1 = r6
            goto L66
        L52:
            if (r5 != 0) goto L5d
            wwb r5 = new wwb
            r8 = 16
            hqb[] r8 = new defpackage.hqb[r8]
            r5.<init>(r4, r8)
        L5d:
            if (r1 == 0) goto L63
            r5.b(r1)
            r1 = r2
        L63:
            r5.b(r6)
        L66:
            hqb r6 = r6.J
            goto L44
        L69:
            if (r7 != r3) goto L6c
            goto L20
        L6c:
            hqb r1 = defpackage.yfd.j(r5)
            goto L20
        L71:
            int r1 = r12.H
            r1 = r1 & 8
            if (r1 == 0) goto L7a
            hqb r12 = r12.J
            goto L16
        L7a:
            ujf r2 = (defpackage.ujf) r2
            if (r2 == 0) goto Lbd
            r12 = r2
            hqb r12 = (defpackage.hqb) r12
            hqb r12 = r12.E
            boolean r12 = r12.R
            if (r12 != r3) goto Lbd
            m5c r10 = defpackage.yfd.V(r2)
            cu9 r12 = defpackage.nai.A(r10)
            l9e r10 = r12.J(r10, r4)
            float r12 = r10.a
            float r0 = r10.b
            float r1 = r10.c
            float r10 = r10.d
            android.graphics.Rect r9 = r9.H(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            float r10 = (float) r10
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            float r11 = (float) r12
            l9e r12 = new l9e
            int r0 = r9.width()
            float r0 = (float) r0
            float r0 = r0 + r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 + r11
            r12.<init>(r10, r11, r0, r9)
            return r12
        Lbd:
            g5c r9 = r10.k0
            java.lang.Object r9 = r9.I
            m5c r9 = (defpackage.m5c) r9
            l9e r9 = defpackage.nai.p(r9, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.p(wjf, android.graphics.Rect, e0g):l9e");
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.K;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.M;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.M = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void r(av9 av9Var) {
        if (this.Z.add(av9Var)) {
            this.a0.r(iei.a);
        }
    }

    public final int v(int i) {
        if (i == this.H.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.wjf r20, defpackage.xjf r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.f79.a
            yub r3 = new yub
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.wjf.j(r4, r1)
            av9 r6 = r1.c
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r9 = r8
        L1d:
            if (r9 >= r7) goto L43
            java.lang.Object r10 = r5.get(r9)
            wjf r10 = (defpackage.wjf) r10
            w69 r11 = r0.n()
            int r10 = r10.f
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L40
            yub r11 = r2.b
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3d
            r0.r(r6)
            return
        L3d:
            r3.a(r10)
        L40:
            int r9 = r9 + 1
            goto L1d
        L43:
            yub r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8e
            r9 = r8
        L4f:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L89
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L69:
            if (r14 >= r12) goto L87
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L83
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L83
            r0.r(r6)
            return
        L83:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L69
        L87:
            if (r12 != r13) goto L8e
        L89:
            if (r9 == r7) goto L8e
            int r9 = r9 + 1
            goto L4f
        L8e:
            java.util.List r1 = defpackage.wjf.j(r4, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L99:
            if (r8 >= r2) goto Lbf
            java.lang.Object r3 = r1.get(r8)
            wjf r3 = (defpackage.wjf) r3
            xub r4 = r0.k0
            int r5 = r3.f
            java.lang.Object r4 = r4.b(r5)
            xjf r4 = (defpackage.xjf) r4
            if (r4 == 0) goto Lbc
            w69 r5 = r0.n()
            int r6 = r3.f
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lbc
            r0.w(r3, r4)
        Lbc:
            int r8 = r8 + 1
            goto L99
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.w(wjf, xjf):void");
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.S = true;
        }
        try {
            return ((Boolean) this.J.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.S = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i, i2);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(qaa.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
