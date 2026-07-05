package com.anthropic.claude.conway.protocol;

import defpackage.fr4;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rr4;
import defpackage.sr4;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001b¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ConwayClientInfo;", "", "", "id", "name", "", "tools", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ConwayClientInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/conway/protocol/ConwayClientInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "Ljava/util/List;", "getTools", "Companion", "rr4", "sr4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayClientInfo {
    public static final int $stable = 8;
    private final String id;
    private final String name;
    private final List<String> tools;
    public static final sr4 Companion = new sr4();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new fr4(5))};

    public /* synthetic */ ConwayClientInfo(int i, String str, String str2, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rr4.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.tools = lm6.E;
        } else {
            this.tools = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConwayClientInfo copy$default(ConwayClientInfo conwayClientInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwayClientInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = conwayClientInfo.name;
        }
        if ((i & 4) != 0) {
            list = conwayClientInfo.tools;
        }
        return conwayClientInfo.copy(str, str2, list);
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ConwayClientInfo self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.name);
        if (!output.E(serialDesc) && x44.r(self.tools, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.tools);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component3() {
        return this.tools;
    }

    public final ConwayClientInfo copy(String id, String name, List<String> tools) {
        id.getClass();
        name.getClass();
        tools.getClass();
        return new ConwayClientInfo(id, name, tools);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayClientInfo)) {
            return false;
        }
        ConwayClientInfo conwayClientInfo = (ConwayClientInfo) other;
        return x44.r(this.id, conwayClientInfo.id) && x44.r(this.name, conwayClientInfo.name) && x44.r(this.tools, conwayClientInfo.tools);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getTools() {
        return this.tools;
    }

    public int hashCode() {
        return this.tools.hashCode() + kgh.l(this.id.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return gid.q(kgh.r("ConwayClientInfo(id=", str, ", name=", str2, ", tools="), this.tools, ")");
    }

    public ConwayClientInfo(String str, String str2, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.id = str;
        this.name = str2;
        this.tools = list;
    }

    public /* synthetic */ ConwayClientInfo(String str, String str2, List list, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? lm6.E : list);
    }
}
