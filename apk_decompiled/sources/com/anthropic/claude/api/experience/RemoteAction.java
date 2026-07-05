package com.anthropic.claude.api.experience;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ree;
import defpackage.srg;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/experience/RemoteAction;", "Lcom/anthropic/claude/api/experience/ExperienceClientAction;", "", "id", "Lkotlinx/serialization/json/JsonObject;", "params", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/RemoteAction;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/api/experience/RemoteAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lkotlinx/serialization/json/JsonObject;", "getParams", "Companion", "qee", "ree", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RemoteAction implements ExperienceClientAction {
    public static final int $stable = 0;
    public static final ree Companion = new ree();
    private final String id;
    private final JsonObject params;

    public /* synthetic */ RemoteAction(int i, String str, JsonObject jsonObject, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.params = null;
        } else {
            this.params = jsonObject;
        }
    }

    public static /* synthetic */ RemoteAction copy$default(RemoteAction remoteAction, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteAction.id;
        }
        if ((i & 2) != 0) {
            jsonObject = remoteAction.params;
        }
        return remoteAction.copy(str, jsonObject);
    }

    public static final /* synthetic */ void write$Self$api(RemoteAction self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.id != null) {
            output.B(serialDesc, 0, srg.a, self.id);
        }
        if (!output.E(serialDesc) && self.params == null) {
            return;
        }
        output.B(serialDesc, 1, uh9.a, self.params);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getParams() {
        return this.params;
    }

    public final RemoteAction copy(String id, JsonObject params) {
        return new RemoteAction(id, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteAction)) {
            return false;
        }
        RemoteAction remoteAction = (RemoteAction) other;
        return x44.r(this.id, remoteAction.id) && x44.r(this.params, remoteAction.params);
    }

    public final String getId() {
        return this.id;
    }

    public final JsonObject getParams() {
        return this.params;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonObject jsonObject = this.params;
        return iHashCode + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "RemoteAction(id=" + this.id + ", params=" + this.params + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteAction() {
        this((String) null, (JsonObject) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public RemoteAction(String str, JsonObject jsonObject) {
        this.id = str;
        this.params = jsonObject;
    }

    public /* synthetic */ RemoteAction(String str, JsonObject jsonObject, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : jsonObject);
    }
}
