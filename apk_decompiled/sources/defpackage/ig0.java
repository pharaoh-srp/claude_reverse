package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.concurrent.futures.b;
import androidx.javascriptengine.DataInputException;
import androidx.javascriptengine.EvaluationFailedException;
import androidx.javascriptengine.IsolateTerminatedException;
import androidx.javascriptengine.JavaScriptException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class ig0 implements cc9 {
    public int E;
    public final Object F;
    public final Object G;
    public Object H;
    public Object I;
    public Object J;

    public ig0(ne9 ne9Var, yt8 yt8Var) {
        this.G = new Object();
        this.I = new HashSet();
        this.J = new HashMap();
        this.F = ne9Var;
        this.H = yt8Var;
        this.E = 20971520;
    }

    @Override // defpackage.cc9
    public boolean a() {
        return true;
    }

    @Override // defpackage.cc9
    public void b(final ep1 ep1Var) {
        f(ep1Var.k());
        ((HashMap) this.J).forEach(new BiConsumer() { // from class: dc9
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Executor) obj2).execute(new yw5((hm4) obj, 5, ep1Var));
            }
        });
    }

    @Override // defpackage.cc9
    public saa c(String str) {
        re9 re9Var = ((ne9) this.F).G;
        re9Var.getClass();
        if (!re9Var.M.contains("JS_FEATURE_EVALUATE_WITHOUT_TRANSACTION_LIMIT")) {
            return mpk.J(new u95(this, 5, str));
        }
        return mpk.J(new u95(this, 6, str.getBytes(StandardCharsets.UTF_8)));
    }

    @Override // defpackage.cc9
    public void close() {
        try {
            ((wt8) ((yt8) this.H)).b();
        } catch (DeadObjectException e) {
            k(e);
        } catch (RemoteException e2) {
            e = e2;
            Log.e("IsolateUsableState", "Exception was thrown during close()", e);
            k(e);
        } catch (RuntimeException e3) {
            e = e3;
            Log.e("IsolateUsableState", "Exception was thrown during close()", e);
            k(e);
        }
        f(new IsolateTerminatedException("isolate closed"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.F) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(long r10, defpackage.ssc r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.H
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.I
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.E
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.E
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            dhe r3 = (defpackage.dhe) r3
            java.lang.String r5 = defpackage.tpi.a
            long r5 = r3.F
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.G
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            ssc r3 = new ssc
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            ssc r3 = (defpackage.ssc) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.J
            dhe r12 = (defpackage.dhe) r12
            if (r12 == 0) goto L6c
            long r5 = r12.F
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.E
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            dhe r12 = new dhe
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            dhe r12 = (defpackage.dhe) r12
        L7e:
            java.util.ArrayList r0 = r12.E
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.fd9.E(r8)
            boolean r2 = r0.isEmpty()
            defpackage.fd9.M(r2)
            r12.F = r10
            r0.add(r3)
            r1.add(r12)
            r9.J = r12
            int r10 = r9.E
            if (r10 == r4) goto L9e
            r9.g(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.F
            ehe r9 = (defpackage.ehe) r9
            r9.d(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.d(long, ssc):void");
    }

    public void e() {
        View view = (View) this.F;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((krh) this.H) != null) {
                if (((krh) this.J) == null) {
                    this.J = new krh();
                }
                krh krhVar = (krh) this.J;
                krhVar.a = null;
                krhVar.d = false;
                krhVar.b = null;
                krhVar.c = false;
                WeakHashMap weakHashMap = mvi.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    krhVar.d = true;
                    krhVar.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    krhVar.c = true;
                    krhVar.b = backgroundTintMode;
                }
                if (krhVar.d || krhVar.c) {
                    ch0.d(background, krhVar, view.getDrawableState());
                    return;
                }
            }
            krh krhVar2 = (krh) this.I;
            if (krhVar2 != null) {
                ch0.d(background, krhVar2, view.getDrawableState());
                return;
            }
            krh krhVar3 = (krh) this.H;
            if (krhVar3 != null) {
                ch0.d(background, krhVar3, view.getDrawableState());
            }
        }
    }

    public void f(IsolateTerminatedException isolateTerminatedException) {
        Set set;
        synchronized (this.G) {
            set = (Set) this.I;
            this.I = Collections.EMPTY_SET;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(isolateTerminatedException);
        }
    }

    public void g(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.I;
        while (priorityQueue.size() > i) {
            dhe dheVar = (dhe) priorityQueue.poll();
            String str = tpi.a;
            int i2 = 0;
            while (true) {
                arrayList = dheVar.E;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((ehe) this.F).d(dheVar.F, (ssc) arrayList.get(i2));
                ((ArrayDeque) this.G).push((ssc) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            dhe dheVar2 = (dhe) this.J;
            if (dheVar2 != null && dheVar2.F == dheVar.F) {
                this.J = null;
            }
            ((ArrayDeque) this.H).push(dheVar);
        }
    }

    public ColorStateList h() {
        krh krhVar = (krh) this.I;
        if (krhVar != null) {
            return krhVar.a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        krh krhVar = (krh) this.I;
        if (krhVar != null) {
            return krhVar.b;
        }
        return null;
    }

    public void j(b bVar, int i, String str) {
        if (i == 0) {
            bVar.b(new EvaluationFailedException(str));
            return;
        }
        if (i == 1) {
            ep1 ep1Var = new ep1(3, str);
            ((ne9) this.F).f(ep1Var);
            bVar.b(ep1Var.k());
        } else if (i != 2) {
            bVar.b(new JavaScriptException(vb7.k(i, "Unknown error: code ", ": ", str)));
        } else {
            bVar.b(new DataInputException(str));
        }
    }

    public ep1 k(Exception exc) {
        ne9 ne9Var = (ne9) this.F;
        ne9Var.G.f(exc);
        ep1 ep1VarI = ne9Var.i();
        Objects.requireNonNull(ep1VarI);
        return ep1VarI;
    }

    public void l(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.F;
        Context context = view.getContext();
        int[] iArr = t0e.y;
        lrb lrbVarP = lrb.P(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        View view2 = (View) this.F;
        mvi.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) lrbVarP.G, i);
        try {
            if (typedArray.hasValue(0)) {
                this.E = typedArray.getResourceId(0, -1);
                ch0 ch0Var = (ch0) this.G;
                Context context2 = view.getContext();
                int i2 = this.E;
                synchronized (ch0Var) {
                    colorStateListG = ch0Var.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    q(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(lrbVarP.w(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(je6.b(typedArray.getInt(2, -1), null));
            }
            lrbVarP.S();
        } catch (Throwable th) {
            lrbVarP.S();
            throw th;
        }
    }

    public void m() {
        this.E = -1;
        q(null);
        e();
    }

    public void n(int i) {
        ColorStateList colorStateListG;
        this.E = i;
        ch0 ch0Var = (ch0) this.G;
        if (ch0Var != null) {
            Context context = ((View) this.F).getContext();
            synchronized (ch0Var) {
                colorStateListG = ch0Var.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        q(colorStateListG);
        e();
    }

    public void o(b bVar) {
        synchronized (this.G) {
            ((Set) this.I).remove(bVar);
        }
    }

    public void p(Runnable runnable) {
        k1h k1hVar = (k1h) this.F;
        if (k1hVar.a.getLooper().getThread().isAlive()) {
            k1hVar.d(runnable);
        }
    }

    public void q(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((krh) this.H) == null) {
                this.H = new krh();
            }
            krh krhVar = (krh) this.H;
            krhVar.a = colorStateList;
            krhVar.d = true;
        } else {
            this.H = null;
        }
        e();
    }

    public void r(int i) {
        fd9.M(i >= 0);
        this.E = i;
        g(i);
    }

    public void s(ColorStateList colorStateList) {
        if (((krh) this.I) == null) {
            this.I = new krh();
        }
        krh krhVar = (krh) this.I;
        krhVar.a = colorStateList;
        krhVar.d = true;
        e();
    }

    public void t(PorterDuff.Mode mode) {
        if (((krh) this.I) == null) {
            this.I = new krh();
        }
        krh krhVar = (krh) this.I;
        krhVar.b = mode;
        krhVar.c = true;
        e();
    }

    public void u(Object obj) {
        Object obj2 = this.I;
        this.I = obj;
        if (obj2.equals(obj)) {
            return;
        }
        v77 v77Var = ((l77) this.H).E;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        v77Var.F();
        v77Var.z(1, num, 10);
        v77Var.z(2, num, 10);
        v77Var.m.e(21, new dp5(iIntValue, 1));
    }

    public ig0(ehe eheVar) {
        this.F = eheVar;
        this.G = new ArrayDeque();
        this.H = new ArrayDeque();
        this.I = new PriorityQueue();
        this.E = -1;
    }

    public ig0(Object obj, Looper looper, Looper looper2, g1h g1hVar, l77 l77Var) {
        this.F = g1hVar.a(looper, null);
        this.G = g1hVar.a(looper2, null);
        this.I = obj;
        this.J = obj;
        this.H = l77Var;
    }

    public ig0(View view) {
        this.E = -1;
        this.F = view;
        this.G = ch0.a();
    }
}
