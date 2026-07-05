package defpackage;

import androidx.credentials.exceptions.ClearCredentialException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class z22 implements i92, m95, h92, cec {
    public final /* synthetic */ int E;
    public final /* synthetic */ ua2 F;

    public /* synthetic */ z22(ua2 ua2Var, int i) {
        this.E = i;
        this.F = ua2Var;
    }

    @Override // defpackage.m95
    public void a(Object obj) {
        ClearCredentialException clearCredentialException = (ClearCredentialException) obj;
        clearCredentialException.getClass();
        ua2 ua2Var = this.F;
        if (ua2Var.s() instanceof q6c) {
            ua2Var.resumeWith(new hre(clearCredentialException));
        }
    }

    public void b(hp1 hp1Var, wg wgVar) {
        hp1Var.getClass();
        int i = hp1Var.a;
        ua2 ua2Var = this.F;
        if (i == 0 && wgVar != null) {
            String str = wgVar.F;
            str.getClass();
            u88.a(ua2Var, bsg.I0(str) ? null : str);
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strK = vb7.k(hp1Var.a, "getBillingConfigAsync returned ", ": ", hp1Var.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "GooglePlayBillingConfigProvider", strK);
                }
            }
        }
        u88.a(ua2Var, null);
    }

    @Override // defpackage.h92
    public void k(u82 u82Var, oqe oqeVar) {
        boolean z = oqeVar.a.U;
        ua2 ua2Var = this.F;
        if (z) {
            ua2Var.resumeWith(oqeVar.b);
        } else {
            ua2Var.resumeWith(new hre(new HttpException(oqeVar)));
        }
    }

    @Override // defpackage.i92
    public void onFailure(v82 v82Var, IOException iOException) {
        int i = this.E;
        ua2 ua2Var = this.F;
        switch (i) {
            case 0:
                if (!(ua2Var.s() instanceof bb2)) {
                    ua2Var.resumeWith(new hre(iOException));
                }
                break;
            case 1:
                ua2Var.resumeWith(new hre(iOException));
                break;
            default:
                if (!(ua2Var.s() instanceof bb2)) {
                    ua2Var.resumeWith(new hre(iOException));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:11:0x0023, B:13:0x0027, B:16:0x0036, B:18:0x003c, B:21:0x0046, B:20:0x0044, B:30:0x005d, B:31:0x0074), top: B:43:0x0023, outer: #1 }] */
    @Override // defpackage.i92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResponse(defpackage.v82 r4, defpackage.pqe r5) {
        /*
            r3 = this;
            int r4 = r3.E
            ua2 r3 = r3.F
            switch(r4) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            b12 r4 = defpackage.b12.H
            r3.o(r5, r4)
            return
        Ld:
            b12 r4 = defpackage.b12.G
            r3.o(r5, r4)
            return
        L13:
            java.lang.String r4 = "HTTP "
            rqe r0 = r5.K
            java.lang.Object r1 = r3.s()
            boolean r1 = r1 instanceof defpackage.bb2
            if (r1 == 0) goto L23
            r5.close()
            goto L8b
        L23:
            boolean r1 = r5.U     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            okio.BufferedSource r4 = r0.G0()     // Catch: java.lang.Throwable -> L5b
            r1 = 2097153(0x200001, double:1.0361313E-317)
            boolean r1 = r4.j0(r1)     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            if (r1 == 0) goto L36
            goto L4a
        L36:
            p8b r0 = r0.e()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L44
            ide r1 = defpackage.p8b.e     // Catch: java.lang.Throwable -> L5b
            java.nio.charset.Charset r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L46
        L44:
            java.nio.charset.Charset r0 = defpackage.dj2.a     // Catch: java.lang.Throwable -> L5b
        L46:
            java.lang.String r2 = r4.Z(r0)     // Catch: java.lang.Throwable -> L5b
        L4a:
            r5.close()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r3.s()
            boolean r4 = r4 instanceof defpackage.bb2
            if (r4 != 0) goto L8b
            r3.resumeWith(r2)
            goto L8b
        L59:
            r4 = move-exception
            goto L7b
        L5b:
            r4 = move-exception
            goto L75
        L5d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            int r1 = r5.H     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r2.append(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5b
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            throw r0     // Catch: java.lang.Throwable -> L5b
        L75:
            throw r4     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            defpackage.wd6.Z(r5, r4)     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L7b:
            java.lang.Object r5 = r3.s()
            boolean r5 = r5 instanceof defpackage.bb2
            if (r5 != 0) goto L8b
            hre r5 = new hre
            r5.<init>(r4)
            r3.resumeWith(r5)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z22.onResponse(v82, pqe):void");
    }

    @Override // defpackage.m95
    public void onResult(Object obj) {
        ua2 ua2Var = this.F;
        if (ua2Var.s() instanceof q6c) {
            ua2Var.resumeWith(iei.a);
        }
    }

    @Override // defpackage.h92
    public void q(u82 u82Var, Throwable th) {
        this.F.resumeWith(new hre(th));
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        this.F.resumeWith(null);
    }
}
