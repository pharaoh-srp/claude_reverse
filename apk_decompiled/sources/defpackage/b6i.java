package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b6i {
    public final he7 a;
    public final s9g b;
    public final dh2 c;
    public final l6f d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ b6i(he7 he7Var, s9g s9gVar, dh2 dh2Var, l6f l6fVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : he7Var, (i & 2) != 0 ? null : s9gVar, (i & 4) != 0 ? null : dh2Var, (i & 8) != 0 ? null : l6fVar, (i & 32) == 0, (i & 64) != 0 ? nm6.E : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6i)) {
            return false;
        }
        b6i b6iVar = (b6i) obj;
        return x44.r(this.a, b6iVar.a) && x44.r(this.b, b6iVar.b) && x44.r(this.c, b6iVar.c) && x44.r(this.d, b6iVar.d) && this.e == b6iVar.e && x44.r(this.f, b6iVar.f);
    }

    public final int hashCode() {
        he7 he7Var = this.a;
        int iHashCode = (he7Var == null ? 0 : he7Var.hashCode()) * 31;
        s9g s9gVar = this.b;
        int iHashCode2 = (iHashCode + (s9gVar == null ? 0 : s9gVar.hashCode())) * 31;
        dh2 dh2Var = this.c;
        int iHashCode3 = (iHashCode2 + (dh2Var == null ? 0 : dh2Var.hashCode())) * 31;
        l6f l6fVar = this.d;
        return this.f.hashCode() + fsh.p((iHashCode3 + (l6fVar != null ? l6fVar.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public b6i(he7 he7Var, s9g s9gVar, dh2 dh2Var, l6f l6fVar, boolean z, Map map) {
        this.a = he7Var;
        this.b = s9gVar;
        this.c = dh2Var;
        this.d = l6fVar;
        this.e = z;
        this.f = map;
    }
}
