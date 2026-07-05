package com.anthropic.claude.api.wiggle;

import defpackage.gvj;
import defpackage.jaj;
import defpackage.kw9;
import defpackage.l84;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wq4;
import defpackage.x44;
import defpackage.xq4;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactRequest;", "", "", "path", "Ljaj;", "operation", "<init>", "(Ljava/lang/String;Ljaj;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljaj;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljaj;", "copy", "(Ljava/lang/String;Ljaj;)Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Ljaj;", "getOperation", "Companion", "wq4", "xq4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConvertWiggleToArtifactRequest {
    public static final int $stable = 0;
    private final jaj operation;
    private final String path;
    public static final xq4 Companion = new xq4();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new l84(28))};

    public /* synthetic */ ConvertWiggleToArtifactRequest(int i, String str, jaj jajVar, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, wq4.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.operation = jajVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.wiggle.WiggleArtifactConversionOperation", jaj.values(), new String[]{"share", "publish"}, new Annotation[][]{null, null});
    }

    public static /* synthetic */ ConvertWiggleToArtifactRequest copy$default(ConvertWiggleToArtifactRequest convertWiggleToArtifactRequest, String str, jaj jajVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = convertWiggleToArtifactRequest.path;
        }
        if ((i & 2) != 0) {
            jajVar = convertWiggleToArtifactRequest.operation;
        }
        return convertWiggleToArtifactRequest.copy(str, jajVar);
    }

    public static final /* synthetic */ void write$Self$api(ConvertWiggleToArtifactRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.path);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.operation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final jaj getOperation() {
        return this.operation;
    }

    public final ConvertWiggleToArtifactRequest copy(String path, jaj operation) {
        path.getClass();
        operation.getClass();
        return new ConvertWiggleToArtifactRequest(path, operation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConvertWiggleToArtifactRequest)) {
            return false;
        }
        ConvertWiggleToArtifactRequest convertWiggleToArtifactRequest = (ConvertWiggleToArtifactRequest) other;
        return x44.r(this.path, convertWiggleToArtifactRequest.path) && this.operation == convertWiggleToArtifactRequest.operation;
    }

    public final jaj getOperation() {
        return this.operation;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.operation.hashCode() + (this.path.hashCode() * 31);
    }

    public String toString() {
        return "ConvertWiggleToArtifactRequest(path=" + this.path + ", operation=" + this.operation + ")";
    }

    public ConvertWiggleToArtifactRequest(String str, jaj jajVar) {
        str.getClass();
        jajVar.getClass();
        this.path = str;
        this.operation = jajVar;
    }
}
