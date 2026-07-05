package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class ynh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ynh.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public yz6[] a;

    public final void a(yz6 yz6Var) {
        yz6Var.d((zz6) this);
        yz6[] yz6VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (yz6VarArr == null) {
            yz6VarArr = new yz6[4];
            this.a = yz6VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= yz6VarArr.length) {
            yz6VarArr = (yz6[]) Arrays.copyOf(yz6VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = yz6VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        yz6VarArr[i] = yz6Var;
        yz6Var.F = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yz6 b(int r9) {
        /*
            r8 = this;
            yz6[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ynh.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            yz6[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.F = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynh.b(int):yz6");
    }

    public final void c(int i) {
        while (i > 0) {
            yz6[] yz6VarArr = this.a;
            yz6VarArr.getClass();
            int i2 = (i - 1) / 2;
            yz6 yz6Var = yz6VarArr[i2];
            yz6Var.getClass();
            yz6 yz6Var2 = yz6VarArr[i];
            yz6Var2.getClass();
            if (yz6Var.compareTo(yz6Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        yz6[] yz6VarArr = this.a;
        yz6VarArr.getClass();
        yz6 yz6Var = yz6VarArr[i2];
        yz6Var.getClass();
        yz6 yz6Var2 = yz6VarArr[i];
        yz6Var2.getClass();
        yz6VarArr[i] = yz6Var;
        yz6VarArr[i2] = yz6Var2;
        yz6Var.F = i;
        yz6Var2.F = i2;
    }
}
