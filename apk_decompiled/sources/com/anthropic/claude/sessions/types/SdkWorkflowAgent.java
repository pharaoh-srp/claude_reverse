package com.anthropic.claude.sessions.types;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.fdf;
import defpackage.gdf;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0001\u0018\u0000 22\u00020\u0001:\u000234B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b.\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b0\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b1\u0010$¨\u00065"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkWorkflowAgent;", "Lcom/anthropic/claude/sessions/types/SdkWorkflowProgress;", "", "index", "", "label", "state", "phaseIndex", "phaseTitle", "tokens", "", "durationMs", "error", "startedAt", "lastProgressAt", "lastToolName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkWorkflowAgent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getIndex", "()I", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getState", "Ljava/lang/Integer;", "getPhaseIndex", "()Ljava/lang/Integer;", "getPhaseTitle", "getTokens", "Ljava/lang/Long;", "getDurationMs", "()Ljava/lang/Long;", "getError", "getStartedAt", "getLastProgressAt", "getLastToolName", "Companion", "fdf", "gdf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkWorkflowAgent implements SdkWorkflowProgress {
    public static final gdf Companion = new gdf();
    private final Long durationMs;
    private final String error;
    private final int index;
    private final String label;
    private final Long lastProgressAt;
    private final String lastToolName;
    private final Integer phaseIndex;
    private final String phaseTitle;
    private final Long startedAt;
    private final String state;
    private final Integer tokens;

    public /* synthetic */ SdkWorkflowAgent(int i, int i2, String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, fdf.a.getDescriptor());
            throw null;
        }
        this.index = i2;
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 4) == 0) {
            this.state = "start";
        } else {
            this.state = str2;
        }
        if ((i & 8) == 0) {
            this.phaseIndex = null;
        } else {
            this.phaseIndex = num;
        }
        if ((i & 16) == 0) {
            this.phaseTitle = null;
        } else {
            this.phaseTitle = str3;
        }
        if ((i & 32) == 0) {
            this.tokens = null;
        } else {
            this.tokens = num2;
        }
        if ((i & 64) == 0) {
            this.durationMs = null;
        } else {
            this.durationMs = l;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.error = null;
        } else {
            this.error = str4;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.startedAt = null;
        } else {
            this.startedAt = l2;
        }
        if ((i & 512) == 0) {
            this.lastProgressAt = null;
        } else {
            this.lastProgressAt = l3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.lastToolName = null;
        } else {
            this.lastToolName = str5;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkWorkflowAgent self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.getIndex(), serialDesc);
        if (output.E(serialDesc) || !x44.r(self.label, "")) {
            output.q(serialDesc, 1, self.label);
        }
        if (output.E(serialDesc) || !x44.r(self.state, "start")) {
            output.q(serialDesc, 2, self.state);
        }
        if (output.E(serialDesc) || self.phaseIndex != null) {
            output.B(serialDesc, 3, e79.a, self.phaseIndex);
        }
        if (output.E(serialDesc) || self.phaseTitle != null) {
            output.B(serialDesc, 4, srg.a, self.phaseTitle);
        }
        if (output.E(serialDesc) || self.tokens != null) {
            output.B(serialDesc, 5, e79.a, self.tokens);
        }
        if (output.E(serialDesc) || self.durationMs != null) {
            output.B(serialDesc, 6, xka.a, self.durationMs);
        }
        if (output.E(serialDesc) || self.error != null) {
            output.B(serialDesc, 7, srg.a, self.error);
        }
        if (output.E(serialDesc) || self.startedAt != null) {
            output.B(serialDesc, 8, xka.a, self.startedAt);
        }
        if (output.E(serialDesc) || self.lastProgressAt != null) {
            output.B(serialDesc, 9, xka.a, self.lastProgressAt);
        }
        if (!output.E(serialDesc) && self.lastToolName == null) {
            return;
        }
        output.B(serialDesc, 10, srg.a, self.lastToolName);
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final String getError() {
        return this.error;
    }

    @Override // com.anthropic.claude.sessions.types.SdkWorkflowProgress
    public int getIndex() {
        return this.index;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Long getLastProgressAt() {
        return this.lastProgressAt;
    }

    public final String getLastToolName() {
        return this.lastToolName;
    }

    public final Integer getPhaseIndex() {
        return this.phaseIndex;
    }

    public final String getPhaseTitle() {
        return this.phaseTitle;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final String getState() {
        return this.state;
    }

    public final Integer getTokens() {
        return this.tokens;
    }

    public SdkWorkflowAgent(int i, String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5) {
        str.getClass();
        str2.getClass();
        this.index = i;
        this.label = str;
        this.state = str2;
        this.phaseIndex = num;
        this.phaseTitle = str3;
        this.tokens = num2;
        this.durationMs = l;
        this.error = str4;
        this.startedAt = l2;
        this.lastProgressAt = l3;
        this.lastToolName = str5;
    }

    public /* synthetic */ SdkWorkflowAgent(int i, String str, String str2, Integer num, String str3, Integer num2, Long l, String str4, Long l2, Long l3, String str5, int i2, mq5 mq5Var) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "start" : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : l, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : l2, (i2 & 512) != 0 ? null : l3, (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str5);
    }
}
