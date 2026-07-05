package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class smj implements zdc {
    public final j88 E;
    public final int F;
    public final gf0 G;
    public final long H;
    public final long I;

    public smj(j88 j88Var, int i, gf0 gf0Var, long j, long j2) {
        this.E = j88Var;
        this.F = i;
        this.G = gf0Var;
        this.H = j;
        this.I = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.smj a(defpackage.j88 r10, int r11, defpackage.gf0 r12) {
        /*
            boolean r0 = r10.b()
            if (r0 != 0) goto L7
            goto L44
        L7:
            ive r0 = defpackage.ive.r()
            java.lang.Object r0 = r0.F
            jve r0 = (defpackage.jve) r0
            r1 = 1
            if (r0 == 0) goto L46
            boolean r2 = r0.F
            if (r2 == 0) goto L44
            boolean r0 = r0.G
            java.util.concurrent.ConcurrentHashMap r2 = r10.N
            java.lang.Object r2 = r2.get(r12)
            kmj r2 = (defpackage.kmj) r2
            if (r2 == 0) goto L42
            ge0 r3 = r2.j
            boolean r4 = r3 instanceof defpackage.fe1
            if (r4 == 0) goto L44
            fe1 r3 = (defpackage.fe1) r3
            drk r4 = r3.Z
            if (r4 == 0) goto L42
            boolean r4 = r3.d()
            if (r4 != 0) goto L42
            sh4 r0 = b(r2, r3, r11)
            if (r0 == 0) goto L44
            int r3 = r2.t
            int r3 = r3 + r1
            r2.t = r3
            boolean r1 = r0.G
            goto L46
        L42:
            r1 = r0
            goto L46
        L44:
            r10 = 0
            return r10
        L46:
            smj r2 = new smj
            r3 = 0
            if (r1 == 0) goto L52
            long r5 = java.lang.System.currentTimeMillis()
            r6 = r5
            goto L53
        L52:
            r6 = r3
        L53:
            if (r1 == 0) goto L59
            long r3 = android.os.SystemClock.elapsedRealtime()
        L59:
            r5 = r12
            r8 = r3
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smj.a(j88, int, gf0):smj");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sh4 b(defpackage.kmj r4, defpackage.fe1 r5, int r6) {
        /*
            drk r5 = r5.Z
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            sh4 r5 = r5.H
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.F
            if (r1 == 0) goto L35
            int[] r1 = r5.H
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.J
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.t
            int r6 = r5.I
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smj.b(kmj, fe1, int):sh4");
    }

    @Override // defpackage.zdc
    public final void onComplete(d5h d5hVar) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        if (this.E.b()) {
            jve jveVar = (jve) ive.r().F;
            if (jveVar == null || jveVar.F) {
                kmj kmjVar = (kmj) this.E.N.get(this.G);
                if (kmjVar != null) {
                    Object obj = kmjVar.j;
                    if (obj instanceof fe1) {
                        fe1 fe1Var = (fe1) obj;
                        int i5 = 0;
                        boolean z = this.H > 0;
                        int i6 = fe1Var.U;
                        int i7 = 100;
                        if (jveVar != null) {
                            z &= jveVar.G;
                            int i8 = jveVar.H;
                            int i9 = jveVar.I;
                            i = jveVar.E;
                            if (fe1Var.Z != null && !fe1Var.d()) {
                                sh4 sh4VarB = b(kmjVar, fe1Var, this.F);
                                if (sh4VarB == null) {
                                    return;
                                }
                                boolean z2 = sh4VarB.G && this.H > 0;
                                i9 = sh4VarB.I;
                                z = z2;
                            }
                            i3 = i8;
                            i2 = i9;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        j88 j88Var = this.E;
                        int iElapsedRealtime = -1;
                        if (d5hVar.g()) {
                            i4 = 0;
                        } else if (((r5l) d5hVar).d) {
                            i4 = i7;
                            i5 = -1;
                        } else {
                            Exception excD = d5hVar.d();
                            if (excD instanceof ApiException) {
                                Status status = ((ApiException) excD).E;
                                i7 = status.E;
                                hh4 hh4Var = status.H;
                                if (hh4Var != null) {
                                    i5 = hh4Var.F;
                                    i4 = i7;
                                }
                                i4 = i7;
                                i5 = -1;
                            } else {
                                i4 = 101;
                                i5 = -1;
                            }
                        }
                        if (z) {
                            long j3 = this.H;
                            long j4 = this.I;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        tmj tmjVar = new tmj(new vjb(this.F, i4, i5, j, j2, null, null, i6, iElapsedRealtime), i, i3, i2);
                        xnj xnjVar = j88Var.Q;
                        xnjVar.sendMessage(xnjVar.obtainMessage(18, tmjVar));
                    }
                }
            }
        }
    }
}
