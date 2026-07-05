package com.anthropic.claude.code.remote.notification;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.anthropic.claude.code.remote.notification.SessionReplyActionWorker;
import com.anthropic.claude.core.telemetry.SilentException;
import defpackage.dhj;
import defpackage.er9;
import defpackage.jce;
import defpackage.kce;
import defpackage.m7f;
import defpackage.ozf;
import defpackage.pf5;
import defpackage.qi3;
import defpackage.ql3;
import defpackage.zaa;

/* JADX INFO: loaded from: classes.dex */
public final class f extends dhj {
    public final er9 a;

    public f(er9 er9Var) {
        er9Var.getClass();
        this.a = er9Var;
    }

    @Override // defpackage.dhj
    public final zaa a(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        if (!str.equals(SessionReplyActionWorker.class.getName())) {
            return null;
        }
        e eVar = SessionReplyActionWorker.Args.Companion;
        pf5 pf5VarA = workerParameters.a();
        pf5VarA.getClass();
        eVar.getClass();
        SessionReplyActionWorker.Args argsA = e.a(pf5VarA);
        if (argsA == null) {
            SilentException.a(new SilentException("SessionReplyActionWorker args failed to parse"), ozf.F, false, 2);
            return null;
        }
        er9 er9Var = this.a;
        m7f m7fVar = (m7f) er9Var.c.I;
        kce kceVar = jce.a;
        return new SessionReplyActionWorker(context, workerParameters, argsA, (ql3) m7fVar.a(kceVar.b(ql3.class), null, null), (qi3) ((m7f) er9Var.c.I).a(kceVar.b(qi3.class), null, null));
    }
}
