package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pce {
    public static final g06 a = g06.c;

    public static void a(e92 e92Var, StringBuilder sb) {
        l6e l6eVarG = vpi.g(e92Var);
        l6e l6eVarS = e92Var.S();
        g06 g06Var = a;
        if (l6eVarG != null) {
            sb.append(g06Var.Z(((mw9) l6eVarG).getType()));
            sb.append(".");
        }
        boolean z = (l6eVarG == null || l6eVarS == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (l6eVarS != null) {
            sb.append(g06Var.Z(((mw9) l6eVarS).getType()));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(h08 h08Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(h08Var, sb);
        sxb name = ((co5) h08Var).getName();
        name.getClass();
        g06 g06Var = a;
        sb.append(g06Var.P(name, true));
        List listI = h08Var.I();
        listI.getClass();
        w44.R0(listI, sb, ", ", "(", ")", p9d.P, 48);
        sb.append(": ");
        yr9 returnType = h08Var.getReturnType();
        returnType.getClass();
        sb.append(g06Var.Z(returnType));
        return sb.toString();
    }

    public static String c(h08 h08Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        a(h08Var, sb);
        List listI = h08Var.I();
        listI.getClass();
        w44.R0(listI, sb, ", ", "(", ")", p9d.Q, 48);
        sb.append(" -> ");
        yr9 returnType = h08Var.getReturnType();
        returnType.getClass();
        sb.append(a.Z(returnType));
        return sb.toString();
    }

    public static String d(hrd hrdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(hrdVar.R() ? "var " : "val ");
        a(hrdVar, sb);
        sxb name = hrdVar.getName();
        name.getClass();
        g06 g06Var = a;
        sb.append(g06Var.P(name, true));
        sb.append(": ");
        yr9 type = hrdVar.getType();
        type.getClass();
        sb.append(g06Var.Z(type));
        return sb.toString();
    }

    public static String e(yr9 yr9Var) {
        yr9Var.getClass();
        return a.Z(yr9Var);
    }
}
