package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.os;
import defpackage.ps;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;", "", "", "tool_description", "days", "hour", "message", "minute", "vibrate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "getDays", "getHour", "getMessage", "getMinute", "getVibrate", "Companion", "os", "ps", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AlarmCreateInputDescriptions {
    public static final int $stable = 0;
    public static final ps Companion = new ps();
    private final String days;
    private final String hour;
    private final String message;
    private final String minute;
    private final String tool_description;
    private final String vibrate;

    public /* synthetic */ AlarmCreateInputDescriptions(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, os.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.days = str2;
        this.hour = str3;
        this.message = str4;
        this.minute = str5;
        this.vibrate = str6;
    }

    public static /* synthetic */ AlarmCreateInputDescriptions copy$default(AlarmCreateInputDescriptions alarmCreateInputDescriptions, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alarmCreateInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            str2 = alarmCreateInputDescriptions.days;
        }
        if ((i & 4) != 0) {
            str3 = alarmCreateInputDescriptions.hour;
        }
        if ((i & 8) != 0) {
            str4 = alarmCreateInputDescriptions.message;
        }
        if ((i & 16) != 0) {
            str5 = alarmCreateInputDescriptions.minute;
        }
        if ((i & 32) != 0) {
            str6 = alarmCreateInputDescriptions.vibrate;
        }
        String str7 = str5;
        String str8 = str6;
        return alarmCreateInputDescriptions.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$models(AlarmCreateInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.q(serialDesc, 1, self.days);
        output.q(serialDesc, 2, self.hour);
        output.q(serialDesc, 3, self.message);
        output.q(serialDesc, 4, self.minute);
        output.q(serialDesc, 5, self.vibrate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVibrate() {
        return this.vibrate;
    }

    public final AlarmCreateInputDescriptions copy(String tool_description, String days, String hour, String message, String minute, String vibrate) {
        y6a.s(tool_description, days, hour, message, minute);
        vibrate.getClass();
        return new AlarmCreateInputDescriptions(tool_description, days, hour, message, minute, vibrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmCreateInputDescriptions)) {
            return false;
        }
        AlarmCreateInputDescriptions alarmCreateInputDescriptions = (AlarmCreateInputDescriptions) other;
        return x44.r(this.tool_description, alarmCreateInputDescriptions.tool_description) && x44.r(this.days, alarmCreateInputDescriptions.days) && x44.r(this.hour, alarmCreateInputDescriptions.hour) && x44.r(this.message, alarmCreateInputDescriptions.message) && x44.r(this.minute, alarmCreateInputDescriptions.minute) && x44.r(this.vibrate, alarmCreateInputDescriptions.vibrate);
    }

    public final String getDays() {
        return this.days;
    }

    public final String getHour() {
        return this.hour;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMinute() {
        return this.minute;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public final String getVibrate() {
        return this.vibrate;
    }

    public int hashCode() {
        return this.vibrate.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(this.tool_description.hashCode() * 31, 31, this.days), 31, this.hour), 31, this.message), 31, this.minute);
    }

    public String toString() {
        String str = this.tool_description;
        String str2 = this.days;
        String str3 = this.hour;
        String str4 = this.message;
        String str5 = this.minute;
        String str6 = this.vibrate;
        StringBuilder sbR = kgh.r("AlarmCreateInputDescriptions(tool_description=", str, ", days=", str2, ", hour=");
        kgh.u(sbR, str3, ", message=", str4, ", minute=");
        return vb7.t(sbR, str5, ", vibrate=", str6, ")");
    }

    public AlarmCreateInputDescriptions(String str, String str2, String str3, String str4, String str5, String str6) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        this.tool_description = str;
        this.days = str2;
        this.hour = str3;
        this.message = str4;
        this.minute = str5;
        this.vibrate = str6;
    }
}
