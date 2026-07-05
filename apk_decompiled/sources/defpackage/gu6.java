package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class gu6 implements fab {
    public final String b;

    public gu6(int i, String... strArr) {
        String str;
        sq6.a(i);
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.fab
    public Set a() {
        return um6.E;
    }

    @Override // defpackage.fab
    public Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        return lm6.E;
    }

    @Override // defpackage.fab
    public Set c() {
        return um6.E;
    }

    @Override // defpackage.fab
    public xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return new ur6(sxb.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{sxbVar}, 1))));
    }

    @Override // defpackage.fab
    public Set f() {
        return um6.E;
    }

    @Override // defpackage.fab
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set g(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return sf5.f0(new lt6(nu6.c));
    }

    @Override // defpackage.fab
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set d(sxb sxbVar, int i) {
        sxbVar.getClass();
        sq6.a(i);
        return nu6.f;
    }

    public String toString() {
        return vb7.s(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
