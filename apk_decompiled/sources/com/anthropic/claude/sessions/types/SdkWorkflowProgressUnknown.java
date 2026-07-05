package com.anthropic.claude.sessions.types;

import defpackage.mdf;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkWorkflowProgressUnknown;", "Lcom/anthropic/claude/sessions/types/SdkWorkflowProgress;", "", "index", "<init>", "(I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkWorkflowProgressUnknown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getIndex", "()I", "Companion", "ldf", "mdf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkWorkflowProgressUnknown implements SdkWorkflowProgress {
    public static final mdf Companion = new mdf();
    private final int index;

    public /* synthetic */ SdkWorkflowProgressUnknown(int i, int i2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.index = -1;
        } else {
            this.index = i2;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkWorkflowProgressUnknown self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.getIndex() == -1) {
            return;
        }
        output.l(0, self.getIndex(), serialDesc);
    }

    @Override // com.anthropic.claude.sessions.types.SdkWorkflowProgress
    public int getIndex() {
        return this.index;
    }

    public SdkWorkflowProgressUnknown(int i) {
        this.index = i;
    }

    public SdkWorkflowProgressUnknown() {
        this(0, 1, (mq5) null);
    }

    public /* synthetic */ SdkWorkflowProgressUnknown(int i, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
