package com.anthropic.claude.api.experience;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.tc3;
import defpackage.uc3;
import defpackage.va7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xa7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/experience/ChatTooltipContent;", "Lcom/anthropic/claude/api/experience/ExperienceContent;", "", "text", "Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;", "location_id", "Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;", "action_type", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ChatTooltipContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;", "component3", "()Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;)Lcom/anthropic/claude/api/experience/ChatTooltipContent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lcom/anthropic/claude/api/experience/ExperienceTooltipLocation;", "getLocation_id", "Lcom/anthropic/claude/api/experience/ExperienceTooltipActionType;", "getAction_type", "Companion", "tc3", "uc3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatTooltipContent implements ExperienceContent {
    public static final int $stable = 0;
    public static final uc3 Companion = new uc3();
    private final ExperienceTooltipActionType action_type;
    private final ExperienceTooltipLocation location_id;
    private final String text;

    public /* synthetic */ ChatTooltipContent(int i, String str, ExperienceTooltipLocation experienceTooltipLocation, ExperienceTooltipActionType experienceTooltipActionType, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, tc3.a.getDescriptor());
            throw null;
        }
        this.text = str;
        this.location_id = experienceTooltipLocation;
        if ((i & 4) == 0) {
            this.action_type = null;
        } else {
            this.action_type = experienceTooltipActionType;
        }
    }

    public static /* synthetic */ ChatTooltipContent copy$default(ChatTooltipContent chatTooltipContent, String str, ExperienceTooltipLocation experienceTooltipLocation, ExperienceTooltipActionType experienceTooltipActionType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatTooltipContent.text;
        }
        if ((i & 2) != 0) {
            experienceTooltipLocation = chatTooltipContent.location_id;
        }
        if ((i & 4) != 0) {
            experienceTooltipActionType = chatTooltipContent.action_type;
        }
        return chatTooltipContent.copy(str, experienceTooltipLocation, experienceTooltipActionType);
    }

    public static final /* synthetic */ void write$Self$api(ChatTooltipContent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.text);
        output.r(serialDesc, 1, xa7.d, self.location_id);
        if (!output.E(serialDesc) && self.action_type == null) {
            return;
        }
        output.B(serialDesc, 2, va7.d, self.action_type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExperienceTooltipLocation getLocation_id() {
        return this.location_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExperienceTooltipActionType getAction_type() {
        return this.action_type;
    }

    public final ChatTooltipContent copy(String text, ExperienceTooltipLocation location_id, ExperienceTooltipActionType action_type) {
        text.getClass();
        location_id.getClass();
        return new ChatTooltipContent(text, location_id, action_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatTooltipContent)) {
            return false;
        }
        ChatTooltipContent chatTooltipContent = (ChatTooltipContent) other;
        return x44.r(this.text, chatTooltipContent.text) && this.location_id == chatTooltipContent.location_id && this.action_type == chatTooltipContent.action_type;
    }

    public final ExperienceTooltipActionType getAction_type() {
        return this.action_type;
    }

    public final ExperienceTooltipLocation getLocation_id() {
        return this.location_id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (this.location_id.hashCode() + (this.text.hashCode() * 31)) * 31;
        ExperienceTooltipActionType experienceTooltipActionType = this.action_type;
        return iHashCode + (experienceTooltipActionType == null ? 0 : experienceTooltipActionType.hashCode());
    }

    public String toString() {
        return "ChatTooltipContent(text=" + this.text + ", location_id=" + this.location_id + ", action_type=" + this.action_type + ")";
    }

    public ChatTooltipContent(String str, ExperienceTooltipLocation experienceTooltipLocation, ExperienceTooltipActionType experienceTooltipActionType) {
        str.getClass();
        experienceTooltipLocation.getClass();
        this.text = str;
        this.location_id = experienceTooltipLocation;
        this.action_type = experienceTooltipActionType;
    }

    public /* synthetic */ ChatTooltipContent(String str, ExperienceTooltipLocation experienceTooltipLocation, ExperienceTooltipActionType experienceTooltipActionType, int i, mq5 mq5Var) {
        this(str, experienceTooltipLocation, (i & 4) != 0 ? null : experienceTooltipActionType);
    }
}
