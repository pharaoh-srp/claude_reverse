package com.anthropic.claude.api.experience;

import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.q3i;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/experience/TrackActionedData;", "Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;", "", "Lcom/anthropic/claude/api/experience/ExperienceClientAction;", "actions", "", "success", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/TrackActionedData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/anthropic/claude/api/experience/TrackActionedData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getActions", "Z", "getSuccess", "Companion", "p3i", "q3i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TrackActionedData implements ExperienceTrackActionData {
    public static final int $stable = 0;
    private final List<ExperienceClientAction> actions;
    private final boolean success;
    public static final q3i Companion = new q3i();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new nlh(26)), null};

    public /* synthetic */ TrackActionedData(int i, List list, boolean z, vnf vnfVar) {
        this.actions = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.success = true;
        } else {
            this.success = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ExperienceClientAction.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackActionedData copy$default(TrackActionedData trackActionedData, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trackActionedData.actions;
        }
        if ((i & 2) != 0) {
            z = trackActionedData.success;
        }
        return trackActionedData.copy(list, z);
    }

    public static final /* synthetic */ void write$Self$api(TrackActionedData self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.actions, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.actions);
        }
        if (!output.E(serialDesc) && self.success) {
            return;
        }
        output.p(serialDesc, 1, self.success);
    }

    public final List<ExperienceClientAction> component1() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final TrackActionedData copy(List<? extends ExperienceClientAction> actions, boolean success) {
        actions.getClass();
        return new TrackActionedData(actions, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackActionedData)) {
            return false;
        }
        TrackActionedData trackActionedData = (TrackActionedData) other;
        return x44.r(this.actions, trackActionedData.actions) && this.success == trackActionedData.success;
    }

    public final List<ExperienceClientAction> getActions() {
        return this.actions;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success) + (this.actions.hashCode() * 31);
    }

    public String toString() {
        return "TrackActionedData(actions=" + this.actions + ", success=" + this.success + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackActionedData() {
        this((List) null, false, 3, (mq5) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackActionedData(List<? extends ExperienceClientAction> list, boolean z) {
        list.getClass();
        this.actions = list;
        this.success = z;
    }

    public /* synthetic */ TrackActionedData(List list, boolean z, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? true : z);
    }
}
