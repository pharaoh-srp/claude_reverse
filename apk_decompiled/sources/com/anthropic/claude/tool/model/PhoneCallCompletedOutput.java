package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.j0d;
import defpackage.k0d;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutput;", "", "", "duration", "", "error", "start_time", "", "Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutputTranscriptItem;", "transcript", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/anthropic/claude/tool/model/PhoneCallCompletedOutput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getDuration", "Ljava/lang/String;", "getError", "getStart_time", "Ljava/util/List;", "getTranscript", "Companion", "i0d", "j0d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PhoneCallCompletedOutput {
    private final Integer duration;
    private final String error;
    private final Integer start_time;
    private final List<PhoneCallCompletedOutputTranscriptItem> transcript;
    public static final j0d Companion = new j0d();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new oob(24))};

    public /* synthetic */ PhoneCallCompletedOutput(int i, Integer num, String str, Integer num2, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.duration = null;
        } else {
            this.duration = num;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = str;
        }
        if ((i & 4) == 0) {
            this.start_time = null;
        } else {
            this.start_time = num2;
        }
        if ((i & 8) == 0) {
            this.transcript = null;
        } else {
            this.transcript = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(k0d.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneCallCompletedOutput copy$default(PhoneCallCompletedOutput phoneCallCompletedOutput, Integer num, String str, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = phoneCallCompletedOutput.duration;
        }
        if ((i & 2) != 0) {
            str = phoneCallCompletedOutput.error;
        }
        if ((i & 4) != 0) {
            num2 = phoneCallCompletedOutput.start_time;
        }
        if ((i & 8) != 0) {
            list = phoneCallCompletedOutput.transcript;
        }
        return phoneCallCompletedOutput.copy(num, str, num2, list);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PhoneCallCompletedOutput self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.duration != null) {
            output.B(serialDesc, 0, e79.a, self.duration);
        }
        if (output.E(serialDesc) || self.error != null) {
            output.B(serialDesc, 1, srg.a, self.error);
        }
        if (output.E(serialDesc) || self.start_time != null) {
            output.B(serialDesc, 2, e79.a, self.start_time);
        }
        if (!output.E(serialDesc) && self.transcript == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.transcript);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStart_time() {
        return this.start_time;
    }

    public final List<PhoneCallCompletedOutputTranscriptItem> component4() {
        return this.transcript;
    }

    public final PhoneCallCompletedOutput copy(Integer duration, String error, Integer start_time, List<PhoneCallCompletedOutputTranscriptItem> transcript) {
        return new PhoneCallCompletedOutput(duration, error, start_time, transcript);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneCallCompletedOutput)) {
            return false;
        }
        PhoneCallCompletedOutput phoneCallCompletedOutput = (PhoneCallCompletedOutput) other;
        return x44.r(this.duration, phoneCallCompletedOutput.duration) && x44.r(this.error, phoneCallCompletedOutput.error) && x44.r(this.start_time, phoneCallCompletedOutput.start_time) && x44.r(this.transcript, phoneCallCompletedOutput.transcript);
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getError() {
        return this.error;
    }

    public final Integer getStart_time() {
        return this.start_time;
    }

    public final List<PhoneCallCompletedOutputTranscriptItem> getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        Integer num = this.duration;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.error;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.start_time;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PhoneCallCompletedOutputTranscriptItem> list = this.transcript;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PhoneCallCompletedOutput(duration=" + this.duration + ", error=" + this.error + ", start_time=" + this.start_time + ", transcript=" + this.transcript + ")";
    }

    public PhoneCallCompletedOutput() {
        this((Integer) null, (String) null, (Integer) null, (List) null, 15, (mq5) null);
    }

    public PhoneCallCompletedOutput(Integer num, String str, Integer num2, List<PhoneCallCompletedOutputTranscriptItem> list) {
        this.duration = num;
        this.error = str;
        this.start_time = num2;
        this.transcript = list;
    }

    public /* synthetic */ PhoneCallCompletedOutput(Integer num, String str, Integer num2, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list);
    }
}
