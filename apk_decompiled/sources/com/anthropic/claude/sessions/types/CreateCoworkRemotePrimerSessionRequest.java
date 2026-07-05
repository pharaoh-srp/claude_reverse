package com.anthropic.claude.sessions.types;

import defpackage.d65;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateCoworkRemotePrimerSessionRequest;", "", "", "title", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateCoworkRemotePrimerSessionRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/CreateCoworkRemotePrimerSessionRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getModel", "Companion", "c65", "d65", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateCoworkRemotePrimerSessionRequest {
    public static final d65 Companion = new d65();
    private final String model;
    private final String title;

    public /* synthetic */ CreateCoworkRemotePrimerSessionRequest(int i, String str, String str2, vnf vnfVar) {
        this.title = (i & 1) == 0 ? "__warming__" : str;
        if ((i & 2) == 0) {
            this.model = null;
        } else {
            this.model = str2;
        }
    }

    public static /* synthetic */ CreateCoworkRemotePrimerSessionRequest copy$default(CreateCoworkRemotePrimerSessionRequest createCoworkRemotePrimerSessionRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCoworkRemotePrimerSessionRequest.title;
        }
        if ((i & 2) != 0) {
            str2 = createCoworkRemotePrimerSessionRequest.model;
        }
        return createCoworkRemotePrimerSessionRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$sessions(CreateCoworkRemotePrimerSessionRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.title, "__warming__")) {
            output.q(serialDesc, 0, self.title);
        }
        if (!output.E(serialDesc) && self.model == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.model);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final CreateCoworkRemotePrimerSessionRequest copy(String title, String model) {
        title.getClass();
        return new CreateCoworkRemotePrimerSessionRequest(title, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCoworkRemotePrimerSessionRequest)) {
            return false;
        }
        CreateCoworkRemotePrimerSessionRequest createCoworkRemotePrimerSessionRequest = (CreateCoworkRemotePrimerSessionRequest) other;
        return x44.r(this.title, createCoworkRemotePrimerSessionRequest.title) && x44.r(this.model, createCoworkRemotePrimerSessionRequest.model);
    }

    public final String getModel() {
        return this.model;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.model;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("CreateCoworkRemotePrimerSessionRequest(title=", this.title, ", model=", this.model, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCoworkRemotePrimerSessionRequest() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public CreateCoworkRemotePrimerSessionRequest(String str, String str2) {
        str.getClass();
        this.title = str;
        this.model = str2;
    }

    public /* synthetic */ CreateCoworkRemotePrimerSessionRequest(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "__warming__" : str, (i & 2) != 0 ? null : str2);
    }
}
