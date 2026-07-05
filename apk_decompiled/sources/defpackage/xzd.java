package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.ViewStructure;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.webkit.WebViewStartupException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class xzd implements sr9, f6b, kn0, tcb, nji, WebMessageListenerBoundaryInterface, d8j, see, up4, eba {
    public final /* synthetic */ int E;
    public Object F;

    public xzd(int i) {
        this.E = i;
        switch (i) {
            case 7:
                this.F = new Stack();
                break;
            case 27:
                this.F = new EnumMap(ork.class);
                break;
            default:
                this.F = new ro6(100);
                break;
        }
    }

    public static xzd K(String str) {
        rrj rrjVar;
        EnumMap enumMap = new EnumMap(ork.class);
        if (str.length() < ork.values().length || str.charAt(0) != '1') {
            return new xzd(27);
        }
        ork[] orkVarArrValues = ork.values();
        int length = orkVarArrValues.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            ork orkVar = orkVarArrValues[i2];
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            rrj[] rrjVarArrValues = rrj.values();
            int length2 = rrjVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    rrjVar = rrj.UNSET;
                    break;
                }
                rrjVar = rrjVarArrValues[i4];
                if (rrjVar.E == cCharAt) {
                    break;
                }
                i4++;
            }
            enumMap.put(orkVar, rrjVar);
            i2++;
            i = i3;
        }
        return new xzd(enumMap);
    }

    public static l22 n(xzd xzdVar, l22 l22Var, l22 l22Var2) {
        xzdVar.w(l22Var);
        xzdVar.w(l22Var2);
        Stack stack = (Stack) xzdVar.F;
        l22 lveVar = (l22) stack.pop();
        while (!stack.isEmpty()) {
            lveVar = new lve((l22) stack.pop(), lveVar);
        }
        return lveVar;
    }

    public static xzd v() {
        return new xzd(5);
    }

    public void A() {
        ((kmj) this.F).u.Q.post(new k51(13, this));
    }

    @Override // defpackage.tcb
    public void B(vcb vcbVar) {
        Toolbar toolbar = (Toolbar) this.F;
        kb kbVar = toolbar.E.a0;
        if (kbVar == null || !kbVar.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.n0.G).iterator();
            while (it.hasNext()) {
                ((kx7) it.next()).a.t();
            }
        }
    }

    public void C(String str) {
        ((ViewStructure) this.F).setClassName(str);
    }

    public void D(String str) {
        ((ViewStructure) this.F).setContentDescription(str);
    }

    public void E(int i, int i2, int i3, int i4) {
        ((ViewStructure) this.F).setDimens(i, i2, 0, 0, i3, i4);
    }

    public void F(int i, String str) {
        ((ViewStructure) this.F).setId(i, null, null, str);
    }

    public void G(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sz6.p("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzd zzdVar = (zzd) it.next();
            if (!"play_pass_subs".equals(zzdVar.b)) {
                hashSet.add(zzdVar.b);
            }
        }
        if (hashSet.size() <= 1) {
            this.F = txj.o(arrayList);
        } else {
            sz6.p("All products should be of the same product type.");
        }
    }

    public void H(CharSequence charSequence) {
        ((ViewStructure) this.F).setText(charSequence);
    }

    public void I(float f) {
        ((ViewStructure) this.F).setTextStyle(f, 0, 0, 0);
    }

    public ViewStructure J() {
        return (ViewStructure) this.F;
    }

    public rrj L() {
        rrj rrjVar = (rrj) ((EnumMap) this.F).get(ork.AD_PERSONALIZATION);
        return rrjVar == null ? rrj.UNSET : rrjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(defpackage.ork r2, int r3) {
        /*
            r1 = this;
            r0 = -30
            if (r3 == r0) goto L1e
            r0 = -20
            if (r3 == r0) goto L1b
            r0 = -10
            if (r3 == r0) goto L18
            if (r3 == 0) goto L1b
            r0 = 30
            if (r3 == r0) goto L15
            rrj r3 = defpackage.rrj.UNSET
            goto L20
        L15:
            rrj r3 = defpackage.rrj.INITIALIZATION
            goto L20
        L18:
            rrj r3 = defpackage.rrj.MANIFEST
            goto L20
        L1b:
            rrj r3 = defpackage.rrj.API
            goto L20
        L1e:
            rrj r3 = defpackage.rrj.TCF
        L20:
            java.lang.Object r1 = r1.F
            java.util.EnumMap r1 = (java.util.EnumMap) r1
            r1.put(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzd.M(ork, int):void");
    }

    public void N(ork orkVar, rrj rrjVar) {
        ((EnumMap) this.F).put(orkVar, rrjVar);
    }

    @Override // defpackage.tcb
    public boolean a(vcb vcbVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        switch (this.E) {
            case 24:
                vnj vnjVar = new vnj(1, (j5h) obj2);
                enj enjVar = (enj) ((znj) obj).t();
                df0 df0Var = (df0) this.F;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(enjVar.k);
                int i = rmj.a;
                parcelObtain.writeStrongBinder(vnjVar);
                rmj.c(parcelObtain, df0Var);
                parcelObtain.writeStrongBinder(null);
                enjVar.c(parcelObtain, 2);
                break;
            default:
                aoj aojVar = new aoj(0, (j5h) obj2);
                soj sojVar = (soj) ((doj) obj).t();
                vh1 vh1Var = (vh1) this.F;
                Parcel parcelD = sojVar.d();
                int i2 = hoj.a;
                parcelD.writeStrongBinder(aojVar);
                hoj.c(parcelD, vh1Var);
                sojVar.D(parcelD, 1);
                break;
        }
    }

    @Override // defpackage.f6b
    public void b(Bundle bundle) {
        ((MediaCodec) this.F).setParameters(bundle);
    }

    @Override // defpackage.f6b
    public void c(int i, rc5 rc5Var, long j, int i2) {
        ((MediaCodec) this.F).queueSecureInputBuffer(i, 0, rc5Var.i, j, i2);
    }

    @Override // defpackage.d8j
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) nv1.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.F).createWebView(webView));
    }

    @Override // defpackage.f6b
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.F).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.eba
    public /* synthetic */ void e(Object obj) {
        ((pea) obj).onLocationResult((LocationResult) this.F);
    }

    @Override // defpackage.nji
    public FileChannel f() {
        return new FileInputStream((File) this.F).getChannel();
    }

    @Override // defpackage.f6b
    public void flush() {
    }

    @Override // defpackage.up4
    public /* synthetic */ Object g(d5h d5hVar) {
        j5h j5hVar = (j5h) this.F;
        if (d5hVar.g()) {
            j5hVar.d((Location) d5hVar.e());
            return null;
        }
        Exception excD = d5hVar.d();
        Objects.requireNonNull(excD);
        j5hVar.c(excD);
        return null;
    }

    @Override // defpackage.d8j
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) nv1.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.F).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // defpackage.f6b
    public void h() {
    }

    @Override // defpackage.d8j
    public String[] i() {
        return ((WebViewProviderFactoryBoundaryInterface) this.F).getSupportedFeatures();
    }

    @Override // defpackage.sr9, defpackage.tr9
    public void j() {
    }

    @Override // defpackage.sr9
    public void k(sxb sxbVar, Object obj) {
    }

    @Override // defpackage.kn0
    public Object l(h9f h9fVar, Float f, Float f2, bz7 bz7Var, jcg jcgVar) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objK = dgj.k(h9fVar, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, yb5.a(MTTypesetterKt.kLineSkipLimitMultiplier, fFloatValue2, 28), (mb0) this.F, bz7Var, jcgVar);
        return objK == m45.E ? objK : (jb0) objK;
    }

    @Override // defpackage.d8j
    public void m(g8j g8jVar, jke jkeVar) {
        ((WebViewProviderFactoryBoundaryInterface) this.F).startUpWebView(new mv1(new fnf(14, g8jVar)), new mv1(new fnf(13, new jke(9, jkeVar))));
    }

    @Override // defpackage.d8j
    public void o(final g8j g8jVar, final mvd mvdVar) {
        WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) this.F;
        final int i = 2;
        Consumer<BiConsumer<Integer, Object>> consumer = new Consumer() { // from class: e8j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                Object obj2 = g8jVar;
                switch (i2) {
                    case 0:
                        l8j l8jVar = new l8j();
                        l8jVar.c = new ArrayList();
                        l8jVar.d = new ArrayList();
                        ((Consumer) obj).accept(l8jVar);
                        new Handler(Looper.getMainLooper()).post(new tui((mvd) obj2, 6, l8jVar));
                        break;
                    case 1:
                        mvd mvdVar2 = (mvd) obj2;
                        k8j k8jVar = new k8j();
                        ((Consumer) obj).accept(k8jVar);
                        new Handler(Looper.getMainLooper()).post(new tui(mvdVar2, 4, k8jVar.a == null ? new WebViewStartupException(k8jVar.b) : new WebViewStartupException(k8jVar.b)));
                        break;
                    default:
                        ((BiConsumer) obj).accept(0, ((g8j) obj2).a);
                        break;
                }
            }
        };
        final int i2 = 0;
        final int i3 = 1;
        webViewProviderFactoryBoundaryInterface.startUpWebView(consumer, new Consumer() { // from class: e8j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i2;
                Object obj2 = mvdVar;
                switch (i22) {
                    case 0:
                        l8j l8jVar = new l8j();
                        l8jVar.c = new ArrayList();
                        l8jVar.d = new ArrayList();
                        ((Consumer) obj).accept(l8jVar);
                        new Handler(Looper.getMainLooper()).post(new tui((mvd) obj2, 6, l8jVar));
                        break;
                    case 1:
                        mvd mvdVar2 = (mvd) obj2;
                        k8j k8jVar = new k8j();
                        ((Consumer) obj).accept(k8jVar);
                        new Handler(Looper.getMainLooper()).post(new tui(mvdVar2, 4, k8jVar.a == null ? new WebViewStartupException(k8jVar.b) : new WebViewStartupException(k8jVar.b)));
                        break;
                    default:
                        ((BiConsumer) obj).accept(0, ((g8j) obj2).a);
                        break;
                }
            }
        }, new Consumer() { // from class: e8j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i3;
                Object obj2 = mvdVar;
                switch (i22) {
                    case 0:
                        l8j l8jVar = new l8j();
                        l8jVar.c = new ArrayList();
                        l8jVar.d = new ArrayList();
                        ((Consumer) obj).accept(l8jVar);
                        new Handler(Looper.getMainLooper()).post(new tui((mvd) obj2, 6, l8jVar));
                        break;
                    case 1:
                        mvd mvdVar2 = (mvd) obj2;
                        k8j k8jVar = new k8j();
                        ((Consumer) obj).accept(k8jVar);
                        new Handler(Looper.getMainLooper()).post(new tui(mvdVar2, 4, k8jVar.a == null ? new WebViewStartupException(k8jVar.b) : new WebViewStartupException(k8jVar.b)));
                        break;
                    default:
                        ((BiConsumer) obj).accept(0, ((g8j) obj2).a);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r10, java.lang.reflect.InvocationHandler r11, android.net.Uri r12, boolean r13, java.lang.reflect.InvocationHandler r14) {
        /*
            r9 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r11 = defpackage.nv1.b(r0, r11)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r11 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r11
            java.lang.reflect.InvocationHandler[] r0 = r11.getPorts()
            int r1 = r0.length
            fnf[] r1 = new defpackage.fnf[r1]
            r2 = 0
            r3 = r2
        L11:
            int r4 = r0.length
            if (r3 >= r4) goto L2c
            fnf r4 = new fnf
            r5 = r0[r3]
            r6 = 12
            r4.<init>(r6, r2)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r6 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r5 = defpackage.nv1.b(r6, r5)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r5 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r5
            r4.F = r5
            r1[r3] = r4
            int r3 = r3 + 1
            goto L11
        L2c:
            bf0 r0 = defpackage.t7j.a
            boolean r0 = r0.b()
            r2 = 1
            if (r0 == 0) goto L61
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r11 = r11.getMessagePayload()
            java.lang.Object r11 = defpackage.nv1.b(r0, r11)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r11 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r11
            int r0 = r11.getType()
            if (r0 == 0) goto L57
            if (r0 == r2) goto L4c
            r11 = 0
            r5 = r11
            goto L6b
        L4c:
            ep1 r0 = new ep1
            byte[] r11 = r11.getAsArrayBuffer()
            r0.<init>(r11, r1)
        L55:
            r5 = r0
            goto L6b
        L57:
            ep1 r0 = new ep1
            java.lang.String r11 = r11.getAsString()
            r0.<init>(r11, r1)
            goto L55
        L61:
            ep1 r0 = new ep1
            java.lang.String r11 = r11.getData()
            r0.<init>(r11, r1)
            goto L55
        L6b:
            if (r5 == 0) goto L8c
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r11 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r11 = defpackage.nv1.b(r11, r14)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r11 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r11
            mr5 r14 = new mr5
            r14.<init>(r2, r11)
            java.lang.Object r11 = r11.getOrCreatePeer(r14)
            r8 = r11
            oe9 r8 = (defpackage.oe9) r8
            java.lang.Object r9 = r9.F
            r3 = r9
            i7j r3 = (defpackage.i7j) r3
            r4 = r10
            r6 = r12
            r7 = r13
            r3.o0(r4, r5, r6, r7, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzd.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public ro6 p() {
        if (((txj) this.F) != null) {
            return new ro6(this);
        }
        sz6.p("Product list must be set to a non empty list.");
        return null;
    }

    @Override // defpackage.sr9
    public void q(sxb sxbVar, jh3 jh3Var) {
    }

    public g8j r() {
        return new g8j((j8j) this.F);
    }

    public j4e s() {
        r66 r66VarE;
        s31 s31Var = (s31) this.F;
        v66 v66Var = (v66) s31Var.I;
        synchronized (v66Var) {
            s31Var.d(true);
            r66VarE = v66Var.e(((p66) s31Var.G).a);
        }
        if (r66VarE != null) {
            return new j4e(r66VarE);
        }
        return null;
    }

    @Override // defpackage.f6b
    public void shutdown() {
    }

    @Override // defpackage.f6b
    public void start() {
    }

    @Override // defpackage.sr9
    public tr9 t(sxb sxbVar) {
        if ("b".equals(sxbVar.b())) {
            return new k3e(this, 2);
        }
        return null;
    }

    public String toString() {
        switch (this.E) {
            case 27:
                StringBuilder sb = new StringBuilder("1");
                for (ork orkVar : ork.values()) {
                    rrj rrjVar = (rrj) ((EnumMap) this.F).get(orkVar);
                    if (rrjVar == null) {
                        rrjVar = rrj.UNSET;
                    }
                    sb.append(rrjVar.E);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.sr9
    public void u(sxb sxbVar, gh3 gh3Var, sxb sxbVar2) {
    }

    public void w(l22 l22Var) {
        if (!l22Var.k()) {
            if (!(l22Var instanceof lve)) {
                String strValueOf = String.valueOf(l22Var.getClass());
                sz6.p(ij0.m(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                lve lveVar = (lve) l22Var;
                w(lveVar.G);
                w(lveVar.H);
                return;
            }
        }
        int size = l22Var.size();
        int[] iArr = lve.L;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.F;
        if (stack.isEmpty() || ((l22) stack.peek()).size() >= i) {
            stack.push(l22Var);
            return;
        }
        int i2 = iArr[iBinarySearch];
        l22 lveVar2 = (l22) stack.pop();
        while (!stack.isEmpty() && ((l22) stack.peek()).size() < i2) {
            lveVar2 = new lve((l22) stack.pop(), lveVar2);
        }
        lve lveVar3 = new lve(lveVar2, l22Var);
        while (!stack.isEmpty()) {
            int[] iArr2 = lve.L;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, lveVar3.F);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((l22) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                lveVar3 = new lve((l22) stack.pop(), lveVar3);
            }
        }
        stack.push(lveVar3);
    }

    public Bundle x() {
        return ((ViewStructure) this.F).getExtras();
    }

    public boolean y(CharSequence charSequence, o2d o2dVar) {
        String str = o2dVar.F;
        if (str.length() != 0) {
            Matcher matcher = ((ro6) this.F).N(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // defpackage.sr9
    public sr9 z(gh3 gh3Var, sxb sxbVar) {
        return null;
    }

    public /* synthetic */ xzd(int i, boolean z) {
        this.E = i;
    }

    public /* synthetic */ xzd(e88 e88Var, a4 a4Var, int i) {
        this.E = i;
        this.F = a4Var;
    }

    public xzd(EnumMap enumMap) {
        this.E = 27;
        EnumMap enumMap2 = new EnumMap(ork.class);
        this.F = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ xzd(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public xzd(SideSheetBehavior sideSheetBehavior) {
        this.E = 10;
        this.F = sideSheetBehavior;
        new pya(9, this);
    }
}
