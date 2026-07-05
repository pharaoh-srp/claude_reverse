package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l0l {
    public final String a;
    public final HashMap b;
    public final int c;

    public l0l(String str, HashMap map) {
        this.a = str;
        this.b = map;
        this.c = 3;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        HashMap map = this.b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public l0l(String str, int i) {
        this.a = str;
        this.c = i;
    }
}
