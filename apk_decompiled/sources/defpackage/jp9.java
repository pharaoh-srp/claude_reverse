package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jp9 {
    public final beg a;
    public kp9 b;
    public ps7 c;

    public jp9(beg begVar) {
        this.a = begVar;
    }

    public final kp9 a() {
        kp9 kp9Var = this.b;
        if (kp9Var != null) {
            return kp9Var;
        }
        x44.o0("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        bz7 bz7Var;
        beg begVar;
        if (i == 7) {
            bz7Var = a().a;
        } else if (i == 2) {
            bz7Var = a().b;
        } else if (i == 6) {
            bz7Var = a().c;
        } else if (i == 5) {
            bz7Var = a().d;
        } else if (i == 3) {
            bz7Var = a().e;
        } else if (i == 4) {
            bz7Var = a().f;
        } else {
            if (i != 1 && i != 0) {
                sz6.j("invalid ImeAction");
                return false;
            }
            bz7Var = null;
        }
        if (bz7Var != null) {
            bz7Var.invoke(this);
            return true;
        }
        if (i == 6) {
            ps7 ps7Var = this.c;
            if (ps7Var != null) {
                ps7Var.a(1);
                return true;
            }
            x44.o0("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (begVar = this.a) == null) {
                return false;
            }
            ((fx5) begVar).a();
            return true;
        }
        ps7 ps7Var2 = this.c;
        if (ps7Var2 != null) {
            ps7Var2.a(2);
            return true;
        }
        x44.o0("focusManager");
        throw null;
    }
}
