package com.anthropic.claude.code.remote.notification;

import com.anthropic.claude.code.remote.notification.SessionReplyActionWorker;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.hre;
import defpackage.pf5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static SessionReplyActionWorker.Args a(pf5 pf5Var) {
        Object hreVar;
        String strC = pf5Var.c("args");
        if (strC == null) {
            return null;
        }
        try {
            ag9 ag9Var = bg9.d;
            ag9Var.getClass();
            hreVar = (SessionReplyActionWorker.Args) ag9Var.b(strC, SessionReplyActionWorker.Args.Companion.serializer());
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        return (SessionReplyActionWorker.Args) (hreVar instanceof hre ? null : hreVar);
    }

    public final KSerializer serializer() {
        return d.a;
    }
}
