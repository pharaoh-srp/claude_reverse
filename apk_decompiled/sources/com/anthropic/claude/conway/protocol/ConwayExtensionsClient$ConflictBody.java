package com.anthropic.claude.conway.protocol;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.mv4;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u001a¨\u0006*"}, d2 = {"com/anthropic/claude/conway/protocol/ConwayExtensionsClient$ConflictBody", "", "", "existing", "", "name", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/conway/protocol/ConwayExtensionsClient$ConflictBody;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ConwayExtensionsClient$ConflictBody;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/ConwayExtensionsClient$ConflictBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getExisting", "Ljava/lang/String;", "getName", "Companion", "com/anthropic/claude/conway/protocol/v", "mv4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class ConwayExtensionsClient$ConflictBody {
    public static final mv4 Companion = new mv4();
    private final boolean existing;
    private final String name;

    public /* synthetic */ ConwayExtensionsClient$ConflictBody(int i, boolean z, String str, vnf vnfVar) {
        this.existing = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static /* synthetic */ ConwayExtensionsClient$ConflictBody copy$default(ConwayExtensionsClient$ConflictBody conwayExtensionsClient$ConflictBody, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conwayExtensionsClient$ConflictBody.existing;
        }
        if ((i & 2) != 0) {
            str = conwayExtensionsClient$ConflictBody.name;
        }
        return conwayExtensionsClient$ConflictBody.copy(z, str);
    }

    public static final /* synthetic */ void write$Self$conway(ConwayExtensionsClient$ConflictBody self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !self.existing) {
            output.p(serialDesc, 0, self.existing);
        }
        if (!output.E(serialDesc) && self.name == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExisting() {
        return this.existing;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ConwayExtensionsClient$ConflictBody copy(boolean existing, String name) {
        return new ConwayExtensionsClient$ConflictBody(existing, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayExtensionsClient$ConflictBody)) {
            return false;
        }
        ConwayExtensionsClient$ConflictBody conwayExtensionsClient$ConflictBody = (ConwayExtensionsClient$ConflictBody) other;
        return this.existing == conwayExtensionsClient$ConflictBody.existing && x44.r(this.name, conwayExtensionsClient$ConflictBody.name);
    }

    public final boolean getExisting() {
        return this.existing;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.existing) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConflictBody(existing=" + this.existing + ", name=" + this.name + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConwayExtensionsClient$ConflictBody() {
        this(false, (String) null, 3, (mq5) (0 == true ? 1 : 0));
    }

    public ConwayExtensionsClient$ConflictBody(boolean z, String str) {
        this.existing = z;
        this.name = str;
    }

    public /* synthetic */ ConwayExtensionsClient$ConflictBody(boolean z, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str);
    }
}
