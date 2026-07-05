package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.gvj;
import defpackage.j7;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qs;
import defpackage.qy1;
import defpackage.rs;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\"¨\u00066"}, d2 = {"Lcom/anthropic/claude/tool/model/AlarmCreateV0Input;", "", "", "", "days", "hour", "", "message", "minute", "", "vibrate", "<init>", "(Ljava/util/List;ILjava/lang/String;ILjava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ILjava/lang/String;ILjava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/AlarmCreateV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;ILjava/lang/String;ILjava/lang/Boolean;)Lcom/anthropic/claude/tool/model/AlarmCreateV0Input;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDays", "I", "getHour", "Ljava/lang/String;", "getMessage", "getMinute", "Ljava/lang/Boolean;", "getVibrate", "Companion", "qs", "rs", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AlarmCreateV0Input {
    private final List<Integer> days;
    private final int hour;
    private final String message;
    private final int minute;
    private final Boolean vibrate;
    public static final rs Companion = new rs();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new j7(10)), null, null, null, null};

    public /* synthetic */ AlarmCreateV0Input(int i, List list, int i2, String str, int i3, Boolean bool, vnf vnfVar) {
        if (14 != (i & 14)) {
            gvj.f(i, 14, qs.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.days = null;
        } else {
            this.days = list;
        }
        this.hour = i2;
        this.message = str;
        this.minute = i3;
        if ((i & 16) == 0) {
            this.vibrate = null;
        } else {
            this.vibrate = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(e79.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlarmCreateV0Input copy$default(AlarmCreateV0Input alarmCreateV0Input, List list, int i, String str, int i2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = alarmCreateV0Input.days;
        }
        if ((i3 & 2) != 0) {
            i = alarmCreateV0Input.hour;
        }
        if ((i3 & 4) != 0) {
            str = alarmCreateV0Input.message;
        }
        if ((i3 & 8) != 0) {
            i2 = alarmCreateV0Input.minute;
        }
        if ((i3 & 16) != 0) {
            bool = alarmCreateV0Input.vibrate;
        }
        Boolean bool2 = bool;
        String str2 = str;
        return alarmCreateV0Input.copy(list, i, str2, i2, bool2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(AlarmCreateV0Input self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.days != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.days);
        }
        output.l(1, self.hour, serialDesc);
        output.q(serialDesc, 2, self.message);
        output.l(3, self.minute, serialDesc);
        if (!output.E(serialDesc) && self.vibrate == null) {
            return;
        }
        output.B(serialDesc, 4, zt1.a, self.vibrate);
    }

    public final List<Integer> component1() {
        return this.days;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getVibrate() {
        return this.vibrate;
    }

    public final AlarmCreateV0Input copy(List<Integer> days, int hour, String message, int minute, Boolean vibrate) {
        message.getClass();
        return new AlarmCreateV0Input(days, hour, message, minute, vibrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmCreateV0Input)) {
            return false;
        }
        AlarmCreateV0Input alarmCreateV0Input = (AlarmCreateV0Input) other;
        return x44.r(this.days, alarmCreateV0Input.days) && this.hour == alarmCreateV0Input.hour && x44.r(this.message, alarmCreateV0Input.message) && this.minute == alarmCreateV0Input.minute && x44.r(this.vibrate, alarmCreateV0Input.vibrate);
    }

    public final List<Integer> getDays() {
        return this.days;
    }

    public final int getHour() {
        return this.hour;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final Boolean getVibrate() {
        return this.vibrate;
    }

    public int hashCode() {
        List<Integer> list = this.days;
        int iC = vb7.c(this.minute, kgh.l(vb7.c(this.hour, (list == null ? 0 : list.hashCode()) * 31, 31), 31, this.message), 31);
        Boolean bool = this.vibrate;
        return iC + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<Integer> list = this.days;
        int i = this.hour;
        String str = this.message;
        int i2 = this.minute;
        Boolean bool = this.vibrate;
        StringBuilder sb = new StringBuilder("AlarmCreateV0Input(days=");
        sb.append(list);
        sb.append(", hour=");
        sb.append(i);
        sb.append(", message=");
        sb.append(str);
        sb.append(", minute=");
        sb.append(i2);
        sb.append(", vibrate=");
        return qy1.h(sb, bool, ")");
    }

    public AlarmCreateV0Input(List<Integer> list, int i, String str, int i2, Boolean bool) {
        str.getClass();
        this.days = list;
        this.hour = i;
        this.message = str;
        this.minute = i2;
        this.vibrate = bool;
    }

    public /* synthetic */ AlarmCreateV0Input(List list, int i, String str, int i2, Boolean bool, int i3, mq5 mq5Var) {
        this((i3 & 1) != 0 ? null : list, i, str, i2, (i3 & 16) != 0 ? null : bool);
    }
}
