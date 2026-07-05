package com.anthropic.claude.code.remote.stores;

import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/code/remote/stores/SessionTarget;", "", "", "getDisplayName", "()Ljava/lang/String;", "displayName", "Companion", "Environment", "SelfHostedPool", "com/anthropic/claude/code/remote/stores/c", "Lcom/anthropic/claude/code/remote/stores/SessionTarget$Environment;", "Lcom/anthropic/claude/code/remote/stores/SessionTarget$SelfHostedPool;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface SessionTarget {
    public static final c Companion = c.a;

    String getDisplayName();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010%\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001a¨\u0006)"}, d2 = {"Lcom/anthropic/claude/code/remote/stores/SessionTarget$Environment;", "Lcom/anthropic/claude/code/remote/stores/SessionTarget;", "Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "env", "<init>", "(Lcom/anthropic/claude/sessions/types/EnvironmentResource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/EnvironmentResource;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/stores/SessionTarget$Environment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "copy", "(Lcom/anthropic/claude/sessions/types/EnvironmentResource;)Lcom/anthropic/claude/code/remote/stores/SessionTarget$Environment;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "getEnv", "getDisplayName", "displayName", "Companion", "com/anthropic/claude/code/remote/stores/d", "com/anthropic/claude/code/remote/stores/e", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Environment implements SessionTarget {
        public static final int $stable = 8;
        public static final e Companion = new e();
        private final EnvironmentResource env;

        public /* synthetic */ Environment(int i, EnvironmentResource environmentResource, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.env = environmentResource;
            } else {
                gvj.f(i, 1, d.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Environment copy$default(Environment environment, EnvironmentResource environmentResource, int i, Object obj) {
            if ((i & 1) != 0) {
                environmentResource = environment.env;
            }
            return environment.copy(environmentResource);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EnvironmentResource getEnv() {
            return this.env;
        }

        public final Environment copy(EnvironmentResource env) {
            env.getClass();
            return new Environment(env);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Environment) && x44.r(this.env, ((Environment) other).env);
        }

        @Override // com.anthropic.claude.code.remote.stores.SessionTarget
        public String getDisplayName() {
            return this.env.getName();
        }

        public final EnvironmentResource getEnv() {
            return this.env;
        }

        public int hashCode() {
            return this.env.hashCode();
        }

        public String toString() {
            return "Environment(env=" + this.env + ")";
        }

        public Environment(EnvironmentResource environmentResource) {
            environmentResource.getClass();
            this.env = environmentResource;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0014\u0010%\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001a¨\u0006)"}, d2 = {"Lcom/anthropic/claude/code/remote/stores/SessionTarget$SelfHostedPool;", "Lcom/anthropic/claude/code/remote/stores/SessionTarget;", "Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;", "pool", "<init>", "(Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/stores/SessionTarget$SelfHostedPool;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;", "copy", "(Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;)Lcom/anthropic/claude/code/remote/stores/SessionTarget$SelfHostedPool;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/SelfHostedRunnerPool;", "getPool", "getDisplayName", "displayName", "Companion", "com/anthropic/claude/code/remote/stores/f", "com/anthropic/claude/code/remote/stores/g", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SelfHostedPool implements SessionTarget {
        public static final int $stable = 8;
        public static final g Companion = new g();
        private final SelfHostedRunnerPool pool;

        public /* synthetic */ SelfHostedPool(int i, SelfHostedRunnerPool selfHostedRunnerPool, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.pool = selfHostedRunnerPool;
            } else {
                gvj.f(i, 1, f.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ SelfHostedPool copy$default(SelfHostedPool selfHostedPool, SelfHostedRunnerPool selfHostedRunnerPool, int i, Object obj) {
            if ((i & 1) != 0) {
                selfHostedRunnerPool = selfHostedPool.pool;
            }
            return selfHostedPool.copy(selfHostedRunnerPool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SelfHostedRunnerPool getPool() {
            return this.pool;
        }

        public final SelfHostedPool copy(SelfHostedRunnerPool pool) {
            pool.getClass();
            return new SelfHostedPool(pool);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelfHostedPool) && x44.r(this.pool, ((SelfHostedPool) other).pool);
        }

        @Override // com.anthropic.claude.code.remote.stores.SessionTarget
        public String getDisplayName() {
            return this.pool.getName();
        }

        public final SelfHostedRunnerPool getPool() {
            return this.pool;
        }

        public int hashCode() {
            return this.pool.hashCode();
        }

        public String toString() {
            return "SelfHostedPool(pool=" + this.pool + ")";
        }

        public SelfHostedPool(SelfHostedRunnerPool selfHostedRunnerPool) {
            selfHostedRunnerPool.getClass();
            this.pool = selfHostedRunnerPool;
        }
    }
}
