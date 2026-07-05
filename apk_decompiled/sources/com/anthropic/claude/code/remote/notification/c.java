package com.anthropic.claude.code.remote.notification;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.anthropic.claude.code.remote.notification.CCRPermissionActionWorker;
import com.anthropic.claude.core.telemetry.SilentException;
import defpackage.dhj;
import defpackage.er9;
import defpackage.jce;
import defpackage.m7f;
import defpackage.ozf;
import defpackage.pf5;
import defpackage.ql3;
import defpackage.zaa;

/* JADX INFO: loaded from: classes.dex */
public final class c extends dhj {
    public final er9 a;

    public c(er9 er9Var) {
        er9Var.getClass();
        this.a = er9Var;
    }

    @Override // defpackage.dhj
    public final zaa a(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        if (!str.equals(CCRPermissionActionWorker.class.getName())) {
            return null;
        }
        b bVar = CCRPermissionActionWorker.Args.Companion;
        pf5 pf5VarA = workerParameters.a();
        pf5VarA.getClass();
        bVar.getClass();
        CCRPermissionActionWorker.Args argsA = b.a(pf5VarA);
        if (argsA != null) {
            return new CCRPermissionActionWorker(context, workerParameters, argsA, (ql3) ((m7f) this.a.c.I).a(jce.a.b(ql3.class), null, null));
        }
        SilentException.a(new SilentException("CCRPermissionActionWorker args failed to parse"), ozf.F, false, 2);
        return null;
    }
}
