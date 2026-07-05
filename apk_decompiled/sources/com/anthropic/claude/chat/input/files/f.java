package com.anthropic.claude.chat.input.files;

import com.anthropic.claude.chat.input.files.FileUploadWorker;
import defpackage.bz7;
import defpackage.vp4;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends vp4 {
    public FileUploadWorker.Args E;
    public bz7 F;
    public File G;
    public /* synthetic */ Object H;
    public final /* synthetic */ i I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(null, null, null, this);
    }
}
