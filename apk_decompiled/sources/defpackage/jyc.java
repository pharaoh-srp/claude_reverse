package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class jyc extends l2 implements Map, mm9 {
    public static final jyc G = new jyc(x6i.e, 0);
    public final x6i E;
    public final int F;

    public jyc(x6i x6iVar, int i) {
        this.E = x6iVar;
        this.F = i;
    }

    @Override // defpackage.l2
    public final Set a() {
        return new xyc(this);
    }

    @Override // defpackage.l2
    public final Set c() {
        return new azc(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.E.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.l2
    public final int d() {
        return this.F;
    }

    @Override // defpackage.l2
    public final Collection e() {
        return new nva(1, this);
    }

    public nyc f() {
        return new nyc(this);
    }

    public /* bridge */ nyc g() {
        return f();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.E.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final jyc h(Object obj, s7a s7aVar) {
        g11 g11VarU = this.E.u(obj != null ? obj.hashCode() : 0, obj, s7aVar, 0);
        return g11VarU == null ? this : new jyc((x6i) g11VarU.G, this.F + g11VarU.F);
    }
}
