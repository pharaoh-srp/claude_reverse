package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m48 extends v38 {
    public final String d;

    public m48(String str) {
        super(qpk.g(str), qpk.g(str), um6.E);
        this.d = str;
        if (str.length() > 0) {
            return;
        }
        sz6.p("serverClientId should not be empty");
        throw null;
    }
}
