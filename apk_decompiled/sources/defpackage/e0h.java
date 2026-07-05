package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0h extends hqb implements e8d, cz5, d8d {
    public Object S;
    public Object T;
    public Object[] U;
    public k7h V;
    public PointerInputEventHandler W;
    public fkg X;
    public t7d Y = a0h.a;
    public final wwb Z;
    public final wwb a0;
    public final wwb b0;
    public t7d c0;
    public long d0;

    public e0h(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.S = obj;
        this.T = obj2;
        this.U = objArr;
        this.W = pointerInputEventHandler;
        wwb wwbVar = new wwb(0, new d0h[16]);
        this.Z = wwbVar;
        this.a0 = wwbVar;
        this.b0 = new wwb(0, new d0h[16]);
        this.d0 = 0L;
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        this.d0 = j;
        if (u7dVar == u7d.E) {
            this.Y = t7dVar;
        }
        tp4 tp4Var = null;
        if (this.X == null) {
            this.X = gb9.D(d1(), null, o45.H, new bff(this, tp4Var, 7), 1);
        }
        q1(t7dVar, u7dVar);
        List list = t7dVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                t7dVar = null;
                break;
            } else if (!hvj.j((z7d) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.c0 = t7dVar;
    }

    @Override // defpackage.d8d
    public final void R() {
        t7d t7dVar = this.c0;
        if (t7dVar == null) {
            return;
        }
        List list = t7dVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((z7d) list.get(i)).f()) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    z7d z7dVar = (z7d) list.get(i2);
                    arrayList.add(new z7d(z7dVar.d(), z7dVar.k(), z7dVar.e(), z7dVar.g(), z7dVar.k(), z7dVar.e(), z7dVar.f(), z7dVar.f(), z7dVar.j()));
                }
                t7d t7dVar2 = new t7d(arrayList, null);
                this.Y = t7dVar2;
                q1(t7dVar2, u7d.E);
                q1(t7dVar2, u7d.F);
                q1(t7dVar2, u7d.G);
                this.c0 = null;
                return;
            }
        }
    }

    @Override // defpackage.d8d
    public final void V0() {
        r1();
    }

    @Override // defpackage.nw5
    public final void f() {
        r1();
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return yfd.W(this).d0.getDensity();
    }

    @Override // defpackage.hqb
    public final void i1() {
        r1();
    }

    @Override // defpackage.cz5
    public final float k0() {
        return yfd.W(this).d0.k0();
    }

    public final Object p1(pz7 pz7Var, tp4 tp4Var) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        d0h d0hVar = new d0h(this, ua2Var);
        synchronized (this.a0) {
            this.Z.b(d0hVar);
            new a3f(zni.I(zni.p(d0hVar, d0hVar, pz7Var)), m45.E).resumeWith(iei.a);
        }
        ua2Var.w(new h4(29, d0hVar));
        return ua2Var.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(defpackage.t7d r7, defpackage.u7d r8) {
        /*
            r6 = this;
            wwb r0 = r6.a0
            monitor-enter(r0)
            wwb r1 = r6.b0     // Catch: java.lang.Throwable -> L6c
            wwb r2 = r6.Z     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.G     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            wwb r0 = r6.b0     // Catch: java.lang.Throwable -> L21
            int r3 = r0.G     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.E     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            d0h r2 = (defpackage.d0h) r2     // Catch: java.lang.Throwable -> L21
            u7d r4 = r2.H     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            ua2 r4 = r2.G     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.G = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            wwb r0 = r6.b0     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.E     // Catch: java.lang.Throwable -> L21
            int r0 = r0.G     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            d0h r4 = (defpackage.d0h) r4     // Catch: java.lang.Throwable -> L21
            u7d r5 = r4.H     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            ua2 r5 = r4.G     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.G = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            wwb r6 = r6.b0
            r6.h()
            return
        L66:
            wwb r6 = r6.b0
            r6.h()
            throw r7
        L6c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0h.q1(t7d, u7d):void");
    }

    public final void r1() {
        fkg fkgVar = this.X;
        if (fkgVar != null) {
            fkgVar.z(new PointerInputResetException());
            this.X = null;
        }
    }
}
