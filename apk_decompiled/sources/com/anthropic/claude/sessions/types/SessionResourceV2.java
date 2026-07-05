package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.SessionId;
import defpackage.fsf;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mrf;
import defpackage.onf;
import defpackage.utf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vtf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionResourceV2;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "id", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadataV2;", "external_metadata", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadataV2;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadataV2;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionResourceV2;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-Ocx55TE", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/sessions/types/SessionExternalMetadataV2;", "copy-KBfF8BU", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionExternalMetadataV2;)Lcom/anthropic/claude/sessions/types/SessionResourceV2;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-Ocx55TE", "Lcom/anthropic/claude/sessions/types/SessionExternalMetadataV2;", "getExternal_metadata", "Companion", "utf", "vtf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionResourceV2 {
    public static final vtf Companion = new vtf();
    private final SessionExternalMetadataV2 external_metadata;
    private final String id;

    private /* synthetic */ SessionResourceV2(int i, String str, SessionExternalMetadataV2 sessionExternalMetadataV2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, utf.a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.external_metadata = null;
        } else {
            this.external_metadata = sessionExternalMetadataV2;
        }
    }

    /* JADX INFO: renamed from: copy-KBfF8BU$default, reason: not valid java name */
    public static /* synthetic */ SessionResourceV2 m876copyKBfF8BU$default(SessionResourceV2 sessionResourceV2, String str, SessionExternalMetadataV2 sessionExternalMetadataV2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionResourceV2.id;
        }
        if ((i & 2) != 0) {
            sessionExternalMetadataV2 = sessionResourceV2.external_metadata;
        }
        return sessionResourceV2.m878copyKBfF8BU(str, sessionExternalMetadataV2);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionResourceV2 self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, fsf.a, SessionId.m1114boximpl(self.id));
        if (!output.E(serialDesc) && self.external_metadata == null) {
            return;
        }
        output.B(serialDesc, 1, mrf.a, self.external_metadata);
    }

    /* JADX INFO: renamed from: component1-Ocx55TE, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SessionExternalMetadataV2 getExternal_metadata() {
        return this.external_metadata;
    }

    /* JADX INFO: renamed from: copy-KBfF8BU, reason: not valid java name */
    public final SessionResourceV2 m878copyKBfF8BU(String id, SessionExternalMetadataV2 external_metadata) {
        id.getClass();
        return new SessionResourceV2(id, external_metadata, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionResourceV2)) {
            return false;
        }
        SessionResourceV2 sessionResourceV2 = (SessionResourceV2) other;
        return SessionId.m1117equalsimpl0(this.id, sessionResourceV2.id) && x44.r(this.external_metadata, sessionResourceV2.external_metadata);
    }

    public final SessionExternalMetadataV2 getExternal_metadata() {
        return this.external_metadata;
    }

    /* JADX INFO: renamed from: getId-Ocx55TE, reason: not valid java name */
    public final String m879getIdOcx55TE() {
        return this.id;
    }

    public int hashCode() {
        int iM1118hashCodeimpl = SessionId.m1118hashCodeimpl(this.id) * 31;
        SessionExternalMetadataV2 sessionExternalMetadataV2 = this.external_metadata;
        return iM1118hashCodeimpl + (sessionExternalMetadataV2 == null ? 0 : sessionExternalMetadataV2.hashCode());
    }

    public String toString() {
        return "SessionResourceV2(id=" + SessionId.m1119toStringimpl(this.id) + ", external_metadata=" + this.external_metadata + ")";
    }

    public /* synthetic */ SessionResourceV2(String str, SessionExternalMetadataV2 sessionExternalMetadataV2, mq5 mq5Var) {
        this(str, sessionExternalMetadataV2);
    }

    public /* synthetic */ SessionResourceV2(int i, String str, SessionExternalMetadataV2 sessionExternalMetadataV2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, sessionExternalMetadataV2, vnfVar);
    }

    private SessionResourceV2(String str, SessionExternalMetadataV2 sessionExternalMetadataV2) {
        str.getClass();
        this.id = str;
        this.external_metadata = sessionExternalMetadataV2;
    }

    public /* synthetic */ SessionResourceV2(String str, SessionExternalMetadataV2 sessionExternalMetadataV2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : sessionExternalMetadataV2, null);
    }
}
