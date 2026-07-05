package com.anthropic.claude.chat.queue;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.anthropic.claude.chat.queue.QueuedMessageWorker;
import com.anthropic.claude.core.telemetry.SilentException;
import defpackage.dhj;
import defpackage.er9;
import defpackage.jce;
import defpackage.kce;
import defpackage.m7f;
import defpackage.mn5;
import defpackage.ozf;
import defpackage.pf5;
import defpackage.ql3;
import defpackage.zaa;

/* JADX INFO: loaded from: classes.dex */
public final class e extends dhj {
    public final er9 a;

    public e(er9 er9Var) {
        er9Var.getClass();
        this.a = er9Var;
    }

    @Override // defpackage.dhj
    public final zaa a(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        if (!str.equals(QueuedMessageWorker.class.getName())) {
            return null;
        }
        b bVar = QueuedMessageWorker.Args.Companion;
        pf5 pf5VarA = workerParameters.a();
        pf5VarA.getClass();
        bVar.getClass();
        QueuedMessageWorker.Args argsA = b.a(pf5VarA);
        if (argsA == null) {
            SilentException.a(new SilentException("QueuedMessageWorker args failed to parse"), ozf.F, false, 2);
            return null;
        }
        er9 er9Var = this.a;
        m7f m7fVar = (m7f) er9Var.c.I;
        kce kceVar = jce.a;
        return new QueuedMessageWorker(context, workerParameters, argsA, (ql3) m7fVar.a(kceVar.b(ql3.class), null, null), (mn5) ((m7f) er9Var.c.I).a(kceVar.b(mn5.class), null, null));
    }
}
