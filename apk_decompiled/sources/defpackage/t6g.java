package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class t6g {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public t6g(Context context, Looper looper, g1h g1hVar) {
        this.c = new ire(context.getApplicationContext(), 5);
        this.d = g1hVar.a(looper, null);
        this.e = g1hVar.a(Looper.getMainLooper(), null);
    }

    public static void b(Object obj, ArrayList arrayList, h4 h4Var) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) h4Var.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList, h4Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.q9c c(defpackage.qai r4) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6g.c(qai):q9c");
    }

    public static p9c d(cs9 cs9Var) {
        j7g j7gVarI;
        j7g j7gVarI2;
        cs9Var.getClass();
        sn7 sn7VarH = okk.h(cs9Var);
        if (sn7VarH == null || (j7gVarI = okk.Q(sn7VarH)) == null) {
            j7gVarI = okk.i(cs9Var);
            j7gVarI.getClass();
        }
        if (okk.H(j7gVarI)) {
            return p9c.F;
        }
        sn7 sn7VarH2 = okk.h(cs9Var);
        if (sn7VarH2 == null || (j7gVarI2 = okk.a0(sn7VarH2)) == null) {
            j7gVarI2 = okk.i(cs9Var);
            j7gVarI2.getClass();
        }
        if (okk.H(j7gVarI2)) {
            return null;
        }
        return p9c.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x035b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x043a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.g4 a(defpackage.yr9 r31, java.lang.Iterable r32, defpackage.cai r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6g.a(yr9, java.lang.Iterable, cai, boolean):g4");
    }

    public boolean e() {
        return this.b;
    }

    public void f(final boolean z, final boolean z2) {
        k1h k1hVar = (k1h) this.d;
        if (z && z2) {
            k1hVar.d(new Runnable() { // from class: a6j
                @Override // java.lang.Runnable
                public final void run() {
                    ire.b((ire) this.E.c, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        k1h k1hVar2 = (k1h) this.e;
        k1hVar2.a.postDelayed(new tui(this, 2, atomicBoolean), 1000L);
        k1hVar.d(new Runnable() { // from class: b6j
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                ire.b((ire) this.E.c, z, z2);
            }
        });
    }

    public void g(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.a) {
            f(true, z);
        }
    }

    public ArrayList h(cs9 cs9Var) {
        el5 el5Var = (el5) this.d;
        ef9 ef9Var = (ef9) ((kw9) el5Var.H).getValue();
        rc0 rc0Var = ((ke9) el5Var.E).q;
        cs9Var.getClass();
        f4 f4Var = new f4(cs9Var, rc0Var.b(ef9Var, ((yr9) cs9Var).getAnnotations()), null);
        h4 h4Var = new h4(0, this);
        ArrayList arrayList = new ArrayList(1);
        b(f4Var, arrayList, h4Var);
        return arrayList;
    }

    public t6g(ub0 ub0Var, boolean z, el5 el5Var, nc0 nc0Var, boolean z2) {
        el5Var.getClass();
        this.c = ub0Var;
        this.a = z;
        this.d = el5Var;
        this.e = nc0Var;
        this.b = z2;
    }

    public /* synthetic */ t6g(ub0 ub0Var, boolean z, el5 el5Var, nc0 nc0Var) {
        this(ub0Var, z, el5Var, nc0Var, false);
    }
}
