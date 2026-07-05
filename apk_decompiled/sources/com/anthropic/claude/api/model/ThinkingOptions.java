package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.emh;
import defpackage.imh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zlh;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002¢\u0006\u0004\b\b\u0010\tBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J<\u0010\u001b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingOptions;", "", "", "Lcom/anthropic/claude/api/model/ThinkingOption;", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "effort_options", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "mode_options", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ThinkingOptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/model/ThinkingOptions;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEffort_options", "getMode_options", "Companion", "hmh", "imh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThinkingOptions {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final imh Companion = new imh();
    private final List<ThinkingOption<ThinkingEffort>> effort_options;
    private final List<ThinkingOption<ThinkingMode>> mode_options;

    static {
        nlh nlhVar = new nlh(8);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, nlhVar), yb5.w(w1aVar, new nlh(9))};
    }

    public /* synthetic */ ThinkingOptions(int i, List list, List list2, vnf vnfVar) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.effort_options = lm6Var;
        } else {
            this.effort_options = list;
        }
        if ((i & 2) == 0) {
            this.mode_options = lm6Var;
        } else {
            this.mode_options = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ThinkingOption.Companion.serializer(zlh.a), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(ThinkingOption.Companion.serializer(emh.a), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThinkingOptions copy$default(ThinkingOptions thinkingOptions, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = thinkingOptions.effort_options;
        }
        if ((i & 2) != 0) {
            list2 = thinkingOptions.mode_options;
        }
        return thinkingOptions.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$api(ThinkingOptions self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.effort_options, lm6Var)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.effort_options);
        }
        if (!output.E(serialDesc) && x44.r(self.mode_options, lm6Var)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.mode_options);
    }

    public final List<ThinkingOption<ThinkingEffort>> component1() {
        return this.effort_options;
    }

    public final List<ThinkingOption<ThinkingMode>> component2() {
        return this.mode_options;
    }

    public final ThinkingOptions copy(List<ThinkingOption<ThinkingEffort>> effort_options, List<ThinkingOption<ThinkingMode>> mode_options) {
        effort_options.getClass();
        mode_options.getClass();
        return new ThinkingOptions(effort_options, mode_options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThinkingOptions)) {
            return false;
        }
        ThinkingOptions thinkingOptions = (ThinkingOptions) other;
        return x44.r(this.effort_options, thinkingOptions.effort_options) && x44.r(this.mode_options, thinkingOptions.mode_options);
    }

    public final List<ThinkingOption<ThinkingEffort>> getEffort_options() {
        return this.effort_options;
    }

    public final List<ThinkingOption<ThinkingMode>> getMode_options() {
        return this.mode_options;
    }

    public int hashCode() {
        return this.mode_options.hashCode() + (this.effort_options.hashCode() * 31);
    }

    public String toString() {
        return "ThinkingOptions(effort_options=" + this.effort_options + ", mode_options=" + this.mode_options + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThinkingOptions() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ThinkingOptions(List<ThinkingOption<ThinkingEffort>> list, List<ThinkingOption<ThinkingMode>> list2) {
        list.getClass();
        list2.getClass();
        this.effort_options = list;
        this.mode_options = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ThinkingOptions(List list, List list2, int i, mq5 mq5Var) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2);
    }
}
