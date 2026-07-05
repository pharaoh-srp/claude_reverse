package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf0 {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public cf0(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        return nv1.d(af0.a, this.b);
    }
}
