package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.SessionId;
import defpackage.fsf;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.m99;
import defpackage.maa;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.naa;
import defpackage.onf;
import defpackage.stf;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJB\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u001f¨\u00067"}, d2 = {"Lcom/anthropic/claude/sessions/types/ListSessionsResponse;", "", "", "Lcom/anthropic/claude/sessions/types/SessionResource;", "data", "", "has_more", "Lcom/anthropic/claude/types/strings/SessionId;", "first_id", "last_id", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ListSessionsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3-UFAIyc8", "()Ljava/lang/String;", "component3", "component4-UFAIyc8", "component4", "copy-kNX6-zc", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ListSessionsResponse;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Z", "getHas_more", "Ljava/lang/String;", "getFirst_id-UFAIyc8", "getLast_id-UFAIyc8", "Companion", "maa", "naa", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ListSessionsResponse {
    private final List<SessionResource> data;
    private final String first_id;
    private final boolean has_more;
    private final String last_id;
    public static final naa Companion = new naa();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new m99(14)), null, null, null};

    private /* synthetic */ ListSessionsResponse(int i, List list, boolean z, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, maa.a.getDescriptor());
            throw null;
        }
        this.data = list;
        this.has_more = z;
        if ((i & 4) == 0) {
            this.first_id = null;
        } else {
            this.first_id = str;
        }
        if ((i & 8) == 0) {
            this.last_id = null;
        } else {
            this.last_id = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(stf.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-kNX6-zc$default, reason: not valid java name */
    public static /* synthetic */ ListSessionsResponse m856copykNX6zc$default(ListSessionsResponse listSessionsResponse, List list, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listSessionsResponse.data;
        }
        if ((i & 2) != 0) {
            z = listSessionsResponse.has_more;
        }
        if ((i & 4) != 0) {
            str = listSessionsResponse.first_id;
        }
        if ((i & 8) != 0) {
            str2 = listSessionsResponse.last_id;
        }
        return listSessionsResponse.m859copykNX6zc(list, z, str, str2);
    }

    public static final /* synthetic */ void write$Self$sessions(ListSessionsResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.data);
        output.p(serialDesc, 1, self.has_more);
        if (output.E(serialDesc) || self.first_id != null) {
            fsf fsfVar = fsf.a;
            String str = self.first_id;
            output.B(serialDesc, 2, fsfVar, str != null ? SessionId.m1114boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.last_id == null) {
            return;
        }
        fsf fsfVar2 = fsf.a;
        String str2 = self.last_id;
        output.B(serialDesc, 3, fsfVar2, str2 != null ? SessionId.m1114boximpl(str2) : null);
    }

    public final List<SessionResource> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHas_more() {
        return this.has_more;
    }

    /* JADX INFO: renamed from: component3-UFAIyc8, reason: not valid java name and from getter */
    public final String getFirst_id() {
        return this.first_id;
    }

    /* JADX INFO: renamed from: component4-UFAIyc8, reason: not valid java name and from getter */
    public final String getLast_id() {
        return this.last_id;
    }

    /* JADX INFO: renamed from: copy-kNX6-zc, reason: not valid java name */
    public final ListSessionsResponse m859copykNX6zc(List<SessionResource> data, boolean has_more, String first_id, String last_id) {
        data.getClass();
        return new ListSessionsResponse(data, has_more, first_id, last_id, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.sessions.types.ListSessionsResponse
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.sessions.types.ListSessionsResponse r5 = (com.anthropic.claude.sessions.types.ListSessionsResponse) r5
            java.util.List<com.anthropic.claude.sessions.types.SessionResource> r1 = r4.data
            java.util.List<com.anthropic.claude.sessions.types.SessionResource> r3 = r5.data
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r1 = r4.has_more
            boolean r3 = r5.has_more
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.first_id
            java.lang.String r3 = r5.first_id
            if (r1 != 0) goto L2a
            if (r3 != 0) goto L28
            r1 = r0
            goto L31
        L28:
            r1 = r2
            goto L31
        L2a:
            if (r3 != 0) goto L2d
            goto L28
        L2d:
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r1, r3)
        L31:
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r4 = r4.last_id
            java.lang.String r5 = r5.last_id
            if (r4 != 0) goto L40
            if (r5 != 0) goto L3e
            r4 = r0
            goto L47
        L3e:
            r4 = r2
            goto L47
        L40:
            if (r5 != 0) goto L43
            goto L3e
        L43:
            boolean r4 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r4, r5)
        L47:
            if (r4 != 0) goto L4a
            return r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.ListSessionsResponse.equals(java.lang.Object):boolean");
    }

    public final List<SessionResource> getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getFirst_id-UFAIyc8, reason: not valid java name */
    public final String m860getFirst_idUFAIyc8() {
        return this.first_id;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    /* JADX INFO: renamed from: getLast_id-UFAIyc8, reason: not valid java name */
    public final String m861getLast_idUFAIyc8() {
        return this.last_id;
    }

    public int hashCode() {
        int iP = fsh.p(this.data.hashCode() * 31, 31, this.has_more);
        String str = this.first_id;
        int iM1118hashCodeimpl = (iP + (str == null ? 0 : SessionId.m1118hashCodeimpl(str))) * 31;
        String str2 = this.last_id;
        return iM1118hashCodeimpl + (str2 != null ? SessionId.m1118hashCodeimpl(str2) : 0);
    }

    public String toString() {
        List<SessionResource> list = this.data;
        boolean z = this.has_more;
        String str = this.first_id;
        String strM1119toStringimpl = str == null ? "null" : SessionId.m1119toStringimpl(str);
        String str2 = this.last_id;
        String strM1119toStringimpl2 = str2 != null ? SessionId.m1119toStringimpl(str2) : "null";
        StringBuilder sb = new StringBuilder("ListSessionsResponse(data=");
        sb.append(list);
        sb.append(", has_more=");
        sb.append(z);
        sb.append(", first_id=");
        return vb7.t(sb, strM1119toStringimpl, ", last_id=", strM1119toStringimpl2, ")");
    }

    public /* synthetic */ ListSessionsResponse(List list, boolean z, String str, String str2, mq5 mq5Var) {
        this(list, z, str, str2);
    }

    public /* synthetic */ ListSessionsResponse(int i, List list, boolean z, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, list, z, str, str2, vnfVar);
    }

    private ListSessionsResponse(List<SessionResource> list, boolean z, String str, String str2) {
        list.getClass();
        this.data = list;
        this.has_more = z;
        this.first_id = str;
        this.last_id = str2;
    }

    public /* synthetic */ ListSessionsResponse(List list, boolean z, String str, String str2, int i, mq5 mq5Var) {
        this(list, z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, null);
    }
}
