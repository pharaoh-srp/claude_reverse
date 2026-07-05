package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p4i extends i6c {
    public final zy1 f;
    public fkg g;

    public p4i(raf rafVar, v9f v9fVar, cz5 cz5Var) {
        super(rafVar, v9fVar, cz5Var);
        this.f = wd6.P(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        if (r0.invoke(r3, r4) == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.p4i r18, defpackage.raf r19, defpackage.n4i r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4i.d(p4i, raf, n4i, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n4i h(zy1 zy1Var) {
        n4i n4iVar = null;
        zmf zmfVarV = yb5.v(new f(new ln(zy1Var, 3), 0 == true ? 1 : 0, 6));
        while (zmfVarV.hasNext()) {
            n4i n4iVarA = (n4i) zmfVarV.next();
            if (n4iVar != null) {
                n4iVarA = n4iVar.a(n4iVarA);
            }
            n4iVar = n4iVarA;
        }
        return n4iVar;
    }

    public final boolean e(t7d t7dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        zy1 zy1Var;
        raf rafVar;
        z7d z7dVar = (z7d) w44.N0(t7dVar.a);
        if (z7dVar != null) {
            List listC = z7dVar.c();
            int size = listC.size();
            int i = 0;
            z3 = false;
            while (true) {
                zy1Var = this.f;
                rafVar = this.a;
                if (i >= size) {
                    break;
                }
                zm8 zm8Var = (zm8) listC.get(i);
                long j = zm8Var.d ^ (-9223372034707292160L);
                if (!(rafVar.i(rafVar.e(j)) == MTTypesetterKt.kLineSkipLimitMultiplier)) {
                    z3 = !(zy1Var.r(new n4i(j, zm8Var.a, false)) instanceof zh2) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = z7dVar.l ^ (-9223372034707292160L);
            boolean z4 = t7dVar.f == 12;
            if (!(rafVar.i(rafVar.e(j2)) == MTTypesetterKt.kLineSkipLimitMultiplier) || z4) {
                if (!(zy1Var.r(new n4i(j2, z7dVar.b, z4)) instanceof zh2) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }

    public final void f(t7d t7dVar, u7d u7dVar, long j) {
        int i = t7dVar.f;
        if (i == 10 || i == 11 || i == 12) {
            List list = t7dVar.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((z7d) list.get(i2)).l()) {
                    return;
                }
            }
            if (u7dVar == u7d.E && this.d) {
                e(t7dVar);
                i6c.a(t7dVar);
            }
            if (u7dVar == u7d.F && !this.d && e(t7dVar)) {
                i6c.a(t7dVar);
            }
        }
    }

    public final void g(l45 l45Var) {
        if (this.g == null) {
            this.g = gb9.D(l45Var, null, null, new lza(this, (tp4) null, 26), 3);
        }
    }
}
