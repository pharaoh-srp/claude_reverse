package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.SessionGroupingId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c69;
import defpackage.esf;
import defpackage.g69;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.trf;
import defpackage.ume;
import defpackage.urf;
import defpackage.vd4;
import defpackage.vme;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xrf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002OPBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0080\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b=\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b>\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bA\u0010\u001bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010#R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bG\u0010E\u001a\u0004\bF\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010(R\u0011\u0010L\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionGrouping;", "", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "id", "", "name", "description", "Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "visibility", "created_by_account_id", "", "Lcom/anthropic/claude/sessions/types/SessionGroupingRelation;", "caller_relations", "Lcom/anthropic/claude/sessions/types/SessionGroupingMember;", "members", "", "members_truncated", "Lc69;", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lc69;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lc69;Lvnf;Lmq5;)V", "component1-iRFWGjk", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "()Lc69;", "copy-0-gwi64", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lc69;)Lcom/anthropic/claude/sessions/types/SessionGrouping;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionGrouping;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-iRFWGjk", "getName", "getDescription", "Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "getVisibility", "getCreated_by_account_id", "Ljava/util/List;", "getCaller_relations", "getCaller_relations$annotations", "()V", "getMembers", "getMembers$annotations", "Ljava/lang/Boolean;", "getMembers_truncated", "Lc69;", "getCreated_at", "isPrivate", "()Z", "Companion", "trf", "urf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionGrouping {
    public static final urf Companion = new urf();
    private final List<SessionGroupingRelation> caller_relations;
    private final c69 created_at;
    private final String created_by_account_id;
    private final String description;
    private final String id;
    private final List<SessionGroupingMember> members;
    private final Boolean members_truncated;
    private final String name;
    private final SessionGroupingVisibility visibility;

    private /* synthetic */ SessionGrouping(int i, String str, String str2, String str3, SessionGroupingVisibility sessionGroupingVisibility, String str4, List list, List list2, Boolean bool, c69 c69Var, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, trf.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.visibility = SessionGroupingVisibility.UNKNOWN;
        } else {
            this.visibility = sessionGroupingVisibility;
        }
        if ((i & 16) == 0) {
            this.created_by_account_id = null;
        } else {
            this.created_by_account_id = str4;
        }
        if ((i & 32) == 0) {
            this.caller_relations = lm6.E;
        } else {
            this.caller_relations = list;
        }
        if ((i & 64) == 0) {
            this.members = null;
        } else {
            this.members = list2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.members_truncated = null;
        } else {
            this.members_truncated = bool;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.created_at = null;
        } else {
            this.created_at = c69Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-0-gwi64$default, reason: not valid java name */
    public static /* synthetic */ SessionGrouping m866copy0gwi64$default(SessionGrouping sessionGrouping, String str, String str2, String str3, SessionGroupingVisibility sessionGroupingVisibility, String str4, List list, List list2, Boolean bool, c69 c69Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionGrouping.id;
        }
        if ((i & 2) != 0) {
            str2 = sessionGrouping.name;
        }
        if ((i & 4) != 0) {
            str3 = sessionGrouping.description;
        }
        if ((i & 8) != 0) {
            sessionGroupingVisibility = sessionGrouping.visibility;
        }
        if ((i & 16) != 0) {
            str4 = sessionGrouping.created_by_account_id;
        }
        if ((i & 32) != 0) {
            list = sessionGrouping.caller_relations;
        }
        if ((i & 64) != 0) {
            list2 = sessionGrouping.members;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            bool = sessionGrouping.members_truncated;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            c69Var = sessionGrouping.created_at;
        }
        Boolean bool2 = bool;
        c69 c69Var2 = c69Var;
        List list3 = list;
        List list4 = list2;
        String str5 = str4;
        String str6 = str3;
        return sessionGrouping.m868copy0gwi64(str, str2, str6, sessionGroupingVisibility, str5, list3, list4, bool2, c69Var2);
    }

    @onf(with = vme.class)
    public static /* synthetic */ void getCaller_relations$annotations() {
    }

    @onf(with = ume.class)
    public static /* synthetic */ void getMembers$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(SessionGrouping self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, xrf.a, SessionGroupingId.m1107boximpl(self.id));
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.visibility != SessionGroupingVisibility.UNKNOWN) {
            output.r(serialDesc, 3, esf.d, self.visibility);
        }
        if (output.E(serialDesc) || self.created_by_account_id != null) {
            output.B(serialDesc, 4, srg.a, self.created_by_account_id);
        }
        if (output.E(serialDesc) || !x44.r(self.caller_relations, lm6.E)) {
            output.r(serialDesc, 5, vme.d, self.caller_relations);
        }
        if (output.E(serialDesc) || self.members != null) {
            output.B(serialDesc, 6, ume.d, self.members);
        }
        if (output.E(serialDesc) || self.members_truncated != null) {
            output.B(serialDesc, 7, zt1.a, self.members_truncated);
        }
        if (!output.E(serialDesc) && self.created_at == null) {
            return;
        }
        output.B(serialDesc, 8, g69.a, self.created_at);
    }

    /* JADX INFO: renamed from: component1-iRFWGjk, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SessionGroupingVisibility getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreated_by_account_id() {
        return this.created_by_account_id;
    }

    public final List<SessionGroupingRelation> component6() {
        return this.caller_relations;
    }

    public final List<SessionGroupingMember> component7() {
        return this.members;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getMembers_truncated() {
        return this.members_truncated;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final c69 getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: copy-0-gwi64, reason: not valid java name */
    public final SessionGrouping m868copy0gwi64(String id, String name, String description, SessionGroupingVisibility visibility, String created_by_account_id, List<? extends SessionGroupingRelation> caller_relations, List<SessionGroupingMember> members, Boolean members_truncated, c69 created_at) {
        id.getClass();
        name.getClass();
        visibility.getClass();
        caller_relations.getClass();
        return new SessionGrouping(id, name, description, visibility, created_by_account_id, caller_relations, members, members_truncated, created_at, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionGrouping)) {
            return false;
        }
        SessionGrouping sessionGrouping = (SessionGrouping) other;
        return SessionGroupingId.m1110equalsimpl0(this.id, sessionGrouping.id) && x44.r(this.name, sessionGrouping.name) && x44.r(this.description, sessionGrouping.description) && this.visibility == sessionGrouping.visibility && x44.r(this.created_by_account_id, sessionGrouping.created_by_account_id) && x44.r(this.caller_relations, sessionGrouping.caller_relations) && x44.r(this.members, sessionGrouping.members) && x44.r(this.members_truncated, sessionGrouping.members_truncated) && x44.r(this.created_at, sessionGrouping.created_at);
    }

    public final List<SessionGroupingRelation> getCaller_relations() {
        return this.caller_relations;
    }

    public final c69 getCreated_at() {
        return this.created_at;
    }

    public final String getCreated_by_account_id() {
        return this.created_by_account_id;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: getId-iRFWGjk, reason: not valid java name */
    public final String m869getIdiRFWGjk() {
        return this.id;
    }

    public final List<SessionGroupingMember> getMembers() {
        return this.members;
    }

    public final Boolean getMembers_truncated() {
        return this.members_truncated;
    }

    public final String getName() {
        return this.name;
    }

    public final SessionGroupingVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iL = kgh.l(SessionGroupingId.m1111hashCodeimpl(this.id) * 31, 31, this.name);
        String str = this.description;
        int iHashCode = (this.visibility.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.created_by_account_id;
        int iM = kgh.m((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.caller_relations);
        List<SessionGroupingMember> list = this.members;
        int iHashCode2 = (iM + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.members_truncated;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        c69 c69Var = this.created_at;
        return iHashCode3 + (c69Var != null ? c69Var.hashCode() : 0);
    }

    public final boolean isPrivate() {
        return this.visibility == SessionGroupingVisibility.PRIVATE;
    }

    public String toString() {
        String strM1112toStringimpl = SessionGroupingId.m1112toStringimpl(this.id);
        String str = this.name;
        String str2 = this.description;
        SessionGroupingVisibility sessionGroupingVisibility = this.visibility;
        String str3 = this.created_by_account_id;
        List<SessionGroupingRelation> list = this.caller_relations;
        List<SessionGroupingMember> list2 = this.members;
        Boolean bool = this.members_truncated;
        c69 c69Var = this.created_at;
        StringBuilder sbR = kgh.r("SessionGrouping(id=", strM1112toStringimpl, ", name=", str, ", description=");
        sbR.append(str2);
        sbR.append(", visibility=");
        sbR.append(sessionGroupingVisibility);
        sbR.append(", created_by_account_id=");
        qy1.p(str3, ", caller_relations=", ", members=", sbR, list);
        sbR.append(list2);
        sbR.append(", members_truncated=");
        sbR.append(bool);
        sbR.append(", created_at=");
        sbR.append(c69Var);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ SessionGrouping(String str, String str2, String str3, SessionGroupingVisibility sessionGroupingVisibility, String str4, List list, List list2, Boolean bool, c69 c69Var, mq5 mq5Var) {
        this(str, str2, str3, sessionGroupingVisibility, str4, list, list2, bool, c69Var);
    }

    public /* synthetic */ SessionGrouping(int i, String str, String str2, String str3, SessionGroupingVisibility sessionGroupingVisibility, String str4, List list, List list2, Boolean bool, c69 c69Var, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, sessionGroupingVisibility, str4, list, list2, bool, c69Var, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SessionGrouping(String str, String str2, String str3, SessionGroupingVisibility sessionGroupingVisibility, String str4, List<? extends SessionGroupingRelation> list, List<SessionGroupingMember> list2, Boolean bool, c69 c69Var) {
        str.getClass();
        str2.getClass();
        sessionGroupingVisibility.getClass();
        list.getClass();
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.visibility = sessionGroupingVisibility;
        this.created_by_account_id = str4;
        this.caller_relations = list;
        this.members = list2;
        this.members_truncated = bool;
        this.created_at = c69Var;
    }

    public /* synthetic */ SessionGrouping(String str, String str2, String str3, SessionGroupingVisibility sessionGroupingVisibility, String str4, List list, List list2, Boolean bool, c69 c69Var, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? SessionGroupingVisibility.UNKNOWN : sessionGroupingVisibility, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? lm6.E : list, (i & 64) != 0 ? null : list2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bool, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : c69Var, null);
    }
}
