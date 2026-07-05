package com.anthropic.claude.chat.input.files;

import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.chat.input.files.FileUploadWorker;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d4c;
import defpackage.en2;
import defpackage.fkc;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vs2;
import defpackage.w28;
import defpackage.xka;
import defpackage.z7;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.input.files.FileUploadWorker.Args", bVar, 11);
        pluginGeneratedSerialDescriptor.j("uploadId", false);
        pluginGeneratedSerialDescriptor.j("fileName", false);
        pluginGeneratedSerialDescriptor.j("mediaType", false);
        pluginGeneratedSerialDescriptor.j("chatId", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("uploadSource", false);
        pluginGeneratedSerialDescriptor.j("analyticsEvent", false);
        pluginGeneratedSerialDescriptor.j("reportProgress", false);
        pluginGeneratedSerialDescriptor.j("enqueuingProcessStart", true);
        pluginGeneratedSerialDescriptor.j("cacheFilePath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = FileUploadWorker.Args.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, d4c.S(vs2.a), z7.a, fkc.a, kw9VarArr[6].getValue(), en2.a, zt1.a, xka.a, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = FileUploadWorker.Args.$childSerializers;
        Object obj = null;
        ChatEvents$AddAttachment chatEvents$AddAttachment = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strM984unboximpl = null;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        String strV4 = null;
        long j = 0;
        int i = 0;
        boolean zU = false;
        boolean z = true;
        ChatEvents$UploadSource chatEvents$UploadSource = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    ChatId chatId = (ChatId) ud4VarC.m(serialDescriptor, 3, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 4, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                    strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 5, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                    strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    chatEvents$UploadSource = (ChatEvents$UploadSource) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), chatEvents$UploadSource);
                    i |= 64;
                    break;
                case 7:
                    chatEvents$AddAttachment = (ChatEvents$AddAttachment) ud4VarC.l(serialDescriptor, 7, en2.a, chatEvents$AddAttachment);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    zU = ud4VarC.u(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    j = ud4VarC.j(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    strV4 = ud4VarC.v(serialDescriptor, 10);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new FileUploadWorker.Args(i, strV, strV2, strV3, strM984unboximpl, strM949unboximpl, strM1071unboximpl, chatEvents$UploadSource, chatEvents$AddAttachment, zU, j, strV4, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FileUploadWorker.Args args = (FileUploadWorker.Args) obj;
        encoder.getClass();
        args.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FileUploadWorker.Args.write$Self$input(args, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
