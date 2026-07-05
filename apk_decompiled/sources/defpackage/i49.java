package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.animation.Animation;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.health.platform.client.proto.g;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.d;
import com.anthropic.claude.sessions.types.SessionResource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i49 implements n4f, tc2, fb8, dof, nn4, sl6, cvg, i7j, wh3 {
    public static final Object H = new Object();
    public static nfj I;
    public final /* synthetic */ int E;
    public Object F;
    public Object G;

    public i49(m4a m4aVar, dyi dyiVar) {
        this.E = 23;
        this.F = m4aVar;
        dyiVar.getClass();
        i95 i95Var = i95.b;
        i95Var.getClass();
        dpf dpfVar = new dpf(dyiVar, aca.d, i95Var);
        pl9 pl9VarB = jce.a.b(aca.class);
        String strD = pl9VarB.d();
        if (strD != null) {
            this.G = (aca) dpfVar.L(pl9VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
        } else {
            sz6.p("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public static i49 E0(m4a m4aVar) {
        return new i49(m4aVar, ((eyi) m4aVar).f());
    }

    public static i49 V0(b5c b5cVar, l42 l42Var) {
        return new i49(b5cVar, 28, l42Var);
    }

    public static i49 f1(ContentCaptureSession contentCaptureSession, View view) {
        return new i49(contentCaptureSession, view);
    }

    public static r5l v0(Context context, Intent intent, boolean z) {
        nfj nfjVar;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (H) {
            try {
                if (I == null) {
                    I = new nfj(context);
                }
                nfjVar = I;
            } finally {
            }
        }
        int i = 1;
        if (!z) {
            return nfjVar.b(intent).j(new ao0(i), new ep5(29));
        }
        if (dpf.K().N(context)) {
            synchronized (thk.b) {
                try {
                    thk.f(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        thk.c.a();
                    }
                    nfjVar.b(intent).h(new jke(7, intent));
                } finally {
                }
            }
        } else {
            nfjVar.b(intent);
        }
        return ez1.E(-1);
    }

    @Override // defpackage.wh3
    public int A(lc2 lc2Var) {
        return okk.l(lc2Var);
    }

    public void A0() {
        if (Build.VERSION.SDK_INT >= 29) {
            le0.l(w5.f(this.G), ((View) this.F).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    @Override // defpackage.wh3
    public j7g B(fw5 fw5Var) {
        return fw5Var.F;
    }

    public wa1 B0() {
        return (wa1) this.G;
    }

    @Override // defpackage.wh3
    public boolean C(cs9 cs9Var) {
        cs9Var.getClass();
        j7g j7gVarI = okk.i(cs9Var);
        return (j7gVarI != null ? okk.g(j7gVarI) : null) != null;
    }

    public wd7 C0(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.G)) {
            if (!((AtomicBoolean) this.G).get()) {
                try {
                    constructorA = ((ep5) this.F).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.G).set(true);
                    constructorA = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (wd7) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    @Override // defpackage.wh3
    public void D(l7g l7gVar) {
        okk.N(l7gVar);
    }

    public InputMethodManager D0() {
        return (InputMethodManager) ((kw9) this.G).getValue();
    }

    @Override // defpackage.wh3
    public vh3 E(l7g l7gVar) {
        return okk.W(this, l7gVar);
    }

    @Override // defpackage.wh3
    public j7g F(l7g l7gVar, boolean z) {
        return okk.c0(l7gVar, z);
    }

    public KeyListener F0(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((qb5) ((ax5) this.G).F).getClass();
        if (keyListener instanceof rl6) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new rl6(keyListener);
    }

    @Override // defpackage.wh3
    public int G(vai vaiVar) {
        return okk.u(vaiVar);
    }

    public n2d G0(int i) {
        List list = (List) auk.g().get(Integer.valueOf(i));
        if (list == null || list.contains("001")) {
            return (n2d) ((ConcurrentHashMap) ((epk) ((qb5) ((c61) this.G).v(((zf) this.F).d(Integer.valueOf(i)))).E).E).get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException(i + " calling code belongs to a geo entity");
    }

    @Override // defpackage.cvg
    public boolean H(u95 u95Var) {
        gv9 gv9VarK0 = K0();
        rvc rvcVar = gv9VarK0 != null ? gv9VarK0.f : null;
        if (rvcVar == null || rvcVar.f()) {
            return true;
        }
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            return rvcVar.j(u95Var);
        } catch (Throwable th) {
            try {
                gv9VarK0.getClass();
                throw th;
            } finally {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            }
        }
    }

    public n2d H0(String str) {
        if (!str.equals("001")) {
            return (n2d) ((ConcurrentHashMap) ((epk) ((qb5) ((c61) this.G).v(((zf) this.F).d(str))).F).E).get(str);
        }
        sz6.p(str.concat(" region code is a non-geo entity"));
        return null;
    }

    @Override // defpackage.n4f
    public void I(Response response) {
        nwb nwbVar = (nwb) this.G;
        if (((Boolean) nwbVar.getValue()).booleanValue()) {
            return;
        }
        nwbVar.setValue(Boolean.TRUE);
        List list = xah.a;
        xah.b(vba.NETWORK);
        ((zy7) this.F).a();
    }

    public MotionEvent I0() {
        return (MotionEvent) this.G;
    }

    @Override // defpackage.wh3
    public boolean J(l7g l7gVar) {
        l7gVar.getClass();
        return okk.F(okk.Z(l7gVar));
    }

    public b5c J0() {
        return (b5c) this.F;
    }

    @Override // defpackage.wh3
    public fhi K(cs9 cs9Var) {
        return okk.S(cs9Var);
    }

    public gv9 K0() {
        nv9 nv9Var = (nv9) this.F;
        av9 av9Var = (av9) nv9Var.N.g(this.G);
        if (av9Var != null) {
            return (gv9) nv9Var.J.g(av9Var);
        }
        return null;
    }

    @Override // defpackage.wh3
    public j7g L(l7g l7gVar) {
        return okk.k(l7gVar);
    }

    public List L0() {
        return (List) this.F;
    }

    @Override // defpackage.wh3
    public fhi M(vai vaiVar) {
        return okk.s(vaiVar);
    }

    public l42 M0() {
        return (l42) this.G;
    }

    @Override // defpackage.wh3
    public int N(v9i v9iVar) {
        return okk.T(v9iVar);
    }

    public za1 N0() {
        return (za1) this.F;
    }

    @Override // defpackage.wh3
    public boolean O(qai qaiVar, v9i v9iVar) {
        return okk.w(qaiVar, v9iVar);
    }

    public void O0(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.F).getContext().obtainStyledAttributes(attributeSet, t0e.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            b1(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.wh3
    public j7g P(cs9 cs9Var) {
        j7g j7gVarA0;
        cs9Var.getClass();
        sn7 sn7VarH = okk.h(cs9Var);
        if (sn7VarH != null && (j7gVarA0 = okk.a0(sn7VarH)) != null) {
            return j7gVarA0;
        }
        j7g j7gVarI = okk.i(cs9Var);
        j7gVarI.getClass();
        return j7gVarI;
    }

    public AutofillId P0(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return le0.g(w5.f(this.G), ((View) this.F).getAutofillId(), j);
        }
        return null;
    }

    @Override // defpackage.wh3
    public u9i Q(l7g l7gVar) {
        return okk.Z(l7gVar);
    }

    public t9i Q0() {
        return new t9i(true, true, this, ds9.a, es9.a);
    }

    @Override // defpackage.wh3
    public boolean R(l7g l7gVar) {
        l7gVar.getClass();
        j7g j7gVarI = okk.i(l7gVar);
        return (j7gVarI != null ? okk.f(this, j7gVarI) : null) != null;
    }

    public xzd R0(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return new xzd(18, le0.h(w5.f(this.G), autofillId, j));
    }

    @Override // defpackage.wh3
    public lc2 S(l7g l7gVar) {
        return okk.f(this, l7gVar);
    }

    public void S0(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            le0.i(w5.f(this.G), viewStructure);
        }
    }

    @Override // defpackage.wh3
    public boolean T(l7g l7gVar) {
        l7gVar.getClass();
        return okk.I(f0(l7gVar)) && !okk.J(l7gVar);
    }

    public void T0(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            le0.j(w5.f(this.G), autofillId);
        }
    }

    @Override // defpackage.wh3
    public fhi U(ArrayList arrayList) {
        j7g j7gVar;
        int size = arrayList.size();
        if (size == 0) {
            sz6.j("Expected some types");
            return null;
        }
        if (size == 1) {
            return (fhi) w44.e1(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            fhi fhiVar = (fhi) it.next();
            z = z || ttj.j(fhiVar);
            if (fhiVar instanceof j7g) {
                j7gVar = (j7g) fhiVar;
            } else {
                if (!(fhiVar instanceof sn7)) {
                    wg6.i();
                    return null;
                }
                j7gVar = ((sn7) fhiVar).F;
                z2 = true;
            }
            arrayList2.add(j7gVar);
        }
        if (z) {
            return nu6.c(mu6.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        mai maiVar = mai.a;
        if (!z2) {
            return maiVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(x44.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(yb5.S((fhi) it2.next()));
        }
        return yfd.z(maiVar.b(arrayList2), maiVar.b(arrayList3));
    }

    public void U0(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            le0.k(w5.f(this.G), autofillId, str);
        }
    }

    @Override // defpackage.wh3
    public wai V(cs9 cs9Var) {
        return okk.j(cs9Var);
    }

    @Override // defpackage.wh3
    public qai W(v9i v9iVar, int i) {
        return okk.p(v9iVar, i);
    }

    public ol6 W0(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        ax5 ax5Var = (ax5) this.G;
        if (inputConnection == null) {
            ax5Var.getClass();
            inputConnection2 = null;
        } else {
            qb5 qb5Var = (qb5) ax5Var.F;
            qb5Var.getClass();
            if (!(inputConnection instanceof ol6)) {
                inputConnection = new ol6(editorInfo, inputConnection, (EditText) qb5Var.E);
            }
            inputConnection2 = inputConnection;
        }
        return (ol6) inputConnection2;
    }

    @Override // defpackage.wh3
    public boolean X(v9i v9iVar, v9i v9iVar2) {
        v9iVar.getClass();
        v9iVar2.getClass();
        if (!(v9iVar instanceof u9i)) {
            sz6.p("Failed requirement.");
            return false;
        }
        if (!(v9iVar2 instanceof u9i)) {
            sz6.p("Failed requirement.");
            return false;
        }
        if (okk.c(v9iVar, v9iVar2)) {
            return true;
        }
        u9i u9iVar = (u9i) v9iVar;
        u9i u9iVar2 = (u9i) v9iVar2;
        Map map = (Map) this.F;
        if (((zr9) this.G).h(u9iVar, u9iVar2)) {
            return true;
        }
        if (map != null) {
            u9i u9iVar3 = (u9i) map.get(u9iVar);
            u9i u9iVar4 = (u9i) map.get(u9iVar2);
            if (u9iVar3 != null && u9iVar3.equals(u9iVar2)) {
                return true;
            }
            if (u9iVar4 != null && u9iVar4.equals(u9iVar)) {
                return true;
            }
        }
        return false;
    }

    public r5l X0(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.F;
        ao0 ao0Var = (ao0) this.G;
        int i = 1;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? ez1.v(ao0Var, new mj5(context, i, intent)).k(ao0Var, new up4() { // from class: ze7
            @Override // defpackage.up4
            public final Object g(d5h d5hVar) {
                return ((Integer) d5hVar.e()).intValue() != 402 ? d5hVar : i49.v0(context, intent, z2).j(new ao0(1), new ep5(28));
            }
        }) : v0(context, intent, z2);
    }

    @Override // defpackage.wh3
    public boolean Y(l7g l7gVar, l7g l7gVar2) {
        return okk.x(l7gVar, l7gVar2);
    }

    public void Y0(h81 h81Var) {
        this.G = h81Var;
    }

    public void Z0(wa1 wa1Var) {
        this.G = wa1Var;
    }

    @Override // defpackage.wh3
    public int a(cs9 cs9Var) {
        return okk.d(cs9Var);
    }

    @Override // defpackage.wh3
    public boolean a0(cs9 cs9Var) {
        cs9Var.getClass();
        return cs9Var instanceof w6c;
    }

    public void a1() {
        this.F = xo3.E;
    }

    @Override // defpackage.cvg
    public dvg apply() {
        nv9 nv9Var = (nv9) this.F;
        gv9 gv9VarK0 = K0();
        if (gv9VarK0 != null) {
            nv9Var.d(gv9VarK0, false);
        }
        return nv9Var.f(this.G);
    }

    @Override // defpackage.wh3
    public boolean b(lc2 lc2Var) {
        return lc2Var instanceof gc2;
    }

    @Override // defpackage.wh3
    public boolean b0(l7g l7gVar) {
        return okk.H(l7gVar);
    }

    public void b1(boolean z) {
        zl6 zl6Var = (zl6) ((qb5) ((ax5) this.G).F).F;
        if (zl6Var.G != z) {
            if (zl6Var.F != null) {
                gl6 gl6VarA = gl6.a();
                yl6 yl6Var = zl6Var.F;
                gl6VarA.getClass();
                knk.q("initCallback cannot be null", yl6Var);
                ReentrantReadWriteLock reentrantReadWriteLock = gl6VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    gl6VarA.b.remove(yl6Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            zl6Var.G = z;
            if (z) {
                zl6.a(zl6Var.E, gl6.a().c());
            }
        }
    }

    @Override // defpackage.fb8
    public Object c(Object obj) {
        return d.c((SessionResource) obj, (c69) this.G);
    }

    @Override // defpackage.wh3
    public vai c0(l7g l7gVar, int i) {
        l7gVar.getClass();
        if (i < 0 || i >= okk.d(l7gVar)) {
            return null;
        }
        return okk.o(l7gVar, i);
    }

    public void c1() {
        this.G = null;
    }

    @Override // defpackage.cvg
    public void cancel() {
        gv9 gv9VarK0 = K0();
        if ((gv9VarK0 != null ? gv9VarK0.f : null) != null) {
            nv9.a((nv9) this.F, this.G);
        }
    }

    @Override // defpackage.wh3
    public int d(q9i q9iVar) {
        q9iVar.getClass();
        if (q9iVar instanceof l7g) {
            return okk.d((cs9) q9iVar);
        }
        if (q9iVar instanceof co0) {
            return ((co0) q9iVar).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(q9iVar);
        wg6.k(sb, ", ", jce.a.b(q9iVar.getClass()));
        return 0;
    }

    @Override // defpackage.wh3
    public boolean d0(vai vaiVar) {
        return okk.M(vaiVar);
    }

    public void d1(String str) {
        if (TextUtils.isEmpty(str)) {
            sz6.p("offerToken can not be empty");
        } else {
            this.G = str;
        }
    }

    @Override // defpackage.sl6
    public boolean e(CharSequence charSequence, int i, int i2, pbi pbiVar) {
        if ((pbiVar.c & 4) > 0) {
            return true;
        }
        if (((mfi) this.F) == null) {
            this.F = new mfi(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((a5) this.G).getClass();
        ((mfi) this.F).setSpan(new qbi(pbiVar), i, i2, 33);
        return true;
    }

    @Override // defpackage.wh3
    public sn7 e0(cs9 cs9Var) {
        return okk.h(cs9Var);
    }

    public void e1(fid fidVar) {
        this.F = fidVar;
        if (fidVar.a() != null) {
            fidVar.a().getClass();
            String str = fidVar.a().a;
            if (str != null) {
                this.G = str;
            }
        }
    }

    @Override // defpackage.wh3
    public q9i f(l7g l7gVar) {
        return okk.e(l7gVar);
    }

    @Override // defpackage.wh3
    public u9i f0(cs9 cs9Var) {
        cs9Var.getClass();
        j7g j7gVarI = okk.i(cs9Var);
        if (j7gVarI == null) {
            j7gVarI = t(cs9Var);
        }
        return okk.Z(j7gVarI);
    }

    @Override // defpackage.wh3
    public void g(cs9 cs9Var) {
        cs9Var.getClass();
        okk.h(cs9Var);
    }

    @Override // defpackage.wh3
    public boolean g0(v9i v9iVar) {
        return okk.F(v9iVar);
    }

    @Override // defpackage.sl6
    public Object getResult() {
        return (mfi) this.F;
    }

    @Override // defpackage.wh3
    public boolean h(v9i v9iVar) {
        return okk.G(v9iVar);
    }

    @Override // defpackage.wh3
    public boolean h0(v9i v9iVar) {
        return okk.y(v9iVar);
    }

    @Override // defpackage.wh3
    public void i(l7g l7gVar) {
        okk.O(l7gVar);
    }

    @Override // defpackage.wh3
    public boolean i0(lc2 lc2Var) {
        return okk.L(lc2Var);
    }

    @Override // defpackage.cvg
    public boolean isComplete() {
        rvc rvcVar;
        gv9 gv9VarK0 = K0();
        if (gv9VarK0 == null || (rvcVar = gv9VarK0.f) == null) {
            return true;
        }
        return rvcVar.f();
    }

    @Override // defpackage.wh3
    public l2c j(lc2 lc2Var) {
        return okk.Y(lc2Var);
    }

    @Override // defpackage.wh3
    public boolean j0(v9i v9iVar) {
        return okk.I(v9iVar);
    }

    @Override // defpackage.wh3
    public int k(qai qaiVar) {
        qaiVar.getClass();
        int iZ = qaiVar.z();
        if (iZ != 0) {
            return gwk.n(iZ);
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wh3
    public vai k0(q9i q9iVar, int i) {
        q9iVar.getClass();
        if (q9iVar instanceof l7g) {
            return okk.o((cs9) q9iVar, i);
        }
        if (q9iVar instanceof co0) {
            E e = ((co0) q9iVar).get(i);
            e.getClass();
            return (vai) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(q9iVar);
        wg6.k(sb, ", ", jce.a.b(q9iVar.getClass()));
        return null;
    }

    @Override // defpackage.wh3
    public boolean l(l7g l7gVar) {
        l7gVar.getClass();
        return okk.A(okk.Z(l7gVar));
    }

    @Override // defpackage.wh3
    public boolean l0(v9i v9iVar) {
        return okk.B(v9iVar);
    }

    @Override // defpackage.n4f
    public void m(Request request) {
    }

    @Override // defpackage.wh3
    public l7g m0(l7g l7gVar) {
        j7g j7gVar;
        l7gVar.getClass();
        fw5 fw5VarG = okk.g(l7gVar);
        return (fw5VarG == null || (j7gVar = fw5VarG.F) == null) ? l7gVar : j7gVar;
    }

    @Override // defpackage.wh3
    public j7g n(cs9 cs9Var) {
        return okk.i(cs9Var);
    }

    @Override // defpackage.wh3
    public vai n0(cs9 cs9Var, int i) {
        return okk.o(cs9Var, i);
    }

    @Override // defpackage.wh3
    public vai o(ic2 ic2Var) {
        return okk.V(ic2Var);
    }

    @Override // defpackage.i7j
    public void o0(WebView webView, ep1 ep1Var, Uri uri, boolean z, oe9 oe9Var) {
        Object hreVar;
        nwb nwbVar = (nwb) this.F;
        webView.getClass();
        uri.getClass();
        oe9Var.getClass();
        String strB = ep1Var.b();
        if (strB != null) {
            try {
                hreVar = new JSONObject(strB);
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            if (hreVar instanceof hre) {
                hreVar = null;
            }
            JSONObject jSONObject = (JSONObject) hreVar;
            if (jSONObject == null) {
                return;
            }
            String strOptString = jSONObject.optString("type");
            if (x44.r(strOptString, "loaded")) {
                nwbVar.setValue(Boolean.TRUE);
            } else if (x44.r(strOptString, "error")) {
                nwbVar.setValue(Boolean.TRUE);
                ((zy7) ((nwb) this.G).getValue()).a();
            }
        }
    }

    @Override // defpackage.wh3
    public boolean p(v9i v9iVar) {
        return okk.A(v9iVar);
    }

    @Override // defpackage.tc2
    public void p0(ee2 ee2Var, pd1 pd1Var) {
        switch (this.E) {
            case 8:
                yd2 yd2Var = (yd2) this.F;
                if (yd2Var == null) {
                    x44.o0("context");
                    throw null;
                }
                if (ee2Var == null) {
                    return;
                }
                sp0 sp0Var = pd1Var.a;
                sp0Var.b = MTTypesetterKt.kLineSkipLimitMultiplier;
                sp0Var.c = MTTypesetterKt.kLineSkipLimitMultiplier;
                sp0Var.d = MTTypesetterKt.kLineSkipLimitMultiplier;
                sp0Var.e = MTTypesetterKt.kLineSkipLimitMultiplier;
                pd1Var.a(yd2Var, sp0Var, yd2Var.d, ee2Var);
                Canvas canvas = yd2Var.c;
                RectF rectF = yd2Var.b;
                float f = rectF.left;
                ge2 ge2Var = yd2Var.a;
                float f2 = f - (ge2Var.g() ? sp0Var.b : sp0Var.d);
                float f3 = rectF.top - sp0Var.c;
                float f4 = rectF.right;
                float f5 = ge2Var.g() ? sp0Var.d : sp0Var.b;
                float f6 = rectF.bottom + sp0Var.e;
                int iSave = canvas.save();
                canvas.clipRect(f2, f3, f5 + f4, f6);
                pd1Var.c(yd2Var, ee2Var);
                canvas.restoreToCount(iSave);
                LinkedHashMap linkedHashMapD = pd1Var.d();
                vc2 vc2Var = (vc2) this.G;
                for (Map.Entry entry : linkedHashMapD.entrySet()) {
                    TreeMap treeMap = vc2Var.k;
                    Object key = entry.getKey();
                    Object arrayList = treeMap.get(key);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        treeMap.put(key, arrayList);
                    }
                    b54.t0((Collection) arrayList, (Iterable) entry.getValue());
                }
                return;
            default:
                xd2 xd2Var = (xd2) this.G;
                if (xd2Var == null) {
                    x44.o0("ranges");
                    throw null;
                }
                uub uubVar = (uub) this.F;
                if (uubVar != null) {
                    pd1Var.e(ee2Var, xd2Var, uubVar);
                    return;
                } else {
                    x44.o0("extraStore");
                    throw null;
                }
        }
    }

    @Override // defpackage.wh3
    public boolean q(fhi fhiVar) {
        fhiVar.getClass();
        return okk.H(t(fhiVar)) != okk.H(P(fhiVar));
    }

    @Override // defpackage.wh3
    public void q0(l7g l7gVar, v9i v9iVar) {
    }

    @Override // defpackage.wh3
    public j7g r(sn7 sn7Var) {
        return okk.a0(sn7Var);
    }

    @Override // defpackage.wh3
    public fhi r0(l7g l7gVar, l7g l7gVar2) {
        return okk.m(this, l7gVar, l7gVar2);
    }

    @Override // defpackage.dof
    public KSerializer s(pl9 pl9Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.G;
        Class clsI = ez1.I(pl9Var);
        Object c52Var = concurrentHashMap.get(clsI);
        if (c52Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsI, (c52Var = new c52((KSerializer) ((bz7) this.F).invoke(pl9Var))))) != null) {
            c52Var = objPutIfAbsent;
        }
        return ((c52) c52Var).a;
    }

    @Override // defpackage.wh3
    public cs9 s0(cs9 cs9Var) {
        return okk.b0(this, cs9Var);
    }

    @Override // defpackage.wh3
    public j7g t(cs9 cs9Var) {
        j7g j7gVarQ;
        cs9Var.getClass();
        sn7 sn7VarH = okk.h(cs9Var);
        if (sn7VarH != null && (j7gVarQ = okk.Q(sn7VarH)) != null) {
            return j7gVarQ;
        }
        j7g j7gVarI = okk.i(cs9Var);
        j7gVarI.getClass();
        return j7gVarI;
    }

    @Override // defpackage.fb8
    public Iterator t0() {
        return ((Iterable) this.F).iterator();
    }

    public String toString() {
        switch (this.E) {
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                StringBuilder sb = new StringBuilder(FreeTypeConstants.FT_LOAD_PEDANTIC);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((m4a) this.F).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.wh3
    public fhi u(lc2 lc2Var) {
        return okk.R(lc2Var);
    }

    @Override // defpackage.wh3
    public fw5 u0(l7g l7gVar) {
        return okk.g(l7gVar);
    }

    @Override // defpackage.wh3
    public Collection v(v9i v9iVar) {
        return okk.X(v9iVar);
    }

    @Override // defpackage.wh3
    public boolean w(v9i v9iVar) {
        return okk.C(v9iVar);
    }

    public l81 w0() {
        return new l81((xo3) this.F, (h81) this.G);
    }

    @Override // defpackage.wh3
    public j7g x(sn7 sn7Var) {
        return okk.Q(sn7Var);
    }

    public dp1 x0() {
        if (((fid) this.F) != null) {
            return new dp1(this);
        }
        mr9.h("ProductDetails is required for constructing ProductDetailsParams.");
        return null;
    }

    @Override // defpackage.wh3
    public Collection y(l7g l7gVar) {
        return okk.U(this, l7gVar);
    }

    public void y0(qo5 qo5Var) {
        synchronized (qo5Var) {
        }
        Handler handler = (Handler) this.F;
        if (handler != null) {
            handler.post(new fd(this, 4, qo5Var));
        }
    }

    @Override // defpackage.wh3
    public boolean z(l7g l7gVar) {
        return okk.D(l7gVar);
    }

    public void z0(String str, PrintWriter printWriter) {
        aca acaVar = (aca) this.G;
        if (acaVar.b.G <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String strConcat = str.concat("    ");
        int i = 0;
        while (true) {
            jgg jggVar = acaVar.b;
            if (i >= jggVar.G) {
                return;
            }
            yba ybaVar = (yba) jggVar.d(i);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(acaVar.b.b(i));
            printWriter.print(": ");
            printWriter.println(ybaVar.toString());
            printWriter.print(strConcat);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(strConcat);
            printWriter.print("mLoader=");
            printWriter.println(ybaVar.l);
            goj gojVar = ybaVar.l;
            String strConcat2 = strConcat.concat("  ");
            gojVar.getClass();
            printWriter.print(strConcat2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(gojVar.a);
            if (gojVar.b || gojVar.e) {
                printWriter.print(strConcat2);
                printWriter.print("mStarted=");
                printWriter.print(gojVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(gojVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (gojVar.c || gojVar.d) {
                printWriter.print(strConcat2);
                printWriter.print("mAbandoned=");
                printWriter.print(gojVar.c);
                printWriter.print(" mReset=");
                printWriter.println(gojVar.d);
            }
            if (gojVar.g != null) {
                printWriter.print(strConcat2);
                printWriter.print("mTask=");
                printWriter.print(gojVar.g);
                printWriter.print(" waiting=");
                gojVar.g.getClass();
                printWriter.println(false);
            }
            if (gojVar.h != null) {
                printWriter.print(strConcat2);
                printWriter.print("mCancellingTask=");
                printWriter.print(gojVar.h);
                printWriter.print(" waiting=");
                gojVar.h.getClass();
                printWriter.println(false);
            }
            if (ybaVar.n != null) {
                printWriter.print(strConcat);
                printWriter.print("mCallbacks=");
                printWriter.println(ybaVar.n);
                z5l z5lVar = ybaVar.n;
                String strConcat3 = strConcat.concat("  ");
                z5lVar.getClass();
                printWriter.print(strConcat3);
                printWriter.print("mDeliveredData=");
                printWriter.println(z5lVar.F);
            }
            printWriter.print(strConcat);
            printWriter.print("mData=");
            goj gojVar2 = ybaVar.l;
            Object obj = ybaVar.e;
            Object obj2 = obj != bvb.k ? obj : null;
            gojVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (obj2 == null) {
                sb.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(strConcat);
            printWriter.print("mStarted=");
            printWriter.println(ybaVar.c > 0);
            i++;
        }
    }

    public i49(gj7 gj7Var, nwb nwbVar, nwb nwbVar2) {
        this.E = 26;
        this.F = nwbVar;
        this.G = nwbVar2;
    }

    public /* synthetic */ i49(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public i49(HashMap map, zr9 zr9Var) {
        this.E = 27;
        zr9Var.getClass();
        this.F = map;
        this.G = zr9Var;
    }

    public i49(lrb lrbVar) {
        this.E = 2;
        this.F = lrbVar;
    }

    public i49() {
        this.E = 16;
        this.F = new ssi(0);
        this.G = new ssi(0);
    }

    public /* synthetic */ i49(int i) {
        this.E = i;
    }

    public i49(zf zfVar, pjb pjbVar, qjb qjbVar) {
        this.E = 24;
        c61 c61Var = new c61(pjbVar, qjbVar, new qb5(11));
        this.F = zfVar;
        this.G = c61Var;
    }

    public i49(EditText editText) {
        this.E = 3;
        this.F = editText;
        this.G = new ax5(editText);
    }

    public i49(Context context) {
        this.E = 1;
        this.F = context;
        this.G = new ao0(1);
    }

    public i49(View view) {
        this.E = 0;
        this.F = view;
        this.G = yb5.w(w1a.G, new xi4(22, this));
    }

    public i49(za1 za1Var, wa1 wa1Var) {
        this.E = 14;
        za1Var.getClass();
        this.F = za1Var;
        this.G = wa1Var;
    }

    public i49(ContentCaptureSession contentCaptureSession, View view) {
        this.E = 12;
        this.G = contentCaptureSession;
        this.F = view;
    }

    public i49(vc2 vc2Var) {
        this.E = 8;
        this.G = vc2Var;
    }

    public i49(bz7 bz7Var) {
        this.E = 11;
        this.F = bz7Var;
        this.G = new ConcurrentHashMap();
    }

    public i49(MediaCodec.CryptoInfo cryptoInfo) {
        this.E = 13;
        this.F = cryptoInfo;
        this.G = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public i49(Animation animation) {
        this.E = 19;
        this.F = animation;
        this.G = null;
    }

    public i49(Animator animator) {
        this.E = 19;
        this.F = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.G = animatorSet;
        animatorSet.play(animator);
    }

    public i49(ArrayList arrayList, ArrayList arrayList2) {
        this.E = 20;
        int size = arrayList.size();
        this.F = new int[size];
        this.G = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.F)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.G)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public i49(int i, int i2) {
        this.E = 20;
        this.F = new int[]{i, i2};
        this.G = new float[]{MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f};
    }

    public i49(int i, int i2, int i3) {
        this.E = 20;
        this.F = new int[]{i, i2, i3};
        this.G = new float[]{MTTypesetterKt.kLineSkipLimitMultiplier, 0.5f, 1.0f};
    }

    public i49(vde vdeVar, int[] iArr) {
        this.E = 25;
        this.F = nz8.q(vdeVar);
        this.G = iArr;
    }

    public i49(ep5 ep5Var) {
        this.E = 15;
        this.F = ep5Var;
        this.G = new AtomicBoolean(false);
    }
}
