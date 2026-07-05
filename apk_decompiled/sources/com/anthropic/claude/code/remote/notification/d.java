package com.anthropic.claude.code.remote.notification;

import com.anthropic.claude.code.remote.notification.SessionReplyActionWorker;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.e79;
import defpackage.fkc;
import defpackage.fsf;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.xka;
import defpackage.z7;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.remote.notification.SessionReplyActionWorker.Args", dVar, 6);
        pluginGeneratedSerialDescriptor.j("sessionId", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("notificationId", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("submittedAtMillis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fsf.a, z7.a, fkc.a, e79.a, srg.a, xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        String strM1120unboximpl = null;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        String strV = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 0, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                    strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 1, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                    strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 2, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                    strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    iR = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionReplyActionWorker.Args(i, strM1120unboximpl, strM949unboximpl, strM1071unboximpl, iR, strV, j, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionReplyActionWorker.Args args = (SessionReplyActionWorker.Args) obj;
        encoder.getClass();
        args.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionReplyActionWorker.Args.write$Self$remote(args, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
