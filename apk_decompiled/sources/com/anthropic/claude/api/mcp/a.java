package com.anthropic.claude.api.mcp;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.types.strings.DirectoryServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d4c;
import defpackage.e79;
import defpackage.j56;
import defpackage.kw9;
import defpackage.p56;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.zt1;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.DirectoryServer", aVar, 19);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("one_liner", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("icon_url", true);
        pluginGeneratedSerialDescriptor.j("categories", true);
        pluginGeneratedSerialDescriptor.j("tool_names", true);
        pluginGeneratedSerialDescriptor.j("has_mcp_app", true);
        pluginGeneratedSerialDescriptor.j("rank", true);
        pluginGeneratedSerialDescriptor.j("trending", true);
        pluginGeneratedSerialDescriptor.j("added_at", true);
        pluginGeneratedSerialDescriptor.j("author", true);
        pluginGeneratedSerialDescriptor.j("documentation", true);
        pluginGeneratedSerialDescriptor.j("support", true);
        pluginGeneratedSerialDescriptor.j("privacy_policy", true);
        pluginGeneratedSerialDescriptor.j("image_urls", true);
        pluginGeneratedSerialDescriptor.j("remote", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = DirectoryServer.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{j56.a, p56.d, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[7].getValue(), kw9VarArr[8].getValue(), d4c.S(zt1Var), d4c.S(e79.a), d4c.S(zt1Var), d4c.S(srgVar), d4c.S(b.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[17].getValue(), d4c.S(f.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        List list;
        String str;
        int i;
        String str2;
        String str3;
        List list2;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DirectoryServer.$childSerializers;
        String str5 = null;
        Boolean bool = null;
        Integer num = null;
        Boolean bool2 = null;
        DirectoryServer.Author author = null;
        List list3 = null;
        int i2 = 0;
        String str6 = null;
        String str7 = null;
        List list4 = null;
        String str8 = null;
        List list5 = null;
        DirectoryServer.RemoteDetails remoteDetails = null;
        String str9 = null;
        boolean z = true;
        String strM1005unboximpl = null;
        DirectoryServerType directoryServerType = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str2 = str10;
                    z = false;
                    bool = bool;
                    str9 = str9;
                    str10 = str2;
                    break;
                case 0:
                    String str13 = str5;
                    List list6 = list3;
                    String str14 = str9;
                    DirectoryServerType directoryServerType2 = directoryServerType;
                    str2 = str10;
                    Boolean bool3 = bool;
                    DirectoryServerId directoryServerId = (DirectoryServerId) ud4VarC.l(serialDescriptor, 0, j56.a, strM1005unboximpl != null ? DirectoryServerId.m999boximpl(strM1005unboximpl) : null);
                    strM1005unboximpl = directoryServerId != null ? directoryServerId.m1005unboximpl() : null;
                    i2 |= 1;
                    directoryServerType = directoryServerType2;
                    bool = bool3;
                    str9 = str14;
                    list3 = list6;
                    str5 = str13;
                    str10 = str2;
                    break;
                case 1:
                    str3 = str5;
                    list2 = list3;
                    str4 = str9;
                    directoryServerType = (DirectoryServerType) ud4VarC.l(serialDescriptor, 1, p56.d, directoryServerType);
                    i2 |= 2;
                    str10 = str10;
                    str9 = str4;
                    list3 = list2;
                    str5 = str3;
                    break;
                case 2:
                    str3 = str5;
                    list2 = list3;
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i2 |= 4;
                    list3 = list2;
                    str5 = str3;
                    break;
                case 3:
                    str3 = str5;
                    list2 = list3;
                    str4 = str9;
                    str10 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str10);
                    i2 |= 8;
                    str9 = str4;
                    list3 = list2;
                    str5 = str3;
                    break;
                case 4:
                    str3 = str5;
                    list2 = list3;
                    str4 = str9;
                    str11 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str11);
                    i2 |= 16;
                    str9 = str4;
                    list3 = list2;
                    str5 = str3;
                    break;
                case 5:
                    str3 = str5;
                    list2 = list3;
                    str4 = str9;
                    str12 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str12);
                    i2 |= 32;
                    str9 = str4;
                    list3 = list2;
                    str5 = str3;
                    break;
                case 6:
                    str3 = str5;
                    list2 = list3;
                    str9 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str9);
                    i2 |= 64;
                    list3 = list2;
                    str5 = str3;
                    break;
                case 7:
                    str3 = str5;
                    list3 = (List) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list3);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    str9 = str9;
                    str5 = str3;
                    break;
                case 8:
                    list = list3;
                    str = str9;
                    list4 = (List) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), list4);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    str9 = str;
                    list3 = list;
                    break;
                case 9:
                    list = list3;
                    str = str9;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 9, zt1.a, bool2);
                    i2 |= 512;
                    str9 = str;
                    list3 = list;
                    break;
                case 10:
                    list = list3;
                    str = str9;
                    num = (Integer) ud4VarC.m(serialDescriptor, 10, e79.a, num);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    str9 = str;
                    list3 = list;
                    break;
                case 11:
                    list = list3;
                    str = str9;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 11, zt1.a, bool);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    str9 = str;
                    list3 = list;
                    break;
                case 12:
                    list = list3;
                    str = str9;
                    str5 = (String) ud4VarC.m(serialDescriptor, 12, srg.a, str5);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    str9 = str;
                    list3 = list;
                    break;
                case 13:
                    list = list3;
                    str = str9;
                    author = (DirectoryServer.Author) ud4VarC.m(serialDescriptor, 13, b.a, author);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    str9 = str;
                    list3 = list;
                    break;
                case 14:
                    list = list3;
                    str = str9;
                    str6 = (String) ud4VarC.m(serialDescriptor, 14, srg.a, str6);
                    i2 |= 16384;
                    str9 = str;
                    list3 = list;
                    break;
                case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    list = list3;
                    str = str9;
                    str7 = (String) ud4VarC.m(serialDescriptor, 15, srg.a, str7);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i2 |= i;
                    str9 = str;
                    list3 = list;
                    break;
                case 16:
                    list = list3;
                    str = str9;
                    str8 = (String) ud4VarC.m(serialDescriptor, 16, srg.a, str8);
                    i = 65536;
                    i2 |= i;
                    str9 = str;
                    list3 = list;
                    break;
                case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
                    list = list3;
                    str = str9;
                    list5 = (List) ud4VarC.l(serialDescriptor, 17, (s06) kw9VarArr[17].getValue(), list5);
                    i = 131072;
                    i2 |= i;
                    str9 = str;
                    list3 = list;
                    break;
                case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
                    str = str9;
                    list = list3;
                    remoteDetails = (DirectoryServer.RemoteDetails) ud4VarC.m(serialDescriptor, 18, f.a, remoteDetails);
                    i = 262144;
                    i2 |= i;
                    str9 = str;
                    list3 = list;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        List list7 = list3;
        String str15 = str9;
        DirectoryServerType directoryServerType3 = directoryServerType;
        String str16 = str10;
        Boolean bool4 = bool;
        ud4VarC.b(serialDescriptor);
        return new DirectoryServer(i2, strM1005unboximpl, directoryServerType3, strV, str16, str11, str12, str15, list7, list4, bool2, num, bool4, str5, author, str6, str7, str8, list5, remoteDetails, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DirectoryServer directoryServer = (DirectoryServer) obj;
        encoder.getClass();
        directoryServer.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DirectoryServer.write$Self$api(directoryServer, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
