package com.anthropic.claude.chat.queue;

import com.anthropic.claude.chat.queue.QueuedMessageWorker;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.c69;
import defpackage.fkc;
import defpackage.g69;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vs2;
import defpackage.w28;
import defpackage.z7;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.queue.QueuedMessageWorker.Args", aVar, 4);
        pluginGeneratedSerialDescriptor.j("chatId", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("expiresAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vs2.a, z7.a, fkc.a, g69.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM984unboximpl = null;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        c69 c69Var = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 1, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                i |= 2;
            } else if (iX == 2) {
                OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 2, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                c69Var = (c69) ud4VarC.l(serialDescriptor, 3, g69.a, c69Var);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new QueuedMessageWorker.Args(i, strM984unboximpl, strM949unboximpl, strM1071unboximpl, c69Var, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        QueuedMessageWorker.Args args = (QueuedMessageWorker.Args) obj;
        encoder.getClass();
        args.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        QueuedMessageWorker.Args.write$Self$chat(args, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
