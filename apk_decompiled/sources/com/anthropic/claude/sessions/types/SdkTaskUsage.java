package com.anthropic.claude.sessions.types;

import defpackage.fcf;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkTaskUsage;", "", "", "total_tokens", "tool_uses", "", "duration_ms", "<init>", "(IIJ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkTaskUsage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getTotal_tokens", "()I", "getTool_uses", "J", "getDuration_ms", "()J", "Companion", "ecf", "fcf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkTaskUsage {
    public static final fcf Companion = new fcf();
    private final long duration_ms;
    private final int tool_uses;
    private final int total_tokens;

    public /* synthetic */ SdkTaskUsage(int i, int i2, int i3, long j, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.total_tokens = 0;
        } else {
            this.total_tokens = i2;
        }
        if ((i & 2) == 0) {
            this.tool_uses = 0;
        } else {
            this.tool_uses = i3;
        }
        if ((i & 4) == 0) {
            this.duration_ms = 0L;
        } else {
            this.duration_ms = j;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkTaskUsage self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.total_tokens != 0) {
            output.l(0, self.total_tokens, serialDesc);
        }
        if (output.E(serialDesc) || self.tool_uses != 0) {
            output.l(1, self.tool_uses, serialDesc);
        }
        if (!output.E(serialDesc) && self.duration_ms == 0) {
            return;
        }
        output.D(serialDesc, 2, self.duration_ms);
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final int getTool_uses() {
        return this.tool_uses;
    }

    public final int getTotal_tokens() {
        return this.total_tokens;
    }

    public SdkTaskUsage() {
        this(0, 0, 0L, 7, (mq5) null);
    }

    public SdkTaskUsage(int i, int i2, long j) {
        this.total_tokens = i;
        this.tool_uses = i2;
        this.duration_ms = j;
    }

    public /* synthetic */ SdkTaskUsage(int i, int i2, long j, int i3, mq5 mq5Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0L : j);
    }
}
