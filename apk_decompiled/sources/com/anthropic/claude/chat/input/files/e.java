package com.anthropic.claude.chat.input.files;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.anthropic.claude.chat.input.files.FileUploadWorker;
import com.anthropic.claude.core.telemetry.SilentException;
import defpackage.bg9;
import defpackage.dhj;
import defpackage.dpf;
import defpackage.er9;
import defpackage.f1c;
import defpackage.jce;
import defpackage.kce;
import defpackage.m7f;
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
        if (!str.equals(FileUploadWorker.class.getName())) {
            return null;
        }
        c cVar = FileUploadWorker.Args.Companion;
        pf5 pf5VarA = workerParameters.a();
        pf5VarA.getClass();
        cVar.getClass();
        FileUploadWorker.Args argsA = c.a(pf5VarA);
        if (argsA == null) {
            SilentException.a(new SilentException("FileUploadWorker args failed to parse"), ozf.F, false, 2);
            return null;
        }
        er9 er9Var = this.a;
        dpf dpfVar = er9Var.c;
        dpf dpfVar2 = er9Var.c;
        m7f m7fVar = (m7f) dpfVar.I;
        kce kceVar = jce.a;
        return new FileUploadWorker(context, workerParameters, argsA, (ql3) m7fVar.a(kceVar.b(ql3.class), null, null), (bg9) ((m7f) dpfVar2.I).a(kceVar.b(bg9.class), null, null), (f1c) ((m7f) dpfVar2.I).a(kceVar.b(f1c.class), null, null));
    }
}
