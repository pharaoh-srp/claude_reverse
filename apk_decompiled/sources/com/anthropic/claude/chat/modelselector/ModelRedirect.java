package com.anthropic.claude.chat.modelselector;

import defpackage.gid;
import defpackage.gvj;
import defpackage.hob;
import defpackage.iob;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rpa;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/chat/modelselector/ModelRedirect;", "", "", "destination_model_name", "explanation", "", "redirect_on", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/modelselector/ModelRedirect;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/chat/modelselector/ModelRedirect;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDestination_model_name", "getExplanation", "Ljava/util/List;", "getRedirect_on", "Companion", "hob", "iob", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelRedirect {
    public static final int $stable = 0;
    private final String destination_model_name;
    private final String explanation;
    private final List<String> redirect_on;
    public static final iob Companion = new iob();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new rpa(24))};

    public /* synthetic */ ModelRedirect(int i, String str, String str2, List list, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, hob.a.getDescriptor());
            throw null;
        }
        this.destination_model_name = str;
        this.explanation = str2;
        this.redirect_on = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModelRedirect copy$default(ModelRedirect modelRedirect, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelRedirect.destination_model_name;
        }
        if ((i & 2) != 0) {
            str2 = modelRedirect.explanation;
        }
        if ((i & 4) != 0) {
            list = modelRedirect.redirect_on;
        }
        return modelRedirect.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$chat(ModelRedirect self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.destination_model_name);
        output.q(serialDesc, 1, self.explanation);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.redirect_on);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDestination_model_name() {
        return this.destination_model_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    public final List<String> component3() {
        return this.redirect_on;
    }

    public final ModelRedirect copy(String destination_model_name, String explanation, List<String> redirect_on) {
        destination_model_name.getClass();
        explanation.getClass();
        redirect_on.getClass();
        return new ModelRedirect(destination_model_name, explanation, redirect_on);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelRedirect)) {
            return false;
        }
        ModelRedirect modelRedirect = (ModelRedirect) other;
        return x44.r(this.destination_model_name, modelRedirect.destination_model_name) && x44.r(this.explanation, modelRedirect.explanation) && x44.r(this.redirect_on, modelRedirect.redirect_on);
    }

    public final String getDestination_model_name() {
        return this.destination_model_name;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final List<String> getRedirect_on() {
        return this.redirect_on;
    }

    public int hashCode() {
        return this.redirect_on.hashCode() + kgh.l(this.destination_model_name.hashCode() * 31, 31, this.explanation);
    }

    public String toString() {
        String str = this.destination_model_name;
        String str2 = this.explanation;
        return gid.q(kgh.r("ModelRedirect(destination_model_name=", str, ", explanation=", str2, ", redirect_on="), this.redirect_on, ")");
    }

    public ModelRedirect(String str, String str2, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.destination_model_name = str;
        this.explanation = str2;
        this.redirect_on = list;
    }
}
