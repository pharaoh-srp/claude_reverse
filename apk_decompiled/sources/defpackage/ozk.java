package defpackage;

import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ozk {
    public static final ozk c = new ozk();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final uyk a = new uyk();

    public final b0l a(Class cls) {
        b0l b0lVarK;
        Charset charset = sxk.a;
        if (cls == null) {
            mr9.h("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        b0l b0lVar = (b0l) concurrentHashMap.get(cls);
        if (b0lVar != null) {
            return b0lVar;
        }
        uyk uykVar = this.a;
        uykVar.getClass();
        n0.class.isAssignableFrom(cls);
        zzk zzkVarF = uykVar.a.f(cls);
        if ((zzkVarF.d & 2) == 2) {
            b0lVarK = q0.i(zzkVarF.a);
        } else {
            b0lVarK = p0.k(zzkVarF, azk.a[sq6.F(zzkVarF.a())] != 1 ? pwk.a : null);
        }
        b0l b0lVar2 = (b0l) concurrentHashMap.putIfAbsent(cls, b0lVarK);
        return b0lVar2 != null ? b0lVar2 : b0lVarK;
    }
}
