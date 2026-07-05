package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import defpackage.b54;
import defpackage.csg;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.g;
import io.sentry.android.replay.g0;
import io.sentry.t5;
import io.sentry.v;
import io.sentry.w6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {
    public final w6 E;
    public final ReplayIntegration F;
    public final ArrayList G = new ArrayList();
    public final io.sentry.util.a H = new io.sentry.util.a();
    public final WeakHashMap I = new WeakHashMap();
    public final io.sentry.util.a J = new io.sentry.util.a();

    public b(w6 w6Var, ReplayIntegration replayIntegration) {
        this.E = w6Var;
        this.F = replayIntegration;
    }

    public final void a(View view) throws Exception {
        WeakHashMap weakHashMap = this.I;
        Window windowS = io.sentry.config.a.s(view);
        w6 w6Var = this.E;
        if (windowS == null) {
            w6Var.getLogger().h(t5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.J;
        v vVarA = aVar.a();
        try {
            WeakReference weakReference = (WeakReference) weakHashMap.get(windowS);
            if ((weakReference != null ? (a) weakReference.get() : null) != null) {
                csg.o(vVarA, null);
                return;
            }
            csg.o(vVarA, null);
            a aVar2 = new a(w6Var, this.F, windowS.getCallback());
            windowS.setCallback(aVar2);
            vVarA = aVar.a();
            try {
                weakHashMap.put(windowS, new WeakReference(aVar2));
                csg.o(vVarA, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void b() throws Exception {
        ArrayList arrayList = this.G;
        v vVarA = this.H.a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    d(view);
                }
            }
            arrayList.clear();
            csg.o(vVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.g
    public final void c(View view, boolean z) throws Exception {
        view.getClass();
        v vVarA = this.H.a();
        ArrayList arrayList = this.G;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                a(view);
            } else {
                d(view);
                b54.w0(new g0(view, 1), arrayList);
            }
            csg.o(vVarA, null);
        } finally {
        }
    }

    public final void d(View view) throws Exception {
        v vVarA;
        Window windowS = io.sentry.config.a.s(view);
        if (windowS == null) {
            this.E.getLogger().h(t5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowS.getCallback();
        if (callback instanceof a) {
            windowS.setCallback(((a) callback).E);
            vVarA = this.J.a();
            try {
                csg.o(vVarA, null);
                return;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        vVarA = this.J.a();
        try {
            WeakReference weakReference = (WeakReference) this.I.get(windowS);
            a aVar = weakReference != null ? (a) weakReference.get() : null;
            csg.o(vVarA, null);
            if (aVar != null) {
                aVar.G = null;
            }
        } catch (Throwable th) {
        }
    }
}
