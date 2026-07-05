package com.anthropic.claude.api.notification;

import defpackage.cdh;
import defpackage.ddh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/notification/TestPushResponse;", "", "", "status", "Lcom/anthropic/claude/api/notification/TestPushCategory;", "category", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/notification/TestPushCategory;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/notification/TestPushCategory;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notification/TestPushResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/notification/TestPushCategory;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/notification/TestPushCategory;)Lcom/anthropic/claude/api/notification/TestPushResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "Lcom/anthropic/claude/api/notification/TestPushCategory;", "getCategory", "Companion", "cdh", "ddh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TestPushResponse {
    public static final int $stable = 0;
    private final TestPushCategory category;
    private final String status;
    public static final ddh Companion = new ddh();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new n7h(13))};

    public /* synthetic */ TestPushResponse(int i, String str, TestPushCategory testPushCategory, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, cdh.a.getDescriptor());
            throw null;
        }
        this.status = str;
        this.category = testPushCategory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return TestPushCategory.Companion.serializer();
    }

    public static /* synthetic */ TestPushResponse copy$default(TestPushResponse testPushResponse, String str, TestPushCategory testPushCategory, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testPushResponse.status;
        }
        if ((i & 2) != 0) {
            testPushCategory = testPushResponse.category;
        }
        return testPushResponse.copy(str, testPushCategory);
    }

    public static final /* synthetic */ void write$Self$api(TestPushResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.status);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.category);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TestPushCategory getCategory() {
        return this.category;
    }

    public final TestPushResponse copy(String status, TestPushCategory category) {
        status.getClass();
        category.getClass();
        return new TestPushResponse(status, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestPushResponse)) {
            return false;
        }
        TestPushResponse testPushResponse = (TestPushResponse) other;
        return x44.r(this.status, testPushResponse.status) && this.category == testPushResponse.category;
    }

    public final TestPushCategory getCategory() {
        return this.category;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.category.hashCode() + (this.status.hashCode() * 31);
    }

    public String toString() {
        return "TestPushResponse(status=" + this.status + ", category=" + this.category + ")";
    }

    public TestPushResponse(String str, TestPushCategory testPushCategory) {
        str.getClass();
        testPushCategory.getClass();
        this.status = str;
        this.category = testPushCategory;
    }
}
