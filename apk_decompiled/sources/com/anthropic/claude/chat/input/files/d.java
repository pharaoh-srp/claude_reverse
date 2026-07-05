package com.anthropic.claude.chat.input.files;

import com.anthropic.claude.chat.input.files.FileUploadWorker;
import defpackage.bgj;
import defpackage.c77;
import defpackage.jc1;
import defpackage.s31;
import defpackage.tgc;
import defpackage.tgj;
import defpackage.xkc;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static UUID a(bgj bgjVar, FileUploadWorker.Args args) {
        args.getClass();
        s31 s31Var = new s31(FileUploadWorker.class);
        tgj tgjVar = (tgj) s31Var.H;
        tgjVar.q = true;
        tgjVar.r = xkc.E;
        s31Var.k(args.toWorkData());
        s31Var.f(jc1.F, 10000L, TimeUnit.MILLISECONDS);
        LinkedHashSet linkedHashSet = (LinkedHashSet) s31Var.I;
        linkedHashSet.add("file_upload");
        String strM678getAccountIdislZJdo = args.m678getAccountIdislZJdo();
        strM678getAccountIdislZJdo.getClass();
        linkedHashSet.add("account:".concat(strM678getAccountIdislZJdo));
        tgc tgcVarB = s31Var.b();
        String uploadId = args.getUploadId();
        uploadId.getClass();
        bgjVar.c("file_upload_".concat(uploadId), c77.E, tgcVarB);
        return tgcVarB.a;
    }
}
