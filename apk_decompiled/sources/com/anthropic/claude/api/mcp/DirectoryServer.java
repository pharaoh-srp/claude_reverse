package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.DirectoryServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.gvj;
import defpackage.h56;
import defpackage.h85;
import defpackage.ij0;
import defpackage.j56;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p56;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 k2\u00020\u0001:\u0005lmnopBë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBë\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\fHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b9\u0010%J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u0010%J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010%J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0\fHÆ\u0003¢\u0006\u0004\b<\u0010/J\u0012\u0010=\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b=\u0010>Jú\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bB\u0010%J\u0010\u0010C\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GJ'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bT\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bU\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bV\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bW\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bX\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bY\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Z\u001a\u0004\b[\u0010/R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Z\u001a\u0004\b\\\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\b^\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010]\u001a\u0004\ba\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bb\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u00108R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\be\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\bf\u0010%R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bg\u0010%R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\bh\u0010/R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010i\u001a\u0004\bj\u0010>¨\u0006q"}, d2 = {"Lcom/anthropic/claude/api/mcp/DirectoryServer;", "", "Lcom/anthropic/claude/types/strings/DirectoryServerId;", "id", "Lcom/anthropic/claude/api/mcp/DirectoryServerType;", "type", "", "name", "display_name", "one_liner", "description", "icon_url", "", "categories", "tool_names", "", "has_mcp_app", "", "rank", "trending", "added_at", "Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;", "author", "documentation", "support", "privacy_policy", "Lcom/anthropic/claude/api/mcp/DirectoryServer$PromptImage;", "image_urls", "Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;", "remote", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/DirectoryServerType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/mcp/DirectoryServerType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;Lvnf;Lmq5;)V", "component1-HdVeoME", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/api/mcp/DirectoryServerType;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "()Ljava/lang/Integer;", "component12", "component13", "component14", "()Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;", "component15", "component16", "component17", "component18", "component19", "()Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;", "copy-DUYYhuM", "(Ljava/lang/String;Lcom/anthropic/claude/api/mcp/DirectoryServerType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;)Lcom/anthropic/claude/api/mcp/DirectoryServer;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/DirectoryServer;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-HdVeoME", "Lcom/anthropic/claude/api/mcp/DirectoryServerType;", "getType", "getName", "getDisplay_name", "getOne_liner", "getDescription", "getIcon_url", "Ljava/util/List;", "getCategories", "getTool_names", "Ljava/lang/Boolean;", "getHas_mcp_app", "Ljava/lang/Integer;", "getRank", "getTrending", "getAdded_at", "Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;", "getAuthor", "getDocumentation", "getSupport", "getPrivacy_policy", "getImage_urls", "Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;", "getRemote", "Companion", "Author", "PromptImage", "RemoteDetails", "com/anthropic/claude/api/mcp/a", "h56", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DirectoryServer {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final h56 Companion = new h56();
    private final String added_at;
    private final Author author;
    private final List<String> categories;
    private final String description;
    private final String display_name;
    private final String documentation;
    private final Boolean has_mcp_app;
    private final String icon_url;
    private final String id;
    private final List<PromptImage> image_urls;
    private final String name;
    private final String one_liner;
    private final String privacy_policy;
    private final Integer rank;
    private final RemoteDetails remote;
    private final String support;
    private final List<String> tool_names;
    private final Boolean trending;
    private final DirectoryServerType type;

    static {
        h85 h85Var = new h85(19);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, yb5.w(w1aVar, h85Var), yb5.w(w1aVar, new h85(20)), null, null, null, null, null, null, null, null, yb5.w(w1aVar, new h85(21)), null};
    }

    private /* synthetic */ DirectoryServer(int i, String str, DirectoryServerType directoryServerType, String str2, String str3, String str4, String str5, String str6, List list, List list2, Boolean bool, Integer num, Boolean bool2, String str7, Author author, String str8, String str9, String str10, List list3, RemoteDetails remoteDetails, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, a.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.type = directoryServerType;
        this.name = str2;
        if ((i & 8) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str3;
        }
        if ((i & 16) == 0) {
            this.one_liner = null;
        } else {
            this.one_liner = str4;
        }
        if ((i & 32) == 0) {
            this.description = null;
        } else {
            this.description = str5;
        }
        if ((i & 64) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str6;
        }
        int i2 = i & FreeTypeConstants.FT_LOAD_PEDANTIC;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.categories = lm6Var;
        } else {
            this.categories = list;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.tool_names = lm6Var;
        } else {
            this.tool_names = list2;
        }
        if ((i & 512) == 0) {
            this.has_mcp_app = null;
        } else {
            this.has_mcp_app = bool;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.rank = null;
        } else {
            this.rank = num;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.trending = null;
        } else {
            this.trending = bool2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.added_at = null;
        } else {
            this.added_at = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.author = null;
        } else {
            this.author = author;
        }
        if ((i & 16384) == 0) {
            this.documentation = null;
        } else {
            this.documentation = str8;
        }
        if ((32768 & i) == 0) {
            this.support = null;
        } else {
            this.support = str9;
        }
        if ((65536 & i) == 0) {
            this.privacy_policy = null;
        } else {
            this.privacy_policy = str10;
        }
        if ((131072 & i) == 0) {
            this.image_urls = lm6Var;
        } else {
            this.image_urls = list3;
        }
        if ((i & 262144) == 0) {
            this.remote = null;
        } else {
            this.remote = remoteDetails;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(d.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-DUYYhuM$default, reason: not valid java name */
    public static /* synthetic */ DirectoryServer m339copyDUYYhuM$default(DirectoryServer directoryServer, String str, DirectoryServerType directoryServerType, String str2, String str3, String str4, String str5, String str6, List list, List list2, Boolean bool, Integer num, Boolean bool2, String str7, Author author, String str8, String str9, String str10, List list3, RemoteDetails remoteDetails, int i, Object obj) {
        RemoteDetails remoteDetails2;
        List list4;
        String str11 = (i & 1) != 0 ? directoryServer.id : str;
        DirectoryServerType directoryServerType2 = (i & 2) != 0 ? directoryServer.type : directoryServerType;
        String str12 = (i & 4) != 0 ? directoryServer.name : str2;
        String str13 = (i & 8) != 0 ? directoryServer.display_name : str3;
        String str14 = (i & 16) != 0 ? directoryServer.one_liner : str4;
        String str15 = (i & 32) != 0 ? directoryServer.description : str5;
        String str16 = (i & 64) != 0 ? directoryServer.icon_url : str6;
        List list5 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? directoryServer.categories : list;
        List list6 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? directoryServer.tool_names : list2;
        Boolean bool3 = (i & 512) != 0 ? directoryServer.has_mcp_app : bool;
        Integer num2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? directoryServer.rank : num;
        Boolean bool4 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? directoryServer.trending : bool2;
        String str17 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? directoryServer.added_at : str7;
        Author author2 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? directoryServer.author : author;
        String str18 = str11;
        String str19 = (i & 16384) != 0 ? directoryServer.documentation : str8;
        String str20 = (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 ? directoryServer.support : str9;
        String str21 = (i & 65536) != 0 ? directoryServer.privacy_policy : str10;
        List list7 = (i & 131072) != 0 ? directoryServer.image_urls : list3;
        if ((i & 262144) != 0) {
            list4 = list7;
            remoteDetails2 = directoryServer.remote;
        } else {
            remoteDetails2 = remoteDetails;
            list4 = list7;
        }
        return directoryServer.m341copyDUYYhuM(str18, directoryServerType2, str12, str13, str14, str15, str16, list5, list6, bool3, num2, bool4, str17, author2, str19, str20, str21, list4, remoteDetails2);
    }

    public static final /* synthetic */ void write$Self$api(DirectoryServer self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, j56.a, DirectoryServerId.m999boximpl(self.id));
        output.r(serialDesc, 1, p56.d, self.type);
        output.q(serialDesc, 2, self.name);
        if (output.E(serialDesc) || self.display_name != null) {
            output.B(serialDesc, 3, srg.a, self.display_name);
        }
        if (output.E(serialDesc) || self.one_liner != null) {
            output.B(serialDesc, 4, srg.a, self.one_liner);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 5, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.icon_url != null) {
            output.B(serialDesc, 6, srg.a, self.icon_url);
        }
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.categories, lm6Var)) {
            output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.categories);
        }
        if (output.E(serialDesc) || !x44.r(self.tool_names, lm6Var)) {
            output.r(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.tool_names);
        }
        if (output.E(serialDesc) || self.has_mcp_app != null) {
            output.B(serialDesc, 9, zt1.a, self.has_mcp_app);
        }
        if (output.E(serialDesc) || self.rank != null) {
            output.B(serialDesc, 10, e79.a, self.rank);
        }
        if (output.E(serialDesc) || self.trending != null) {
            output.B(serialDesc, 11, zt1.a, self.trending);
        }
        if (output.E(serialDesc) || self.added_at != null) {
            output.B(serialDesc, 12, srg.a, self.added_at);
        }
        if (output.E(serialDesc) || self.author != null) {
            output.B(serialDesc, 13, b.a, self.author);
        }
        if (output.E(serialDesc) || self.documentation != null) {
            output.B(serialDesc, 14, srg.a, self.documentation);
        }
        if (output.E(serialDesc) || self.support != null) {
            output.B(serialDesc, 15, srg.a, self.support);
        }
        if (output.E(serialDesc) || self.privacy_policy != null) {
            output.B(serialDesc, 16, srg.a, self.privacy_policy);
        }
        if (output.E(serialDesc) || !x44.r(self.image_urls, lm6Var)) {
            output.r(serialDesc, 17, (znf) kw9VarArr[17].getValue(), self.image_urls);
        }
        if (!output.E(serialDesc) && self.remote == null) {
            return;
        }
        output.B(serialDesc, 18, f.a, self.remote);
    }

    /* JADX INFO: renamed from: component1-HdVeoME, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getHas_mcp_app() {
        return this.has_mcp_app;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getTrending() {
        return this.trending;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAdded_at() {
        return this.added_at;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Author getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDocumentation() {
        return this.documentation;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSupport() {
        return this.support;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPrivacy_policy() {
        return this.privacy_policy;
    }

    public final List<PromptImage> component18() {
        return this.image_urls;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final RemoteDetails getRemote() {
        return this.remote;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DirectoryServerType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOne_liner() {
        return this.one_liner;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon_url() {
        return this.icon_url;
    }

    public final List<String> component8() {
        return this.categories;
    }

    public final List<String> component9() {
        return this.tool_names;
    }

    /* JADX INFO: renamed from: copy-DUYYhuM, reason: not valid java name */
    public final DirectoryServer m341copyDUYYhuM(String id, DirectoryServerType type, String name, String display_name, String one_liner, String description, String icon_url, List<String> categories, List<String> tool_names, Boolean has_mcp_app, Integer rank, Boolean trending, String added_at, Author author, String documentation, String support, String privacy_policy, List<PromptImage> image_urls, RemoteDetails remote) {
        id.getClass();
        type.getClass();
        name.getClass();
        categories.getClass();
        tool_names.getClass();
        image_urls.getClass();
        return new DirectoryServer(id, type, name, display_name, one_liner, description, icon_url, categories, tool_names, has_mcp_app, rank, trending, added_at, author, documentation, support, privacy_policy, image_urls, remote, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectoryServer)) {
            return false;
        }
        DirectoryServer directoryServer = (DirectoryServer) other;
        return DirectoryServerId.m1002equalsimpl0(this.id, directoryServer.id) && this.type == directoryServer.type && x44.r(this.name, directoryServer.name) && x44.r(this.display_name, directoryServer.display_name) && x44.r(this.one_liner, directoryServer.one_liner) && x44.r(this.description, directoryServer.description) && x44.r(this.icon_url, directoryServer.icon_url) && x44.r(this.categories, directoryServer.categories) && x44.r(this.tool_names, directoryServer.tool_names) && x44.r(this.has_mcp_app, directoryServer.has_mcp_app) && x44.r(this.rank, directoryServer.rank) && x44.r(this.trending, directoryServer.trending) && x44.r(this.added_at, directoryServer.added_at) && x44.r(this.author, directoryServer.author) && x44.r(this.documentation, directoryServer.documentation) && x44.r(this.support, directoryServer.support) && x44.r(this.privacy_policy, directoryServer.privacy_policy) && x44.r(this.image_urls, directoryServer.image_urls) && x44.r(this.remote, directoryServer.remote);
    }

    public final String getAdded_at() {
        return this.added_at;
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getDocumentation() {
        return this.documentation;
    }

    public final Boolean getHas_mcp_app() {
        return this.has_mcp_app;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    /* JADX INFO: renamed from: getId-HdVeoME, reason: not valid java name */
    public final String m342getIdHdVeoME() {
        return this.id;
    }

    public final List<PromptImage> getImage_urls() {
        return this.image_urls;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOne_liner() {
        return this.one_liner;
    }

    public final String getPrivacy_policy() {
        return this.privacy_policy;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final RemoteDetails getRemote() {
        return this.remote;
    }

    public final String getSupport() {
        return this.support;
    }

    public final List<String> getTool_names() {
        return this.tool_names;
    }

    public final Boolean getTrending() {
        return this.trending;
    }

    public final DirectoryServerType getType() {
        return this.type;
    }

    public int hashCode() {
        int iL = kgh.l((this.type.hashCode() + (DirectoryServerId.m1003hashCodeimpl(this.id) * 31)) * 31, 31, this.name);
        String str = this.display_name;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.one_liner;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon_url;
        int iM = kgh.m(kgh.m((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.categories), 31, this.tool_names);
        Boolean bool = this.has_mcp_app;
        int iHashCode4 = (iM + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.rank;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.trending;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.added_at;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Author author = this.author;
        int iHashCode8 = (iHashCode7 + (author == null ? 0 : author.hashCode())) * 31;
        String str6 = this.documentation;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.support;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.privacy_policy;
        int iM2 = kgh.m((iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.image_urls);
        RemoteDetails remoteDetails = this.remote;
        return iM2 + (remoteDetails != null ? remoteDetails.hashCode() : 0);
    }

    public String toString() {
        String strM1004toStringimpl = DirectoryServerId.m1004toStringimpl(this.id);
        DirectoryServerType directoryServerType = this.type;
        String str = this.name;
        String str2 = this.display_name;
        String str3 = this.one_liner;
        String str4 = this.description;
        String str5 = this.icon_url;
        List<String> list = this.categories;
        List<String> list2 = this.tool_names;
        Boolean bool = this.has_mcp_app;
        Integer num = this.rank;
        Boolean bool2 = this.trending;
        String str6 = this.added_at;
        Author author = this.author;
        String str7 = this.documentation;
        String str8 = this.support;
        String str9 = this.privacy_policy;
        List<PromptImage> list3 = this.image_urls;
        RemoteDetails remoteDetails = this.remote;
        StringBuilder sb = new StringBuilder("DirectoryServer(id=");
        sb.append(strM1004toStringimpl);
        sb.append(", type=");
        sb.append(directoryServerType);
        sb.append(", name=");
        kgh.u(sb, str, ", display_name=", str2, ", one_liner=");
        kgh.u(sb, str3, ", description=", str4, ", icon_url=");
        qy1.p(str5, ", categories=", ", tool_names=", sb, list);
        sb.append(list2);
        sb.append(", has_mcp_app=");
        sb.append(bool);
        sb.append(", rank=");
        sb.append(num);
        sb.append(", trending=");
        sb.append(bool2);
        sb.append(", added_at=");
        sb.append(str6);
        sb.append(", author=");
        sb.append(author);
        sb.append(", documentation=");
        kgh.u(sb, str7, ", support=", str8, ", privacy_policy=");
        qy1.p(str9, ", image_urls=", ", remote=", sb, list3);
        sb.append(remoteDetails);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b\u0005\u0010\u0019¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;", "", "", "url", "", "is_authless", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/anthropic/claude/api/mcp/DirectoryServer$RemoteDetails;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Z", "Companion", "com/anthropic/claude/api/mcp/f", "com/anthropic/claude/api/mcp/g", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class RemoteDetails {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final boolean is_authless;
        private final String url;

        public /* synthetic */ RemoteDetails(int i, String str, boolean z, vnf vnfVar) {
            this.url = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.is_authless = false;
            } else {
                this.is_authless = z;
            }
        }

        public static /* synthetic */ RemoteDetails copy$default(RemoteDetails remoteDetails, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteDetails.url;
            }
            if ((i & 2) != 0) {
                z = remoteDetails.is_authless;
            }
            return remoteDetails.copy(str, z);
        }

        public static final /* synthetic */ void write$Self$api(RemoteDetails self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.url != null) {
                output.B(serialDesc, 0, srg.a, self.url);
            }
            if (output.E(serialDesc) || self.is_authless) {
                output.p(serialDesc, 1, self.is_authless);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIs_authless() {
            return this.is_authless;
        }

        public final RemoteDetails copy(String url, boolean is_authless) {
            return new RemoteDetails(url, is_authless);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteDetails)) {
                return false;
            }
            RemoteDetails remoteDetails = (RemoteDetails) other;
            return x44.r(this.url, remoteDetails.url) && this.is_authless == remoteDetails.is_authless;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            return Boolean.hashCode(this.is_authless) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final boolean is_authless() {
            return this.is_authless;
        }

        public String toString() {
            return "RemoteDetails(url=" + this.url + ", is_authless=" + this.is_authless + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteDetails() {
            this((String) null, false, 3, (mq5) (0 == true ? 1 : 0));
        }

        public RemoteDetails(String str, boolean z) {
            this.url = str;
            this.is_authless = z;
        }

        public /* synthetic */ RemoteDetails(String str, boolean z, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;", "", "", "name", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/mcp/DirectoryServer$Author;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getUrl", "Companion", "com/anthropic/claude/api/mcp/b", "com/anthropic/claude/api/mcp/c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Author {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String name;
        private final String url;

        public /* synthetic */ Author(int i, String str, String str2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.name = null;
            } else {
                this.name = str;
            }
            if ((i & 2) == 0) {
                this.url = null;
            } else {
                this.url = str2;
            }
        }

        public static /* synthetic */ Author copy$default(Author author, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = author.name;
            }
            if ((i & 2) != 0) {
                str2 = author.url;
            }
            return author.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$api(Author self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.name != null) {
                output.B(serialDesc, 0, srg.a, self.name);
            }
            if (!output.E(serialDesc) && self.url == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Author copy(String name, String url) {
            return new Author(name, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Author)) {
                return false;
            }
            Author author = (Author) other;
            return x44.r(this.name, author.name) && x44.r(this.url, author.url);
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.url;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ij0.l("Author(name=", this.name, ", url=", this.url, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Author() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public Author(String str, String str2) {
            this.name = str;
            this.url = str2;
        }

        public /* synthetic */ Author(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/mcp/DirectoryServer$PromptImage;", "", "", "prompt", "image_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/DirectoryServer$PromptImage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/mcp/DirectoryServer$PromptImage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrompt", "getImage_url", "Companion", "com/anthropic/claude/api/mcp/d", "com/anthropic/claude/api/mcp/e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PromptImage {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String image_url;
        private final String prompt;

        public /* synthetic */ PromptImage(int i, String str, String str2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.prompt = null;
            } else {
                this.prompt = str;
            }
            if ((i & 2) == 0) {
                this.image_url = null;
            } else {
                this.image_url = str2;
            }
        }

        public static /* synthetic */ PromptImage copy$default(PromptImage promptImage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = promptImage.prompt;
            }
            if ((i & 2) != 0) {
                str2 = promptImage.image_url;
            }
            return promptImage.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$api(PromptImage self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.prompt != null) {
                output.B(serialDesc, 0, srg.a, self.prompt);
            }
            if (!output.E(serialDesc) && self.image_url == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.image_url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPrompt() {
            return this.prompt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImage_url() {
            return this.image_url;
        }

        public final PromptImage copy(String prompt, String image_url) {
            return new PromptImage(prompt, image_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromptImage)) {
                return false;
            }
            PromptImage promptImage = (PromptImage) other;
            return x44.r(this.prompt, promptImage.prompt) && x44.r(this.image_url, promptImage.image_url);
        }

        public final String getImage_url() {
            return this.image_url;
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public int hashCode() {
            String str = this.prompt;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.image_url;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ij0.l("PromptImage(prompt=", this.prompt, ", image_url=", this.image_url, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PromptImage() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public PromptImage(String str, String str2) {
            this.prompt = str;
            this.image_url = str2;
        }

        public /* synthetic */ PromptImage(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public /* synthetic */ DirectoryServer(String str, DirectoryServerType directoryServerType, String str2, String str3, String str4, String str5, String str6, List list, List list2, Boolean bool, Integer num, Boolean bool2, String str7, Author author, String str8, String str9, String str10, List list3, RemoteDetails remoteDetails, mq5 mq5Var) {
        this(str, directoryServerType, str2, str3, str4, str5, str6, list, list2, bool, num, bool2, str7, author, str8, str9, str10, list3, remoteDetails);
    }

    public /* synthetic */ DirectoryServer(int i, String str, DirectoryServerType directoryServerType, String str2, String str3, String str4, String str5, String str6, List list, List list2, Boolean bool, Integer num, Boolean bool2, String str7, Author author, String str8, String str9, String str10, List list3, RemoteDetails remoteDetails, vnf vnfVar, mq5 mq5Var) {
        this(i, str, directoryServerType, str2, str3, str4, str5, str6, list, list2, bool, num, bool2, str7, author, str8, str9, str10, list3, remoteDetails, vnfVar);
    }

    private DirectoryServer(String str, DirectoryServerType directoryServerType, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, Boolean bool, Integer num, Boolean bool2, String str7, Author author, String str8, String str9, String str10, List<PromptImage> list3, RemoteDetails remoteDetails) {
        str.getClass();
        directoryServerType.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.id = str;
        this.type = directoryServerType;
        this.name = str2;
        this.display_name = str3;
        this.one_liner = str4;
        this.description = str5;
        this.icon_url = str6;
        this.categories = list;
        this.tool_names = list2;
        this.has_mcp_app = bool;
        this.rank = num;
        this.trending = bool2;
        this.added_at = str7;
        this.author = author;
        this.documentation = str8;
        this.support = str9;
        this.privacy_policy = str10;
        this.image_urls = list3;
        this.remote = remoteDetails;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DirectoryServer(String str, DirectoryServerType directoryServerType, String str2, String str3, String str4, String str5, String str6, List list, List list2, Boolean bool, Integer num, Boolean bool2, String str7, Author author, String str8, String str9, String str10, List list3, RemoteDetails remoteDetails, int i, mq5 mq5Var) {
        String str11 = (i & 8) != 0 ? null : str3;
        String str12 = (i & 16) != 0 ? null : str4;
        String str13 = (i & 32) != 0 ? null : str5;
        String str14 = (i & 64) != 0 ? null : str6;
        int i2 = i & FreeTypeConstants.FT_LOAD_PEDANTIC;
        lm6 lm6Var = lm6.E;
        this(str, directoryServerType, str2, str11, str12, str13, str14, i2 != 0 ? lm6Var : list, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? lm6Var : list2, (i & 512) != 0 ? null : bool, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : num, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : bool2, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : author, (i & 16384) != 0 ? null : str8, (32768 & i) != 0 ? null : str9, (65536 & i) != 0 ? null : str10, (131072 & i) != 0 ? lm6Var : list3, (i & 262144) != 0 ? null : remoteDetails, null);
    }
}
