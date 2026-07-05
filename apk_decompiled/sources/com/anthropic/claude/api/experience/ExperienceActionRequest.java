package com.anthropic.claude.api.experience;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.l87;
import defpackage.m87;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceActionRequest;", "", "", "experience_id", "action_id", "Lkotlinx/serialization/json/JsonObject;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceActionRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/api/experience/ExperienceActionRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExperience_id", "getAction_id", "Lkotlinx/serialization/json/JsonObject;", "getParams", "Companion", "l87", "m87", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceActionRequest {
    public static final int $stable = 0;
    public static final m87 Companion = new m87();
    private final String action_id;
    private final String experience_id;
    private final JsonObject params;

    public /* synthetic */ ExperienceActionRequest(int i, String str, String str2, JsonObject jsonObject, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, l87.a.getDescriptor());
            throw null;
        }
        this.experience_id = str;
        this.action_id = str2;
        if ((i & 4) == 0) {
            this.params = null;
        } else {
            this.params = jsonObject;
        }
    }

    public static /* synthetic */ ExperienceActionRequest copy$default(ExperienceActionRequest experienceActionRequest, String str, String str2, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experienceActionRequest.experience_id;
        }
        if ((i & 2) != 0) {
            str2 = experienceActionRequest.action_id;
        }
        if ((i & 4) != 0) {
            jsonObject = experienceActionRequest.params;
        }
        return experienceActionRequest.copy(str, str2, jsonObject);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceActionRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.experience_id);
        output.q(serialDesc, 1, self.action_id);
        if (!output.E(serialDesc) && self.params == null) {
            return;
        }
        output.B(serialDesc, 2, uh9.a, self.params);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExperience_id() {
        return this.experience_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction_id() {
        return this.action_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getParams() {
        return this.params;
    }

    public final ExperienceActionRequest copy(String experience_id, String action_id, JsonObject params) {
        experience_id.getClass();
        action_id.getClass();
        return new ExperienceActionRequest(experience_id, action_id, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceActionRequest)) {
            return false;
        }
        ExperienceActionRequest experienceActionRequest = (ExperienceActionRequest) other;
        return x44.r(this.experience_id, experienceActionRequest.experience_id) && x44.r(this.action_id, experienceActionRequest.action_id) && x44.r(this.params, experienceActionRequest.params);
    }

    public final String getAction_id() {
        return this.action_id;
    }

    public final String getExperience_id() {
        return this.experience_id;
    }

    public final JsonObject getParams() {
        return this.params;
    }

    public int hashCode() {
        int iL = kgh.l(this.experience_id.hashCode() * 31, 31, this.action_id);
        JsonObject jsonObject = this.params;
        return iL + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public String toString() {
        String str = this.experience_id;
        String str2 = this.action_id;
        JsonObject jsonObject = this.params;
        StringBuilder sbR = kgh.r("ExperienceActionRequest(experience_id=", str, ", action_id=", str2, ", params=");
        sbR.append(jsonObject);
        sbR.append(")");
        return sbR.toString();
    }

    public ExperienceActionRequest(String str, String str2, JsonObject jsonObject) {
        str.getClass();
        str2.getClass();
        this.experience_id = str;
        this.action_id = str2;
        this.params = jsonObject;
    }

    public /* synthetic */ ExperienceActionRequest(String str, String str2, JsonObject jsonObject, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : jsonObject);
    }
}
