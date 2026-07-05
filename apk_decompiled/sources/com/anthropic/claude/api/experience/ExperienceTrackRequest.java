package com.anthropic.claude.api.experience;

import defpackage.ab7;
import defpackage.bb7;
import defpackage.c97;
import defpackage.cb7;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceTrackRequest;", "", "", "experience_id", "Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;", "action", "Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceTrackRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;", "component3", "()Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;)Lcom/anthropic/claude/api/experience/ExperienceTrackRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExperience_id", "Lcom/anthropic/claude/api/experience/ExperienceTrackActionType;", "getAction", "Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;", "getMetadata", "Companion", "bb7", "cb7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceTrackRequest {
    public static final int $stable = 0;
    private final ExperienceTrackActionType action;
    private final String experience_id;
    private final ExperienceTrackActionData metadata;
    public static final cb7 Companion = new cb7();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new c97(5))};

    public /* synthetic */ ExperienceTrackRequest(int i, String str, ExperienceTrackActionType experienceTrackActionType, ExperienceTrackActionData experienceTrackActionData, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, bb7.a.getDescriptor());
            throw null;
        }
        this.experience_id = str;
        this.action = experienceTrackActionType;
        if ((i & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = experienceTrackActionData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ExperienceTrackActionData.Companion.serializer();
    }

    public static /* synthetic */ ExperienceTrackRequest copy$default(ExperienceTrackRequest experienceTrackRequest, String str, ExperienceTrackActionType experienceTrackActionType, ExperienceTrackActionData experienceTrackActionData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experienceTrackRequest.experience_id;
        }
        if ((i & 2) != 0) {
            experienceTrackActionType = experienceTrackRequest.action;
        }
        if ((i & 4) != 0) {
            experienceTrackActionData = experienceTrackRequest.metadata;
        }
        return experienceTrackRequest.copy(str, experienceTrackActionType, experienceTrackActionData);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceTrackRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.experience_id);
        output.r(serialDesc, 1, ab7.d, self.action);
        if (!output.E(serialDesc) && self.metadata == null) {
            return;
        }
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExperience_id() {
        return this.experience_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExperienceTrackActionType getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExperienceTrackActionData getMetadata() {
        return this.metadata;
    }

    public final ExperienceTrackRequest copy(String experience_id, ExperienceTrackActionType action, ExperienceTrackActionData metadata) {
        experience_id.getClass();
        action.getClass();
        return new ExperienceTrackRequest(experience_id, action, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceTrackRequest)) {
            return false;
        }
        ExperienceTrackRequest experienceTrackRequest = (ExperienceTrackRequest) other;
        return x44.r(this.experience_id, experienceTrackRequest.experience_id) && this.action == experienceTrackRequest.action && x44.r(this.metadata, experienceTrackRequest.metadata);
    }

    public final ExperienceTrackActionType getAction() {
        return this.action;
    }

    public final String getExperience_id() {
        return this.experience_id;
    }

    public final ExperienceTrackActionData getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + (this.experience_id.hashCode() * 31)) * 31;
        ExperienceTrackActionData experienceTrackActionData = this.metadata;
        return iHashCode + (experienceTrackActionData == null ? 0 : experienceTrackActionData.hashCode());
    }

    public String toString() {
        return "ExperienceTrackRequest(experience_id=" + this.experience_id + ", action=" + this.action + ", metadata=" + this.metadata + ")";
    }

    public ExperienceTrackRequest(String str, ExperienceTrackActionType experienceTrackActionType, ExperienceTrackActionData experienceTrackActionData) {
        str.getClass();
        experienceTrackActionType.getClass();
        this.experience_id = str;
        this.action = experienceTrackActionType;
        this.metadata = experienceTrackActionData;
    }

    public /* synthetic */ ExperienceTrackRequest(String str, ExperienceTrackActionType experienceTrackActionType, ExperienceTrackActionData experienceTrackActionData, int i, mq5 mq5Var) {
        this(str, experienceTrackActionType, (i & 4) != 0 ? null : experienceTrackActionData);
    }
}
