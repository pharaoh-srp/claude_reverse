package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.onf;
import defpackage.srg;
import defpackage.tpf;
import defpackage.ucf;
import defpackage.uo0;
import defpackage.upf;
import defpackage.vb7;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJb\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b4\u0010\u001f¨\u00068"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionContext;", "", "", "Lcom/anthropic/claude/sessions/types/SessionContextSource;", "sources", "", "cwd", "Lcom/anthropic/claude/sessions/types/Outcome;", "outcomes", "custom_system_prompt", "append_system_prompt", "model", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionContext;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SessionContext;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSources", "Ljava/lang/String;", "getCwd", "getOutcomes", "getCustom_system_prompt", "getAppend_system_prompt", "getModel", "Companion", "tpf", "upf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionContext {
    private static final kw9[] $childSerializers;
    public static final upf Companion = new upf();
    private final String append_system_prompt;
    private final String custom_system_prompt;
    private final String cwd;
    private final String model;
    private final List<Outcome> outcomes;
    private final List<SessionContextSource> sources;

    static {
        ucf ucfVar = new ucf(18);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ucfVar), null, yb5.w(w1aVar, new ucf(19)), null, null, null};
    }

    public /* synthetic */ SessionContext(int i, List list, String str, List list2, String str2, String str3, String str4, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, tpf.a.getDescriptor());
            throw null;
        }
        this.sources = list;
        if ((i & 2) == 0) {
            this.cwd = null;
        } else {
            this.cwd = str;
        }
        if ((i & 4) == 0) {
            this.outcomes = null;
        } else {
            this.outcomes = list2;
        }
        if ((i & 8) == 0) {
            this.custom_system_prompt = null;
        } else {
            this.custom_system_prompt = str2;
        }
        if ((i & 16) == 0) {
            this.append_system_prompt = null;
        } else {
            this.append_system_prompt = str3;
        }
        if ((i & 32) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(SessionContextSource.Companion.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(Outcome.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionContext copy$default(SessionContext sessionContext, List list, String str, List list2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sessionContext.sources;
        }
        if ((i & 2) != 0) {
            str = sessionContext.cwd;
        }
        if ((i & 4) != 0) {
            list2 = sessionContext.outcomes;
        }
        if ((i & 8) != 0) {
            str2 = sessionContext.custom_system_prompt;
        }
        if ((i & 16) != 0) {
            str3 = sessionContext.append_system_prompt;
        }
        if ((i & 32) != 0) {
            str4 = sessionContext.model;
        }
        String str5 = str3;
        String str6 = str4;
        return sessionContext.copy(list, str, list2, str2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionContext self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.sources);
        if (output.E(serialDesc) || self.cwd != null) {
            output.B(serialDesc, 1, srg.a, self.cwd);
        }
        if (output.E(serialDesc) || self.outcomes != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.outcomes);
        }
        if (output.E(serialDesc) || self.custom_system_prompt != null) {
            output.B(serialDesc, 3, srg.a, self.custom_system_prompt);
        }
        if (output.E(serialDesc) || self.append_system_prompt != null) {
            output.B(serialDesc, 4, srg.a, self.append_system_prompt);
        }
        if (!output.E(serialDesc) && self.model == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.model);
    }

    public final List<SessionContextSource> component1() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCwd() {
        return this.cwd;
    }

    public final List<Outcome> component3() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustom_system_prompt() {
        return this.custom_system_prompt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppend_system_prompt() {
        return this.append_system_prompt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final SessionContext copy(List<? extends SessionContextSource> sources, String cwd, List<? extends Outcome> outcomes, String custom_system_prompt, String append_system_prompt, String model) {
        sources.getClass();
        return new SessionContext(sources, cwd, outcomes, custom_system_prompt, append_system_prompt, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionContext)) {
            return false;
        }
        SessionContext sessionContext = (SessionContext) other;
        return x44.r(this.sources, sessionContext.sources) && x44.r(this.cwd, sessionContext.cwd) && x44.r(this.outcomes, sessionContext.outcomes) && x44.r(this.custom_system_prompt, sessionContext.custom_system_prompt) && x44.r(this.append_system_prompt, sessionContext.append_system_prompt) && x44.r(this.model, sessionContext.model);
    }

    public final String getAppend_system_prompt() {
        return this.append_system_prompt;
    }

    public final String getCustom_system_prompt() {
        return this.custom_system_prompt;
    }

    public final String getCwd() {
        return this.cwd;
    }

    public final String getModel() {
        return this.model;
    }

    public final List<Outcome> getOutcomes() {
        return this.outcomes;
    }

    public final List<SessionContextSource> getSources() {
        return this.sources;
    }

    public int hashCode() {
        int iHashCode = this.sources.hashCode() * 31;
        String str = this.cwd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Outcome> list = this.outcomes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.custom_system_prompt;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.append_system_prompt;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        List<SessionContextSource> list = this.sources;
        String str = this.cwd;
        List<Outcome> list2 = this.outcomes;
        String str2 = this.custom_system_prompt;
        String str3 = this.append_system_prompt;
        String str4 = this.model;
        StringBuilder sb = new StringBuilder("SessionContext(sources=");
        sb.append(list);
        sb.append(", cwd=");
        sb.append(str);
        sb.append(", outcomes=");
        ms6.x(", custom_system_prompt=", str2, ", append_system_prompt=", sb, list2);
        return vb7.t(sb, str3, ", model=", str4, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionContext(List<? extends SessionContextSource> list, String str, List<? extends Outcome> list2, String str2, String str3, String str4) {
        list.getClass();
        this.sources = list;
        this.cwd = str;
        this.outcomes = list2;
        this.custom_system_prompt = str2;
        this.append_system_prompt = str3;
        this.model = str4;
    }

    public /* synthetic */ SessionContext(List list, String str, List list2, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
