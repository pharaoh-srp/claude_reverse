package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3j;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.x9j;
import defpackage.y9j;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ2\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0014\u0010-\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001b¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/WidgetEvents$OpenAppViaShortcut", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;", "shortcut_type", "", "conversation_uuid", "artifact_identifier", "<init>", "(Lcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/WidgetEvents$OpenAppViaShortcut;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/WidgetEvents$OpenAppViaShortcut;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/WidgetEvents$OpenAppViaShortcut;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/WidgetEvents$ShortcutType;", "getShortcut_type", "Ljava/lang/String;", "getConversation_uuid", "getArtifact_identifier", "getEventName", "eventName", "Companion", "x9j", "y9j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WidgetEvents$OpenAppViaShortcut implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String artifact_identifier;
    private final String conversation_uuid;
    private final WidgetEvents$ShortcutType shortcut_type;
    public static final y9j Companion = new y9j();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new p3j(18)), null, null};

    public /* synthetic */ WidgetEvents$OpenAppViaShortcut(int i, WidgetEvents$ShortcutType widgetEvents$ShortcutType, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, x9j.a.getDescriptor());
            throw null;
        }
        this.shortcut_type = widgetEvents$ShortcutType;
        if ((i & 2) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str;
        }
        if ((i & 4) == 0) {
            this.artifact_identifier = null;
        } else {
            this.artifact_identifier = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return WidgetEvents$ShortcutType.Companion.serializer();
    }

    public static /* synthetic */ WidgetEvents$OpenAppViaShortcut copy$default(WidgetEvents$OpenAppViaShortcut widgetEvents$OpenAppViaShortcut, WidgetEvents$ShortcutType widgetEvents$ShortcutType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            widgetEvents$ShortcutType = widgetEvents$OpenAppViaShortcut.shortcut_type;
        }
        if ((i & 2) != 0) {
            str = widgetEvents$OpenAppViaShortcut.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str2 = widgetEvents$OpenAppViaShortcut.artifact_identifier;
        }
        return widgetEvents$OpenAppViaShortcut.copy(widgetEvents$ShortcutType, str, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(WidgetEvents$OpenAppViaShortcut self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.shortcut_type);
        if (output.E(serialDesc) || self.conversation_uuid != null) {
            output.B(serialDesc, 1, srg.a, self.conversation_uuid);
        }
        if (!output.E(serialDesc) && self.artifact_identifier == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.artifact_identifier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WidgetEvents$ShortcutType getShortcut_type() {
        return this.shortcut_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtifact_identifier() {
        return this.artifact_identifier;
    }

    public final WidgetEvents$OpenAppViaShortcut copy(WidgetEvents$ShortcutType shortcut_type, String conversation_uuid, String artifact_identifier) {
        shortcut_type.getClass();
        return new WidgetEvents$OpenAppViaShortcut(shortcut_type, conversation_uuid, artifact_identifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetEvents$OpenAppViaShortcut)) {
            return false;
        }
        WidgetEvents$OpenAppViaShortcut widgetEvents$OpenAppViaShortcut = (WidgetEvents$OpenAppViaShortcut) other;
        return this.shortcut_type == widgetEvents$OpenAppViaShortcut.shortcut_type && x44.r(this.conversation_uuid, widgetEvents$OpenAppViaShortcut.conversation_uuid) && x44.r(this.artifact_identifier, widgetEvents$OpenAppViaShortcut.artifact_identifier);
    }

    public final String getArtifact_identifier() {
        return this.artifact_identifier;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "open_app_via_shortcut";
    }

    public final WidgetEvents$ShortcutType getShortcut_type() {
        return this.shortcut_type;
    }

    public int hashCode() {
        int iHashCode = this.shortcut_type.hashCode() * 31;
        String str = this.conversation_uuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.artifact_identifier;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        WidgetEvents$ShortcutType widgetEvents$ShortcutType = this.shortcut_type;
        String str = this.conversation_uuid;
        String str2 = this.artifact_identifier;
        StringBuilder sb = new StringBuilder("OpenAppViaShortcut(shortcut_type=");
        sb.append(widgetEvents$ShortcutType);
        sb.append(", conversation_uuid=");
        sb.append(str);
        sb.append(", artifact_identifier=");
        return ij0.m(sb, str2, ")");
    }

    public WidgetEvents$OpenAppViaShortcut(WidgetEvents$ShortcutType widgetEvents$ShortcutType, String str, String str2) {
        widgetEvents$ShortcutType.getClass();
        this.shortcut_type = widgetEvents$ShortcutType;
        this.conversation_uuid = str;
        this.artifact_identifier = str2;
    }

    public /* synthetic */ WidgetEvents$OpenAppViaShortcut(WidgetEvents$ShortcutType widgetEvents$ShortcutType, String str, String str2, int i, mq5 mq5Var) {
        this(widgetEvents$ShortcutType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
