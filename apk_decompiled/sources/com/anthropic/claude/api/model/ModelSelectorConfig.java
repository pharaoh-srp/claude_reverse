package com.anthropic.claude.api.model;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.pob;
import defpackage.qob;
import defpackage.rob;
import defpackage.tpb;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/model/ModelSelectorConfig;", "", "Lcom/anthropic/claude/api/model/ModelSelectorSurface;", "id", "", "Lcom/anthropic/claude/api/model/ModelSelectorEntry;", "models", "<init>", "(Ljava/lang/String;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelSelectorConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-WIVdKfU", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "copy-fate96s", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/model/ModelSelectorConfig;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-WIVdKfU", "Ljava/util/List;", "getModels", "Companion", "pob", "qob", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelSelectorConfig {
    public static final int $stable = 0;
    private final String id;
    private final List<ModelSelectorEntry> models;
    public static final qob Companion = new qob();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new oob(0))};

    private /* synthetic */ ModelSelectorConfig(int i, String str, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, pob.a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.models = lm6.E;
        } else {
            this.models = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(rob.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-fate96s$default, reason: not valid java name */
    public static /* synthetic */ ModelSelectorConfig m357copyfate96s$default(ModelSelectorConfig modelSelectorConfig, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelSelectorConfig.id;
        }
        if ((i & 2) != 0) {
            list = modelSelectorConfig.models;
        }
        return modelSelectorConfig.m359copyfate96s(str, list);
    }

    public static final /* synthetic */ void write$Self$api(ModelSelectorConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, tpb.a, ModelSelectorSurface.m372boximpl(self.id));
        if (!output.E(serialDesc) && x44.r(self.models, lm6.E)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.models);
    }

    /* JADX INFO: renamed from: component1-WIVdKfU, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ModelSelectorEntry> component2() {
        return this.models;
    }

    /* JADX INFO: renamed from: copy-fate96s, reason: not valid java name */
    public final ModelSelectorConfig m359copyfate96s(String id, List<ModelSelectorEntry> models) {
        id.getClass();
        models.getClass();
        return new ModelSelectorConfig(id, models, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelSelectorConfig)) {
            return false;
        }
        ModelSelectorConfig modelSelectorConfig = (ModelSelectorConfig) other;
        return ModelSelectorSurface.m375equalsimpl0(this.id, modelSelectorConfig.id) && x44.r(this.models, modelSelectorConfig.models);
    }

    /* JADX INFO: renamed from: getId-WIVdKfU, reason: not valid java name */
    public final String m360getIdWIVdKfU() {
        return this.id;
    }

    public final List<ModelSelectorEntry> getModels() {
        return this.models;
    }

    public int hashCode() {
        return this.models.hashCode() + (ModelSelectorSurface.m376hashCodeimpl(this.id) * 31);
    }

    public String toString() {
        return y6a.o("ModelSelectorConfig(id=", ModelSelectorSurface.m377toStringimpl(this.id), ", models=", this.models, ")");
    }

    public /* synthetic */ ModelSelectorConfig(String str, List list, mq5 mq5Var) {
        this(str, list);
    }

    public /* synthetic */ ModelSelectorConfig(int i, String str, List list, vnf vnfVar, mq5 mq5Var) {
        this(i, str, list, vnfVar);
    }

    private ModelSelectorConfig(String str, List<ModelSelectorEntry> list) {
        str.getClass();
        list.getClass();
        this.id = str;
        this.models = list;
    }

    public /* synthetic */ ModelSelectorConfig(String str, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? lm6.E : list, null);
    }
}
