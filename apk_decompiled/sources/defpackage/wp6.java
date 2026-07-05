package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wp6 {
    public static final wp6 b = new wp6(new b6i((he7) null, (s9g) null, (dh2) null, (l6f) null, (LinkedHashMap) null, 127));
    public final b6i a;

    public wp6(b6i b6iVar) {
        this.a = b6iVar;
    }

    public final wp6 a(wp6 wp6Var) {
        he7 he7Var = wp6Var.a.a;
        if (he7Var == null) {
            he7Var = this.a.a;
        }
        b6i b6iVar = wp6Var.a;
        s9g s9gVar = b6iVar.b;
        if (s9gVar == null) {
            s9gVar = this.a.b;
        }
        dh2 dh2Var = b6iVar.c;
        if (dh2Var == null) {
            dh2Var = this.a.c;
        }
        l6f l6fVar = b6iVar.d;
        if (l6fVar == null) {
            l6fVar = this.a.d;
        }
        return new wp6(new b6i(he7Var, s9gVar, dh2Var, l6fVar, sta.l0(this.a.f, b6iVar.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wp6) && ((wp6) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        b6i b6iVar = this.a;
        he7 he7Var = b6iVar.a;
        sb.append(he7Var != null ? he7Var.toString() : null);
        sb.append(",\nSlide - ");
        s9g s9gVar = b6iVar.b;
        sb.append(s9gVar != null ? s9gVar.toString() : null);
        sb.append(",\nShrink - ");
        dh2 dh2Var = b6iVar.c;
        sb.append(dh2Var != null ? dh2Var.toString() : null);
        sb.append(",\nScale - ");
        l6f l6fVar = b6iVar.d;
        sb.append(l6fVar != null ? l6fVar.toString() : null);
        return sb.toString();
    }
}
