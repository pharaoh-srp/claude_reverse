package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.bga;
import defpackage.cc;
import defpackage.fkc;
import defpackage.gvj;
import defpackage.jj;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rc1;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Lcom/anthropic/claude/types/strings/OrganizationId;", "getOrganizationId-QUMPZR0", "()Ljava/lang/String;", "organizationId", "Ljj;", "getAgeSignalsResult", "()Ljj;", "ageSignalsResult", "Companion", "NeedsBootstrap", "Bootstrapped", "com/anthropic/claude/app/main/loggedin/c", "Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$Bootstrapped;", "Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$NeedsBootstrap;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface BootstrapScreen extends bga {
    public static final c Companion = c.a;

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    jj getAgeSignalsResult();

    /* JADX INFO: renamed from: getOrganizationId-QUMPZR0, reason: not valid java name */
    String mo507getOrganizationIdQUMPZR0();

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$Bootstrapped;", "Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen;", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Ljj;", "ageSignalsResult", "<init>", "(Ljava/lang/String;Ljj;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljj;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$Bootstrapped;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-XjkXN6I", "()Ljava/lang/String;", "component1", "component2", "()Ljj;", "copy-rw-Nbjk", "(Ljava/lang/String;Ljj;)Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$Bootstrapped;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganizationId-XjkXN6I", "Ljj;", "getAgeSignalsResult", "Companion", "com/anthropic/claude/app/main/loggedin/a", "com/anthropic/claude/app/main/loggedin/b", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Bootstrapped implements BootstrapScreen {
        public static final int $stable = 0;
        private final jj ageSignalsResult;
        private final String organizationId;
        public static final b Companion = new b();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new rc1(6))};

        private /* synthetic */ Bootstrapped(int i, String str, jj jjVar, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.organizationId = str;
            this.ageSignalsResult = jjVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            jj[] jjVarArrValues = jj.values();
            jjVarArrValues.getClass();
            return new lq6("com.anthropic.claude.agesignals.AgeSignalsResult", (Enum[]) jjVarArrValues);
        }

        /* JADX INFO: renamed from: copy-rw-Nbjk$default, reason: not valid java name */
        public static /* synthetic */ Bootstrapped m508copyrwNbjk$default(Bootstrapped bootstrapped, String str, jj jjVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bootstrapped.organizationId;
            }
            if ((i & 2) != 0) {
                jjVar = bootstrapped.ageSignalsResult;
            }
            return bootstrapped.m510copyrwNbjk(str, jjVar);
        }

        public static final /* synthetic */ void write$Self$app(Bootstrapped self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.r(serialDesc, 0, fkc.a, OrganizationId.m1065boximpl(self.mo507getOrganizationIdQUMPZR0()));
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.getAgeSignalsResult());
        }

        /* JADX INFO: renamed from: component1-XjkXN6I, reason: not valid java name and from getter */
        public final String getOrganizationId() {
            return this.organizationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final jj getAgeSignalsResult() {
            return this.ageSignalsResult;
        }

        /* JADX INFO: renamed from: copy-rw-Nbjk, reason: not valid java name */
        public final Bootstrapped m510copyrwNbjk(String organizationId, jj ageSignalsResult) {
            organizationId.getClass();
            ageSignalsResult.getClass();
            return new Bootstrapped(organizationId, ageSignalsResult, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bootstrapped)) {
                return false;
            }
            Bootstrapped bootstrapped = (Bootstrapped) other;
            return OrganizationId.m1068equalsimpl0(this.organizationId, bootstrapped.organizationId) && this.ageSignalsResult == bootstrapped.ageSignalsResult;
        }

        @Override // com.anthropic.claude.app.main.loggedin.BootstrapScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.main.loggedin.BootstrapScreen
        public jj getAgeSignalsResult() {
            return this.ageSignalsResult;
        }

        @Override // com.anthropic.claude.app.main.loggedin.BootstrapScreen
        /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name and merged with bridge method [inline-methods] */
        public String mo507getOrganizationIdQUMPZR0() {
            return this.organizationId;
        }

        public int hashCode() {
            return this.ageSignalsResult.hashCode() + (OrganizationId.m1069hashCodeimpl(this.organizationId) * 31);
        }

        public String toString() {
            return "Bootstrapped(organizationId=" + OrganizationId.m1070toStringimpl(this.organizationId) + ", ageSignalsResult=" + this.ageSignalsResult + ")";
        }

        public /* synthetic */ Bootstrapped(String str, jj jjVar, mq5 mq5Var) {
            this(str, jjVar);
        }

        public /* synthetic */ Bootstrapped(int i, String str, jj jjVar, vnf vnfVar, mq5 mq5Var) {
            this(i, str, jjVar, vnfVar);
        }

        private Bootstrapped(String str, jj jjVar) {
            str.getClass();
            jjVar.getClass();
            this.organizationId = str;
            this.ageSignalsResult = jjVar;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$NeedsBootstrap;", "Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen;", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Ljj;", "ageSignalsResult", "<init>", "(Ljava/lang/String;Ljj;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljj;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$NeedsBootstrap;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-QUMPZR0", "()Ljava/lang/String;", "component1", "component2", "()Ljj;", "copy-a6Ow0xg", "(Ljava/lang/String;Ljj;)Lcom/anthropic/claude/app/main/loggedin/BootstrapScreen$NeedsBootstrap;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganizationId-QUMPZR0", "Ljj;", "getAgeSignalsResult", "Companion", "com/anthropic/claude/app/main/loggedin/d", "com/anthropic/claude/app/main/loggedin/e", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class NeedsBootstrap implements BootstrapScreen {
        public static final int $stable = 0;
        private final jj ageSignalsResult;
        private final String organizationId;
        public static final e Companion = new e();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new rc1(7))};

        private /* synthetic */ NeedsBootstrap(int i, String str, jj jjVar, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, d.a.getDescriptor());
                throw null;
            }
            this.organizationId = str;
            this.ageSignalsResult = jjVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            jj[] jjVarArrValues = jj.values();
            jjVarArrValues.getClass();
            return new lq6("com.anthropic.claude.agesignals.AgeSignalsResult", (Enum[]) jjVarArrValues);
        }

        /* JADX INFO: renamed from: copy-a6Ow0xg$default, reason: not valid java name */
        public static /* synthetic */ NeedsBootstrap m512copya6Ow0xg$default(NeedsBootstrap needsBootstrap, String str, jj jjVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = needsBootstrap.organizationId;
            }
            if ((i & 2) != 0) {
                jjVar = needsBootstrap.ageSignalsResult;
            }
            return needsBootstrap.m514copya6Ow0xg(str, jjVar);
        }

        public static final /* synthetic */ void write$Self$app(NeedsBootstrap self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            fkc fkcVar = fkc.a;
            String strMo507getOrganizationIdQUMPZR0 = self.mo507getOrganizationIdQUMPZR0();
            output.B(serialDesc, 0, fkcVar, strMo507getOrganizationIdQUMPZR0 != null ? OrganizationId.m1065boximpl(strMo507getOrganizationIdQUMPZR0) : null);
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.getAgeSignalsResult());
        }

        /* JADX INFO: renamed from: component1-QUMPZR0, reason: not valid java name and from getter */
        public final String getOrganizationId() {
            return this.organizationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final jj getAgeSignalsResult() {
            return this.ageSignalsResult;
        }

        /* JADX INFO: renamed from: copy-a6Ow0xg, reason: not valid java name */
        public final NeedsBootstrap m514copya6Ow0xg(String organizationId, jj ageSignalsResult) {
            ageSignalsResult.getClass();
            return new NeedsBootstrap(organizationId, ageSignalsResult, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.anthropic.claude.app.main.loggedin.BootstrapScreen.NeedsBootstrap
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.app.main.loggedin.BootstrapScreen$NeedsBootstrap r5 = (com.anthropic.claude.app.main.loggedin.BootstrapScreen.NeedsBootstrap) r5
                java.lang.String r1 = r4.organizationId
                java.lang.String r3 = r5.organizationId
                if (r1 != 0) goto L18
                if (r3 != 0) goto L16
                r1 = r0
                goto L1f
            L16:
                r1 = r2
                goto L1f
            L18:
                if (r3 != 0) goto L1b
                goto L16
            L1b:
                boolean r1 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r1, r3)
            L1f:
                if (r1 != 0) goto L22
                return r2
            L22:
                jj r4 = r4.ageSignalsResult
                jj r5 = r5.ageSignalsResult
                if (r4 == r5) goto L29
                return r2
            L29:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.main.loggedin.BootstrapScreen.NeedsBootstrap.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.app.main.loggedin.BootstrapScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.main.loggedin.BootstrapScreen
        public jj getAgeSignalsResult() {
            return this.ageSignalsResult;
        }

        @Override // com.anthropic.claude.app.main.loggedin.BootstrapScreen
        /* JADX INFO: renamed from: getOrganizationId-QUMPZR0 */
        public String mo507getOrganizationIdQUMPZR0() {
            return this.organizationId;
        }

        public int hashCode() {
            String str = this.organizationId;
            return this.ageSignalsResult.hashCode() + ((str == null ? 0 : OrganizationId.m1069hashCodeimpl(str)) * 31);
        }

        public String toString() {
            String str = this.organizationId;
            return "NeedsBootstrap(organizationId=" + (str == null ? "null" : OrganizationId.m1070toStringimpl(str)) + ", ageSignalsResult=" + this.ageSignalsResult + ")";
        }

        public /* synthetic */ NeedsBootstrap(String str, jj jjVar, mq5 mq5Var) {
            this(str, jjVar);
        }

        public /* synthetic */ NeedsBootstrap(int i, String str, jj jjVar, vnf vnfVar, mq5 mq5Var) {
            this(i, str, jjVar, vnfVar);
        }

        private NeedsBootstrap(String str, jj jjVar) {
            jjVar.getClass();
            this.organizationId = str;
            this.ageSignalsResult = jjVar;
        }
    }
}
