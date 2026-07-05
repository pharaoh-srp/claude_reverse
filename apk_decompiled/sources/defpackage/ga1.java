package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ga1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ga1.class, "notCompletedCount$volatile");
    public final yv5[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public ga1(yv5[] yv5VarArr) {
        this.a = yv5VarArr;
        this.notCompletedCount$volatile = yv5VarArr.length;
    }
}
