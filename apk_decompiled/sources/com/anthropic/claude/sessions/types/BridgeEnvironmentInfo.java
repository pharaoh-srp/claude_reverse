package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.fx1;
import defpackage.hx1;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&Jd\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b5\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006="}, d2 = {"Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;", "", "", "max_sessions", "", "machine_name", "directory", "branch", "git_repo_url", "", "online", "Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;", "spawn_mode", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;)Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMax_sessions", "Ljava/lang/String;", "getMachine_name", "getDirectory", "getBranch", "getGit_repo_url", "Ljava/lang/Boolean;", "getOnline", "Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;", "getSpawn_mode", "Companion", "ex1", "fx1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BridgeEnvironmentInfo {
    public static final fx1 Companion = new fx1();
    private final String branch;
    private final String directory;
    private final String git_repo_url;
    private final String machine_name;
    private final Integer max_sessions;
    private final Boolean online;
    private final BridgeSpawnMode spawn_mode;

    public /* synthetic */ BridgeEnvironmentInfo(int i, Integer num, String str, String str2, String str3, String str4, Boolean bool, BridgeSpawnMode bridgeSpawnMode, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.max_sessions = null;
        } else {
            this.max_sessions = num;
        }
        if ((i & 2) == 0) {
            this.machine_name = null;
        } else {
            this.machine_name = str;
        }
        if ((i & 4) == 0) {
            this.directory = null;
        } else {
            this.directory = str2;
        }
        if ((i & 8) == 0) {
            this.branch = null;
        } else {
            this.branch = str3;
        }
        if ((i & 16) == 0) {
            this.git_repo_url = null;
        } else {
            this.git_repo_url = str4;
        }
        if ((i & 32) == 0) {
            this.online = null;
        } else {
            this.online = bool;
        }
        if ((i & 64) == 0) {
            this.spawn_mode = null;
        } else {
            this.spawn_mode = bridgeSpawnMode;
        }
    }

    public static /* synthetic */ BridgeEnvironmentInfo copy$default(BridgeEnvironmentInfo bridgeEnvironmentInfo, Integer num, String str, String str2, String str3, String str4, Boolean bool, BridgeSpawnMode bridgeSpawnMode, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bridgeEnvironmentInfo.max_sessions;
        }
        if ((i & 2) != 0) {
            str = bridgeEnvironmentInfo.machine_name;
        }
        if ((i & 4) != 0) {
            str2 = bridgeEnvironmentInfo.directory;
        }
        if ((i & 8) != 0) {
            str3 = bridgeEnvironmentInfo.branch;
        }
        if ((i & 16) != 0) {
            str4 = bridgeEnvironmentInfo.git_repo_url;
        }
        if ((i & 32) != 0) {
            bool = bridgeEnvironmentInfo.online;
        }
        if ((i & 64) != 0) {
            bridgeSpawnMode = bridgeEnvironmentInfo.spawn_mode;
        }
        Boolean bool2 = bool;
        BridgeSpawnMode bridgeSpawnMode2 = bridgeSpawnMode;
        String str5 = str4;
        String str6 = str2;
        return bridgeEnvironmentInfo.copy(num, str, str6, str3, str5, bool2, bridgeSpawnMode2);
    }

    public static final /* synthetic */ void write$Self$sessions(BridgeEnvironmentInfo self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.max_sessions != null) {
            output.B(serialDesc, 0, e79.a, self.max_sessions);
        }
        if (output.E(serialDesc) || self.machine_name != null) {
            output.B(serialDesc, 1, srg.a, self.machine_name);
        }
        if (output.E(serialDesc) || self.directory != null) {
            output.B(serialDesc, 2, srg.a, self.directory);
        }
        if (output.E(serialDesc) || self.branch != null) {
            output.B(serialDesc, 3, srg.a, self.branch);
        }
        if (output.E(serialDesc) || self.git_repo_url != null) {
            output.B(serialDesc, 4, srg.a, self.git_repo_url);
        }
        if (output.E(serialDesc) || self.online != null) {
            output.B(serialDesc, 5, zt1.a, self.online);
        }
        if (!output.E(serialDesc) && self.spawn_mode == null) {
            return;
        }
        output.B(serialDesc, 6, hx1.a, self.spawn_mode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMax_sessions() {
        return this.max_sessions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMachine_name() {
        return this.machine_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBranch() {
        return this.branch;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGit_repo_url() {
        return this.git_repo_url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getOnline() {
        return this.online;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BridgeSpawnMode getSpawn_mode() {
        return this.spawn_mode;
    }

    public final BridgeEnvironmentInfo copy(Integer max_sessions, String machine_name, String directory, String branch, String git_repo_url, Boolean online, BridgeSpawnMode spawn_mode) {
        return new BridgeEnvironmentInfo(max_sessions, machine_name, directory, branch, git_repo_url, online, spawn_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BridgeEnvironmentInfo)) {
            return false;
        }
        BridgeEnvironmentInfo bridgeEnvironmentInfo = (BridgeEnvironmentInfo) other;
        return x44.r(this.max_sessions, bridgeEnvironmentInfo.max_sessions) && x44.r(this.machine_name, bridgeEnvironmentInfo.machine_name) && x44.r(this.directory, bridgeEnvironmentInfo.directory) && x44.r(this.branch, bridgeEnvironmentInfo.branch) && x44.r(this.git_repo_url, bridgeEnvironmentInfo.git_repo_url) && x44.r(this.online, bridgeEnvironmentInfo.online) && this.spawn_mode == bridgeEnvironmentInfo.spawn_mode;
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

    public final Integer getMax_sessions() {
        return this.max_sessions;
    }

    public final Boolean getOnline() {
        return this.online;
    }

    public final BridgeSpawnMode getSpawn_mode() {
        return this.spawn_mode;
    }

    public int hashCode() {
        Integer num = this.max_sessions;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.machine_name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.directory;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.branch;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.git_repo_url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.online;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        BridgeSpawnMode bridgeSpawnMode = this.spawn_mode;
        return iHashCode6 + (bridgeSpawnMode != null ? bridgeSpawnMode.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.max_sessions;
        String str = this.machine_name;
        String str2 = this.directory;
        String str3 = this.branch;
        String str4 = this.git_repo_url;
        Boolean bool = this.online;
        BridgeSpawnMode bridgeSpawnMode = this.spawn_mode;
        StringBuilder sb = new StringBuilder("BridgeEnvironmentInfo(max_sessions=");
        sb.append(num);
        sb.append(", machine_name=");
        sb.append(str);
        sb.append(", directory=");
        kgh.u(sb, str2, ", branch=", str3, ", git_repo_url=");
        sb.append(str4);
        sb.append(", online=");
        sb.append(bool);
        sb.append(", spawn_mode=");
        sb.append(bridgeSpawnMode);
        sb.append(")");
        return sb.toString();
    }

    public BridgeEnvironmentInfo() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (BridgeSpawnMode) null, 127, (mq5) null);
    }

    public BridgeEnvironmentInfo(Integer num, String str, String str2, String str3, String str4, Boolean bool, BridgeSpawnMode bridgeSpawnMode) {
        this.max_sessions = num;
        this.machine_name = str;
        this.directory = str2;
        this.branch = str3;
        this.git_repo_url = str4;
        this.online = bool;
        this.spawn_mode = bridgeSpawnMode;
    }

    public /* synthetic */ BridgeEnvironmentInfo(Integer num, String str, String str2, String str3, String str4, Boolean bool, BridgeSpawnMode bridgeSpawnMode, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bridgeSpawnMode);
    }
}
