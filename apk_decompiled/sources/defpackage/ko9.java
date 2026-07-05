package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ko9 implements eo9 {
    public final eo9 E;

    public ko9(eo9 eo9Var) {
        eo9Var.getClass();
        this.E = eo9Var;
    }

    @Override // defpackage.eo9
    public final boolean e() {
        return this.E.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ko9 ko9Var = obj instanceof ko9 ? (ko9) obj : null;
        eo9 eo9Var = ko9Var != null ? ko9Var.E : null;
        eo9 eo9Var2 = this.E;
        if (!x44.r(eo9Var2, eo9Var)) {
            return false;
        }
        cm9 cm9VarH = eo9Var2.h();
        if (cm9VarH instanceof pl9) {
            eo9 eo9Var3 = obj instanceof eo9 ? (eo9) obj : null;
            cm9 cm9VarH2 = eo9Var3 != null ? eo9Var3.h() : null;
            if (cm9VarH2 != null && (cm9VarH2 instanceof pl9)) {
                return ez1.I((pl9) cm9VarH).equals(ez1.I((pl9) cm9VarH2));
            }
        }
        return false;
    }

    @Override // defpackage.eo9
    public final List g() {
        return this.E.g();
    }

    @Override // defpackage.eo9
    public final cm9 h() {
        return this.E.h();
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.E;
    }
}
