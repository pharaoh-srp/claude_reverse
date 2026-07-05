package defpackage;

import com.google.android.gms.internal.measurement.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d1l {
    public long a;
    public b0 b;
    public String c;
    public HashMap d;

    public d1l a() {
        long j = this.a;
        b0 b0Var = this.b;
        String str = this.c;
        HashMap map = this.d;
        d1l d1lVar = new d1l();
        d1lVar.a = j;
        d1lVar.b = b0Var;
        d1lVar.c = str;
        d1lVar.d = map;
        return d1lVar;
    }

    public void b(long j) {
        this.a = j;
    }

    public void c(b0 b0Var) {
        this.b = b0Var;
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(HashMap map) {
        this.d = map;
    }

    public b0 f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public Map h() {
        return this.d;
    }
}
