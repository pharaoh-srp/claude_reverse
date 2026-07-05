package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ih4 {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public ih4(jh4 jh4Var) {
        jh4Var.getClass();
        this.a = jh4Var.a;
        this.b = jh4Var.c;
        this.c = jh4Var.d;
        this.d = jh4Var.b;
    }

    public final jh4 a() {
        return new jh4(this.a, this.d, this.b, this.c);
    }

    public final void b(zf3... zf3VarArr) {
        boolean z = this.a;
        if (!z) {
            sz6.p("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(zf3VarArr.length);
        for (zf3 zf3Var : zf3VarArr) {
            arrayList.add(zf3Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            sz6.p("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.b = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            sz6.p("At least one cipher suite is required");
        }
    }

    public final void c(nrh... nrhVarArr) {
        boolean z = this.a;
        if (!z) {
            sz6.p("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(nrhVarArr.length);
        for (nrh nrhVar : nrhVarArr) {
            arrayList.add(nrhVar.E);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            sz6.p("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            sz6.p("At least one TLS version is required");
        }
    }

    public ih4() {
        this.a = true;
    }
}
