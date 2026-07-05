package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class amg extends d4 implements wa2, r08, ylg, jwb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(amg.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long K = yf4.a.objectFieldOffset(amg.class.getDeclaredField("_state$volatile"));
    public int I;
    private volatile /* synthetic */ Object _state$volatile;

    public amg(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x006c, code lost:
    
        if (r15 != r2) goto L28;
     */
    /* JADX WARN: Path cross not found for [B:36:0x0082, B:38:0x0088], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0088, B:36:0x0082], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0088, B:46:0x00a3], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:58:0x00e5, B:59:0x00e6], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b3, B:50:0x00cf, B:56:0x00df, B:53:0x00d6, B:55:0x00dc, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b3, B:50:0x00cf, B:56:0x00df, B:53:0x00d6, B:55:0x00dc, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b3, B:50:0x00cf, B:56:0x00df, B:53:0x00d6, B:55:0x00dc, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b2 -> B:28:0x006c). Please report as a decompilation issue!!! */
    @Override // defpackage.kp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lp7 r14, defpackage.tp4 r15) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amg.a(lp7, tp4):java.lang.Object");
    }

    @Override // defpackage.r08
    public final kp7 b(c45 c45Var, int i, py1 py1Var) {
        return (((i < 0 || i >= 2) && i != -2) || py1Var != py1.F) ? o2g.d(this, c45Var, i, py1Var) : this;
    }

    @Override // defpackage.jwb
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.jwb
    public final boolean f(Object obj) {
        n(null, obj);
        return true;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        m(obj);
        return iei.a;
    }

    @Override // defpackage.ylg
    public final Object getValue() {
        J.getClass();
        Object objectVolatile = yf4.a.getObjectVolatile(this, K);
        if (objectVolatile == l9c.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.d4
    public final e4 h() {
        return new cmg();
    }

    @Override // defpackage.d4
    public final e4[] i() {
        return new cmg[2];
    }

    public final boolean l(Object obj, Object obj2) {
        sqb sqbVar = l9c.a;
        if (obj == null) {
            obj = sqbVar;
        }
        if (obj2 == null) {
            obj2 = sqbVar;
        }
        return n(obj, obj2);
    }

    public final void m(Object obj) {
        if (obj == null) {
            obj = l9c.a;
        }
        n(null, obj);
    }

    public final boolean n(Object obj, Object obj2) {
        int i;
        e4[] e4VarArr;
        sqb sqbVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !x44.r(obj3, obj)) {
                return false;
            }
            if (x44.r(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.I;
            if ((i2 & 1) != 0) {
                this.I = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.I = i3;
            e4[] e4VarArr2 = this.E;
            while (true) {
                cmg[] cmgVarArr = (cmg[]) e4VarArr2;
                if (cmgVarArr != null) {
                    for (cmg cmgVar : cmgVarArr) {
                        if (cmgVar != null) {
                            AtomicReference atomicReference = cmgVar.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (sqbVar = bmg.b)) {
                                    sqb sqbVar2 = bmg.a;
                                    if (obj4 != sqbVar2) {
                                        while (!atomicReference.compareAndSet(obj4, sqbVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((ua2) obj4).resumeWith(iei.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, sqbVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.I;
                    if (i == i3) {
                        this.I = i3 + 1;
                        return true;
                    }
                    e4VarArr = this.E;
                }
                e4VarArr2 = e4VarArr;
                i3 = i;
            }
        }
    }
}
