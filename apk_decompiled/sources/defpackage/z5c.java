package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z5c implements Iterable {
    public final /* synthetic */ int E = 0;
    public final Object F;
    public final Object G;

    public z5c(b5c b5cVar, b5c b5cVar2) {
        this.F = b5cVar;
        this.G = b5cVar2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.E;
        Object obj = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new a6c((b5c) obj, (b5c) obj2);
            default:
                m11 m11Var = (m11) obj2;
                return new sig((xzd) m11Var.G, m11Var, (String) obj);
        }
    }

    public String toString() {
        switch (this.E) {
            case 1:
                wg wgVar = new wg(", ", 12);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                wgVar.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public z5c(m11 m11Var, String str) {
        this.F = str;
        this.G = m11Var;
    }
}
