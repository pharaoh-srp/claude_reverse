package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dkf {
    public final String a;
    public final pz7 b;
    public final boolean c;

    public dkf(String str, pz7 pz7Var) {
        this.a = str;
        this.b = pz7Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ dkf(String str) {
        this(str, z80.j0);
    }

    public dkf(String str, int i) {
        this(str);
        this.c = true;
    }

    public dkf(String str, boolean z, pz7 pz7Var) {
        this(str, pz7Var);
        this.c = z;
    }
}
