package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lpb;
import defpackage.mdj;
import defpackage.mpb;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.tpb;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vpb;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&JB\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010$R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010&¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/model/ModelSelectorState;", "", "Lcom/anthropic/claude/api/model/ModelSelectorSurface;", "id", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "Lcom/anthropic/claude/api/model/ThinkingState;", "thinking", "", "Lcom/anthropic/claude/api/model/ModelThinkingDefault;", "thinking_by_model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Ljava/util/List;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelSelectorState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "defaultThinking-YWwWmQU", "(Ljava/lang/String;)Lcom/anthropic/claude/api/model/ThinkingState;", "defaultThinking", "component1-WIVdKfU", "()Ljava/lang/String;", "component1", "component2-i-4oh0I", "component2", "component3", "()Lcom/anthropic/claude/api/model/ThinkingState;", "component4", "()Ljava/util/List;", "copy-zqSYdVg", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Ljava/util/List;)Lcom/anthropic/claude/api/model/ModelSelectorState;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-WIVdKfU", "getModel-i-4oh0I", "Lcom/anthropic/claude/api/model/ThinkingState;", "getThinking", "Ljava/util/List;", "getThinking_by_model", "Companion", "lpb", "mpb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelSelectorState {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final mpb Companion = new mpb();
    private final String id;
    private final String model;
    private final ThinkingState thinking;
    private final List<ModelThinkingDefault> thinking_by_model;

    static {
        oob oobVar = new oob(7);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, oobVar), yb5.w(w1aVar, new oob(8))};
    }

    private /* synthetic */ ModelSelectorState(int i, String str, String str2, ThinkingState thinkingState, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, lpb.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.model = str2;
        if ((i & 4) == 0) {
            this.thinking = null;
        } else {
            this.thinking = thinkingState;
        }
        if ((i & 8) == 0) {
            this.thinking_by_model = null;
        } else {
            this.thinking_by_model = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ThinkingState.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(vpb.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-zqSYdVg$default, reason: not valid java name */
    public static /* synthetic */ ModelSelectorState m365copyzqSYdVg$default(ModelSelectorState modelSelectorState, String str, String str2, ThinkingState thinkingState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelSelectorState.id;
        }
        if ((i & 2) != 0) {
            str2 = modelSelectorState.model;
        }
        if ((i & 4) != 0) {
            thinkingState = modelSelectorState.thinking;
        }
        if ((i & 8) != 0) {
            list = modelSelectorState.thinking_by_model;
        }
        return modelSelectorState.m368copyzqSYdVg(str, str2, thinkingState, list);
    }

    public static final /* synthetic */ void write$Self$api(ModelSelectorState self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, tpb.a, ModelSelectorSurface.m372boximpl(self.id));
        output.r(serialDesc, 1, vnb.a, ModelId.m1058boximpl(self.model));
        if (output.E(serialDesc) || self.thinking != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.thinking);
        }
        if (!output.E(serialDesc) && self.thinking_by_model == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.thinking_by_model);
    }

    /* JADX INFO: renamed from: component1-WIVdKfU, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2-i-4oh0I, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ThinkingState getThinking() {
        return this.thinking;
    }

    public final List<ModelThinkingDefault> component4() {
        return this.thinking_by_model;
    }

    /* JADX INFO: renamed from: copy-zqSYdVg, reason: not valid java name */
    public final ModelSelectorState m368copyzqSYdVg(String id, String model, ThinkingState thinking, List<ModelThinkingDefault> thinking_by_model) {
        id.getClass();
        model.getClass();
        return new ModelSelectorState(id, model, thinking, thinking_by_model, null);
    }

    /* JADX INFO: renamed from: defaultThinking-YWwWmQU, reason: not valid java name */
    public final ThinkingState m369defaultThinkingYWwWmQU(String model) {
        Object next;
        model.getClass();
        List<ModelThinkingDefault> list = this.thinking_by_model;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (ModelId.m1061equalsimpl0(((ModelThinkingDefault) next).m382getIdi4oh0I(), model)) {
                    break;
                }
            }
            ModelThinkingDefault modelThinkingDefault = (ModelThinkingDefault) next;
            if (modelThinkingDefault != null) {
                return modelThinkingDefault.getThinking();
            }
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelSelectorState)) {
            return false;
        }
        ModelSelectorState modelSelectorState = (ModelSelectorState) other;
        return ModelSelectorSurface.m375equalsimpl0(this.id, modelSelectorState.id) && ModelId.m1061equalsimpl0(this.model, modelSelectorState.model) && x44.r(this.thinking, modelSelectorState.thinking) && x44.r(this.thinking_by_model, modelSelectorState.thinking_by_model);
    }

    /* JADX INFO: renamed from: getId-WIVdKfU, reason: not valid java name */
    public final String m370getIdWIVdKfU() {
        return this.id;
    }

    /* JADX INFO: renamed from: getModel-i-4oh0I, reason: not valid java name */
    public final String m371getModeli4oh0I() {
        return this.model;
    }

    public final ThinkingState getThinking() {
        return this.thinking;
    }

    public final List<ModelThinkingDefault> getThinking_by_model() {
        return this.thinking_by_model;
    }

    public int hashCode() {
        int iM1062hashCodeimpl = (ModelId.m1062hashCodeimpl(this.model) + (ModelSelectorSurface.m376hashCodeimpl(this.id) * 31)) * 31;
        ThinkingState thinkingState = this.thinking;
        int iHashCode = (iM1062hashCodeimpl + (thinkingState == null ? 0 : thinkingState.hashCode())) * 31;
        List<ModelThinkingDefault> list = this.thinking_by_model;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String strM377toStringimpl = ModelSelectorSurface.m377toStringimpl(this.id);
        String strM1063toStringimpl = ModelId.m1063toStringimpl(this.model);
        ThinkingState thinkingState = this.thinking;
        List<ModelThinkingDefault> list = this.thinking_by_model;
        StringBuilder sbR = kgh.r("ModelSelectorState(id=", strM377toStringimpl, ", model=", strM1063toStringimpl, ", thinking=");
        sbR.append(thinkingState);
        sbR.append(", thinking_by_model=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ModelSelectorState(String str, String str2, ThinkingState thinkingState, List list, mq5 mq5Var) {
        this(str, str2, thinkingState, list);
    }

    public /* synthetic */ ModelSelectorState(int i, String str, String str2, ThinkingState thinkingState, List list, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, thinkingState, list, vnfVar);
    }

    private ModelSelectorState(String str, String str2, ThinkingState thinkingState, List<ModelThinkingDefault> list) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.model = str2;
        this.thinking = thinkingState;
        this.thinking_by_model = list;
    }

    public /* synthetic */ ModelSelectorState(String str, String str2, ThinkingState thinkingState, List list, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : thinkingState, (i & 8) != 0 ? null : list, null);
    }
}
