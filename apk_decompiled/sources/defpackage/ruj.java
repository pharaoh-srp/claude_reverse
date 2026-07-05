package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ruj {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final avj f;

    public ruj(umk umkVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        avj avjVar;
        dgj.s(str2);
        dgj.s(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            qgk qgkVar = umkVar.M;
            umk.d(qgkVar);
            qgkVar.M.c("Event created with reverse previous/current timestamps. appId", qgk.Q0(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            avjVar = new avj(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    qgk qgkVar2 = umkVar.M;
                    umk.d(qgkVar2);
                    qgkVar2.J.b("Param name can't be null");
                    it.remove();
                } else {
                    h1l h1lVar = umkVar.P;
                    umk.c(h1lVar);
                    Object objE1 = h1lVar.E1(next, bundle2.get(next));
                    if (objE1 == null) {
                        qgk qgkVar3 = umkVar.M;
                        umk.d(qgkVar3);
                        qgkVar3.M.c("Param value can't be null", umkVar.Q.f(next));
                        it.remove();
                    } else {
                        h1l h1lVar2 = umkVar.P;
                        umk.c(h1lVar2);
                        h1lVar2.e1(bundle2, next, objE1);
                    }
                }
            }
            avjVar = new avj(bundle2);
        }
        this.f = avjVar;
    }

    public final ruj a(umk umkVar, long j) {
        return new ruj(umkVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        return ij0.m(kgh.r("Event{appId='", this.a, "', name='", this.b, "', params="), String.valueOf(this.f), "}");
    }

    public ruj(umk umkVar, String str, String str2, String str3, long j, long j2, avj avjVar) {
        dgj.s(str2);
        dgj.s(str3);
        dgj.v(avjVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            qgk qgkVar = umkVar.M;
            umk.d(qgkVar);
            qgkVar.M.a(qgk.Q0(str2), qgk.Q0(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f = avjVar;
    }
}
