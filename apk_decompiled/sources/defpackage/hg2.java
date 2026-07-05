package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hg2 implements ywg {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public fg2 d;
    public long e;
    public long f;
    public long g;

    public hg2() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new fg2(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            do0 do0Var = new do0(3, this);
            gg2 gg2Var = new gg2();
            gg2Var.L = do0Var;
            arrayDeque.add(gg2Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.po5
    public void a() {
    }

    @Override // defpackage.po5
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.ywg
    public final void c(long j) {
        this.e = j;
    }

    @Override // defpackage.po5
    public final Object e() {
        fd9.M(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        fg2 fg2Var = (fg2) arrayDeque.pollFirst();
        this.d = fg2Var;
        return fg2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // defpackage.po5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.axg r7) {
        /*
            r6 = this;
            fg2 r0 = r6.d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.fd9.E(r0)
            fg2 r7 = (defpackage.fg2) r7
            r0 = 4
            boolean r0 = r7.c(r0)
            if (r0 != 0) goto L33
            long r0 = r7.K
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L33
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L33
            r7.e()
            java.util.ArrayDeque r0 = r6.a
            r0.add(r7)
            goto L41
        L33:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.O = r0
            java.util.ArrayDeque r0 = r6.c
            r0.add(r7)
        L41:
            r7 = 0
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg2.f(axg):void");
    }

    @Override // defpackage.po5
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            fg2 fg2Var = (fg2) arrayDeque2.poll();
            String str = tpi.a;
            fg2Var.e();
            arrayDeque.add(fg2Var);
        }
        fg2 fg2Var2 = this.d;
        if (fg2Var2 != null) {
            fg2Var2.e();
            arrayDeque.add(fg2Var2);
            this.d = null;
        }
    }

    public abstract ig2 g();

    public abstract void h(fg2 fg2Var);

    @Override // defpackage.po5
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public gg2 d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            fg2 fg2Var = (fg2) arrayDeque2.peek();
            String str = tpi.a;
            if (fg2Var.K > this.e) {
                return null;
            }
            fg2 fg2Var2 = (fg2) arrayDeque2.poll();
            boolean zC = fg2Var2.c(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zC) {
                gg2 gg2Var = (gg2) arrayDeque.pollFirst();
                gg2Var.a(4);
                fg2Var2.e();
                arrayDeque3.add(fg2Var2);
                return gg2Var;
            }
            h(fg2Var2);
            if (j()) {
                ig2 ig2VarG = g();
                gg2 gg2Var2 = (gg2) arrayDeque.pollFirst();
                long j = fg2Var2.K;
                gg2Var2.G = j;
                gg2Var2.I = ig2VarG;
                gg2Var2.J = j;
                fg2Var2.e();
                arrayDeque3.add(fg2Var2);
                return gg2Var2;
            }
            fg2Var2.e();
            arrayDeque3.add(fg2Var2);
        }
    }

    public abstract boolean j();
}
