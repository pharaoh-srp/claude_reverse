package com.anthropic.claude.models.organization.configtypes;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yqh;
import defpackage.zqh;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;", "", "", "tool_description", "duration_seconds", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "getDuration_seconds", "getMessage", "Companion", "yqh", "zqh", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TimerCreateInputDescriptions {
    public static final int $stable = 0;
    public static final zqh Companion = new zqh();
    private final String duration_seconds;
    private final String message;
    private final String tool_description;

    public /* synthetic */ TimerCreateInputDescriptions(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, yqh.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.duration_seconds = str2;
        this.message = str3;
    }

    public static /* synthetic */ TimerCreateInputDescriptions copy$default(TimerCreateInputDescriptions timerCreateInputDescriptions, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timerCreateInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            str2 = timerCreateInputDescriptions.duration_seconds;
        }
        if ((i & 4) != 0) {
            str3 = timerCreateInputDescriptions.message;
        }
        return timerCreateInputDescriptions.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$models(TimerCreateInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.q(serialDesc, 1, self.duration_seconds);
        output.q(serialDesc, 2, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuration_seconds() {
        return this.duration_seconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final TimerCreateInputDescriptions copy(String tool_description, String duration_seconds, String message) {
        tool_description.getClass();
        duration_seconds.getClass();
        message.getClass();
        return new TimerCreateInputDescriptions(tool_description, duration_seconds, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerCreateInputDescriptions)) {
            return false;
        }
        TimerCreateInputDescriptions timerCreateInputDescriptions = (TimerCreateInputDescriptions) other;
        return x44.r(this.tool_description, timerCreateInputDescriptions.tool_description) && x44.r(this.duration_seconds, timerCreateInputDescriptions.duration_seconds) && x44.r(this.message, timerCreateInputDescriptions.message);
    }

    public final String getDuration_seconds() {
        return this.duration_seconds;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.message.hashCode() + kgh.l(this.tool_description.hashCode() * 31, 31, this.duration_seconds);
    }

    public String toString() {
        String str = this.tool_description;
        String str2 = this.duration_seconds;
        return ij0.m(kgh.r("TimerCreateInputDescriptions(tool_description=", str, ", duration_seconds=", str2, ", message="), this.message, ")");
    }

    public TimerCreateInputDescriptions(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.tool_description = str;
        this.duration_seconds = str2;
        this.message = str3;
    }
}
