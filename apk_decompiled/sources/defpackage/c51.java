package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c51 {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d = 0;

    public final d51 a() {
        if (this.a || !(this.b || this.c)) {
            return new d51(this);
        }
        sz6.j("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }
}
