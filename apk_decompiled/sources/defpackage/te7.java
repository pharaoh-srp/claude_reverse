package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class te7 extends c5h {
    public final /* synthetic */ hwe e;
    public final /* synthetic */ ue7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te7(String str, hwe hweVar, ue7 ue7Var) {
        super(str, true);
        this.e = hweVar;
        this.f = ue7Var;
    }

    @Override // defpackage.c5h
    public final long a() throws InterruptedException {
        gwe gweVar;
        hwe hweVar = this.e;
        try {
            gweVar = hweVar.d();
        } catch (Throwable th) {
            gweVar = new gwe(hweVar, th, 2);
        }
        ue7 ue7Var = this.f;
        if (!((CopyOnWriteArrayList) ue7Var.H).contains(hweVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) ue7Var.I).put(gweVar);
        return -1L;
    }
}
