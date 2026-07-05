package com.anthropic.claude.chat.queue;

import com.anthropic.claude.chat.queue.QueuedMessageWorker;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.hre;
import defpackage.pf5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static QueuedMessageWorker.Args a(pf5 pf5Var) {
        Object hreVar;
        String strC = pf5Var.c("args");
        if (strC == null) {
            return null;
        }
        try {
            ag9 ag9Var = bg9.d;
            ag9Var.getClass();
            hreVar = (QueuedMessageWorker.Args) ag9Var.b(strC, QueuedMessageWorker.Args.Companion.serializer());
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        return (QueuedMessageWorker.Args) (hreVar instanceof hre ? null : hreVar);
    }

    public final KSerializer serializer() {
        return a.a;
    }
}
