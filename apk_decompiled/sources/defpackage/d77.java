package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d77 {
    public static final d77 b = new d77(new b6i((he7) null, (s9g) null, (dh2) null, (l6f) null, (LinkedHashMap) null, 127));
    public static final d77 c = new d77(new b6i((he7) null, (s9g) null, (dh2) null, (l6f) null, (LinkedHashMap) null, 95));
    public final b6i a;

    public d77(b6i b6iVar) {
        this.a = b6iVar;
    }

    public final d77 a(d77 d77Var) {
        he7 he7Var = d77Var.a.a;
        if (he7Var == null) {
            he7Var = this.a.a;
        }
        b6i b6iVar = d77Var.a;
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
        boolean z = b6iVar.e;
        b6i b6iVar2 = this.a;
        return new d77(new b6i(he7Var, s9gVar, dh2Var, l6fVar, z || b6iVar2.e, sta.l0(b6iVar2.f, b6iVar.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d77) && ((d77) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b6iVar.e);
        return sb.toString();
    }
}
