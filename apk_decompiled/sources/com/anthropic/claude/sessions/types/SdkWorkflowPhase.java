package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.hdf;
import defpackage.idf;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkWorkflowPhase;", "Lcom/anthropic/claude/sessions/types/SdkWorkflowProgress;", "", "index", "", "title", "<init>", "(ILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkWorkflowPhase;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getIndex", "()I", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Companion", "hdf", "idf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkWorkflowPhase implements SdkWorkflowProgress {
    public static final idf Companion = new idf();
    private final int index;
    private final String title;

    public /* synthetic */ SdkWorkflowPhase(int i, int i2, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, hdf.a.getDescriptor());
            throw null;
        }
        this.index = i2;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkWorkflowPhase self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.getIndex(), serialDesc);
        if (!output.E(serialDesc) && x44.r(self.title, "")) {
            return;
        }
        output.q(serialDesc, 1, self.title);
    }

    @Override // com.anthropic.claude.sessions.types.SdkWorkflowProgress
    public int getIndex() {
        return this.index;
    }

    public final String getTitle() {
        return this.title;
    }

    public SdkWorkflowPhase(int i, String str) {
        str.getClass();
        this.index = i;
        this.title = str;
    }

    public /* synthetic */ SdkWorkflowPhase(int i, String str, int i2, mq5 mq5Var) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
