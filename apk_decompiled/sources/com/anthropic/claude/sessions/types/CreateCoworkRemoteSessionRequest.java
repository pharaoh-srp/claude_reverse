package com.anthropic.claude.sessions.types;

import defpackage.e65;
import defpackage.f65;
import defpackage.fr4;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.orf;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionRequest;", "", "", "message", "message_uuid", "model", "", "Lcom/anthropic/claude/sessions/types/SessionFileAttachment;", "file_attachments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getMessage_uuid", "getModel", "Ljava/util/List;", "getFile_attachments", "Companion", "e65", "f65", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateCoworkRemoteSessionRequest {
    private final List<SessionFileAttachment> file_attachments;
    private final String message;
    private final String message_uuid;
    private final String model;
    public static final f65 Companion = new f65();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new fr4(27))};

    public /* synthetic */ CreateCoworkRemoteSessionRequest(int i, String str, String str2, String str3, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, e65.a.getDescriptor());
            throw null;
        }
        this.message = str;
        this.message_uuid = str2;
        if ((i & 4) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 8) == 0) {
            this.file_attachments = null;
        } else {
            this.file_attachments = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(orf.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateCoworkRemoteSessionRequest copy$default(CreateCoworkRemoteSessionRequest createCoworkRemoteSessionRequest, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCoworkRemoteSessionRequest.message;
        }
        if ((i & 2) != 0) {
            str2 = createCoworkRemoteSessionRequest.message_uuid;
        }
        if ((i & 4) != 0) {
            str3 = createCoworkRemoteSessionRequest.model;
        }
        if ((i & 8) != 0) {
            list = createCoworkRemoteSessionRequest.file_attachments;
        }
        return createCoworkRemoteSessionRequest.copy(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$sessions(CreateCoworkRemoteSessionRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.message);
        output.q(serialDesc, 1, self.message_uuid);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 2, srg.a, self.model);
        }
        if (!output.E(serialDesc) && self.file_attachments == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.file_attachments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final List<SessionFileAttachment> component4() {
        return this.file_attachments;
    }

    public final CreateCoworkRemoteSessionRequest copy(String message, String message_uuid, String model, List<SessionFileAttachment> file_attachments) {
        message.getClass();
        message_uuid.getClass();
        return new CreateCoworkRemoteSessionRequest(message, message_uuid, model, file_attachments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCoworkRemoteSessionRequest)) {
            return false;
        }
        CreateCoworkRemoteSessionRequest createCoworkRemoteSessionRequest = (CreateCoworkRemoteSessionRequest) other;
        return x44.r(this.message, createCoworkRemoteSessionRequest.message) && x44.r(this.message_uuid, createCoworkRemoteSessionRequest.message_uuid) && x44.r(this.model, createCoworkRemoteSessionRequest.model) && x44.r(this.file_attachments, createCoworkRemoteSessionRequest.file_attachments);
    }

    public final List<SessionFileAttachment> getFile_attachments() {
        return this.file_attachments;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        int iL = kgh.l(this.message.hashCode() * 31, 31, this.message_uuid);
        String str = this.model;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        List<SessionFileAttachment> list = this.file_attachments;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.message;
        String str2 = this.message_uuid;
        String str3 = this.model;
        List<SessionFileAttachment> list = this.file_attachments;
        StringBuilder sbR = kgh.r("CreateCoworkRemoteSessionRequest(message=", str, ", message_uuid=", str2, ", model=");
        sbR.append(str3);
        sbR.append(", file_attachments=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public CreateCoworkRemoteSessionRequest(String str, String str2, String str3, List<SessionFileAttachment> list) {
        str.getClass();
        str2.getClass();
        this.message = str;
        this.message_uuid = str2;
        this.model = str3;
        this.file_attachments = list;
    }

    public /* synthetic */ CreateCoworkRemoteSessionRequest(String str, String str2, String str3, List list, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}
