package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.b;
import coil.compose.AsyncImagePainter;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public class poj implements tcb, gi0, y8g, zcb, sac, xn4, fo5, occ, kbc, y5c, nsg, ao6 {
    public static poj F;
    public static poj I;
    public Object E;
    public static final hj6 G = new hj6(27);
    public static final Object H = new Object();
    public static final a28 J = new a28(1);

    public poj(int i) {
        mhb mhbVar;
        switch (i) {
            case 7:
                this.E = new ConcurrentHashMap();
                break;
            case 10:
                this.E = new CopyOnWriteArrayList();
                break;
            case 14:
                this.E = new fnf(20);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                this.E = new HashSet();
                break;
            default:
                oud oudVar = oud.c;
                try {
                    mhbVar = (mhb) Class.forName("androidx.health.platform.client.proto.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    mhbVar = J;
                }
                mhb[] mhbVarArr = {a28.b, mhbVar};
                cqa cqaVar = new cqa();
                cqaVar.a = mhbVarArr;
                Charset charset = s89.a;
                this.E = cqaVar;
                break;
        }
    }

    public static poj I() {
        poj pojVar;
        synchronized (H) {
            try {
                if (I == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    poj pojVar2 = new poj();
                    pojVar2.E = new uoj(looper);
                    I = pojVar2;
                }
                pojVar = I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pojVar;
    }

    public static r5l L(Callable callable) {
        j5h j5hVar = new j5h();
        qjk.E.execute(new s2k(callable, 14, j5hVar));
        return j5hVar.a;
    }

    public static synchronized poj P(Context context) {
        poj pojVar;
        String strD;
        Context applicationContext = context.getApplicationContext();
        synchronized (poj.class) {
            pojVar = F;
            if (pojVar == null) {
                pojVar = new poj();
                nog nogVarA = nog.a(applicationContext);
                pojVar.E = nogVarA;
                nogVarA.b();
                String strD2 = nogVarA.d("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strD2) && (strD = nogVarA.d(nog.f("googleSignInOptions", strD2))) != null) {
                    try {
                        GoogleSignInOptions.l0(strD);
                    } catch (JSONException unused) {
                    }
                }
                F = pojVar;
            }
        }
        return pojVar;
        return pojVar;
    }

    @Override // defpackage.fo5
    public Object A(xmc xmcVar, Object obj) {
        return null;
    }

    @Override // defpackage.tcb
    public void B(vcb vcbVar) {
        xzd xzdVar = ((ActionMenuView) this.E).b0;
        if (xzdVar != null) {
            xzdVar.B(vcbVar);
        }
    }

    public void C(int i) {
    }

    @Override // defpackage.occ
    public int D(int i) {
        on5 on5Var = (on5) this.E;
        if (i < on5Var.b) {
            return i;
        }
        if (i < on5Var.c) {
            return i + 1;
        }
        int i2 = on5Var.d;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    public void E(int i, float f) {
    }

    public Object F(tg3 tg3Var, Object obj) {
        return x(tg3Var, obj);
    }

    @Override // defpackage.kbc
    public void G(Object obj) {
        m4a m4aVar = (m4a) obj;
        a36 a36Var = (a36) this.E;
        if (m4aVar == null || !a36Var.F0) {
            return;
        }
        throw new IllegalStateException("Fragment " + a36Var + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void H() {
        ((r5l) ((fnf) this.E).F).p(null);
    }

    public List J(ge2 ge2Var, final double d, final double d2, final float f, final float f2, final int i) {
        Double d3;
        Double d4 = (Double) ((bz7) this.E).invoke(ge2Var.i().d);
        if (d4 == null) {
            d3 = null;
        } else {
            if (d4.doubleValue() <= 0.0d) {
                sz6.p("`step` must return a positive value.");
                return null;
            }
            d3 = d4;
        }
        i52 i52VarK = ge2Var.k();
        Object[] objArr = {d3, Double.valueOf(d2), Double.valueOf(d), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)};
        final Double d5 = d3;
        zy7 zy7Var = new zy7() { // from class: rv5
            /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
            @Override // defpackage.zy7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rv5.a():java.lang.Object");
            }
        };
        i52VarK.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 6);
        hj6 hj6Var = G;
        Object objA = i52VarK.a(hj6Var, objArrCopyOf);
        if (objA == null) {
            objA = zy7Var.a();
            i52VarK.b(hj6Var, Arrays.copyOf(objArr, 6), objA);
        }
        return (List) objA;
    }

    public fnf K() {
        return (fnf) this.E;
    }

    public Bundle M() {
        Bundle bundle = new Bundle();
        Integer num = (Integer) this.E;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        return bundle;
    }

    public void N(int i, Object obj, d7f d7fVar) {
        b bVar = (b) this.E;
        bVar.r(i, 3);
        d7fVar.g((a) obj, bVar.a);
        bVar.r(i, 4);
    }

    public void O(int i, Object obj, d7f d7fVar) {
        b bVar = (b) this.E;
        a aVar = (a) obj;
        bVar.r(i, 2);
        bVar.t(aVar.b(d7fVar));
        d7fVar.g(aVar, bVar.a);
    }

    public synchronized void Q() {
        nog nogVar = (nog) this.E;
        ReentrantLock reentrantLock = nogVar.a;
        reentrantLock.lock();
        try {
            nogVar.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.tcb
    public boolean a(vcb vcbVar, MenuItem menuItem) {
        nb nbVar = ((ActionMenuView) this.E).g0;
        if (nbVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((fnf) nbVar).F).n0.G).iterator();
        while (it.hasNext()) {
            if (((kx7) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fo5
    public Object b(krd krdVar, Object obj) {
        return x(krdVar, obj);
    }

    @Override // defpackage.xn4
    public ao4 build() {
        return new ao4(new ive(((ContentInfo.Builder) this.E).build()));
    }

    @Override // defpackage.xn4
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.E).setLinkUri(uri);
    }

    @Override // defpackage.zcb
    public void d(vcb vcbVar, MenuItem menuItem) {
        ((oe2) this.E).J.removeCallbacksAndMessages(vcbVar);
    }

    @Override // defpackage.xn4
    public void e(int i) {
        ((ContentInfo.Builder) this.E).setFlags(i);
    }

    @Override // defpackage.y5c
    public void f(c5c c5cVar, int i) {
        char c;
        StringBuilder sb = (StringBuilder) this.E;
        if (c5cVar instanceof ikh) {
            yj6.U(sb, (ikh) c5cVar);
            return;
        }
        if (c5cVar instanceof yj6) {
            yj6 yj6Var = (yj6) c5cVar;
            if (sb.length() > 0) {
                if (!yj6Var.g0() && !yj6Var.w("br")) {
                    if (!yj6Var.H.b(FreeTypeConstants.FT_LOAD_NO_RECURSE) || yj6Var.I.size() <= 0) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    c5c c5cVarM = yj6Var;
                    int i2 = 0;
                    while (c5cVarM != null) {
                        char c2 = 1;
                        if (!(c5cVarM instanceof ikh) || xrg.f(((ikh) c5cVarM).O())) {
                            c = 1;
                        } else {
                            atomicBoolean.set(true);
                            c = 5;
                        }
                        if (c == 5) {
                            break;
                        }
                        if (c != 1 || c5cVarM.o() <= 0) {
                            while (c5cVarM.z() == null && i2 > 0) {
                                if (c == 1 || c == 2) {
                                    c = 1;
                                }
                                yj6 yj6Var2 = c5cVarM.E;
                                i2--;
                                if (c == 4) {
                                    c5cVarM.J();
                                }
                                c = 1;
                                c5cVarM = yj6Var2;
                            }
                            if (c != 1 && c != 2) {
                                c2 = c;
                            }
                            if (c5cVarM == yj6Var) {
                                break;
                            }
                            c5c c5cVarZ = c5cVarM.z();
                            if (c2 == 4) {
                                c5cVarM.J();
                            }
                            c5cVarM = c5cVarZ;
                        } else {
                            c5cVarM = c5cVarM.m(0);
                            i2++;
                        }
                    }
                    if (!atomicBoolean.get()) {
                        return;
                    }
                }
                if (ikh.V(sb)) {
                    return;
                }
                sb.append(' ');
            }
        }
    }

    @Override // defpackage.fo5
    public Object g(eri eriVar, Object obj) {
        return null;
    }

    @Override // defpackage.fo5
    public Object h(r4 r4Var, Object obj) {
        return null;
    }

    @Override // defpackage.fo5
    public Object i(mw9 mw9Var, Object obj) {
        return null;
    }

    public void k(int i) {
    }

    @Override // defpackage.occ
    public int l(int i) {
        on5 on5Var = (on5) this.E;
        if (i <= on5Var.b - 1) {
            return i;
        }
        if (i <= on5Var.c - 1) {
            return i - 1;
        }
        int i2 = on5Var.d;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    @Override // defpackage.y5c
    public void m(c5c c5cVar, int i) {
        StringBuilder sb = (StringBuilder) this.E;
        if (c5cVar instanceof yj6) {
            yj6 yj6Var = (yj6) c5cVar;
            z3h z3hVar = yj6Var.H;
            c5c c5cVarZ = c5cVar.z();
            if (!z3hVar.b(FreeTypeConstants.FT_LOAD_NO_RECURSE) && (z3hVar.H & 4) == 0) {
                for (int i2 = 0; i2 < yj6Var.I.size(); i2++) {
                    c5c c5cVarM = yj6Var.m(i2);
                    if (!(c5cVarM instanceof yj6) || !((yj6) c5cVarM).g0()) {
                    }
                }
                return;
            }
            if (((c5cVarZ instanceof ikh) || ((c5cVarZ instanceof yj6) && (((yj6) c5cVarZ).H.H & 4) == 0)) && !ikh.V(sb)) {
                sb.append(' ');
            }
        }
    }

    @Override // defpackage.fo5
    public Object n(prd prdVar, Object obj) {
        return x(prdVar, obj);
    }

    @Override // defpackage.fo5
    public Object o(d1a d1aVar, Object obj) {
        return null;
    }

    @Override // defpackage.sac
    public Object o0() {
        Type type = (Type) this.E;
        if (!(type instanceof ParameterizedType)) {
            wg6.j("Invalid EnumMap type: ", type);
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        wg6.j("Invalid EnumMap type: ", type);
        return null;
    }

    @Override // defpackage.fo5
    public Object p(q16 q16Var, Object obj) {
        return null;
    }

    @Override // defpackage.nsg
    public void q(nab nabVar, Bitmap bitmap, Map map) {
        ((at) this.E).p(nabVar, bitmap, map, zik.d(bitmap));
    }

    @Override // defpackage.y8g
    public Object r(p4e p4eVar) {
        return j8.G(new z01(((AsyncImagePainter) this.E).K, 0), p4eVar);
    }

    @Override // defpackage.fo5
    public Object s(uqb uqbVar, Object obj) {
        return null;
    }

    @Override // defpackage.xn4
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.E).setExtras(bundle);
    }

    @Override // defpackage.zcb
    public void t(vcb vcbVar, adb adbVar) {
        oe2 oe2Var = (oe2) this.E;
        Handler handler = oe2Var.J;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = oe2Var.L;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vcbVar == ((ne2) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new me2(this, i2 < arrayList.size() ? (ne2) arrayList.get(i2) : null, adbVar, vcbVar, 0), vcbVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.ao6
    public Object u(String str) {
        return ((qo6) this.E).f(str, null);
    }

    @Override // defpackage.fo5
    public Object v(jrd jrdVar, Object obj) {
        im9 im9Var = (im9) this.E;
        jrdVar.getClass();
        int i = (jrdVar.X != null ? 1 : 0) + (jrdVar.Y != null ? 1 : 0);
        if (jrdVar.J) {
            if (i == 0) {
                return new tm9(im9Var, jrdVar);
            }
            if (i == 1) {
                return new wm9(im9Var, jrdVar);
            }
            if (i == 2) {
                return new ym9(im9Var, jrdVar);
            }
        } else {
            if (i == 0) {
                return new nn9(im9Var, jrdVar);
            }
            if (i == 1) {
                return new rn9(im9Var, jrdVar);
            }
            if (i == 2) {
                return new vn9(im9Var, jrdVar);
            }
        }
        rl7.n("Unsupported property: ", jrdVar);
        return null;
    }

    @Override // defpackage.nsg
    public pab w(nab nabVar) {
        return null;
    }

    @Override // defpackage.fo5
    public Object x(h08 h08Var, Object obj) {
        return new lm9((im9) this.E, h08Var);
    }

    @Override // defpackage.fo5
    public Object y(qqb qqbVar, Object obj) {
        return null;
    }

    @Override // defpackage.nsg
    public void z(int i) {
    }

    public poj(lu8 lu8Var) {
        dgj.v(lu8Var);
        this.E = lu8Var;
    }

    public /* synthetic */ poj(Object obj) {
        this.E = obj;
    }

    public poj(ClipData clipData, int i) {
        this.E = gb2.g(clipData, i);
    }
}
