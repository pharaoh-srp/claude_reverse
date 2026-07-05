package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n6g implements ztc {
    public final ska a;
    public final String b;

    public n6g(ska skaVar, String str) {
        this.a = skaVar;
        this.b = str;
    }

    @Override // defpackage.ztc
    public final Object a(l25 l25Var, String str, int i) {
        if (i >= str.length()) {
            return Integer.valueOf(i);
        }
        final char cCharAt = str.charAt(i);
        ska skaVar = this.a;
        if (cCharAt == '-') {
            skaVar.invoke(l25Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt != '+') {
            return new usc(i, new zy7() { // from class: m6g
                @Override // defpackage.zy7
                public final Object a() {
                    return "Expected " + this.E.b + " but got " + cCharAt;
                }
            });
        }
        skaVar.invoke(l25Var, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.b;
    }
}
