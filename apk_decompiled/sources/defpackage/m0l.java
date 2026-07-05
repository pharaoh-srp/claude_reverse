package defpackage;

import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class m0l {
    public c0 a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ o0l e;

    public m0l(o0l o0lVar) {
        this.e = o0lVar;
    }

    public final void a(c0 c0Var) {
        this.a = c0Var;
    }

    public final boolean b(long j, x xVar) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.isEmpty() || ((((x) this.c.get(0)).B() / 1000) / 60) / 60 == ((xVar.B() / 1000) / 60) / 60) {
            long jA = this.d + ((long) xVar.a(null));
            o0l o0lVar = this.e;
            o0lVar.N();
            if (jA < Math.max(0, ((Integer) zvj.j.a(null)).intValue())) {
                this.d = jA;
                this.c.add(xVar);
                this.b.add(Long.valueOf(j));
                int size = this.c.size();
                o0lVar.N();
                if (size < Math.max(1, ((Integer) zvj.k.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }
}
