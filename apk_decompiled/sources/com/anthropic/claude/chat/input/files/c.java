package com.anthropic.claude.chat.input.files;

import com.anthropic.claude.chat.input.files.FileUploadWorker;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.hre;
import defpackage.pf5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static FileUploadWorker.Args a(pf5 pf5Var) {
        Object hreVar;
        String strC = pf5Var.c("args");
        if (strC == null) {
            return null;
        }
        c cVar = FileUploadWorker.Args.Companion;
        try {
            ag9 ag9Var = bg9.d;
            ag9Var.getClass();
            hreVar = (FileUploadWorker.Args) ag9Var.b(strC, FileUploadWorker.Args.Companion.serializer());
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        return (FileUploadWorker.Args) (hreVar instanceof hre ? null : hreVar);
    }

    public final KSerializer serializer() {
        return b.a;
    }
}
