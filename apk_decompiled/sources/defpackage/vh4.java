package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vh4 implements lze, hxb {
    public final lze E;
    public final hxb F;
    public c45 G;
    public Throwable H;
    public final uh4 I;

    public vh4(lze lzeVar) {
        jxb jxbVar = new jxb();
        lzeVar.getClass();
        this.E = lzeVar;
        this.F = jxbVar;
        this.I = new uh4(this);
    }

    @Override // defpackage.lze
    public final tze L0(String str) {
        str.getClass();
        uh4 uh4Var = this.I;
        if (uh4Var == null) {
            return this.E.L0(str);
        }
        Object objC = uh4Var.c(str);
        objC.getClass();
        return new th4((tze) objC);
    }

    @Override // defpackage.hxb
    public final Object c(tp4 tp4Var) {
        return this.F.c(tp4Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        uh4 uh4Var = this.I;
        if (uh4Var != null) {
            uh4Var.h(-1);
        }
        this.E.close();
    }

    @Override // defpackage.hxb
    public final void d(Object obj) {
        this.F.d(null);
    }

    public final void e(StringBuilder sb) {
        int i;
        uh4 uh4Var = this.I;
        if (this.G == null && this.H == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            c45 c45Var = this.G;
            if (c45Var != null) {
                sb.append("\t\tCoroutine: " + c45Var);
                sb.append('\n');
            }
            Throwable th = this.H;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = w44.I0(bsg.N0(mwa.N(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (uh4Var != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (uh4Var.c) {
                i = uh4Var.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.lze
    public final boolean s0() {
        return this.E.s0();
    }

    public final String toString() {
        return this.E.toString();
    }
}
