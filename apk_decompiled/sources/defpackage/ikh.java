package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ikh extends a2a {
    public static boolean V(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // defpackage.c5c
    public String A() {
        return "#text";
    }

    @Override // defpackage.c5c
    public void E(gjk gjkVar, n96 n96Var) {
        yp6.c(gjkVar, O(), n96Var, 1);
    }

    @Override // defpackage.c5c
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public ikh clone() {
        return (ikh) super.clone();
    }

    @Override // defpackage.c5c
    public final String toString() {
        return D();
    }
}
