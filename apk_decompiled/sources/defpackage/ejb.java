package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ejb implements zpf {
    public final String a;
    public final String b;
    public final String c;
    public final oq6 d;

    public ejb(String str, String str2, String str3, String str4, oq6 oq6Var) {
        grc.B(str, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = oq6Var;
    }

    @Override // defpackage.zpf
    public final String a() {
        return this.b;
    }

    @Override // defpackage.zpf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.zpf
    public final String getType() {
        return "env_log";
    }
}
