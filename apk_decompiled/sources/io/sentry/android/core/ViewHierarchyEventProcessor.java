package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.Owner;
import defpackage.av9;
import defpackage.csg;
import defpackage.sd6;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.j5;
import io.sentry.t5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.i0 {
    public final SentryAndroidOptions E;
    public final sd6 F;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.E = sentryAndroidOptions;
        this.F = new sd6(2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.p.a("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, io.sentry.protocol.l0 l0Var, List list) throws Exception {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.b == null) {
                        io.sentry.v vVarA = composeViewHierarchyExporter.c.a();
                        try {
                            if (composeViewHierarchyExporter.b == null) {
                                composeViewHierarchyExporter.b = new io.sentry.compose.a(composeViewHierarchyExporter.a);
                            }
                            csg.o(vVarA, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                csg.o(vVarA, th);
                                throw th2;
                            }
                        }
                    }
                    av9 root = ((Owner) view).getRoot();
                    io.sentry.compose.a aVar = composeViewHierarchyExporter.b;
                    aVar.getClass();
                    ComposeViewHierarchyExporter.a(aVar, l0Var, root);
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.l0 l0VarB = b(childAt);
                    arrayList.add(l0VarB);
                    a(childAt, l0VarB, list);
                }
            }
            l0Var.O = arrayList;
        }
    }

    public static io.sentry.protocol.l0 b(View view) {
        io.sentry.protocol.l0 l0Var = new io.sentry.protocol.l0();
        l0Var.F = io.sentry.p.j(view);
        try {
            l0Var.G = io.sentry.android.core.internal.gestures.j.b(view);
        } catch (Throwable unused) {
        }
        l0Var.K = Double.valueOf(view.getX());
        l0Var.L = Double.valueOf(view.getY());
        l0Var.I = Double.valueOf(view.getWidth());
        l0Var.J = Double.valueOf(view.getHeight());
        l0Var.N = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            l0Var.M = "visible";
        } else if (visibility == 4) {
            l0Var.M = "invisible";
        } else if (visibility == 8) {
            l0Var.M = "gone";
        }
        return l0Var;
    }

    @Override // io.sentry.i0
    public final j5 d(j5 j5Var, io.sentry.n0 n0Var) {
        if (j5Var.h()) {
            SentryAndroidOptions sentryAndroidOptions = this.E;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().h(t5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return j5Var;
            }
            if (!io.sentry.util.c.f(n0Var)) {
                boolean zA = this.F.a();
                if (sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback() == null ? !zA : j5Var.g() != null || (!zA && j5Var.Y == t5.FATAL)) {
                    WeakReference weakReference = (WeakReference) q0.b.a;
                    io.sentry.protocol.k0 k0Var = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    final List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    final io.sentry.a1 logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.h(t5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.h(t5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            final View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.h(t5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.k0 k0Var2 = new io.sentry.protocol.k0("android_view_system", arrayList);
                                        io.sentry.protocol.l0 l0VarB = b(viewPeekDecorView);
                                        arrayList.add(l0VarB);
                                        a(viewPeekDecorView, l0VarB, viewHierarchyExporters);
                                        k0Var = k0Var2;
                                    } else {
                                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                                        final AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.b2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AtomicReference atomicReference2 = atomicReference;
                                                View view = viewPeekDecorView;
                                                List list = viewHierarchyExporters;
                                                CountDownLatch countDownLatch2 = countDownLatch;
                                                try {
                                                    ArrayList arrayList2 = new ArrayList(1);
                                                    io.sentry.protocol.k0 k0Var3 = new io.sentry.protocol.k0("android_view_system", arrayList2);
                                                    io.sentry.protocol.l0 l0VarB2 = ViewHierarchyEventProcessor.b(view);
                                                    arrayList2.add(l0VarB2);
                                                    ViewHierarchyEventProcessor.a(view, l0VarB2, list);
                                                    atomicReference2.set(k0Var3);
                                                    countDownLatch2.countDown();
                                                } catch (Throwable th) {
                                                    logger.d(t5.ERROR, "Failed to process view hierarchy.", th);
                                                }
                                            }
                                        });
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            k0Var = (io.sentry.protocol.k0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.d(t5.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (k0Var != null) {
                        n0Var.e = new io.sentry.a(k0Var);
                    }
                }
            }
        }
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.n0 n0Var) {
        return e0Var;
    }
}
