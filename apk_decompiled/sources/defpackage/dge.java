package defpackage;

import android.content.Context;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes3.dex */
public final class dge implements zs1 {
    public static boolean h = true;
    public final gg8 a;
    public final RenderScript b;
    public zt0 c;
    public final ib2 d = new ib2();
    public fkg e;
    public boolean f;
    public final ja8 g;

    public dge(gg8 gg8Var) {
        this.a = gg8Var;
        this.b = RenderScript.create((Context) yb5.o(gg8Var, w00.b));
        this.g = ((ga8) yb5.o(gg8Var, ve4.g)).c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [ja8] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ja8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [cge, tp4] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dge r17, defpackage.ja8 r18, float r19, defpackage.vp4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dge.a(dge, ja8, float, vp4):java.lang.Object");
    }

    @Override // defpackage.zs1
    public final void c() {
        fkg fkgVar = this.e;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        ((ga8) yb5.o(this.a, ve4.g)).a(this.g);
        zt0 zt0Var = this.c;
        if (zt0Var != null) {
            zt0Var.b = true;
            ((ScriptIntrinsicBlur) zt0Var.d).destroy();
            ((Allocation) zt0Var.e).destroy();
            ((Allocation) zt0Var.f).destroy();
            ((RenderScript) zt0Var.c).destroy();
        }
    }

    @Override // defpackage.zs1
    public final void d(final cv9 cv9Var) {
        gg8 gg8Var;
        fkg fkgVar;
        final dge dgeVar = this;
        umg umgVar = w00.b;
        gg8 gg8Var2 = dgeVar.a;
        final Context context = (Context) yb5.o(gg8Var2, umgVar);
        final long j = gg8Var2.d0;
        final aae aaeVar = new aae();
        float fA = ig8.a(gg8Var2);
        aaeVar.E = fA;
        aae aaeVar2 = new aae();
        cv9Var.getDensity();
        float fQ0 = cv9Var.q0(ig8.c(gg8Var2)) * fA;
        aaeVar2.E = fQ0;
        if (fQ0 > 25.0f) {
            aaeVar.E = (25.0f / fQ0) * aaeVar.E;
            aaeVar2.E = 25.0f;
        }
        ja8 ja8Var = dgeVar.g;
        if (g79.b(ja8Var.u, 0L) || (fkgVar = dgeVar.e) == null || !fkgVar.c()) {
            dgeVar.f = false;
            ja8 ja8VarK = u00.k(cv9Var, gg8Var2, aaeVar.E, gg8Var2.c0, j);
            gg8Var = gg8Var2;
            if (ja8VarK != null) {
                ja8VarK.h(gg8Var.n0 != null);
                tp4 tp4Var = null;
                if (g79.b(ja8Var.u, 0L)) {
                    gb9.U(new bge(dgeVar, ja8VarK, aaeVar2, tp4Var, 0));
                    dgeVar = this;
                } else {
                    l45 l45VarD1 = gg8Var.d1();
                    ft5 ft5Var = g86.a;
                    dgeVar = this;
                    dgeVar.e = gb9.D(l45VarD1, tpa.a.J, null, new bge(dgeVar, ja8VarK, aaeVar2, tp4Var, 1), 2);
                }
            }
        } else {
            dgeVar.f = true;
            gg8Var = gg8Var2;
        }
        u00.T(gg8Var, new bz7() { // from class: age
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                ja8 ja8Var2 = (ja8) obj;
                ja8Var2.getClass();
                dge dgeVar2 = this.E;
                gg8 gg8Var3 = dgeVar2.a;
                ja8Var2.g(gg8Var3.j0);
                kw9 kw9Var = ig8.a;
                ja8Var2.h(gg8Var3.n0 != null);
                cv9 cv9Var2 = cv9Var;
                cv9Var2.t(csg.R(cv9Var2.E.g()), new nu1(j, aaeVar, dgeVar2, context, 2), ja8Var2);
                csg.t(cv9Var2, ja8Var2);
                return iei.a;
            }
        });
    }
}
