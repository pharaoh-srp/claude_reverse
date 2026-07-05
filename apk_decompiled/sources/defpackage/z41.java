package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z41 {
    public boolean a;
    public boolean b;
    public boolean c;

    public a51 a() {
        if (this.a || !(this.b || this.c)) {
            return new a51(this);
        }
        sz6.j("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
