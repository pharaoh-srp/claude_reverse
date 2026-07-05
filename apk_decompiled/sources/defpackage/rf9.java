package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class rf9 implements j09 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(rf9.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(rf9.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater H;
    public static final /* synthetic */ long I;
    public static final /* synthetic */ long J;
    public final t5c E;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = yf4.a;
        J = unsafe.objectFieldOffset(rf9.class.getDeclaredField("_rootCause$volatile"));
        H = AtomicReferenceFieldUpdater.newUpdater(rf9.class, Object.class, "_exceptionsHolder$volatile");
        I = unsafe.objectFieldOffset(rf9.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public rf9(t5c t5cVar, Throwable th) {
        this.E = t5cVar;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thE = e();
        if (thE == null) {
            i(th);
            return;
        }
        if (th == thE) {
            return;
        }
        Object objB = b();
        if (objB == null) {
            h(th);
            return;
        }
        if (!(objB instanceof Throwable)) {
            if (objB instanceof ArrayList) {
                ((ArrayList) objB).add(th);
                return;
            } else {
                sz6.j(ij0.B("State is ", objB));
                return;
            }
        }
        if (th == objB) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objB);
        arrayList.add(th);
        h(arrayList);
    }

    public final Object b() {
        H.getClass();
        return yf4.a.getObjectVolatile(this, I);
    }

    @Override // defpackage.j09
    public final boolean c() {
        return e() == null;
    }

    @Override // defpackage.j09
    public final t5c d() {
        return this.E;
    }

    public final Throwable e() {
        G.getClass();
        return (Throwable) yf4.a.getObjectVolatile(this, J);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object objB = b();
        if (objB == null) {
            arrayList = new ArrayList(4);
        } else if (objB instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objB);
            arrayList = arrayList2;
        } else {
            if (!(objB instanceof ArrayList)) {
                sz6.j(ij0.B("State is ", objB));
                return null;
            }
            arrayList = (ArrayList) objB;
        }
        Throwable thE = e();
        if (thE != null) {
            arrayList.add(0, thE);
        }
        if (th != null && !th.equals(thE)) {
            arrayList.add(th);
        }
        h(wf9.e);
        return arrayList;
    }

    public final void h(Object obj) {
        H.getClass();
        yf4.a.putObjectVolatile(this, I, obj);
    }

    public final void i(Throwable th) {
        G.getClass();
        yf4.a.putObjectVolatile(this, J, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(F.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(b());
        sb.append(", list=");
        sb.append(this.E);
        sb.append(']');
        return sb.toString();
    }
}
