package com.anthropic.claude.sessions.types;

import defpackage.ebh;
import defpackage.f7a;
import defpackage.fc6;
import defpackage.gvj;
import defpackage.h32;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kce;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.pq6;
import defpackage.qg9;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq6;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Anthropic", "Byoc", "Bridge", "pq6", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Anthropic;", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Bridge;", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Byoc;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "environment_type")
public abstract class EnvironmentConfiguration {
    public static final pq6 Companion = new pq6();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new fc6(18));

    public /* synthetic */ EnvironmentConfiguration(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.sessions.types.EnvironmentConfiguration", kceVar.b(EnvironmentConfiguration.class), new pl9[]{kceVar.b(Anthropic.class), kceVar.b(Bridge.class), kceVar.b(Byoc.class)}, new KSerializer[]{e0.a, g0.a, i0.a}, new Annotation[]{new d0()});
    }

    public static final /* synthetic */ void write$Self(EnvironmentConfiguration self, vd4 output, SerialDescriptor serialDesc) {
    }

    private EnvironmentConfiguration() {
    }

    public /* synthetic */ EnvironmentConfiguration(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Byoc;", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "", "cwd", "task_setup_script", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Byoc;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Byoc;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCwd", "getTask_setup_script", "Companion", "com/anthropic/claude/sessions/types/i0", "com/anthropic/claude/sessions/types/j0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Byoc extends EnvironmentConfiguration {
        public static final j0 Companion = new j0();
        private final String cwd;
        private final String task_setup_script;

        public /* synthetic */ Byoc(int i, String str, String str2, vnf vnfVar) {
            super(i, vnfVar);
            if ((i & 1) == 0) {
                this.cwd = null;
            } else {
                this.cwd = str;
            }
            if ((i & 2) == 0) {
                this.task_setup_script = null;
            } else {
                this.task_setup_script = str2;
            }
        }

        public static /* synthetic */ Byoc copy$default(Byoc byoc, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = byoc.cwd;
            }
            if ((i & 2) != 0) {
                str2 = byoc.task_setup_script;
            }
            return byoc.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(Byoc self, vd4 output, SerialDescriptor serialDesc) {
            EnvironmentConfiguration.write$Self(self, output, serialDesc);
            if (output.E(serialDesc) || self.cwd != null) {
                output.B(serialDesc, 0, srg.a, self.cwd);
            }
            if (!output.E(serialDesc) && self.task_setup_script == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.task_setup_script);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCwd() {
            return this.cwd;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTask_setup_script() {
            return this.task_setup_script;
        }

        public final Byoc copy(String cwd, String task_setup_script) {
            return new Byoc(cwd, task_setup_script);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Byoc)) {
                return false;
            }
            Byoc byoc = (Byoc) other;
            return x44.r(this.cwd, byoc.cwd) && x44.r(this.task_setup_script, byoc.task_setup_script);
        }

        public final String getCwd() {
            return this.cwd;
        }

        public final String getTask_setup_script() {
            return this.task_setup_script;
        }

        public int hashCode() {
            String str = this.cwd;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.task_setup_script;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ij0.l("Byoc(cwd=", this.cwd, ", task_setup_script=", this.task_setup_script, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Byoc() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public Byoc(String str, String str2) {
            super(null);
            this.cwd = str;
            this.task_setup_script = str2;
        }

        public /* synthetic */ Byoc(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Bridge;", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "", "machine_name", "directory", "branch", "git_repo_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Bridge;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Bridge;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMachine_name", "getDirectory", "getBranch", "getGit_repo_url", "Companion", "com/anthropic/claude/sessions/types/g0", "com/anthropic/claude/sessions/types/h0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Bridge extends EnvironmentConfiguration {
        public static final h0 Companion = new h0();
        private final String branch;
        private final String directory;
        private final String git_repo_url;
        private final String machine_name;

        public /* synthetic */ Bridge(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
            super(i, vnfVar);
            if ((i & 1) == 0) {
                this.machine_name = null;
            } else {
                this.machine_name = str;
            }
            if ((i & 2) == 0) {
                this.directory = null;
            } else {
                this.directory = str2;
            }
            if ((i & 4) == 0) {
                this.branch = null;
            } else {
                this.branch = str3;
            }
            if ((i & 8) == 0) {
                this.git_repo_url = null;
            } else {
                this.git_repo_url = str4;
            }
        }

        public static /* synthetic */ Bridge copy$default(Bridge bridge, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bridge.machine_name;
            }
            if ((i & 2) != 0) {
                str2 = bridge.directory;
            }
            if ((i & 4) != 0) {
                str3 = bridge.branch;
            }
            if ((i & 8) != 0) {
                str4 = bridge.git_repo_url;
            }
            return bridge.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$sessions(Bridge self, vd4 output, SerialDescriptor serialDesc) {
            EnvironmentConfiguration.write$Self(self, output, serialDesc);
            if (output.E(serialDesc) || self.machine_name != null) {
                output.B(serialDesc, 0, srg.a, self.machine_name);
            }
            if (output.E(serialDesc) || self.directory != null) {
                output.B(serialDesc, 1, srg.a, self.directory);
            }
            if (output.E(serialDesc) || self.branch != null) {
                output.B(serialDesc, 2, srg.a, self.branch);
            }
            if (!output.E(serialDesc) && self.git_repo_url == null) {
                return;
            }
            output.B(serialDesc, 3, srg.a, self.git_repo_url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMachine_name() {
            return this.machine_name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDirectory() {
            return this.directory;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBranch() {
            return this.branch;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getGit_repo_url() {
            return this.git_repo_url;
        }

        public final Bridge copy(String machine_name, String directory, String branch, String git_repo_url) {
            return new Bridge(machine_name, directory, branch, git_repo_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bridge)) {
                return false;
            }
            Bridge bridge = (Bridge) other;
            return x44.r(this.machine_name, bridge.machine_name) && x44.r(this.directory, bridge.directory) && x44.r(this.branch, bridge.branch) && x44.r(this.git_repo_url, bridge.git_repo_url);
        }

        public final String getBranch() {
            return this.branch;
        }

        public final String getDirectory() {
            return this.directory;
        }

        public final String getGit_repo_url() {
            return this.git_repo_url;
        }

        public final String getMachine_name() {
            return this.machine_name;
        }

        public int hashCode() {
            String str = this.machine_name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.directory;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.branch;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.git_repo_url;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.machine_name;
            String str2 = this.directory;
            return vb7.t(kgh.r("Bridge(machine_name=", str, ", directory=", str2, ", branch="), this.branch, ", git_repo_url=", this.git_repo_url, ")");
        }

        public Bridge() {
            this((String) null, (String) null, (String) null, (String) null, 15, (mq5) null);
        }

        public Bridge(String str, String str2, String str3, String str4) {
            super(null);
            this.machine_name = str;
            this.directory = str2;
            this.branch = str3;
            this.git_repo_url = str4;
        }

        public /* synthetic */ Bridge(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JZ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006;"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Anthropic;", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "", "cwd", "init_script", "", "environment", "", "Lcom/anthropic/claude/sessions/types/EnvironmentLanguage;", "languages", "Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;", "network_config", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Anthropic;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/util/List;", "component5", "()Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;)Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration$Anthropic;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCwd", "getInit_script", "Ljava/util/Map;", "getEnvironment", "Ljava/util/List;", "getLanguages", "Lcom/anthropic/claude/sessions/types/CCRNetworkConfig;", "getNetwork_config", "Companion", "com/anthropic/claude/sessions/types/e0", "com/anthropic/claude/sessions/types/f0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Anthropic extends EnvironmentConfiguration {
        private static final kw9[] $childSerializers;
        public static final f0 Companion = new f0();
        private final String cwd;
        private final Map<String, String> environment;
        private final String init_script;
        private final List<EnvironmentLanguage> languages;
        private final CCRNetworkConfig network_config;

        static {
            fc6 fc6Var = new fc6(19);
            w1a w1aVar = w1a.F;
            $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, fc6Var), yb5.w(w1aVar, new fc6(20)), null};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Anthropic(int i, String str, String str2, Map map, List list, CCRNetworkConfig cCRNetworkConfig, vnf vnfVar) {
            super(i, vnfVar);
            if (12 != (i & 12)) {
                gvj.f(i, 12, e0.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.cwd = null;
            } else {
                this.cwd = str;
            }
            if ((i & 2) == 0) {
                this.init_script = null;
            } else {
                this.init_script = str2;
            }
            this.environment = map;
            this.languages = list;
            if ((i & 16) == 0) {
                this.network_config = null;
            } else {
                this.network_config = cCRNetworkConfig;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            srg srgVar = srg.a;
            return new f7a(srgVar, srgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new uo0(vq6.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Anthropic copy$default(Anthropic anthropic2, String str, String str2, Map map, List list, CCRNetworkConfig cCRNetworkConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                str = anthropic2.cwd;
            }
            if ((i & 2) != 0) {
                str2 = anthropic2.init_script;
            }
            if ((i & 4) != 0) {
                map = anthropic2.environment;
            }
            if ((i & 8) != 0) {
                list = anthropic2.languages;
            }
            if ((i & 16) != 0) {
                cCRNetworkConfig = anthropic2.network_config;
            }
            CCRNetworkConfig cCRNetworkConfig2 = cCRNetworkConfig;
            Map map2 = map;
            return anthropic2.copy(str, str2, map2, list, cCRNetworkConfig2);
        }

        public static final /* synthetic */ void write$Self$sessions(Anthropic self, vd4 output, SerialDescriptor serialDesc) {
            EnvironmentConfiguration.write$Self(self, output, serialDesc);
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.cwd != null) {
                output.B(serialDesc, 0, srg.a, self.cwd);
            }
            if (output.E(serialDesc) || self.init_script != null) {
                output.B(serialDesc, 1, srg.a, self.init_script);
            }
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.environment);
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.languages);
            if (!output.E(serialDesc) && self.network_config == null) {
                return;
            }
            output.B(serialDesc, 4, h32.a, self.network_config);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCwd() {
            return this.cwd;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getInit_script() {
            return this.init_script;
        }

        public final Map<String, String> component3() {
            return this.environment;
        }

        public final List<EnvironmentLanguage> component4() {
            return this.languages;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final CCRNetworkConfig getNetwork_config() {
            return this.network_config;
        }

        public final Anthropic copy(String cwd, String init_script, Map<String, String> environment, List<EnvironmentLanguage> languages, CCRNetworkConfig network_config) {
            environment.getClass();
            languages.getClass();
            return new Anthropic(cwd, init_script, environment, languages, network_config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Anthropic)) {
                return false;
            }
            Anthropic anthropic2 = (Anthropic) other;
            return x44.r(this.cwd, anthropic2.cwd) && x44.r(this.init_script, anthropic2.init_script) && x44.r(this.environment, anthropic2.environment) && x44.r(this.languages, anthropic2.languages) && x44.r(this.network_config, anthropic2.network_config);
        }

        public final String getCwd() {
            return this.cwd;
        }

        public final Map<String, String> getEnvironment() {
            return this.environment;
        }

        public final String getInit_script() {
            return this.init_script;
        }

        public final List<EnvironmentLanguage> getLanguages() {
            return this.languages;
        }

        public final CCRNetworkConfig getNetwork_config() {
            return this.network_config;
        }

        public int hashCode() {
            String str = this.cwd;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.init_script;
            int iM = kgh.m(ebh.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.environment), 31, this.languages);
            CCRNetworkConfig cCRNetworkConfig = this.network_config;
            return iM + (cCRNetworkConfig != null ? cCRNetworkConfig.hashCode() : 0);
        }

        public String toString() {
            String str = this.cwd;
            String str2 = this.init_script;
            Map<String, String> map = this.environment;
            List<EnvironmentLanguage> list = this.languages;
            CCRNetworkConfig cCRNetworkConfig = this.network_config;
            StringBuilder sbR = kgh.r("Anthropic(cwd=", str, ", init_script=", str2, ", environment=");
            sbR.append(map);
            sbR.append(", languages=");
            sbR.append(list);
            sbR.append(", network_config=");
            sbR.append(cCRNetworkConfig);
            sbR.append(")");
            return sbR.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Anthropic(String str, String str2, Map<String, String> map, List<EnvironmentLanguage> list, CCRNetworkConfig cCRNetworkConfig) {
            super(null);
            map.getClass();
            list.getClass();
            this.cwd = str;
            this.init_script = str2;
            this.environment = map;
            this.languages = list;
            this.network_config = cCRNetworkConfig;
        }

        public /* synthetic */ Anthropic(String str, String str2, Map map, List list, CCRNetworkConfig cCRNetworkConfig, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, map, list, (i & 16) != 0 ? null : cCRNetworkConfig);
        }
    }
}
