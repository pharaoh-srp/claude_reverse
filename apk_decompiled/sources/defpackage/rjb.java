package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.sentry.e0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rjb extends pe1 implements Handler.Callback {
    public final hj6 W;
    public final r77 X;
    public final Handler Y;
    public final mjb Z;
    public yuj a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public gjb e0;
    public long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjb(r77 r77Var, Looper looper) {
        super(5);
        hj6 hj6Var = hj6.N;
        this.X = r77Var;
        this.Y = looper == null ? null : new Handler(looper, this);
        this.W = hj6Var;
        this.Z = new mjb(1);
        this.f0 = -9223372036854775807L;
    }

    @Override // defpackage.pe1
    public final int D(jw7 jw7Var) {
        if (this.W.O(jw7Var)) {
            return pe1.f(jw7Var.P == 0 ? 4 : 2, 0, 0, 0);
        }
        return pe1.f(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(defpackage.gjb r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            fjb[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            jw7 r2 = r2.a()
            if (r2 == 0) goto L3e
            hj6 r3 = r5.W
            boolean r4 = r3.O(r2)
            if (r4 == 0) goto L3e
            yuj r2 = r3.w(r2)
            r1 = r1[r0]
            byte[] r1 = r1.c()
            r1.getClass()
            mjb r3 = r5.Z
            r3.e()
            int r4 = r1.length
            r3.h(r4)
            java.nio.ByteBuffer r4 = r3.I
            r4.put(r1)
            r3.j()
            gjb r1 = r2.c(r3)
            if (r1 == 0) goto L43
            r5.G(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjb.G(gjb, java.util.ArrayList):void");
    }

    public final long H(long j) {
        fd9.M(j != -9223372036854775807L);
        fd9.M(this.f0 != -9223372036854775807L);
        return j - this.f0;
    }

    public final void I(gjb gjbVar) {
        r77 r77Var = this.X;
        v77 v77Var = r77Var.E;
        n7b n7bVar = v77Var.c0;
        kba kbaVar = v77Var.m;
        m7b m7bVarA = n7bVar.a();
        int i = 0;
        while (true) {
            fjb[] fjbVarArr = gjbVar.a;
            if (i >= fjbVarArr.length) {
                break;
            }
            fjbVarArr[i].b(m7bVarA);
            i++;
        }
        v77Var.c0 = new n7b(m7bVarA);
        n7b n7bVarA = v77Var.a();
        if (!n7bVarA.equals(v77Var.N)) {
            v77Var.N = n7bVarA;
            kbaVar.c(14, new do0(20, r77Var));
        }
        kbaVar.c(28, new do0(21, gjbVar));
        kbaVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            I((gjb) message.obj);
            return true;
        }
        e0.b();
        return false;
    }

    @Override // defpackage.pe1
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // defpackage.pe1
    public final boolean m() {
        return this.c0;
    }

    @Override // defpackage.pe1
    public final boolean o() {
        return true;
    }

    @Override // defpackage.pe1
    public final void p() {
        this.e0 = null;
        this.a0 = null;
        this.f0 = -9223372036854775807L;
    }

    @Override // defpackage.pe1
    public final void r(long j, boolean z, boolean z2) {
        this.e0 = null;
        this.b0 = false;
        this.c0 = false;
    }

    @Override // defpackage.pe1
    public final void w(jw7[] jw7VarArr, long j, long j2, z7b z7bVar) {
        this.a0 = this.W.w(jw7VarArr[0]);
        gjb gjbVar = this.e0;
        if (gjbVar != null) {
            long j3 = gjbVar.b;
            long j4 = (this.f0 + j3) - j2;
            if (j3 != j4) {
                gjbVar = new gjb(j4, gjbVar.a);
            }
            this.e0 = gjbVar;
        }
        this.f0 = j2;
    }

    @Override // defpackage.pe1
    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.b0 && this.e0 == null) {
                mjb mjbVar = this.Z;
                mjbVar.e();
                qb5 qb5Var = this.G;
                qb5Var.i();
                int iY = y(qb5Var, mjbVar, 0);
                if (iY == -4) {
                    if (mjbVar.c(4)) {
                        this.b0 = true;
                    } else if (mjbVar.K >= this.P) {
                        mjbVar.N = this.d0;
                        mjbVar.j();
                        yuj yujVar = this.a0;
                        String str = tpi.a;
                        gjb gjbVarC = yujVar.c(mjbVar);
                        if (gjbVarC != null) {
                            ArrayList arrayList = new ArrayList(gjbVarC.a.length);
                            G(gjbVarC, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.e0 = new gjb(H(mjbVar.K), (fjb[]) arrayList.toArray(new fjb[0]));
                            }
                        }
                    }
                } else if (iY == -5) {
                    jw7 jw7Var = (jw7) qb5Var.F;
                    jw7Var.getClass();
                    this.d0 = jw7Var.t;
                }
            }
            gjb gjbVar = this.e0;
            if (gjbVar == null || gjbVar.b > H(j)) {
                z = false;
            } else {
                gjb gjbVar2 = this.e0;
                Handler handler = this.Y;
                if (handler != null) {
                    handler.obtainMessage(1, gjbVar2).sendToTarget();
                } else {
                    I(gjbVar2);
                }
                this.e0 = null;
                z = true;
            }
            if (this.b0 && this.e0 == null) {
                this.c0 = true;
            }
        }
    }
}
