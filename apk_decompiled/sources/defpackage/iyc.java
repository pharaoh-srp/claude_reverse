package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class iyc extends l2 {
    public static final iyc G = new iyc(w6i.e, 0);
    public final w6i E;
    public final int F;

    public iyc(w6i w6iVar, int i) {
        w6iVar.getClass();
        this.E = w6iVar;
        this.F = i;
    }

    @Override // defpackage.l2
    public final Set a() {
        return new wyc(this, 0);
    }

    @Override // defpackage.l2
    public final Set c() {
        return new wyc(this, 1);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.E.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.l2
    public final int d() {
        return this.F;
    }

    @Override // defpackage.l2
    public final Collection e() {
        return new czc(this);
    }

    @Override // defpackage.l2, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.F != map.size()) {
            return false;
        }
        if (map instanceof dzc) {
            y6a.t(map);
            throw null;
        }
        if (map instanceof ezc) {
            y6a.t(map);
            throw null;
        }
        boolean z = map instanceof iyc;
        w6i w6iVar = this.E;
        return z ? w6iVar.g(((iyc) obj).E, bw9.b0) : map instanceof myc ? w6iVar.g(((myc) obj).g(), bw9.c0) : super.equals(obj);
    }

    public final iyc f(Object obj, r7a r7aVar) {
        g11 g11VarU = this.E.u(obj != null ? obj.hashCode() : 0, obj, r7aVar, 0);
        return g11VarU == null ? this : new iyc((w6i) g11VarU.G, this.F + g11VarU.F);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.E.h(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
