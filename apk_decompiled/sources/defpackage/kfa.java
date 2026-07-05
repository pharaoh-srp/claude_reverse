package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class kfa {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(kfa.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = yf4.a.objectFieldOffset(kfa.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(kfa.class, "_state$volatile");
    public static final sqb g = new sqb("REMOVE_FROZEN", 1);

    public kfa(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            sz6.j("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        sz6.j("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                kfa kfaVar = this;
                if (f.compareAndSet(kfaVar, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    kfa kfaVarD = kfaVar;
                    while ((atomicLongFieldUpdater.get(kfaVarD) & 1152921504606846976L) != 0) {
                        kfaVarD = kfaVarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = kfaVarD.d;
                        int i4 = kfaVarD.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof jfa) && ((jfa) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            kfaVarD = null;
                        }
                        if (kfaVarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = kfaVar;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final kfa b(long j) {
        kfa kfaVar;
        while (true) {
            e.getClass();
            Unsafe unsafe = yf4.a;
            long j2 = h;
            kfa kfaVar2 = (kfa) unsafe.getObjectVolatile(this, j2);
            if (kfaVar2 != null) {
                return kfaVar2;
            }
            kfa kfaVar3 = new kfa(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object jfaVar = this.d.get(i4);
                if (jfaVar == null) {
                    jfaVar = new jfa(i);
                }
                kfaVar3.d.set(kfaVar3.c & i, jfaVar);
                i++;
            }
            f.set(kfaVar3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = yf4.a;
                kfaVar = this;
                if (!unsafe2.compareAndSwapObject(kfaVar, h, (Object) null, kfaVar3) && unsafe2.getObjectVolatile(kfaVar, j2) == null) {
                    this = kfaVar;
                }
            }
            this = kfaVar;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            kfa kfaVar = this;
            if (atomicLongFieldUpdater.compareAndSet(kfaVar, j, 2305843009213693952L | j)) {
                return true;
            }
            this = kfaVar;
        }
    }

    public final kfa d() {
        long j;
        kfa kfaVar;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                kfaVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            kfaVar = this;
            if (atomicLongFieldUpdater.compareAndSet(kfaVar, j, j2)) {
                j = j2;
                break;
            }
            this = kfaVar;
        }
        return kfaVar.b(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.kfa.f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            sqb r0 = defpackage.kfa.g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof defpackage.jfa
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.kfa.f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            kfa r0 = r1.d()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = defpackage.kfa.f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.d
            int r2 = r2.c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfa.e():java.lang.Object");
    }
}
