package com.anthropic.claude.sessions.types;

import defpackage.ij0;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rpf;
import defpackage.srg;
import defpackage.ucf;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B5\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001aR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006/"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "", "", "Lcom/anthropic/claude/sessions/types/SessionContextSource;", "sources", "Lcom/anthropic/claude/sessions/types/Outcome;", "outcomes", "", "model", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SessionConfigViewV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSources", "getOutcomes", "Ljava/lang/String;", "getModel", "Companion", "qpf", "rpf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionConfigViewV2 {
    private static final kw9[] $childSerializers;
    public static final rpf Companion = new rpf();
    private final String model;
    private final List<Outcome> outcomes;
    private final List<SessionContextSource> sources;

    static {
        ucf ucfVar = new ucf(16);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ucfVar), yb5.w(w1aVar, new ucf(17)), null};
    }

    public /* synthetic */ SessionConfigViewV2(int i, List list, List list2, String str, vnf vnfVar) {
        this.sources = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.outcomes = null;
        } else {
            this.outcomes = list2;
        }
        if ((i & 4) == 0) {
            this.model = null;
        } else {
            this.model = str;
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
    public static /* synthetic */ SessionConfigViewV2 copy$default(SessionConfigViewV2 sessionConfigViewV2, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sessionConfigViewV2.sources;
        }
        if ((i & 2) != 0) {
            list2 = sessionConfigViewV2.outcomes;
        }
        if ((i & 4) != 0) {
            str = sessionConfigViewV2.model;
        }
        return sessionConfigViewV2.copy(list, list2, str);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionConfigViewV2 self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.sources, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.sources);
        }
        if (output.E(serialDesc) || self.outcomes != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.outcomes);
        }
        if (!output.E(serialDesc) && self.model == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.model);
    }

    public final List<SessionContextSource> component1() {
        return this.sources;
    }

    public final List<Outcome> component2() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final SessionConfigViewV2 copy(List<? extends SessionContextSource> sources, List<? extends Outcome> outcomes, String model) {
        sources.getClass();
        return new SessionConfigViewV2(sources, outcomes, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigViewV2)) {
            return false;
        }
        SessionConfigViewV2 sessionConfigViewV2 = (SessionConfigViewV2) other;
        return x44.r(this.sources, sessionConfigViewV2.sources) && x44.r(this.outcomes, sessionConfigViewV2.outcomes) && x44.r(this.model, sessionConfigViewV2.model);
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
        List<Outcome> list = this.outcomes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.model;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        List<SessionContextSource> list = this.sources;
        List<Outcome> list2 = this.outcomes;
        String str = this.model;
        StringBuilder sb = new StringBuilder("SessionConfigViewV2(sources=");
        sb.append(list);
        sb.append(", outcomes=");
        sb.append(list2);
        sb.append(", model=");
        return ij0.m(sb, str, ")");
    }

    public SessionConfigViewV2() {
        this((List) null, (List) null, (String) null, 7, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionConfigViewV2(List<? extends SessionContextSource> list, List<? extends Outcome> list2, String str) {
        list.getClass();
        this.sources = list;
        this.outcomes = list2;
        this.model = str;
    }

    public /* synthetic */ SessionConfigViewV2(List list, List list2, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
