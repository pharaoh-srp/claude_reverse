package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Printer;

/* JADX INFO: loaded from: classes.dex */
public final class vpa implements Printer, m4i {
    public long F;
    public k99 H;
    public final long E = 100000000;
    public String G = "";

    @Override // defpackage.m4i
    public final void a(Context context) {
        upa upaVar = upa.E;
        upa.a().remove(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vpa.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(100L);
    }

    @Override // defpackage.m4i
    public final void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
        this.H = k99Var;
        upa upaVar = upa.E;
        if (upa.b().compareAndSet(false, true)) {
            Looper.getMainLooper().setMessageLogging(upaVar);
        }
        upa.a().add(this);
    }

    @Override // android.util.Printer
    public final void println(String str) {
        k99 k99Var;
        if (str != null) {
            k99 k99Var2 = this.H;
            if (k99Var2 == null) {
                x44.o0("sdkCore");
                throw null;
            }
            k99Var2.y().getClass();
            long jNanoTime = System.nanoTime();
            if (isg.q0(str, ">>>>> Dispatching to ", false)) {
                this.G = str.substring(21);
                this.F = jNanoTime;
                return;
            }
            if (isg.q0(str, "<<<<< Finished to ", false)) {
                long j = jNanoTime - this.F;
                if (j <= this.E || (k99Var = this.H) == null) {
                    return;
                }
                cye cyeVarA = t78.a(k99Var);
                hf hfVar = cyeVarA instanceof hf ? (hf) cyeVarA : null;
                if (hfVar != null) {
                    hfVar.e(j, this.G);
                }
            }
        }
    }

    public final String toString() {
        return "MainLooperLongTaskStrategy(100)";
    }
}
