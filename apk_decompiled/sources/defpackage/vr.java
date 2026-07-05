package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vr {
    public final tr a;
    public final String b;
    public final nr c;
    public final String d;

    public vr(tr trVar, String str, nr nrVar, String str2) {
        this.a = trVar;
        this.b = str;
        this.c = nrVar;
        this.d = str2;
    }

    public final String a() {
        String str = this.c.E;
        String str2 = this.d;
        String str3 = this.b;
        if (str2 == null) {
            return str3 + '_' + str;
        }
        return str3 + '_' + str2 + '_' + str;
    }
}
