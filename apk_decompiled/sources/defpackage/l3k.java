package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l3k extends PhantomReference {
    public final Set a;
    public final wmj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3k(un3 un3Var, ReferenceQueue referenceQueue, Set set) {
        super(un3Var, referenceQueue);
        wmj wmjVar = wmj.G;
        this.a = set;
        this.b = wmjVar;
    }
}
