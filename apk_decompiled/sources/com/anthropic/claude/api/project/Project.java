package com.anthropic.claude.api.project;

import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.e79;
import defpackage.ebh;
import defpackage.emd;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ikd;
import defpackage.jkd;
import defpackage.kgh;
import defpackage.kkd;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.mq5;
import defpackage.nnd;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xod;
import defpackage.yb5;
import defpackage.ynd;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 m2\u00020\u0001:\u0002noBü\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0019\u0010\u000e\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0019\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u001f\b\u0002\u0010\u0012\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"BÅ\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b1\u00102J'\u00103\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b3\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u00102J\u0010\u00105\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010(J\u0012\u0010<\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b?\u0010@J\u008f\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001b\b\u0002\u0010\u000e\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u001b\b\u0002\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001f\b\u0002\u0010\u0012\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bD\u0010(J\u0010\u0010E\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00072\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bU\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010S\u001a\u0004\bV\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\b\b\u0010-R*\u0010\u000e\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u0010/R*\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bZ\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\b\\\u00102R.\u0010\u0012\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\b]\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b^\u00102R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\b\u0014\u0010-R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\b\u0015\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010_\u001a\u0004\b`\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010a\u001a\u0004\bb\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bc\u0010(R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010d\u001a\u0004\be\u0010=R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\bf\u0010=R\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\bh\u0010@R\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bi\u0010-R\u0011\u0010l\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bk\u0010-¨\u0006p"}, d2 = {"Lcom/anthropic/claude/api/project/Project;", "", "Lcom/anthropic/claude/types/strings/ProjectId;", "uuid", "", "name", "description", "", "is_private", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "Lcom/anthropic/claude/api/project/ProjectActorAccount;", "creator", "archived_at", "archiver", "is_starred", "is_starter_project", "Lcom/anthropic/claude/api/project/ProjectType;", "type", "Lcom/anthropic/claude/api/project/ProjectSubtype;", "subtype", "prompt_template", "", "docs_count", "files_count", "", "Lcom/anthropic/claude/api/project/ProjectPermission;", "permissions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/project/ProjectActorAccount;Ljava/util/Date;Lcom/anthropic/claude/api/project/ProjectActorAccount;ZZLcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/project/ProjectActorAccount;Ljava/util/Date;Lcom/anthropic/claude/api/project/ProjectActorAccount;ZZLcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lvnf;Lmq5;)V", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Z", "component5", "()Ljava/util/Date;", "component6", "component7", "()Lcom/anthropic/claude/api/project/ProjectActorAccount;", "component8", "component9", "component10", "component11", "component12", "()Lcom/anthropic/claude/api/project/ProjectType;", "component13", "()Lcom/anthropic/claude/api/project/ProjectSubtype;", "component14", "component15", "()Ljava/lang/Integer;", "component16", "component17", "()Ljava/util/List;", "copy-qeyL9fA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/project/ProjectActorAccount;Ljava/util/Date;Lcom/anthropic/claude/api/project/ProjectActorAccount;ZZLcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/anthropic/claude/api/project/Project;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/Project;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-5pmjb-U", "getName", "getDescription", "Z", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "Lcom/anthropic/claude/api/project/ProjectActorAccount;", "getCreator", "getArchived_at", "getArchiver", "Lcom/anthropic/claude/api/project/ProjectType;", "getType", "Lcom/anthropic/claude/api/project/ProjectSubtype;", "getSubtype", "getPrompt_template", "Ljava/lang/Integer;", "getDocs_count", "getFiles_count", "Ljava/util/List;", "getPermissions", "getCanDelete", "canDelete", "getCanEditSettings", "canEditSettings", "Companion", "ikd", "jkd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Project {
    public static final int $stable = 0;
    private final Date archived_at;
    private final ProjectActorAccount archiver;
    private final Date created_at;
    private final ProjectActorAccount creator;
    private final String description;
    private final Integer docs_count;
    private final Integer files_count;
    private final boolean is_private;
    private final boolean is_starred;
    private final boolean is_starter_project;
    private final String name;
    private final List<ProjectPermission> permissions;
    private final String prompt_template;
    private final ProjectSubtype subtype;
    private final ProjectType type;
    private final Date updated_at;
    private final String uuid;
    public static final jkd Companion = new jkd();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new mgd(3))};

    private /* synthetic */ Project(int i, String str, String str2, String str3, boolean z, Date date, Date date2, ProjectActorAccount projectActorAccount, Date date3, ProjectActorAccount projectActorAccount2, boolean z2, boolean z3, ProjectType projectType, ProjectSubtype projectSubtype, String str4, Integer num, Integer num2, List list, vnf vnfVar) {
        if (59 != (i & 59)) {
            gvj.f(i, 59, ikd.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        this.is_private = z;
        this.created_at = date;
        this.updated_at = date2;
        if ((i & 64) == 0) {
            this.creator = null;
        } else {
            this.creator = projectActorAccount;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.archived_at = null;
        } else {
            this.archived_at = date3;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.archiver = null;
        } else {
            this.archiver = projectActorAccount2;
        }
        if ((i & 512) == 0) {
            this.is_starred = false;
        } else {
            this.is_starred = z2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.is_starter_project = false;
        } else {
            this.is_starter_project = z3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.type = null;
        } else {
            this.type = projectType;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.subtype = null;
        } else {
            this.subtype = projectSubtype;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.prompt_template = null;
        } else {
            this.prompt_template = str4;
        }
        if ((i & 16384) == 0) {
            this.docs_count = null;
        } else {
            this.docs_count = num;
        }
        if ((32768 & i) == 0) {
            this.files_count = null;
        } else {
            this.files_count = num2;
        }
        if ((i & 65536) == 0) {
            this.permissions = null;
        } else {
            this.permissions = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(nnd.d, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-qeyL9fA$default, reason: not valid java name */
    public static /* synthetic */ Project m401copyqeyL9fA$default(Project project, String str, String str2, String str3, boolean z, Date date, Date date2, ProjectActorAccount projectActorAccount, Date date3, ProjectActorAccount projectActorAccount2, boolean z2, boolean z3, ProjectType projectType, ProjectSubtype projectSubtype, String str4, Integer num, Integer num2, List list, int i, Object obj) {
        List list2;
        Integer num3;
        String str5;
        Project project2;
        Integer num4;
        String str6;
        String str7;
        boolean z4;
        Date date4;
        Date date5;
        ProjectActorAccount projectActorAccount3;
        Date date6;
        ProjectActorAccount projectActorAccount4;
        boolean z5;
        boolean z6;
        ProjectType projectType2;
        ProjectSubtype projectSubtype2;
        String str8;
        String str9 = (i & 1) != 0 ? project.uuid : str;
        String str10 = (i & 2) != 0 ? project.name : str2;
        String str11 = (i & 4) != 0 ? project.description : str3;
        boolean z7 = (i & 8) != 0 ? project.is_private : z;
        Date date7 = (i & 16) != 0 ? project.created_at : date;
        Date date8 = (i & 32) != 0 ? project.updated_at : date2;
        ProjectActorAccount projectActorAccount5 = (i & 64) != 0 ? project.creator : projectActorAccount;
        Date date9 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? project.archived_at : date3;
        ProjectActorAccount projectActorAccount6 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? project.archiver : projectActorAccount2;
        boolean z8 = (i & 512) != 0 ? project.is_starred : z2;
        boolean z9 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? project.is_starter_project : z3;
        ProjectType projectType3 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? project.type : projectType;
        ProjectSubtype projectSubtype3 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? project.subtype : projectSubtype;
        String str12 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? project.prompt_template : str4;
        String str13 = str9;
        Integer num5 = (i & 16384) != 0 ? project.docs_count : num;
        Integer num6 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? project.files_count : num2;
        if ((i & 65536) != 0) {
            num3 = num6;
            list2 = project.permissions;
            num4 = num5;
            str6 = str10;
            str7 = str11;
            z4 = z7;
            date4 = date7;
            date5 = date8;
            projectActorAccount3 = projectActorAccount5;
            date6 = date9;
            projectActorAccount4 = projectActorAccount6;
            z5 = z8;
            z6 = z9;
            projectType2 = projectType3;
            projectSubtype2 = projectSubtype3;
            str8 = str12;
            str5 = str13;
            project2 = project;
        } else {
            list2 = list;
            num3 = num6;
            str5 = str13;
            project2 = project;
            num4 = num5;
            str6 = str10;
            str7 = str11;
            z4 = z7;
            date4 = date7;
            date5 = date8;
            projectActorAccount3 = projectActorAccount5;
            date6 = date9;
            projectActorAccount4 = projectActorAccount6;
            z5 = z8;
            z6 = z9;
            projectType2 = projectType3;
            projectSubtype2 = projectSubtype3;
            str8 = str12;
        }
        return project2.m403copyqeyL9fA(str5, str6, str7, z4, date4, date5, projectActorAccount3, date6, projectActorAccount4, z5, z6, projectType2, projectSubtype2, str8, num4, num3, list2);
    }

    public static final /* synthetic */ void write$Self$api(Project self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, emd.a, ProjectId.m1079boximpl(self.uuid));
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, srg.a, self.description);
        }
        output.p(serialDesc, 3, self.is_private);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 4, bc9Var, self.created_at);
        output.r(serialDesc, 5, bc9Var, self.updated_at);
        if (output.E(serialDesc) || self.creator != null) {
            output.B(serialDesc, 6, kkd.a, self.creator);
        }
        if (output.E(serialDesc) || self.archived_at != null) {
            output.B(serialDesc, 7, bc9Var, self.archived_at);
        }
        if (output.E(serialDesc) || self.archiver != null) {
            output.B(serialDesc, 8, kkd.a, self.archiver);
        }
        if (output.E(serialDesc) || self.is_starred) {
            output.p(serialDesc, 9, self.is_starred);
        }
        if (output.E(serialDesc) || self.is_starter_project) {
            output.p(serialDesc, 10, self.is_starter_project);
        }
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 11, xod.d, self.type);
        }
        if (output.E(serialDesc) || self.subtype != null) {
            output.B(serialDesc, 12, ynd.d, self.subtype);
        }
        if (output.E(serialDesc) || self.prompt_template != null) {
            output.B(serialDesc, 13, srg.a, self.prompt_template);
        }
        if (output.E(serialDesc) || self.docs_count != null) {
            output.B(serialDesc, 14, e79.a, self.docs_count);
        }
        if (output.E(serialDesc) || self.files_count != null) {
            output.B(serialDesc, 15, e79.a, self.files_count);
        }
        if (!output.E(serialDesc) && self.permissions == null) {
            return;
        }
        output.B(serialDesc, 16, (znf) kw9VarArr[16].getValue(), self.permissions);
    }

    /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIs_starred() {
        return this.is_starred;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIs_starter_project() {
        return this.is_starter_project;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ProjectType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ProjectSubtype getSubtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrompt_template() {
        return this.prompt_template;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getDocs_count() {
        return this.docs_count;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getFiles_count() {
        return this.files_count;
    }

    public final List<ProjectPermission> component17() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_private() {
        return this.is_private;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProjectActorAccount getCreator() {
        return this.creator;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getArchived_at() {
        return this.archived_at;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ProjectActorAccount getArchiver() {
        return this.archiver;
    }

    /* JADX INFO: renamed from: copy-qeyL9fA, reason: not valid java name */
    public final Project m403copyqeyL9fA(String uuid, String name, String description, boolean is_private, Date created_at, Date updated_at, ProjectActorAccount creator, Date archived_at, ProjectActorAccount archiver, boolean is_starred, boolean is_starter_project, ProjectType type, ProjectSubtype subtype, String prompt_template, Integer docs_count, Integer files_count, List<? extends ProjectPermission> permissions) {
        uuid.getClass();
        name.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new Project(uuid, name, description, is_private, created_at, updated_at, creator, archived_at, archiver, is_starred, is_starter_project, type, subtype, prompt_template, docs_count, files_count, permissions, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Project)) {
            return false;
        }
        Project project = (Project) other;
        return ProjectId.m1082equalsimpl0(this.uuid, project.uuid) && x44.r(this.name, project.name) && x44.r(this.description, project.description) && this.is_private == project.is_private && x44.r(this.created_at, project.created_at) && x44.r(this.updated_at, project.updated_at) && x44.r(this.creator, project.creator) && x44.r(this.archived_at, project.archived_at) && x44.r(this.archiver, project.archiver) && this.is_starred == project.is_starred && this.is_starter_project == project.is_starter_project && this.type == project.type && this.subtype == project.subtype && x44.r(this.prompt_template, project.prompt_template) && x44.r(this.docs_count, project.docs_count) && x44.r(this.files_count, project.files_count) && x44.r(this.permissions, project.permissions);
    }

    public final Date getArchived_at() {
        return this.archived_at;
    }

    public final ProjectActorAccount getArchiver() {
        return this.archiver;
    }

    public final boolean getCanDelete() {
        List<ProjectPermission> list = this.permissions;
        return list != null && list.contains(ProjectPermission.DELETE);
    }

    public final boolean getCanEditSettings() {
        List<ProjectPermission> list = this.permissions;
        return list != null && list.contains(ProjectPermission.EDIT_SETTINGS);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final ProjectActorAccount getCreator() {
        return this.creator;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDocs_count() {
        return this.docs_count;
    }

    public final Integer getFiles_count() {
        return this.files_count;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ProjectPermission> getPermissions() {
        return this.permissions;
    }

    public final String getPrompt_template() {
        return this.prompt_template;
    }

    public final ProjectSubtype getSubtype() {
        return this.subtype;
    }

    public final ProjectType getType() {
        return this.type;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-5pmjb-U, reason: not valid java name */
    public final String m404getUuid5pmjbU() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(ProjectId.m1083hashCodeimpl(this.uuid) * 31, 31, this.name);
        String str = this.description;
        int iJ = ebh.j(this.updated_at, ebh.j(this.created_at, fsh.p((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.is_private), 31), 31);
        ProjectActorAccount projectActorAccount = this.creator;
        int iHashCode = (iJ + (projectActorAccount == null ? 0 : projectActorAccount.hashCode())) * 31;
        Date date = this.archived_at;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        ProjectActorAccount projectActorAccount2 = this.archiver;
        int iP = fsh.p(fsh.p((iHashCode2 + (projectActorAccount2 == null ? 0 : projectActorAccount2.hashCode())) * 31, 31, this.is_starred), 31, this.is_starter_project);
        ProjectType projectType = this.type;
        int iHashCode3 = (iP + (projectType == null ? 0 : projectType.hashCode())) * 31;
        ProjectSubtype projectSubtype = this.subtype;
        int iHashCode4 = (iHashCode3 + (projectSubtype == null ? 0 : projectSubtype.hashCode())) * 31;
        String str2 = this.prompt_template;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.docs_count;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.files_count;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ProjectPermission> list = this.permissions;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final boolean is_private() {
        return this.is_private;
    }

    public final boolean is_starred() {
        return this.is_starred;
    }

    public final boolean is_starter_project() {
        return this.is_starter_project;
    }

    public String toString() {
        String strM1084toStringimpl = ProjectId.m1084toStringimpl(this.uuid);
        String str = this.name;
        String str2 = this.description;
        boolean z = this.is_private;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        ProjectActorAccount projectActorAccount = this.creator;
        Date date3 = this.archived_at;
        ProjectActorAccount projectActorAccount2 = this.archiver;
        boolean z2 = this.is_starred;
        boolean z3 = this.is_starter_project;
        ProjectType projectType = this.type;
        ProjectSubtype projectSubtype = this.subtype;
        String str3 = this.prompt_template;
        Integer num = this.docs_count;
        Integer num2 = this.files_count;
        List<ProjectPermission> list = this.permissions;
        StringBuilder sbR = kgh.r("Project(uuid=", strM1084toStringimpl, ", name=", str, ", description=");
        gid.t(sbR, str2, ", is_private=", z, ", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", creator=");
        sbR.append(projectActorAccount);
        sbR.append(", archived_at=");
        sbR.append(date3);
        sbR.append(", archiver=");
        sbR.append(projectActorAccount2);
        sbR.append(", is_starred=");
        sbR.append(z2);
        sbR.append(", is_starter_project=");
        sbR.append(z3);
        sbR.append(", type=");
        sbR.append(projectType);
        sbR.append(", subtype=");
        sbR.append(projectSubtype);
        sbR.append(", prompt_template=");
        sbR.append(str3);
        sbR.append(", docs_count=");
        sbR.append(num);
        sbR.append(", files_count=");
        sbR.append(num2);
        sbR.append(", permissions=");
        return gid.q(sbR, list, ")");
    }

    public /* synthetic */ Project(String str, String str2, String str3, boolean z, Date date, Date date2, ProjectActorAccount projectActorAccount, Date date3, ProjectActorAccount projectActorAccount2, boolean z2, boolean z3, ProjectType projectType, ProjectSubtype projectSubtype, String str4, Integer num, Integer num2, List list, mq5 mq5Var) {
        this(str, str2, str3, z, date, date2, projectActorAccount, date3, projectActorAccount2, z2, z3, projectType, projectSubtype, str4, num, num2, list);
    }

    public /* synthetic */ Project(int i, String str, String str2, String str3, boolean z, Date date, Date date2, ProjectActorAccount projectActorAccount, Date date3, ProjectActorAccount projectActorAccount2, boolean z2, boolean z3, ProjectType projectType, ProjectSubtype projectSubtype, String str4, Integer num, Integer num2, List list, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, z, date, date2, projectActorAccount, date3, projectActorAccount2, z2, z3, projectType, projectSubtype, str4, num, num2, list, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Project(String str, String str2, String str3, boolean z, Date date, Date date2, ProjectActorAccount projectActorAccount, Date date3, ProjectActorAccount projectActorAccount2, boolean z2, boolean z3, ProjectType projectType, ProjectSubtype projectSubtype, String str4, Integer num, Integer num2, List<? extends ProjectPermission> list) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        this.uuid = str;
        this.name = str2;
        this.description = str3;
        this.is_private = z;
        this.created_at = date;
        this.updated_at = date2;
        this.creator = projectActorAccount;
        this.archived_at = date3;
        this.archiver = projectActorAccount2;
        this.is_starred = z2;
        this.is_starter_project = z3;
        this.type = projectType;
        this.subtype = projectSubtype;
        this.prompt_template = str4;
        this.docs_count = num;
        this.files_count = num2;
        this.permissions = list;
    }

    public /* synthetic */ Project(String str, String str2, String str3, boolean z, Date date, Date date2, ProjectActorAccount projectActorAccount, Date date3, ProjectActorAccount projectActorAccount2, boolean z2, boolean z3, ProjectType projectType, ProjectSubtype projectSubtype, String str4, Integer num, Integer num2, List list, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, z, date, date2, (i & 64) != 0 ? null : projectActorAccount, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : date3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : projectActorAccount2, (i & 512) != 0 ? false : z2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? false : z3, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : projectType, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : projectSubtype, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str4, (i & 16384) != 0 ? null : num, (32768 & i) != 0 ? null : num2, (i & 65536) != 0 ? null : list, null);
    }
}
