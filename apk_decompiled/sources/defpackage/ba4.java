package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.anthropic.claude.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba4 extends aa4 implements eyi, tf8, u5f, xdc, izb, ed, aec, yy7 {
    public final ki6 F;
    public final fj0 G;
    public final q28 H;
    public dyi I;
    public final x94 J;
    public final u0h K;
    public final AtomicInteger L;
    public final z94 M;
    public final CopyOnWriteArrayList N;
    public final CopyOnWriteArrayList O;
    public final CopyOnWriteArrayList P;
    public final CopyOnWriteArrayList Q;
    public final CopyOnWriteArrayList R;
    public final CopyOnWriteArrayList S;
    public final CopyOnWriteArrayList T;
    public boolean U;
    public boolean V;
    public final u0h W;
    public final u0h X;
    public final u0h Y;

    public ba4() {
        int i = 1;
        ki6 ki6Var = new ki6(1);
        this.F = ki6Var;
        this.G = new fj0(new q94(this, 1));
        int i2 = 4;
        t5f t5fVar = new t5f(this, new p3f(i2, this));
        q28 q28Var = new q28(t5fVar, 29);
        this.H = q28Var;
        this.J = new x94(this);
        this.K = new u0h(new r94(this, i));
        this.L = new AtomicInteger();
        this.M = new z94(this);
        this.N = new CopyOnWriteArrayList();
        this.O = new CopyOnWriteArrayList();
        this.P = new CopyOnWriteArrayList();
        this.Q = new CopyOnWriteArrayList();
        this.R = new CopyOnWriteArrayList();
        this.S = new CopyOnWriteArrayList();
        this.T = new CopyOnWriteArrayList();
        this.W = new u0h(new r94(this, 2));
        p4a p4aVar = this.E;
        if (p4aVar == null) {
            sz6.j("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i3 = 0;
        p4aVar.a(new t94(i3, this));
        this.E.a(new t94(i, this));
        this.E.a(new k9e(i, this));
        t5fVar.a();
        o5f.b(this);
        ((q28) q28Var.G).B("android:support:activity-result", new u94(i3, this));
        v94 v94Var = new v94(this, i3);
        ba4 ba4Var = (ba4) ki6Var.G;
        if (ba4Var != null) {
            v94Var.a(ba4Var);
        }
        ((CopyOnWriteArraySet) ki6Var.F).add(v94Var);
        this.X = new u0h(new r94(this, 3));
        this.Y = new u0h(new r94(this, i2));
    }

    public static void k(ba4 ba4Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!x44.r(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!x44.r(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.m4a
    public final c4a a() {
        return this.E;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.J.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.izb
    public final dpf b() {
        return c().b().c;
    }

    @Override // defpackage.xdc
    public final vdc c() {
        return (vdc) this.Y.getValue();
    }

    @Override // defpackage.tf8
    public final sub d() {
        sub subVar = new sub(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = subVar.a;
        if (application != null) {
            linkedHashMap.put(yxi.d, getApplication());
        }
        linkedHashMap.put(o5f.a, this);
        linkedHashMap.put(o5f.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(o5f.c, extras);
        }
        return subVar;
    }

    @Override // defpackage.ed
    public final z94 e() {
        return this.M;
    }

    @Override // defpackage.eyi
    public final dyi f() {
        if (getApplication() == null) {
            sz6.j("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.I == null) {
            w94 w94Var = (w94) getLastNonConfigurationInstance();
            if (w94Var != null) {
                this.I = w94Var.a;
            }
            if (this.I == null) {
                this.I = new dyi();
            }
        }
        dyi dyiVar = this.I;
        dyiVar.getClass();
        return dyiVar;
    }

    @Override // defpackage.u5f
    public final q28 g() {
        return (q28) this.H.G;
    }

    @Override // defpackage.aec
    public final void i(hm4 hm4Var) {
        hm4Var.getClass();
        this.N.add(hm4Var);
    }

    @Override // defpackage.aec
    public final void j(hm4 hm4Var) {
        hm4Var.getClass();
        this.N.remove(hm4Var);
    }

    public final zxi l() {
        return (zxi) this.X.getValue();
    }

    public final void m() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final ad n(final qc qcVar, final ez1 ez1Var) {
        final z94 z94Var = this.M;
        z94Var.getClass();
        final String str = "activity_rq#" + this.L.getAndIncrement();
        LinkedHashMap linkedHashMap = z94Var.c;
        p4a p4aVar = this.E;
        if (p4aVar.d.compareTo(a4a.H) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            a4a a4aVar = p4aVar.d;
            sb.append(" is attempting to register while current state is ");
            sb.append(a4aVar);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        z94Var.d(str);
        zc zcVar = (zc) linkedHashMap.get(str);
        if (zcVar == null) {
            zcVar = new zc(p4aVar);
        }
        i4a i4aVar = new i4a() { // from class: xc
            @Override // defpackage.i4a
            public final void d(m4a m4aVar, y3a y3aVar) {
                y3a y3aVar2 = y3a.ON_START;
                z94 z94Var2 = z94Var;
                String str2 = str;
                if (y3aVar2 != y3aVar) {
                    if (y3a.ON_STOP == y3aVar) {
                        z94Var2.e.remove(str2);
                        return;
                    } else {
                        if (y3a.ON_DESTROY == y3aVar) {
                            z94Var2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = z94Var2.e;
                Bundle bundle = z94Var2.g;
                LinkedHashMap linkedHashMap3 = z94Var2.f;
                qc qcVar2 = qcVar;
                ez1 ez1Var2 = ez1Var;
                linkedHashMap2.put(str2, new yc(qcVar2, ez1Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    qcVar2.e(obj);
                }
                pc pcVar = (pc) yfd.C(bundle, str2, pc.class);
                if (pcVar != null) {
                    bundle.remove(str2);
                    qcVar2.e(ez1Var2.O(pcVar.F, pcVar.E));
                }
            }
        };
        zcVar.a.a(i4aVar);
        zcVar.b.add(i4aVar);
        linkedHashMap.put(str, zcVar);
        return new ad(z94Var, str, ez1Var, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.M.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((b56) this.W.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.N.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hm4) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.aa4, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.H.y(bundle);
        ki6 ki6Var = this.F;
        ki6Var.getClass();
        ki6Var.G = this;
        Iterator it = ((CopyOnWriteArraySet) ki6Var.F).iterator();
        while (it.hasNext()) {
            ((v94) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = hie.F;
        fie.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.G.G).iterator();
        while (it.hasNext()) {
            ((kx7) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.G.G).iterator();
            while (it.hasNext()) {
                if (((kx7) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.U = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.U = false;
            Iterator it = this.Q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((hm4) it.next()).accept(new aub(z, configuration));
            }
        } catch (Throwable th) {
            this.U = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.P.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hm4) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.G.G).iterator();
        while (it.hasNext()) {
            ((kx7) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.V = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.V = false;
            Iterator it = this.R.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((hm4) it.next()).accept(new s2d(z, configuration));
            }
        } catch (Throwable th) {
            this.V = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        zl4 zl4VarE = puj.e(pictureInPictureUiState);
        Iterator it = this.S.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hm4) it.next()).accept(zl4VarE);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.G.G).iterator();
        while (it.hasNext()) {
            ((kx7) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.M.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        w94 w94Var;
        dyi dyiVar = this.I;
        if (dyiVar == null && (w94Var = (w94) getLastNonConfigurationInstance()) != null) {
            dyiVar = w94Var.a;
        }
        if (dyiVar == null) {
            return null;
        }
        w94 w94Var2 = new w94();
        w94Var2.a = dyiVar;
        return w94Var2;
    }

    @Override // defpackage.aa4, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        p4a p4aVar = this.E;
        if (p4aVar != null) {
            p4aVar.e("setCurrentState");
            p4aVar.g(a4a.G);
        }
        super.onSaveInstanceState(bundle);
        this.H.z(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.O.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hm4) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.T.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (mpk.O()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((xy7) this.K.getValue()).a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.J.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.J.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.J.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.U) {
            return;
        }
        Iterator it = this.Q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hm4) it.next()).accept(new aub(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.V) {
            return;
        }
        Iterator it = this.R.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hm4) it.next()).accept(new s2d(z));
        }
    }
}
