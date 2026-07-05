package com.anthropic.claude.chat.queue;

import com.anthropic.claude.chat.input.draft.QueuedSendRequest;
import com.anthropic.claude.chat.queue.QueuedMessageWorker;
import defpackage.bgj;
import defpackage.fb6;
import defpackage.vp4;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends vp4 {
    public QueuedMessageWorker.Args E;
    public QueuedSendRequest F;
    public fb6 G;
    public String H;
    public bgj I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ d L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.c(null, null, null, null, 0, this);
    }
}
