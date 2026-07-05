package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.ContentInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.glance.appwidget.protobuf.a;
import androidx.health.platform.client.proto.g;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter$State$Loading;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.crypto.tink.shaded.protobuf.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ive implements vdb, yz7, z4h, ee1, tc2, s5d, sac, zn4, mec, ocg, kn0 {
    public static ive G;
    public static final jve H = new jve(0, false, false, 0, 0);
    public static final Object I = new Object();
    public static final int[] J = {0, 9, 11, 1114111};
    public static final int[] K = {0, 1114111};
    public static final z18 L;
    public static final b28 M;
    public final /* synthetic */ int E;
    public Object F;

    static {
        int i = 1;
        L = new z18(i);
        M = new b28(i);
    }

    public ive(int i) {
        lhb lhbVar;
        nhb nhbVar;
        this.E = i;
        int i2 = 2;
        switch (i) {
            case 3:
                nud nudVar = nud.c;
                try {
                    lhbVar = (lhb) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    lhbVar = L;
                }
                lhb[] lhbVarArr = {z18.b, lhbVar};
                bqa bqaVar = new bqa();
                bqaVar.a = lhbVarArr;
                Charset charset = r89.a;
                this.F = bqaVar;
                break;
            case 4:
                try {
                    nhbVar = (nhb) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    nhbVar = M;
                }
                nhb[] nhbVarArr = {b28.b, nhbVar};
                dqa dqaVar = new dqa();
                dqaVar.a = nhbVarArr;
                Charset charset2 = t89.a;
                this.F = dqaVar;
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                this.F = t8g.a;
                break;
            default:
                dg3 dg3Var = new dg3(i2);
                dg3Var.e = new s59[10];
                dg3Var.b = 0;
                dg3Var.d = 2;
                this.F = dg3Var;
                v(5);
                break;
        }
    }

    public static synchronized ive r() {
        try {
            if (G == null) {
                G = new ive(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return G;
    }

    public void A(int i) {
        this.F = Integer.valueOf(i | (-16777216));
    }

    public void B(Object obj, wn9 wn9Var, Object obj2) {
        od1 od1Var = (od1) obj2;
        ArrayList arrayList = ((sa1) obj).a;
        wn9Var.getClass();
        if (x44.r((od1) this.F, od1Var)) {
            return;
        }
        od1 od1Var2 = (od1) this.F;
        if (od1Var2 != null) {
            arrayList.remove(od1Var2);
        }
        this.F = od1Var;
        if (od1Var != null) {
            arrayList.add(od1Var);
        }
    }

    public void C(Intent intent, String str) {
        if (intent.getData() == null) {
            return;
        }
        Uri data = intent.getData();
        rh9 rh9Var = new rh9();
        if (str != null) {
            mpk.U(rh9Var, "referrer", str);
        }
        if (data != null) {
            if (data.isHierarchical()) {
                for (String str2 : data.getQueryParameterNames()) {
                    String queryParameter = data.getQueryParameter(str2);
                    if (queryParameter != null && bsg.k1(queryParameter).toString().length() > 0) {
                        str2.getClass();
                        mpk.U(rh9Var, str2, queryParameter);
                    }
                }
            }
            mpk.U(rh9Var, "url", data.toString());
        }
        gx.e((gx) this.F, "Deep Link Opened", rh9Var.a(), 4);
    }

    public void D(int i, k22 k22Var) {
        e eVar = (e) this.F;
        eVar.r(i, 2);
        eVar.s(k22Var.size());
        g22 g22Var = (g22) k22Var;
        eVar.l(g22Var.H, g22Var.k(), g22Var.size());
    }

    public void E(int i, Object obj, c7f c7fVar) {
        androidx.glance.appwidget.protobuf.e eVar = (androidx.glance.appwidget.protobuf.e) this.F;
        eVar.y(i, 3);
        c7fVar.h((a) obj, eVar.a);
        eVar.y(i, 4);
    }

    public void F(int i, Object obj, e7f e7fVar) {
        e eVar = (e) this.F;
        eVar.r(i, 3);
        e7fVar.h((com.google.crypto.tink.shaded.protobuf.a) obj, eVar.a);
        eVar.r(i, 4);
    }

    public void G(int i, Object obj, e7f e7fVar) {
        e eVar = (e) this.F;
        com.google.crypto.tink.shaded.protobuf.a aVar = (com.google.crypto.tink.shaded.protobuf.a) obj;
        eVar.r(i, 2);
        eVar.s(aVar.b(e7fVar));
        e7fVar.h(aVar, eVar.a);
    }

    @Override // defpackage.vdb
    public void a(vcb vcbVar, boolean z) {
        if (vcbVar instanceof xug) {
            ((xug) vcbVar).z.k().c(false);
        }
        vdb vdbVar = ((kb) this.F).I;
        if (vdbVar != null) {
            vdbVar.a(vcbVar, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:104:0x005c->B:19:0x005c BREAK  A[LOOP:1: B:11:0x0045->B:20:0x0062]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    @Override // defpackage.yz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ive.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.zn4
    public ClipData b() {
        return ((ContentInfo) this.F).getClip();
    }

    @Override // defpackage.ocg
    public float c(float f, float f2) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.zn4
    public int d() {
        return ((ContentInfo) this.F).getSource();
    }

    @Override // defpackage.ocg
    public float e(float f) {
        return ((qb5) this.F).e(f);
    }

    @Override // defpackage.z4h
    public void f(Drawable drawable) {
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.F;
        asyncImagePainter.l(new AsyncImagePainter$State$Loading(drawable != null ? asyncImagePainter.k(drawable) : null));
    }

    @Override // defpackage.s5d
    public InputConnection g(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection inputConnectionG = ((s5d) this.F).g(editorInfo);
        editorInfo.imeOptions |= 16777216;
        return inputConnectionG;
    }

    @Override // defpackage.zn4
    public int getFlags() {
        return ((ContentInfo) this.F).getFlags();
    }

    @Override // defpackage.ee1
    public void h(hh4 hh4Var) {
        boolean z = hh4Var.F == 0;
        fe1 fe1Var = (fe1) this.F;
        if (z) {
            fe1Var.m(null, fe1Var.s());
            return;
        }
        de1 de1Var = fe1Var.T;
        if (de1Var != null) {
            de1Var.b(hh4Var);
        }
    }

    @Override // defpackage.zn4
    public ContentInfo i() {
        return (ContentInfo) this.F;
    }

    public poj j() {
        return new poj((Integer) this.F);
    }

    public kr1 k(int i) {
        kr1 kr1VarV = v(3);
        int i2 = kr1VarV.a;
        kr1VarV.b = i2 << 1;
        dg3 dg3Var = (dg3) this.F;
        ((s59[]) dg3Var.e)[i2].c = i;
        int i3 = i + 1;
        if (dg3Var.d < i3) {
            dg3Var.d = i3;
        }
        return kr1VarV;
    }

    @Override // defpackage.kn0
    public Object l(h9f h9fVar, Float f, Float f2, bz7 bz7Var, jcg jcgVar) {
        Object objJ = dgj.j(h9fVar, f.floatValue(), yb5.a(MTTypesetterKt.kLineSkipLimitMultiplier, f2.floatValue(), 28), (zn5) this.F, bz7Var, jcgVar);
        return objJ == m45.E ? objJ : (jb0) objJ;
    }

    public kr1 m(kr1 kr1Var, kr1 kr1Var2) {
        int i;
        int i2 = kr1Var.a;
        boolean z = false;
        if (i2 == 0 || (i = kr1Var2.a) == 0) {
            return new kr1(0, 0, false);
        }
        ((dg3) this.F).d(kr1Var.b, i);
        int i3 = kr1Var2.b;
        if (kr1Var.c && kr1Var2.c) {
            z = true;
        }
        return new kr1(i2, i3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kr1 n(kde kdeVar) {
        int i;
        dg3 dg3Var = (dg3) this.F;
        kr1 kr1VarM = null;
        switch (sq6.F(kdeVar.a)) {
            case 0:
                return new kr1(0, 0, false);
            case 1:
                return w();
            case 2:
                int[] iArr = kdeVar.d;
                if (iArr.length == 0) {
                    return w();
                }
                for (int i2 : iArr) {
                    kr1 kr1VarZ = z(kdeVar.b, new int[]{i2});
                    kr1VarM = kr1VarM == null ? kr1VarZ : m(kr1VarM, kr1VarZ);
                }
                return kr1VarM;
            case 3:
                return z(kdeVar.b, kdeVar.d);
            case 4:
                return z(0, J);
            case 5:
                return z(0, K);
            case 6:
                return p(1);
            case 7:
                return p(2);
            case 8:
                return p(4);
            case 9:
                return p(8);
            case 10:
                return p(16);
            case 11:
                return p(32);
            case 12:
                return m(m(k(kdeVar.g << 1), n(kdeVar.c[0])), k((kdeVar.g << 1) | 1));
            case 13:
                kr1 kr1VarN = n(kdeVar.c[0]);
                boolean z = (kdeVar.b & 32) != 0;
                if (!kr1VarN.c) {
                    return u(kr1VarN, z);
                }
                int i3 = kr1VarN.a;
                int i4 = u(kr1VarN, z).b;
                kr1 kr1VarV = v(1);
                int i5 = kr1VarV.a;
                s59 s59Var = ((s59[]) dg3Var.e)[i5];
                if (z) {
                    s59Var.c = i3;
                    kr1VarV.b = i5 << 1;
                } else {
                    s59Var.b = i3;
                    kr1VarV.b = (i5 << 1) | 1;
                }
                kr1VarV.b = dg3Var.c(kr1VarV.b, i4);
                return kr1VarV;
            case 14:
                kr1 kr1VarN2 = n(kdeVar.c[0]);
                return new kr1(kr1VarN2.a, u(kr1VarN2, (kdeVar.b & 32) != 0).b, kr1VarN2.c);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                kr1 kr1VarN3 = n(kdeVar.c[0]);
                Object[] objArr = (kdeVar.b & 32) != 0 ? 1 : 0;
                kr1 kr1VarV2 = v(1);
                dg3 dg3Var2 = (dg3) this.F;
                int i6 = kr1VarV2.a;
                s59 s59Var2 = ((s59[]) dg3Var2.e)[i6];
                if (objArr != 0) {
                    s59Var2.c = kr1VarN3.a;
                    kr1VarV2.b = i6 << 1;
                } else {
                    s59Var2.b = kr1VarN3.a;
                    kr1VarV2.b = (i6 << 1) | 1;
                }
                kr1VarV2.b = dg3Var2.c(kr1VarV2.b, kr1VarN3.b);
                return kr1VarV2;
            case 16:
            default:
                sz6.j("regexp: unhandled case in compile");
                return null;
            case g.MAX_FIELD_NUMBER /* 17 */:
                kde[] kdeVarArr = kdeVar.c;
                if (kdeVarArr.length == 0) {
                    return w();
                }
                for (kde kdeVar2 : kdeVarArr) {
                    kr1 kr1VarN4 = n(kdeVar2);
                    if (kr1VarM != null) {
                        kr1VarN4 = m(kr1VarM, kr1VarN4);
                    }
                    kr1VarM = kr1VarN4;
                }
                return kr1VarM;
            case g.AVG_FIELD_NUMBER /* 18 */:
                kde[] kdeVarArr2 = kdeVar.c;
                if (kdeVarArr2.length == 0) {
                    return w();
                }
                for (kde kdeVar3 : kdeVarArr2) {
                    kr1 kr1VarN5 = n(kdeVar3);
                    if (kr1VarM == null || (i = kr1VarM.a) == 0) {
                        kr1VarM = kr1VarN5;
                    } else if (kr1VarN5.a != 0) {
                        kr1 kr1VarV3 = v(1);
                        s59 s59Var3 = ((s59[]) dg3Var.e)[kr1VarV3.a];
                        s59Var3.b = i;
                        s59Var3.c = kr1VarN5.a;
                        kr1VarV3.b = dg3Var.c(kr1VarM.b, kr1VarN5.b);
                        kr1VarV3.c = kr1VarM.c || kr1VarN5.c;
                        kr1VarM = kr1VarV3;
                    }
                }
                return kr1VarM;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(android.content.Context r9, int r10, defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ive.o(android.content.Context, int, vp4):java.lang.Object");
    }

    @Override // defpackage.sac
    public Object o0() {
        Class cls = (Class) this.F;
        try {
            return ufi.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override // defpackage.mec
    public /* synthetic */ void onSuccess(Object obj) {
        ((lc) this.F).invoke(obj);
    }

    public kr1 p(int i) {
        kr1 kr1VarV = v(4);
        dg3 dg3Var = (dg3) this.F;
        int i2 = kr1VarV.a;
        ((s59[]) dg3Var.e)[i2].c = i;
        kr1VarV.b = i2 << 1;
        return kr1VarV;
    }

    @Override // defpackage.tc2
    public void p0(ee2 ee2Var, pd1 pd1Var) {
        mub mubVar = (mub) this.F;
        if (mubVar == null) {
            x44.o0("ranges");
            throw null;
        }
        if (ee2Var == null) {
            return;
        }
        pd1Var.g(mubVar, ee2Var);
    }

    public jve q() {
        return (jve) this.F;
    }

    @Override // defpackage.vdb
    public boolean s(vcb vcbVar) {
        kb kbVar = (kb) this.F;
        if (vcbVar == kbVar.G) {
            return false;
        }
        ((xug) vcbVar).A.getClass();
        vdb vdbVar = kbVar.I;
        if (vdbVar != null) {
            return vdbVar.s(vcbVar);
        }
        return false;
    }

    public Object t(Context context, nm0 nm0Var, Bundle bundle, sz7 sz7Var, vp4 vp4Var) {
        return ctf.a.a(new h68(context, nm0Var, this, bundle, sz7Var, null), vp4Var);
    }

    public String toString() {
        switch (this.E) {
            case 24:
                return "ContentInfoCompat{" + ((ContentInfo) this.F) + "}";
            default:
                return super.toString();
        }
    }

    public kr1 u(kr1 kr1Var, boolean z) {
        kr1 kr1VarV = v(1);
        dg3 dg3Var = (dg3) this.F;
        int i = kr1VarV.a;
        s59 s59Var = ((s59[]) dg3Var.e)[i];
        if (z) {
            s59Var.c = kr1Var.a;
            kr1VarV.b = i << 1;
        } else {
            s59Var.b = kr1Var.a;
            kr1VarV.b = (i << 1) | 1;
        }
        dg3Var.d(kr1Var.b, i);
        return kr1VarV;
    }

    public kr1 v(int i) {
        dg3 dg3Var = (dg3) this.F;
        int i2 = dg3Var.b;
        s59[] s59VarArr = (s59[]) dg3Var.e;
        if (i2 >= s59VarArr.length) {
            dg3Var.e = (s59[]) Arrays.copyOf(s59VarArr, s59VarArr.length * 2);
        }
        s59[] s59VarArr2 = (s59[]) dg3Var.e;
        int i3 = dg3Var.b;
        s59 s59Var = new s59();
        s59Var.a = i;
        s59VarArr2[i3] = s59Var;
        dg3Var.b = i3 + 1;
        return new kr1(i3, 0, true);
    }

    public kr1 w() {
        kr1 kr1VarV = v(7);
        kr1VarV.b = kr1VarV.a << 1;
        return kr1VarV;
    }

    public void x(hp1 hp1Var, List list) {
        v84 v84Var = (v84) this.F;
        hp1Var.getClass();
        list.getClass();
        v84Var.c0(new sxd(hp1Var, list));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zk3
            if (r0 == 0) goto L13
            r0 = r5
            zk3 r0 = (defpackage.zk3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            zk3 r0 = new zk3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.E
            int r5 = r0.G
            r1 = 1
            if (r5 == 0) goto L2c
            if (r5 == r1) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r4)
            throw r4
        L2c:
            defpackage.sf5.h0(r4)
            ta4 r4 = defpackage.bhk.b
            r0.G = r1
            defpackage.xpk.e(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ive.y(vp4):void");
    }

    public kr1 z(int i, int[] iArr) {
        kr1 kr1VarV = v(8);
        kr1VarV.c = false;
        dg3 dg3Var = (dg3) this.F;
        int i2 = kr1VarV.a;
        s59 s59Var = ((s59[]) dg3Var.e)[i2];
        s59Var.d = iArr;
        int i3 = i & 1;
        if (iArr.length != 1 || xzk.G(iArr[0]) == iArr[0]) {
            i3 = 0;
        }
        s59Var.c = i3;
        kr1VarV.b = i2 << 1;
        if (((i3 & 1) == 0 && iArr.length == 1) || (iArr.length == 2 && iArr[0] == iArr[1])) {
            s59Var.a = 9;
            return kr1VarV;
        }
        if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
            s59Var.a = 10;
            return kr1VarV;
        }
        if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
            s59Var.a = 11;
        }
        return kr1VarV;
    }

    public /* synthetic */ ive(int i, boolean z) {
        this.E = i;
    }

    public /* synthetic */ ive(boolean z) {
        this.E = 26;
    }

    public ive(fe1 fe1Var) {
        this.E = 10;
        Objects.requireNonNull(fe1Var);
        this.F = fe1Var;
    }

    public ive(androidx.glance.appwidget.protobuf.e eVar) {
        this.E = 21;
        Charset charset = r89.a;
        this.F = eVar;
        eVar.a = this;
    }

    public /* synthetic */ ive(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public ive(e eVar) {
        this.E = 22;
        t89.a("output", eVar);
        this.F = eVar;
        eVar.a = this;
    }

    public ive(hi6 hi6Var) {
        this.E = 1;
        Context context = (Context) hi6Var.E;
        String str = (String) hi6Var.F;
        String str2 = (String) hi6Var.G;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.F = (ro6) hi6Var.K;
            return;
        }
        sz6.p("keysetName cannot be null");
        throw null;
    }

    public ive(ContentInfo contentInfo) {
        this.E = 24;
        contentInfo.getClass();
        this.F = gb2.i(contentInfo);
    }

    public ive(BottomSheetBehavior bottomSheetBehavior) {
        this.E = 15;
        this.F = bottomSheetBehavior;
        new k51(3, this);
    }
}
