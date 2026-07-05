package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class tyj implements zwk {
    public final /* synthetic */ j6k a;

    public tyj(j6k j6kVar) {
        this.a = j6kVar;
    }

    @Override // defpackage.zwk
    public final int b(String str) {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new hak(j6kVar, str, n4kVar));
        Integer num = (Integer) n4k.d(n4kVar.c(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.zwk
    public final void c(String str, String str2, Bundle bundle) {
        j6k j6kVar = this.a;
        j6kVar.c(new w6k(j6kVar, str, str2, bundle, 0));
    }

    @Override // defpackage.zwk
    public final void d(String str) {
        j6k j6kVar = this.a;
        j6kVar.c(new r8k(j6kVar, str, 0));
    }

    @Override // defpackage.zwk
    public final void e(String str) {
        j6k j6kVar = this.a;
        j6kVar.c(new r8k(j6kVar, str, 1));
    }

    @Override // defpackage.zwk
    public final void f(Bundle bundle) {
        j6k j6kVar = this.a;
        j6kVar.c(new p6k(j6kVar, bundle, 1));
    }

    @Override // defpackage.zwk
    public final String g() {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new b9k(j6kVar, n4kVar, 4));
        return n4kVar.D(500L);
    }

    @Override // defpackage.zwk
    public final String h() {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new b9k(j6kVar, n4kVar, 2));
        return n4kVar.D(50L);
    }

    @Override // defpackage.zwk
    public final Map i(String str, String str2, boolean z) {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new t9k(j6kVar, str, str2, z, n4kVar));
        Bundle bundleC = n4kVar.c(5000L);
        if (bundleC == null || bundleC.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleC.size());
        for (String str3 : bundleC.keySet()) {
            Object obj = bundleC.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // defpackage.zwk
    public final String j() {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new b9k(j6kVar, n4kVar, 0));
        return n4kVar.D(500L);
    }

    @Override // defpackage.zwk
    public final void k(String str, String str2, Bundle bundle) {
        j6k j6kVar = this.a;
        j6kVar.c(new sbk(j6kVar, str, str2, bundle, true));
    }

    @Override // defpackage.zwk
    public final String l() {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new b9k(j6kVar, n4kVar, 3));
        return n4kVar.D(500L);
    }

    @Override // defpackage.zwk
    public final List m(String str, String str2) {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new w6k(j6kVar, str, str2, n4kVar, 1));
        List list = (List) n4k.d(n4kVar.c(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.zwk
    public final long zza() {
        n4k n4kVar = new n4k();
        j6k j6kVar = this.a;
        j6kVar.c(new b9k(j6kVar, n4kVar, 1));
        Long l = (Long) n4k.d(n4kVar.c(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNanoTime = System.nanoTime();
        j6kVar.b.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i = j6kVar.e + 1;
        j6kVar.e = i;
        return jNextLong + ((long) i);
    }
}
