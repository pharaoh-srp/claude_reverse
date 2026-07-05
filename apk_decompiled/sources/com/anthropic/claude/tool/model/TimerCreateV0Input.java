package com.anthropic.claude.tool.model;

import defpackage.arh;
import defpackage.brh;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/anthropic/claude/tool/model/TimerCreateV0Input;", "", "", "duration_seconds", "", "message", "<init>", "(ILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/TimerCreateV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/anthropic/claude/tool/model/TimerCreateV0Input;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDuration_seconds", "Ljava/lang/String;", "getMessage", "Companion", "arh", "brh", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TimerCreateV0Input {
    public static final brh Companion = new brh();
    private final int duration_seconds;
    private final String message;

    public /* synthetic */ TimerCreateV0Input(int i, int i2, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, arh.a.getDescriptor());
            throw null;
        }
        this.duration_seconds = i2;
        this.message = str;
    }

    public static /* synthetic */ TimerCreateV0Input copy$default(TimerCreateV0Input timerCreateV0Input, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = timerCreateV0Input.duration_seconds;
        }
        if ((i2 & 2) != 0) {
            str = timerCreateV0Input.message;
        }
        return timerCreateV0Input.copy(i, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(TimerCreateV0Input self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.duration_seconds, serialDesc);
        output.q(serialDesc, 1, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration_seconds() {
        return this.duration_seconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final TimerCreateV0Input copy(int duration_seconds, String message) {
        message.getClass();
        return new TimerCreateV0Input(duration_seconds, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerCreateV0Input)) {
            return false;
        }
        TimerCreateV0Input timerCreateV0Input = (TimerCreateV0Input) other;
        return this.duration_seconds == timerCreateV0Input.duration_seconds && x44.r(this.message, timerCreateV0Input.message);
    }

    public final int getDuration_seconds() {
        return this.duration_seconds;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.duration_seconds) * 31);
    }

    public String toString() {
        return "TimerCreateV0Input(duration_seconds=" + this.duration_seconds + ", message=" + this.message + ")";
    }

    public TimerCreateV0Input(int i, String str) {
        str.getClass();
        this.duration_seconds = i;
        this.message = str;
    }
}
