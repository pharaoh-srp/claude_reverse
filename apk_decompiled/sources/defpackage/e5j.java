package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e5j extends m08 implements zy7 {
    public static final e5j E = new e5j(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

    @Override // defpackage.zy7
    public final Object a() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
