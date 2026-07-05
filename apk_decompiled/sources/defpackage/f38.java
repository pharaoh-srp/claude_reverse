package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f38 implements GestureDetector.OnGestureListener {
    public final k99 a;
    public final WeakReference b;
    public final kf9[] c;
    public final m4c d;
    public final WeakReference e;
    public final h99 f;
    public final sb g;
    public final sb h;
    public oxe i;
    public oyi j;
    public float k;
    public float l;

    public f38(k99 k99Var, WeakReference weakReference, kf9[] kf9VarArr, m4c m4cVar, WeakReference weakReference2, h99 h99Var, sb sbVar) {
        gmf gmfVar = new gmf(2);
        k99Var.getClass();
        h99Var.getClass();
        this.a = k99Var;
        this.b = weakReference;
        this.c = kf9VarArr;
        this.d = m4cVar;
        this.e = weakReference2;
        this.f = h99Var;
        this.g = sbVar;
        this.h = gmfVar;
        Context context = (Context) weakReference2.get();
        if (context != null) {
            sbVar.k(k99Var, context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[PHI: r5
      0x0045: PHI (r5v6 oyi) = (r5v2 oyi), (r5v7 oyi) binds: [B:26:0x0053, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.oyi a(android.view.View r11, float r12, float r13, boolean r14) {
        /*
            r10 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
            r0.add(r1, r11)
            r11 = 0
            r2 = r11
            r3 = r1
        Lc:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L76
            java.lang.Object r4 = r0.remove(r1)
            r4.getClass()
            android.view.View r4 = (android.view.View) r4
            if (r3 != 0) goto L30
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "androidx.compose.ui.platform.ComposeView"
            boolean r3 = defpackage.isg.q0(r3, r5, r1)
            if (r3 == 0) goto L2e
            goto L30
        L2e:
            r3 = r1
            goto L31
        L30:
            r3 = 1
        L31:
            sb r5 = r10.g
            sb r6 = r10.h
            if (r14 == 0) goto L47
            oyi r6 = r6.n(r4, r12, r13)
            if (r6 == 0) goto L3e
            goto L3f
        L3e:
            r6 = r11
        L3f:
            oyi r5 = r5.n(r4, r12, r13)
            if (r5 == 0) goto L56
        L45:
            r6 = r5
            goto L56
        L47:
            oyi r6 = r6.p(r4, r12, r13)
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r6 = r11
        L4f:
            oyi r5 = r5.p(r4, r12, r13)
            if (r5 == 0) goto L56
            goto L45
        L56:
            if (r6 == 0) goto L59
            r2 = r6
        L59:
            int r5 = r4.getVisibility()
            if (r5 != 0) goto Lc
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto Lc
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r5 = r4.getChildCount()
            r6 = r1
        L6a:
            if (r6 >= r5) goto Lc
            android.view.View r7 = r4.getChildAt(r6)
            r0.add(r7)
            int r6 = r6 + 1
            goto L6a
        L76:
            if (r2 != 0) goto L92
            if (r3 == 0) goto L7d
            java.lang.String r11 = "We could not find a valid target for the gesture event. Compose actions tracking not enabled, or the compose view is not tagged."
            goto L7f
        L7d:
            java.lang.String r11 = "We could not find a valid target for the gesture event. The DecorView was empty and either transparent or not clickable for this Activity."
        L7f:
            rb1 r6 = new rb1
            r12 = 13
            r6.<init>(r11, r12)
            r8 = 0
            r9 = 56
            h99 r3 = r10.f
            r4 = 3
            g99 r5 = defpackage.g99.E
            r7 = 0
            defpackage.dch.H(r3, r4, r5, r6, r7, r8, r9)
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f38.a(android.view.View, float, float, boolean):oyi");
    }

    public final LinkedHashMap b(oyi oyiVar, MotionEvent motionEvent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        View view = (View) oyiVar.a().get();
        if (view != null) {
            String strL = opk.l((Context) this.e.get(), view.getId());
            linkedHashMap.put("action.target.classname", opk.m(view));
            linkedHashMap.put("action.target.resource_id", strL);
            for (kf9 kf9Var : this.c) {
                kf9Var.getClass();
                kf9.a(view, linkedHashMap);
            }
        }
        if (motionEvent != null) {
            float x = motionEvent.getX() - this.k;
            float y = motionEvent.getY() - this.l;
            linkedHashMap.put("action.gesture.direction", Math.abs(x) > Math.abs(y) ? x > MTTypesetterKt.kLineSkipLimitMultiplier ? "right" : "left" : y > MTTypesetterKt.kLineSkipLimitMultiplier ? "down" : "up");
        }
        return linkedHashMap;
    }

    public final void c(oyi oyiVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        View view = (View) oyiVar.a().get();
        if (view != null) {
            String strL = opk.l((Context) this.e.get(), view.getId());
            linkedHashMap.put("action.target.classname", opk.m(view));
            linkedHashMap.put("action.target.resource_id", strL);
            for (kf9 kf9Var : this.c) {
                kf9Var.getClass();
                kf9.a(view, linkedHashMap);
            }
        }
        cye cyeVarA = t78.a(this.a);
        opk.k(this.d, oyiVar);
        cyeVarA.t(oxe.E, "", linkedHashMap);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.j = null;
        this.i = null;
        this.l = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.k = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.k = motionEvent.getX();
        this.l = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        this.i = oxe.G;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View decorView;
        motionEvent2.getClass();
        cye cyeVarA = t78.a(this.a);
        Window window = (Window) this.b.get();
        if (window != null && (decorView = window.getDecorView()) != null && this.i == null) {
            oyi oyiVarA = motionEvent != null ? a(decorView, motionEvent.getX(), motionEvent.getY(), true) : null;
            if (oyiVarA != null) {
                this.j = oyiVarA;
                LinkedHashMap linkedHashMapB = b(oyiVarA, null);
                opk.k(this.d, oyiVarA);
                cyeVarA.u(linkedHashMapB);
                this.i = oxe.F;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        oyi oyiVarA;
        motionEvent.getClass();
        Window window = (Window) this.b.get();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView == null || (oyiVarA = a(decorView, motionEvent.getX(), motionEvent.getY(), false)) == null) {
            return true;
        }
        c(oyiVarA);
        return true;
    }
}
