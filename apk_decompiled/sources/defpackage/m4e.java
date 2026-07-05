package defpackage;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class m4e implements i92 {
    public volatile boolean E;
    public final Object F;
    public final Object G;
    public Cloneable H;

    public m4e() {
        this.F = new efk(28);
        this.G = new LinkedHashMap();
        this.H = new LinkedHashSet();
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                vb7.C(autoCloseable);
            } catch (Exception e) {
                xh6.h(e);
            }
        }
    }

    public void a() {
        this.E = true;
        f4e f4eVar = (f4e) this.H;
        if (f4eVar != null) {
            f4eVar.cancel();
        }
    }

    @Override // defpackage.i92
    public void onFailure(v82 v82Var, IOException iOException) {
        ((gb9) this.G).G(this, iOException, null);
    }

    @Override // defpackage.i92
    public void onResponse(v82 v82Var, pqe pqeVar) {
        e4e e4eVar;
        try {
            if (!pqeVar.U) {
                ((gb9) this.G).G(this, null, pqeVar);
                pqeVar.close();
                return;
            }
            rqe rqeVar = pqeVar.K;
            p8b p8bVarE = rqeVar.e();
            if (p8bVarE != null && p8bVarE.b.equals("text") && p8bVarE.c.equals("event-stream")) {
                f4e f4eVar = (f4e) this.H;
                if (f4eVar != null && (e4eVar = f4eVar.J) != null) {
                    e4eVar.b();
                }
                pqe pqeVarL0 = x44.l0(pqeVar);
                xof xofVar = new xof(rqeVar.G0(), this);
                try {
                    if (!this.E) {
                        ((gb9) this.G).H(this, pqeVarL0);
                        while (!this.E && xofVar.a()) {
                        }
                    }
                    boolean z = this.E;
                    gb9 gb9Var = (gb9) this.G;
                    if (z) {
                        gb9Var.G(this, new IOException("canceled"), pqeVarL0);
                    } else {
                        gb9Var.E(this);
                    }
                    pqeVar.close();
                    return;
                } catch (Exception e) {
                    e = e;
                    if (this.E) {
                        e = new IOException("canceled", e);
                    }
                    ((gb9) this.G).G(this, e, pqeVarL0);
                    pqeVar.close();
                    return;
                }
            }
            ((gb9) this.G).G(this, new IllegalStateException("Invalid content-type: " + rqeVar.e()), pqeVar);
            pqeVar.close();
        } finally {
        }
    }

    public m4e(kie kieVar, gb9 gb9Var) {
        this.F = kieVar;
        this.G = gb9Var;
    }
}
